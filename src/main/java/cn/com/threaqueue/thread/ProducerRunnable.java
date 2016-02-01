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
public class ProducerRunnable implements Runnable {

    private final static transient Logger logger = LoggerFactory.getLogger(ProducerRunnable.class);

    ITaskData taskData;

    public ProducerRunnable(ITaskData taskData) {
        this.taskData = taskData;
    }

    @Override
    public void run() {

        try {
            logger.debug(String.format("thread name :%s,task data:%s,", Thread.currentThread().getName(), taskData.toString()));

            QueueStorage.push(taskData);

        } catch (InterruptedException e) {

            logger.error("任务生产失败", e);

        }
    }
}
