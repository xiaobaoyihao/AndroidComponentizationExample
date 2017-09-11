package com.dbs;

import com.dbs.module1.IDependService;

/**
 * Created by dingbaosheng340 on 2017/9/11.
 */

public class Module1DependService implements IDependService {

    @Override
    public String getUserName() {
        return "xiaobaoyihao";
    }
}
