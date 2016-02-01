package cn.com.threaqueue;

import cn.com.threaqueue.service.ITaskService;
import cn.com.threaqueue.taskdata.TaskData;
import cn.com.threaqueue.thread.ConsumerRunnable;
import cn.com.threaqueue.thread.ProducerRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 17:17
 * Desc:
 */
public class ThreadExecutorService {

//    public static Executor executor = Executors.newFixedThreadPool(10);

    private static void addTask(Runnable runnable) {
//        executor.execute(runnable);
        new Thread(runnable).start();
    }


    public static void createProducer(TaskData taskData) {
        ProducerRunnable runnable = new ProducerRunnable(taskData);
        addTask(runnable);
    }

    public static void createConsumer(ITaskService taskService) {
        ConsumerRunnable runnable = new ConsumerRunnable(taskService);
        addTask(runnable);
    }

}
