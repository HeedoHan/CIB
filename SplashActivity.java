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
        // ���� ��Ƽ��Ƽ�� �Ѿ

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
