package com.bukaapp.keyper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PasswordViewHolder extends RecyclerView.ViewHolder {

    private TextView tvTitulo, tvSenha;

    public PasswordViewHolder(@NonNull View itemView) {
        super(itemView);

        tvTitulo = itemView.findViewById(R.id.tv_titulo);
        tvSenha = itemView.findViewById(R.id.tv_senha);
    }

    public void bindViews(Senha senha){
        tvTitulo.setText( senha.getTipo());
        tvSenha.setText( senha.getSenha());
    }
}
