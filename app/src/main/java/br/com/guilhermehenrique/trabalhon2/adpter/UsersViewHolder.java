package br.com.guilhermehenrique.trabalhon2.adpter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import br.com.guilhermehenrique.trabalhon2.R;

public class UsersViewHolder extends RecyclerView.ViewHolder {
    final TextView name;
    final TextView email;
    final TextView website;

    public UsersViewHolder(View view){
        super(view);
        name = view.findViewById(R.id.tvNome);
        email = view.findViewById(R.id.tvEmail);
        website = view.findViewById(R.id.tvWebsite);

    }


}
