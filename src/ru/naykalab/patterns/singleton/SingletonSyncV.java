package ru.naykalab.patterns.singleton;


public class SingletonSyncV {
    private volatile static SingletonSyncV instSingletonSyncV;

    public SingletonSyncV() {
    }
    
    public static SingletonSyncV getInstance() {
        if (instSingletonSyncV == null) {
            synchronized (SingletonSyncV.class) {
                instSingletonSyncV = new SingletonSyncV();
            }
        }
        return instSingletonSyncV;
    }
}
