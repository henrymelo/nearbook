package br.com.caelum.casadocodigo.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.caelum.casadocodigo.R;
import br.com.caelum.casadocodigo.modelo.Cartao;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by android7392 on 28/04/18.
 */

public class CartaoAdapter extends RecyclerView.Adapter {

    private List<Cartao> cartoes;

    public CartaoAdapter(List<Cartao> cartoes) {
        this.cartoes = cartoes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cartao, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        Cartao cartao = cartoes.get(position);
        ViewHolder holder = (ViewHolder) viewHolder;
        holder.nome.setText(cartao.getNomeCompleto());
        holder.numero.setText(cartao.getNomeCompleto());
        holder.validade.setText(cartao.getValidade());
        holder.cvv.setText(cartao.getCvv().toString());
    }

    @Override
    public int getItemCount() {
        return cartoes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.titular_cartao_item)
        TextView nome;

        @BindView(R.id.numero_cartao_item)
        TextView numero;

        @BindView(R.id.validade_cartao_item)
        TextView validade;

        @BindView(R.id.cvv_cartao_item)


        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);
        }
    }
}
