package cn.com.threaqueue.taskdata;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 17:23
 * Desc:
 */
public class TaskData implements ITaskData {

    private String name;
    private String data;

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

    @Override
    public String toString() {
        return "TaskData{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
