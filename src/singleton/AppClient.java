package singleton;

public class AppClient {
    public static void main(String[] args) {
        System.out.println(SingletonClass.getInstanceSingletonClass());
        System.out.println(SingletonClass.getInstanceSingletonClass());

        // every enum is instance singleton
        System.out.println(SingletonEnum.SINGLETON_ENUM_CLASS.hashCode());
        System.out.println(SingletonEnum.SINGLETON_ENUM_CLASS.hashCode());
    }
}
