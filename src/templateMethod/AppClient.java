package templateMethod;

public class AppClient {
    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();
        AbstractClass otherConcreteClass = new OtherConcreteClass();

        concreteClass.templateMethod();
        otherConcreteClass.templateMethod();
    }
}
