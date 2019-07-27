package dp.sda.singleton;

public class Singleton  {    
    private Singleton() {}
    
    private static class SingletonHolder {    
        public static final Singleton instance = new Singleton();
    }    

    public static Singleton getInstance() {    
        return SingletonHolder.instance;    
    }    
}