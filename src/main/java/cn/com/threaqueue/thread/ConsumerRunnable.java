package cn.com.threaqueue.thread;

import cn.com.threaqueue.QueueStorage;
import cn.com.threaqueue.TaskContext;
import cn.com.threaqueue.taskdata.ITaskData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 17:06
 * Desc:
 */
public class ConsumerRunnable implements Runnable {

    private final static transient Logger logger = LoggerFactory.getLogger(ConsumerRunnable.class);


    public ConsumerRunnable() {
    }

    @Override
    public void run() {

        while (true) {

            try {
                ITaskData taskData = QueueStorage.pop();

                logger.debug(String.format("thread name :%s,task data:%s,", Thread.currentThread().getName(), taskData.toString()));

            } catch (InterruptedException e) {

                logger.error("任务消费失败", e);

            }
        }
    }
}
