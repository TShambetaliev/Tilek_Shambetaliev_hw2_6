package com.example.tilek_shambetaliev_hw2_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText password = findViewById(R.id.password);
        EditText login = findViewById(R.id.login);
        MaterialButton voyti = findViewById(R.id.button_vhod);
        TextView zabytparol = findViewById(R.id.zabyli_parol);
        TextView parolnajat = findViewById(R.id.najmite);
        TextView vypolnitevhod = findViewById(R.id.vypolnite_vhod);
        TextView vhod = findViewById(R.id.vhod);
        /*if (password.getText().toString().equals(null)&&login.getText().toString().equals(null)){
            voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));
        } else {
            voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
        }*/
        login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence cS1, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence cS1, int start, int before, int count) {
                if (login.getText().toString().isEmpty() && password.getText().toString().isEmpty()){
                    voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));
                } else {
                    voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence cS1, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence cS1, int start, int before, int count) {
                if (password.getText().toString().isEmpty())  {
                    voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));
                } else {
                    voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        findViewById(R.id.button_vhod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().equals("admin") && login.getText().toString().equals("admins")){
                    password.animate().alpha(0).setDuration(1000);
                    login.animate().alpha(0).setDuration(1000);
                    voyti.animate().alpha(0).setDuration(1000);
                    zabytparol.setVisibility(View.GONE);
                    parolnajat.setVisibility(View.GONE);
                    vypolnitevhod.animate().alpha(0).setDuration(1000);
                    vhod.animate().alpha(0).setDuration(1000);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Неправильный логин или пароль",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
    }
