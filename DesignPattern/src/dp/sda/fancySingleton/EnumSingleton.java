package dp.sda.fancySingleton;

public enum EnumSingleton {

    INSTANCE;
    String name = "ENUM Singleton";

    private EnumSingleton() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}
