package br.com.guilhermehenrique.trabalhon2.adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.guilhermehenrique.trabalhon2.R;
import br.com.guilhermehenrique.trabalhon2.model.UserModel;

public class Adapter_users extends RecyclerView.Adapter {

    private List<UserModel> users;
    private Context context;

    public Adapter_users(List<UserModel> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false);

        UsersViewHolder holder = new UsersViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        UsersViewHolder holder = (UsersViewHolder) viewHolder;
        UserModel user = users.get(position);
        holder.name.setText(user.getName());
        holder.email.setText(user.getEmail());
        holder.website.setText(user.getWebsite());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}