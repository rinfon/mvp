package mvpclean;

/**
 * Created by rinfon on 2018/4/9.
 */

public class LoginContract {
    public interface View<T> {
        void showLoading();

        void closeLoading();

        void onSuccess(T Result);

        void onFail();
    }

    public interface Presenter {
        void login(String uid, String password);
    }
}
