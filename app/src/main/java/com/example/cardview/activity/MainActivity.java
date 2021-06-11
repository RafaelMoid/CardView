package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);
        //Na aula 101 você aprende a fazer um card view na vertical, imitando o netflix

        //Adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Rafael Varela", "Me contrata", R.drawable.imagem1);
        this.postagens.add ( p );

        p = new Postagem("Sou lindo", "E amo estudar", R.drawable.imagem2);
        this.postagens.add ( p );

        p = new Postagem("Aprendo rapido", "pode confiar", R.drawable.imagem3);
        this.postagens.add ( p );

        p = new Postagem("Não custa falar dinovo", "Me contrata", R.drawable.imagem4);
        this.postagens.add ( p );
    }
}
