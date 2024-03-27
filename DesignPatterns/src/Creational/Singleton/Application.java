package Creational.Singleton;

class Thread1 extends Thread {

    public static SingletonClass singletonClass;

    @Override
    public void run() {
        singletonClass = SingletonClass.getInstance();
    }

    public SingletonClass getSingletonClass() {
        return singletonClass;
    }
}

class Thread2 extends Thread {

    public SingletonClass singletonClass;

    @Override
    public void run() {
        singletonClass = SingletonClass.getInstance();
    }

    public SingletonClass getSingletonClass() {
        return singletonClass;
    }
}


public class Application {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        Thread threadOne = new Thread(thread1);
        Thread threadTwo = new Thread(thread2);

        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread1.getSingletonClass().hashCode());
        System.out.println(thread2.getSingletonClass().hashCode());

    }
}
