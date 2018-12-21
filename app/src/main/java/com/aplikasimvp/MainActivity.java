package com.aplikasimvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aplikasimvp.presenter.ILoginPresenter;
import com.aplikasimvp.presenter.LoginPresenter;
import com.aplikasimvp.view.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {

    EditText id_Email, id_Pass;
    Button btn_Login;

    ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id_Email = findViewById(R.id.id_email);
        id_Pass = findViewById(R.id.id_pass);
        btn_Login = findViewById(R.id.btn_login);

        loginPresenter = new LoginPresenter(this);

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = id_Email.getText().toString();
                String password = id_Pass.getText().toString();
                loginPresenter.onLogin(email, password);
            }
        });
    }

    @Override
    public void onLoginSuccess(String message) {
        Toast.makeText(this, message,Toast.LENGTH_SHORT).show();;
    }

    @Override
    public void onLoginError(String message) {
        Toast.makeText(this, message,Toast.LENGTH_SHORT).show();;
    }
}