package creational.singleton.naive_single_thread;

public final class Singleton {

    private static Singleton instance;
    public String value;

    private Singleton(String value){
        // The following code emulates slow initialization.
        try{
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
