package tenthdayassignment;

public class LazyInitialization {
    public static LazyInitialization INSTANCE=new LazyInitialization();
    private LazyInitialization(){}

    public static LazyInitialization getINSTANCE(){
        if (INSTANCE==null)
            INSTANCE=new LazyInitialization();
        return INSTANCE;
    }
}
