package com.example.gultsevapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class ActivityLogin extends AppCompatActivity {
    EditText loginEditText;
    EditText PasswordEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
         loginEditText = (EditText) findViewById(R.id.login);
        PasswordEditText = (EditText) findViewById(R.id.password);
        Button LoginButton = (Button) findViewById(R.id.ButtonLogin);
LoginButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String login = loginEditText.getText().toString();
        String password = PasswordEditText.getText().toString();
        if (login.equals("gruni") && password.equals("123")) {
            Snackbar.make(view, "Вы вошли в аккаунт", Snackbar.LENGTH_LONG).show();
        } else {
            Snackbar.make(view, "Пароль или логин не верный", Snackbar.LENGTH_LONG).show();
        }
    }
});
    }
}

