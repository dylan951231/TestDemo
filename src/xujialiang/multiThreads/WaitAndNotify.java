package xujialiang.multiThreads;

/**
 * @Author :xujialiang
 * @Date: create in 2019/12/19 11:37
 * @Description : 一个线程负责加，另一个负责监听，当到5时进行提示
 */
public class WaitAndNotify {

    int count = 0;

    public void  add(){
        while(true){
            synchronized (this){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" count -------- "+ ++count );
                if(count ==5){
                    try {
                        this.notify();
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public void watch(){
        synchronized (this){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("watch---"+count);
                System.out.println("监视完成");
                this.notify();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        WaitAndNotify waitAndNotify =new WaitAndNotify();
        new Thread(()->waitAndNotify.add()).start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->waitAndNotify.watch()).start();
    }
}
