package View;

import android.app.Activity;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.util.Log;

import com.rinfon.mvp.R;

import java.io.FileNotFoundException;

import base.ErrorCode;
import base.IBaseView;
import presenter.LoginPresenter;
import repository.LoginRepository;

public class MainActivity extends Activity implements IBaseView<String> {

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPresenter = new LoginPresenter(this);
        loginPresenter.toLogin("111", "111");
    }

    @Override
    protected void onDestroy() {
        loginPresenter.unBind();
        super.onDestroy();
    }

    @Override
    public void onSuccess(String Result) {
        Log.i("MainActivity", Result);

    }

    @Override
    public void onFailed(ErrorCode errorCode) {
        Log.i("MainActivity", errorCode.getMessage());
        String msg = null;
        msg.toLowerCase();
    }

    @Override
    public void showProgress() {
        Log.i("MainActivity", "loading");
    }

    @Override
    public void hideProgress() {
        Log.i("MainActivity", "hide loading");
    }
}
