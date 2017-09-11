package com.dbs.module1.user;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dbs.module1.IDependService;
import com.dbs.module1.Module1SDK;
import com.dbs.module1.R;

/**
 * 用户页面，演示如何调用外部module业务功能
 * Created by dingbaosheng340 on 2017/9/9.
 */

public class UserInfoActivity extends Activity {


    private TextView mTvUserName;
    private Button mBtnGetUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module1_acitivity_user_info);

        mTvUserName = (TextView) findViewById(R.id.tv_user_name);
        mBtnGetUserName = (Button)findViewById(R.id.btn_get_user_name);
        mBtnGetUserName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IDependService dependService = Module1SDK.getInstance().getDependService();
                if (dependService != null) {
                    mTvUserName.setText(dependService.getUserName());
                }
            }
        });
    }
}
