package br.com.guilhermehenrique.trabalhon2.adpter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import br.com.guilhermehenrique.trabalhon2.R;

public class PostsViewHolder extends RecyclerView.ViewHolder {
    final TextView title;
    final TextView body;

    public PostsViewHolder(View view){
        super(view);
        title = view.findViewById(R.id.tvTitle);
        body = view.findViewById(R.id.tvBody);

    }


}
