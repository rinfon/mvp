package base;

/**
 * Created by rinfon on 2018/4/8.
 */

public class BasePresenterImpl {

    public IBaseView mView;

    public BaseInteractor.Callback baseCallback = new BaseInteractor.Callback() {
        @Override
        public void onRequsetSuccess(Object result) {
            mView.hideProgress();
            mView.onSuccess(result);
        }

        @Override
        public void onRequestFailed(ErrorCode errorCode) {
            mView.hideProgress();
            mView.onFailed(errorCode);
        }

        @Override
        public void onCancel() {
            mView.onFailed(ErrorCode.BuilderCancel());
        }
    };

    public BasePresenterImpl(IBaseView mView) {
        this.mView = mView;
    }


    public void unBind() {
        mView = null;
    }
}
