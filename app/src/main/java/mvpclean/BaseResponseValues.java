package mvpclean;

import android.support.annotation.NonNull;

import static util.Utils.checkNotNull;

/**
 * Created by rinfon on 2018/4/9.
 */

public final class BaseResponseValues implements UseCase.ResponseValue {

    private ResponseEntry mResult = null;

    public BaseResponseValues(@NonNull ResponseEntry result) {
        mResult = checkNotNull(result, "result cannot be null!");
    }

    public ResponseEntry getResult() {
        return mResult;
    }
}
