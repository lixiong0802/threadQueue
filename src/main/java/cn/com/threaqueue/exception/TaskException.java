package cn.com.threaqueue.exception;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 14:34
 * Desc:
 */
public class TaskException extends Throwable {

    private static final long serialVersionUID = 6937304029901546157L;
    private String errMsg = "";
    private String errCode = "";
    private String bussinessMsg;

    public TaskException() {
    }

    public TaskException(Throwable exception) {
        super(exception);
    }

    public TaskException(String msg, Throwable exception) {
        super(msg, exception);
        this.errMsg = msg;
    }

    public TaskException(String code, String msg, Throwable exception) {
        super(msg, exception);
        this.errMsg = msg;
        this.errCode = code;
    }

    public TaskException(String code, String msg, String bussinessMsg, Throwable exception) {
        super(msg, exception);
        this.errMsg = msg;
        this.errCode = code;
        this.bussinessMsg = bussinessMsg;
    }

    public TaskException(String code, String msg) {
        super(msg);
        this.errMsg = msg;
        this.errCode = code;
    }

    public TaskException(String code, String msg, String bussinessMsg) {
        super(msg);
        this.errMsg = msg;
        this.errCode = code;
        this.bussinessMsg = bussinessMsg;
    }

    public TaskException(int code, String msg) {
        super(msg);
        this.errMsg = msg;
        this.errCode = String.valueOf(code);
    }

    public TaskException(int code, String msg, String bussinessMsg) {
        super(msg);
        this.errMsg = msg;
        this.errCode = String.valueOf(code);
        this.bussinessMsg = bussinessMsg;
    }

    public TaskException(String msg) {
        super(msg);
        this.errMsg = msg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getBussinessMsg() {
        return bussinessMsg;
    }

    public void setBussinessMsg(String bussinessMsg) {
        this.bussinessMsg = bussinessMsg;
    }
}
