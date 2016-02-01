package cn.com.threaqueue.taskdata;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 17:23
 * Desc:
 */
public class TaskData implements ITaskData {

    private String name;
    private String data;
    private int retaskCount;
    private Map<String,String> params;

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public TaskData(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getRetaskCount() {
        return retaskCount;
    }

    public void setRetaskCount(int retaskCount) {
        this.retaskCount = retaskCount;
    }
}
