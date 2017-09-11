package com.dbs.module1;

/**
 * Created by dingbaosheng340 on 2017/9/11.
 */

public class Module1SDK {

    private IDependService mDependService;

    private static final Module1SDK sInstance = new Module1SDK();

    private Module1SDK() {
        try {
            Class clazz = Class.forName("com.dbs.Module1DependService");
            mDependService = (IDependService) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Module1SDK getInstance() {
        return sInstance;
    }

    public IDependService getDependService() {
        return mDependService;
    }

    public void setDependService(IDependService dependService) {
        mDependService = dependService;
    }
}
