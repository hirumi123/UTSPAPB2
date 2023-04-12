package com.example.nyobadrawer;

import static com.example.nyobadrawer.SetPin.MyPREFERENCES;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;




public class ForgotPin extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sharedpreferences;
    EditText etEmail;
    Button btnSendPin;
    View v;
    private CoordinatorLayout coordinatorLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_forgot_pin);

        etEmail = (EditText) findViewById(R.id.etEmail);
        btnSendPin = (Button)findViewById(R.id.btnSendPin);
        btnSendPin.setOnClickListener(this);

    }
    private void sendEmail() {
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        final String email = sharedpreferences.getString("emailKey", "");
        final String pin = sharedpreferences.getString("passwordKey", "");
        String subject = "Anti-Theft Alarm";
        String message ="Your Pin: "+pin;
        final InputMethodManager inputManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        String enteredEmail = etEmail.getText().toString();

    }


    public boolean isOnline() {
        ConnectivityManager connManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connManager.getActiveNetworkInfo();

        if(networkInfo != null && networkInfo.isConnectedOrConnecting()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void onClick(View v) {

        sendEmail();

    }

}