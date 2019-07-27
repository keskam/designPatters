package dp.sda.abstractFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        
        if("Toy".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        
        return null;
    }
}