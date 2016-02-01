package cn.com.threaqueue;

import cn.com.threaqueue.taskdata.TaskData;
import cn.com.threaqueue.thread.ConsumerRunnable;
import cn.com.threaqueue.thread.ProducerRunnable;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 17:21
 * Desc:
 */
public class Test {

    public static void main(String[] args) {

        QueueStorage queueStorage = new QueueStorage();

        for (int i = 0; i < 100; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        TaskData taskData = new TaskData("" + new Random().nextInt(), "" + new Random().nextInt());
                        ThreadExecutorService.createProducer(taskData);

                        try {
                            Thread.sleep(1000 * new Random().nextInt(3));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }).start();
        }


//        ThreadExecutorService.createConsumer();
//        ThreadExecutorService.createConsumer();
//        ThreadExecutorService.createConsumer();
//        ThreadExecutorService.createConsumer();
//        ThreadExecutorService.createConsumer();
    }
}
