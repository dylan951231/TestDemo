package xujialiang.multiThreads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskMy {

    public static void main(String[] args) {

        //新建callable
        Callable<Integer> call =new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(1000);
            }
        };

        //提交到futuretask，通过futureTask执行，并获取结果
       FutureTask<Integer> futureTask =new FutureTask<Integer>(call);

       new Thread(futureTask).start();

        try {
            //模拟等待结果
            Thread.sleep(3000);
            System.out.println(futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
