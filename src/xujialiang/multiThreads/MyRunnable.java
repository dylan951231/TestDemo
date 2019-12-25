package xujialiang.multiThreads;

/**
 * @Author :xujialiang
 * @Date: create in 2019/12/19 11:26
 * @Description :
 */
public class MyRunnable {
    public static void main(String[] args) {
        MyTestRunnable runnable = new MyTestRunnable(10);
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}

class MyTestRunnable implements Runnable{
    int count = 0 ;
    MyTestRunnable (int count){
        this.count=count;
    }

    @Override
    public void run() {
        while(count >0){
            synchronized (this){
              if(count >0){
                  System.out.println(Thread.currentThread().getName()+" count----"+ --count);
              }
            }
        }
    }
}
