public class SingletonExample {

    // volatile : never refer the variable from cache
    public volatile static SingletonExample singletonExample;
    private SingletonExample(){
    }

    public static SingletonExample getInstance() throws InterruptedException {
        if(singletonExample == null){
            synchronized (SingletonExample.class){
                Thread.sleep(3000);
                if(singletonExample == null){
                    singletonExample = new SingletonExample();
                }
            }
        }
        return singletonExample;
    }
}
