package com.dbs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dbs.module1.user.UserInfoActivity;

public class MainActivity extends Activity {

    private Button mBtnGoTriggerPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnGoTriggerPage = (Button)findViewById(R.id.btn_go_trigger_page);
        mBtnGoTriggerPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
