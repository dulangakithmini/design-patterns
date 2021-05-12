package Singleton;

public class ThreadSafeWithSynchronized {
    private static ThreadSafeWithSynchronized instance;

    private ThreadSafeWithSynchronized() {
    }

    public static synchronized ThreadSafeWithSynchronized getInstance() {
        if (instance == null) {
            instance = new ThreadSafeWithSynchronized();
        }
        return instance;
    }
}
