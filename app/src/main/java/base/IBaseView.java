package base;

import java.io.FileNotFoundException;

/**
 * Created by rinfon on 2018/4/8.
 */

public interface IBaseView<T> {

    void onSuccess(T Result);

    void onFailed(ErrorCode errorCode);

    /**
     * This is a general method used for showing some kind of progress during a background task. For example, this
     * method should show a progress bar and/or disable buttons before some background work starts.
     */
    void showProgress();

    /**
     * This is a general method used for hiding progress information after a background task finishes.
     */
    void hideProgress();

}
