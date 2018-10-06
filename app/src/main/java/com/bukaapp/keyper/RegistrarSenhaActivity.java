package com.bukaapp.keyper;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistrarSenhaActivity extends AppCompatActivity {

    private EditText edt1, edt2;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_senha);

        edt1 = findViewById(R.id.edt_senha_1);
        edt2 = findViewById(R.id.edt_senha_2);

        preferences = getSharedPreferences(RegistroActivity.PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public void salvarSenha(View view){
        String senha1 = edt1.getText().toString();
        String senha2 = edt2.getText().toString();

        if(senha1.isEmpty() || senha2.isEmpty()){
            return;
        }

        if(!senha1.equals(senha2)){
            edt2.setError("A senha não conscidem!");
        }else{
            // a senha conscidem, salvar na base de dados

            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("senha", senha2);
            editor.apply();

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
