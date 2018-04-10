package mvpclean;

import android.support.annotation.NonNull;

import java.util.HashMap;

import util.Utils;

import static util.Utils.checkNotNull;

/**
 * Created by rinfon on 2018/4/9.
 */

public class LoginTask extends UseCase<LoginTask.LoginRequestValues, BaseResponseValues> {


    @Override
    protected void executeUseCase(LoginRequestValues requestValues) {
//        TODO 网络请求

//        回调
        getUseCaseCallback().onSuccess(new BaseResponseValues(
                ResponseEntry
                        .Builder()
                        .setStatus(1)
                        .setMessage("Login success")));

    }

    public static final class LoginRequestValues extends BaseRequsetValues {

        public LoginRequestValues(@NonNull String uid, @NonNull String password) {
            super(new HashMap<String, String>());
            uid = checkNotNull(uid, "task cannot be null!");
            password = checkNotNull(password, "task cannot be null!");
            getParmas().put("uid", uid);
            getParmas().put("password", password);
        }
    }
}
