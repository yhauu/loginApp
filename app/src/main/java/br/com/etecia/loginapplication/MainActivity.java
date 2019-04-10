package br.com.etecia.loginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = findViewById(R.id.btnLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView txtLogin = findViewById(R.id.txtLogin);
                TextView txtSenha = findViewById(R.id.txtSenha);
                String login = txtLogin.getText().toString();
                String senha = txtSenha.getText().toString();

                if (login.equals("etecia") && senha.equals("123")) {
                    //System.out.println("Logado com sucesso");
                    Intent intentLogado = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intentLogado);
                }
                else {
                    alert("Login ou senha incorretos");
                }
            }
        });
    }

    private void alert(String message){
        Toast.makeText (this, message, Toast.LENGTH_SHORT).show();
    }
}
