package mvpsimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.rinfon.mvp.R;

import mvpclean.MvpCleanActivity;


public class MainActivity extends Activity implements IBaseView<String> {

    LoginPresenter loginPresenter;

    TextView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (TextView) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MvpCleanActivity.class);
                startActivity(intent);
            }
        });
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
