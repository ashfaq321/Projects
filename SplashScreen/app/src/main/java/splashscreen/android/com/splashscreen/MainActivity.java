package splashscreen.android.com.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splashHit();
    }

    private void splashHit() {
        Thread mThread = new Thread() {
            public void run() {
                super.run();
                try {
                    Thread.sleep(3000);
                    Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(mIntent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        mThread.start();


    }
}
