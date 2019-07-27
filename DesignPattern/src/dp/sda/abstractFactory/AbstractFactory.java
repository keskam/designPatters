package dp.sda.abstractFactory;

public interface AbstractFactory<T> {
    T create(String type) ;
}