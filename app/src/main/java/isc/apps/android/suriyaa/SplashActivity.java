package isc.apps.android.suriyaa;

import android.annotation.SuppressLint;
        import android.annotation.TargetApi;
        import android.app.ActionBar;
        import android.app.Activity;
        import android.content.Intent;
        import android.os.Build;
        import android.os.Bundle;

@SuppressLint("NewApi")
public class SplashActivity extends Activity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionBar = getActionBar();
        actionBar.hide();

        Thread t =new Thread(){
            public void run(){
                try{
                    sleep(10000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent i =new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        };
        t.start();
    }
    @Override
    public void onPause(){
        super.onPause();
        finish();
    }

}
