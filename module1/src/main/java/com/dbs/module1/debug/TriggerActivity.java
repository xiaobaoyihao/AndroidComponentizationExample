package com.dbs.module1.debug;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dbs.module1.Module1SDK;
import com.dbs.module1.R;

/**
 *业务触发类，是Module1为app时启动入口页
 * Created by dingbaosheng340 on 2017/9/9.
 */

public class TriggerActivity extends Activity {


    private Button mBtnTrigger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.module1_acitivity_trigger);

        mBtnTrigger = (Button) findViewById(R.id.btn_trigger);
        mBtnTrigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TriggerActivity.this, "业务启动入口", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
