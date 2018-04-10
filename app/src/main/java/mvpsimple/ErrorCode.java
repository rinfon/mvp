package mvpsimple;

/**
 * Created by rinfon on 2018/4/8.
 */

public class ErrorCode {


    int status;

    String message;

    public static ErrorCode Builder() {
        return new ErrorCode();
    }

    public static ErrorCode BuilderCancel() {
        return new ErrorCode().setStatus(0).setMessage("onCancel");
    }

    public int getStatus() {
        return status;
    }

    public ErrorCode setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ErrorCode setMessage(String message) {
        this.message = message;
        return this;
    }
}
