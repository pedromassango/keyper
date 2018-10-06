package com.bukaapp.keyper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class PasswordsAdapter extends
        RecyclerView.Adapter<PasswordViewHolder> {

    private ArrayList<Senha> dados = new ArrayList<>();

    @NonNull
    @Override
    public PasswordViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                 int viewType) {
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.linha_password, parent, false);

        return new PasswordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PasswordViewHolder holder,
                                 int position) {
        Senha s = dados.get(position);

        holder.bindViews(s);
    }

    @Override
    public int getItemCount() {
        return dados.size();
    }

    public void add(Senha mSenha){
        dados.add( mSenha);
        notifyDataSetChanged();
    }

    public void add(List<Senha> arrayList){
        dados.addAll( arrayList);
        notifyDataSetChanged();
    }
}
