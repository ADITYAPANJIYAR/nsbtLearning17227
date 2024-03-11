package tenthdayassignment;

public class LazyInitialization {
    public static LazyInitialization INSTANCE=null;
    private LazyInitialization(){}

    public static LazyInitialization getINSTANCE(){
        if (INSTANCE==null)
            INSTANCE=new LazyInitialization();
        return INSTANCE;
    }
}
