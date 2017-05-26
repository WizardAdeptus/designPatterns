package ru.naykalab.patterns.singleton;


public class SingletonSync {
    private static SingletonSync instSingleton;

    private SingletonSync() {
    }
    
    public static synchronized SingletonSync getInstance() {
        
        if (instSingleton == null) {
            instSingleton = new SingletonSync();
        }
        return instSingleton;
    }
}
