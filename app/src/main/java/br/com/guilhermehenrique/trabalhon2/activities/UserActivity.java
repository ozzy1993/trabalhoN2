package br.com.guilhermehenrique.trabalhon2.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import br.com.guilhermehenrique.trabalhon2.R;
import br.com.guilhermehenrique.trabalhon2.adpter.Adapter_users;
import br.com.guilhermehenrique.trabalhon2.httpServer.HttpConnect;
import br.com.guilhermehenrique.trabalhon2.model.UserModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);


        final RecyclerView recyclerView = findViewById(R.id.recycler);
        HttpConnect conexao = HttpConnect.retrofit.create(HttpConnect.class);

        final Call<List<UserModel>> call = conexao.getUsers("users");
        call.enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                List<UserModel> lista = response.body();

                recyclerView.setAdapter(new Adapter_users(lista, UserActivity.this));

                RecyclerView.LayoutManager layout = new LinearLayoutManager(UserActivity.this, LinearLayoutManager.VERTICAL, false);

                recyclerView.setLayoutManager(layout);
            }
            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {

            }

        });
    }
}
