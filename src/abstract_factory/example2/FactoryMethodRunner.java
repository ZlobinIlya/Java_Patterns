package abstract_factory.example2;

public class FactoryMethodRunner {
    public static void main(String[ ] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.check();
    }
}
