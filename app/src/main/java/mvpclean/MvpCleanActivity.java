package mvpclean;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.rinfon.mvp.R;

public class MvpCleanActivity extends Activity implements LoginContract.View<BaseResponseValues> {

    CleanLoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPresenter = new CleanLoginPresenter(this, UseCaseHandler.getInstance(), new LoginTask());
        loginPresenter.login("111", "111");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void showLoading() {
        Log.i("MvpCleanActivity", "showloading");

    }

    @Override
    public void closeLoading() {
        Log.i("MvpCleanActivity", "closeloading");

    }

    @Override
    public void onSuccess(BaseResponseValues r) {
        Log.i("MvpCleanActivity", r.getResult().getMessage());
//        will crash
        String msg = null;
        msg.toLowerCase();
    }

    @Override
    public void onFail() {
        Log.i("MvpCleanActivity", "login fail");
    }


}
