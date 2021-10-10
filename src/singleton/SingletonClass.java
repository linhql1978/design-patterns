package singleton;

public class SingletonClass {
    private static SingletonClass instanceSingletonClass;

    public static SingletonClass getInstanceSingletonClass() {
        if(instanceSingletonClass==null){
            instanceSingletonClass = new SingletonClass();
        }

        return instanceSingletonClass;
    }

    private SingletonClass() {
    }
}
