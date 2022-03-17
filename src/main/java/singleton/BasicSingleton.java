package singleton;

public class BasicSingleton {
    private static BasicSingleton instance;
    public static int usageCounter;

    private BasicSingleton(){
        usageCounter = 1;
    }

    public static BasicSingleton getInstance(){
        if(instance == null){
            instance = new BasicSingleton();
        }
        usageCounter++;
        return instance;
    }
}
