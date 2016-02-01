package cn.com.threaqueue.thread;

import cn.com.threaqueue.QueueStorage;
import cn.com.threaqueue.TaskContext;
import cn.com.threaqueue.exception.TaskException;
import cn.com.threaqueue.service.ITaskService;
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

    private ITaskService taskService;

    public ConsumerRunnable(ITaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run() {

        while (true) {

            try {
                ITaskData taskData = QueueStorage.pop();

                try {
                    taskService.exec(taskData);
                } catch (TaskException e) {

                    logger.error("task exec error", e);

                    //任务执行失败，重新返回执行队列中
                    if (taskData.getRetaskCount() < TaskContext.retaskCount) {

                        taskData.setRetaskCount(taskData.getRetaskCount() + 1);
                        QueueStorage.push(taskData);
                    }
                }

                logger.debug(String.format("thread name :%s,task data:%s,", Thread.currentThread().getName(), taskData.toString()));

            } catch (InterruptedException e) {

                logger.error("任务消费失败", e);

            }
        }
    }
}
