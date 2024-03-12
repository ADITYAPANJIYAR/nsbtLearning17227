package tenthdayassignment;

public class Question1DriverClass {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton=EagerSingleton.getInstance();
        System.out.println("Eager Singleton HashCode: "+eagerSingleton.hashCode());

        LazyInitialization lazyInitialization=LazyInitialization.getINSTANCE();
        System.out.println("Lazy Singleton HashCode: " +lazyInitialization.hashCode());

        SingletonEnum singleton1 = SingletonEnum.INSTANCE;
        System.out.println("Enum Singleton HashCode: " +singleton1.hashCode());

    }
}
