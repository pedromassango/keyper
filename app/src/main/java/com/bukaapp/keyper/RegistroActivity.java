package com.bukaapp.keyper;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    private EditText edtSenha;
    private Button btnEntrar;

    public static String PREFERENCES_NAME = "prefs";

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        // referenciar as views
        edtSenha = findViewById(R.id.edt_senha);
        btnEntrar = findViewById(R.id.btn_entrar);

        preferences = getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
        String senha = preferences.getString("senha", "");

        // verifica se existe uma senha
        if(senha.trim().isEmpty()){
            registrarSenha();
        }

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String senha = edtSenha.getText().toString();
                verificarSenha(senha);
            }
        });
    }

    private void registrarSenha(){
        // inicar a actividade de registro de senha
        Intent intent = new Intent(this, RegistrarSenhaActivity.class);
        startActivity(intent);
    }

    private void verificarSenha(String senha){
        String senhaArmazenada = preferences.getString("senha", "");

        if(senhaArmazenada.equals(senha)){
            Intent intent = new Intent(this,
                    MainActivity.class);

            startActivity(intent);
        }else{
            Toast.makeText(
                    this,
                    "senha invalida!",
                    Toast.LENGTH_LONG).show();
        }
    }
}
