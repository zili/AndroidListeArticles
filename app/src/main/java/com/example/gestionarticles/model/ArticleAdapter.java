package com.example.gestionarticles.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.gestionarticles.R;

import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {
    TextView message;

    public ArticleAdapter(@NonNull Context context,
                          @NonNull List<Article> objects,
                          TextView msg) {
        super(context, 0, objects);
        message = msg;
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        //Récupérer l'article qui correspond à la position de l'item.
        Article article = getItem(position);

        // Vérifiez si la vue existe déjà, dans ce cas elle sera réutilisée, sinon elle sera recreée.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        // Récupérer les Labels de la vue (TextView) à modifier
        TextView tvCode     =  convertView.findViewById(R.id.Code);
        TextView tvLibelle  =  convertView.findViewById(R.id.Libelle);
        Button btn          =  convertView.findViewById(R.id.button);

        btn.setOnClickListener(v -> {
            message.setText(article.getLibelle());
            //Toast.makeText(this.getContext(), article.getLibelle(), Toast.LENGTH_SHORT).show();
        });

        // Saisir les données au niveau de la vue
        tvCode.setText(article.getCode().toString());
        tvLibelle.setText(article.getLibelle());

        // Retourner la vue réalisée pour l'afficher à l'écran
        return convertView;
    }
}
