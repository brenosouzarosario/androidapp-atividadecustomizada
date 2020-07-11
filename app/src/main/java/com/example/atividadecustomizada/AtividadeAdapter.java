package com.example.atividadecustomizada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import java.util.ArrayList;

public class AtividadeAdapter extends ArrayAdapter<Atividade>{
        private final Context contexto;
        private final ArrayList<Atividade> vetorAtividade;

        public AtividadeAdapter (@NonNull Context contexto, ArrayList<Atividade> vetorAtividade)
        {
          super(contexto, R.layout.registro, vetorAtividade);
          this.contexto = contexto;
          this.vetorAtividade = vetorAtividade;
        }

        public View getView(int position, View convertView, ViewGroup parent )
        {
            LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.registro, parent, false);
            TextView atividade = (TextView) rowView.findViewById(R.id.txtAtividade);
            TextView responsavel = (TextView) rowView.findViewById(R.id.txtResponsavel);
            atividade.setText(vetorAtividade.get(position).getNome_atividade());
            responsavel.setText(vetorAtividade.get(position).getResponsavel());

            return rowView;
        }
}
