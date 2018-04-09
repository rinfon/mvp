package base;

/**
 * Created by rinfon on 2018/4/8.
 */

public interface BaseInteractor extends Interactor {
    interface Callback {
        void onRequsetSuccess(Object result);

        void onRequestFailed(ErrorCode ErrorMode);

        void onCancel();
    }
}
