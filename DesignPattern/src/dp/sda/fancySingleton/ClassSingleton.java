package dp.sda.fancySingleton;

public class ClassSingleton {

    private static ClassSingleton INSTANCE;
    
    private ClassSingleton(){}
    
    public static ClassSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ClassSingleton();
        }
        
        return INSTANCE;
    }
}
