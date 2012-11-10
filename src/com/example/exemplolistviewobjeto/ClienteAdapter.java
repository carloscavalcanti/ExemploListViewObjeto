package com.example.exemplolistviewobjeto;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ClienteAdapter extends BaseAdapter {
	
	private List<Cliente> clientes;
	private LayoutInflater mInflater;
	private ViewHolder holder;


	static class ViewHolder{
		private TextView txtNome;
		private TextView txtDataNascimento;
	}

	public ClienteAdapter(Context context, List<Cliente> cliente) {
		mInflater = LayoutInflater.from(context);
		this.clientes = cliente;
	}

	@Override
	public int getCount() {
		return clientes.size();
	}

	@Override
	public Object getItem(int index) {
		return clientes.get(index);
	}

	@Override
	public long getItemId(int index) {
		return index;
	}

	@Override
	public View getView(int posicao, View convertView, ViewGroup arg2) {

		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.cliente_list, null);
			holder = new ViewHolder();

			holder.txtNome = (TextView) convertView.findViewById(R.id.txtNome);
			holder.txtDataNascimento = (TextView) convertView
					.findViewById(R.id.txtDataNascimento);

			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();
		}


		Cliente cliente = clientes.get(posicao);
		holder.txtNome.setText(cliente.getNome());
		holder.txtDataNascimento.setText(cliente.getDataNascimento().toGMTString());

		return convertView;
	}

}