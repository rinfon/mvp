package mvpclean;

/**
 * Created by rinfon on 2018/4/9.
 */

public class ResponseEntry {

    int status;

    String message;

    public static ResponseEntry Builder() {
        return new ResponseEntry();
    }

    public ResponseEntry() {
    }

    public int getStatus() {
        return status;
    }

    public ResponseEntry setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseEntry setMessage(String message) {
        this.message = message;
        return this;
    }
}
