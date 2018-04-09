package base;

/**
 * Created by rinfon on 2018/4/9.
 */

public class BaseRepository {
    private BaseInteractor.Callback callback;


    public BaseInteractor.Callback getCallback() {
        return callback;
    }

    public BaseRepository(BaseInteractor.Callback callback) {
        this.callback = callback;
    }

    public void onRequsetSuccess(Object result) {
        try {
            callback.onRequsetSuccess(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void onRequestFailed(ErrorCode errorCode) {
        try {
            callback.onRequestFailed(errorCode);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void onCancel() {
        try {
            callback.onCancel();
        } catch (Exception ex) {
        }
    }
}
