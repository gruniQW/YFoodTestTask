package com.example.gultsevapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText loginEditText = (EditText) findViewById(R.id.login);
        EditText PasswordEditText = (EditText) findViewById(R.id.password);
        Button LoginButton = (Button) findViewById(R.id.ButtonLogin);
LoginButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String login = LoginEditText.getText().toString();
        String password = PsswordEditText.getText().toString();
        Snackbar.make(view, "Пароль не верный", Snackbar.LENGTH_LONG).show();
    }
});
    }
}

