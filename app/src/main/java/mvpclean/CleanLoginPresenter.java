package mvpclean;

/**
 * Created by rinfon on 2018/4/9.
 */

public class CleanLoginPresenter implements LoginContract.Presenter {

    private final LoginContract.View mView;

    private final UseCaseHandler mUseCaseHandler;

    private final LoginTask loginTask;

    public CleanLoginPresenter(LoginContract.View mView, UseCaseHandler mUseCaseHandler, LoginTask loginTask) {
//        TODO 参数过多，使用builder模式
        this.mView = mView;
        this.mUseCaseHandler = mUseCaseHandler;
        this.loginTask = loginTask;
    }

    @Override
    public void login(String uid, String password) {
        mView.showLoading();
        mUseCaseHandler.execute(loginTask, new LoginTask.LoginRequestValues(uid, password),
                new UseCase.UseCaseCallback<BaseResponseValues>() {

                    @Override
                    public void onSuccess(BaseResponseValues response) {
                        mView.closeLoading();
                        mView.onSuccess(response);
                    }

                    @Override
                    public void onError() {
                        mView.closeLoading();
                        mView.onFail();
                    }
                });
    }
}
