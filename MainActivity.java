package com.project.yil;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    public void onClick(View view)
    {
        EditText editId = (EditText) findViewById(R.id.edit_id);
        String id = editId.getText().toString();
        // ����ڰ� �Է��� ���̵� ������.

        Intent intent = new Intent(this, MyBooksList.class);
        //intent.putExtra("Profile", new Person("LarryPage", "Male", "Google"));
        startActivity(intent);
    }
    */

}
