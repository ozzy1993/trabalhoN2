package br.com.guilhermehenrique.trabalhon2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.guilhermehenrique.trabalhon2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        Intent intent = null;

        switch (view.getId()){
            case R.id.btnPost:
                intent = new Intent(this, PostActivity.class);

                startActivity(intent);
                break;
            default:
                intent = new Intent(this, UserActivity.class);

                startActivity(intent);
        }
    }
}
