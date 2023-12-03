public class Main {
    public static void main(String[] args) throws InterruptedException {

        SingletonManager singletonManager1 = new SingletonManager();
        SingletonManager singletonManager2 = new SingletonManager();

        singletonManager1.start();
        singletonManager2.start();

        while (singletonManager1.singletonExample == null||singletonManager2.singletonExample == null){
            Thread.sleep(1000);
            System.out.println("waiting!!");
        }
        System.out.println(singletonManager1.getSingletonExample() == singletonManager2.getSingletonExample());
    }
}