package com.example.gestionarticles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.gestionarticles.model.Article;
import com.example.gestionarticles.model.ArticleAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = findViewById(R.id.msg);

        List<Article> lesArticles = new ArrayList<>();

        lesArticles.add(new Article(1,"Pain"));
        lesArticles.add(new Article(2,"Huile"));
        lesArticles.add(new Article(3,"Pomme"));
        lesArticles.add(new Article(4,"Thé"));
        lesArticles.add(new Article(5,"Stylo"));
        lesArticles.add(new Article(6,"Cahier"));

        ArticleAdapter articleAdapter = new ArticleAdapter(this, lesArticles,msg);

        ListView listView = findViewById(R.id.lstArts);

        listView.setAdapter(articleAdapter);

        articleAdapter.add(new Article(7,"Un autre !"));
    }
}