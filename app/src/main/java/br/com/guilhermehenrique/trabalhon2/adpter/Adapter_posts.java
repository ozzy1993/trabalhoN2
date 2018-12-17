package br.com.guilhermehenrique.trabalhon2.adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.guilhermehenrique.trabalhon2.R;
import br.com.guilhermehenrique.trabalhon2.model.PostModel;

public class Adapter_posts extends RecyclerView.Adapter {

    private List<PostModel> posts;
    private Context context;

    public Adapter_posts(List<PostModel> post, Context context) {
        this.posts = post;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_post, parent, false);

        PostsViewHolder holder = new PostsViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        PostsViewHolder holder = (PostsViewHolder) viewHolder;
        PostModel post = posts.get(position);
        holder.body.setText(post.getBody());
        holder.title.setText(post.getTitle());
    }

    @Override
    public int getItemCount() {

        return posts.size();
    }
}