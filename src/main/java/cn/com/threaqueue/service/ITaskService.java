package cn.com.threaqueue.service;

import cn.com.threaqueue.exception.TaskException;
import cn.com.threaqueue.taskdata.ITaskData;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/26 13:11
 * Desc:
 */
public interface ITaskService {

    public boolean exec(ITaskData zqData) throws TaskException;
}
