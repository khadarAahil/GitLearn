package com.khadar.dp.singleton;

import java.io.Serializable;

public class DemoSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static class LazyHolder {
        private static DemoSingleton instance = new DemoSingleton();
    }

    public static DemoSingleton getInstance(){
        return LazyHolder.instance;
    }

    protected Object readResolve(){
        return getInstance();
    }

}
