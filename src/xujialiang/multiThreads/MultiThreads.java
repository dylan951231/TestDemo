package xujialiang.multiThreads;

/**
 * @Author :xujialiang
 * @Date: create in 2019/12/19 10:08
 * @Description :
 */
public class MultiThreads {
    int count =0 ;

    public  void add(){
       while(true){
          synchronized (this){
              if(count <10){
                  count++;
                  System.out.println("add-------"+count);
              }
          }
       }
    }

    public void mulit(){
        while(true){
           synchronized (this){
               if(count >0){
                   count--;
                   System.out.println("mulit----------: "+count);
               }
           }
        }
    }

    public static void main(String[] args) {
        MultiThreads obj =new MultiThreads();
        new Thread(()-> obj.add()).start();
        new Thread(()-> obj.mulit()).start();
    }
}