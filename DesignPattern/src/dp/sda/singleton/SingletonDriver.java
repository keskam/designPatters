package dp.sda.singleton;

public class SingletonDriver {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("After first get " + instance.toString());

        Singleton secondInstance = Singleton.getInstance();
        System.out.println("After second get " + secondInstance.toString());
    }
}
