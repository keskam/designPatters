package dp.sda.fancySingleton;

public class Sandbox {

    public static void main(String[] args) {
        
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();
        ClassSingleton classSingleton2 = ClassSingleton.getInstance();

        System.out.println("Singletons from class");
        System.out.println(classSingleton1.toString());
        System.out.println(classSingleton2.toString());

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();

        System.out.println("Singletons from Enum");
        System.out.println(enumSingleton1.INSTANCE.getName());
        System.out.println(enumSingleton2.INSTANCE.getName());
    }
}
