package cn.com.threaqueue;

import cn.com.threaqueue.taskdata.ITaskData;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 17:07
 * Desc:
 */
public class QueueStorage {

    private static BlockingQueue<ITaskData> queues = new LinkedBlockingQueue<ITaskData>();

    /**
     * 生产
     *
     * @param p 产品
     * @throws InterruptedException
     */
    public static void push(ITaskData p) throws InterruptedException {
        queues.put(p);
    }

    /**
     * 消费
     *
     * @return 产品
     * @throws InterruptedException
     */
    public static ITaskData pop() throws InterruptedException {
        return queues.take();
    }

}
