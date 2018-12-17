package br.com.guilhermehenrique.trabalhon2.httpServer;

import java.util.List;

import br.com.guilhermehenrique.trabalhon2.model.PostModel;
import br.com.guilhermehenrique.trabalhon2.model.UserModel;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface HttpConnect {

    @GET("/{users}")
    Call<List<UserModel>> getUsers(@Path("users") String users);

    @GET("/{posts}")
    Call<List<PostModel>> getPost(@Path("posts") String posts);


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
