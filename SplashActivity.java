package com.project.yil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Eduardo on 2016-10-17.
 */

public class SplashActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        // 메인 액티비티로 넘어감

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
