package mvpsimple;

/**
 * Created by rinfon on 2018/4/9.
 */

public class LoginPresenter extends BasePresenterImpl {

    IBaseRepository baseRepository;

    public LoginPresenter(IBaseView mView) {
        super(mView);
    }

    public void toLogin(String uid, String password) {
        mView.showProgress();
        baseRepository = LoginRepository.Builder(baseCallback)
                .setUid(uid).setPassword(password);
        baseRepository.Action();
    }
}
