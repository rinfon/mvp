package mvpsimple;

/**
 * Created by rinfon on 2018/4/8.
 */

public class LoginRepository extends BaseRepository implements IBaseRepository {

    private String uid;

    private String password;

    public static LoginRepository Builder(BaseInteractor.Callback callback) {
        return new LoginRepository(callback);
    }

    public String getUid() {
        return uid;
    }

    public LoginRepository setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginRepository setPassword(String password) {
        this.password = password;
        return this;
    }

    public LoginRepository(BaseInteractor.Callback callback) {
        super(callback);
    }

    @Override
    public void Action() {
//        TODO
//        网络请求
//        onRequsetSuccess("login success");

        onRequestFailed(new ErrorCode().setStatus(0).setMessage("login fail"));

    }

    @Override
    public void Cancel() {
//        TODO
//        取消网络请求

//        回调上一次进行异常处理
        onCancel();
    }
}
