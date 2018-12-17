package br.com.guilhermehenrique.trabalhon2.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import br.com.guilhermehenrique.trabalhon2.R;
import br.com.guilhermehenrique.trabalhon2.adpter.Adapter_posts;
import br.com.guilhermehenrique.trabalhon2.httpServer.HttpConnect;
import br.com.guilhermehenrique.trabalhon2.model.PostModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);


        final RecyclerView recyclerView = findViewById(R.id.recycler);
        HttpConnect conexao = HttpConnect.retrofit.create(HttpConnect.class);

        final Call<List<PostModel>> call = conexao.getPost("posts");
        call.enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                List<PostModel> lista = response.body();

                recyclerView.setAdapter(new Adapter_posts(lista, PostActivity.this));

                RecyclerView.LayoutManager layout = new LinearLayoutManager(PostActivity.this, LinearLayoutManager.VERTICAL, false);

                recyclerView.setLayoutManager(layout);
            }
            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {

            }

        });
    }
}
