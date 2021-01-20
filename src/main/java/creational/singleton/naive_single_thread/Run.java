package creational.singleton.naive_single_thread;

public class Run {

    public static void main(String[] args){
        System.out.println("If you see the same value, then creational.singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        //Instantiate two different singletons -> but there is only "one"
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
