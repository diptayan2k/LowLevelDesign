public class SingletonManager extends Thread{

    public SingletonExample singletonExample;
    @Override
    public void run() {
        try {
            singletonExample = SingletonExample.getInstance();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public SingletonExample getSingletonExample(){
        return singletonExample;
    }
}
