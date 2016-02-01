package cn.com.threaqueue.taskdata;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 17:07
 * Desc:
 */
public interface ITaskData {

    public String getName();

    public void setName(String name);

    public int getRetaskCount();

    public void setRetaskCount(int retaskCount);

    public Map<String, String> getParams();

    public void setParams(Map<String, String> params);

}
