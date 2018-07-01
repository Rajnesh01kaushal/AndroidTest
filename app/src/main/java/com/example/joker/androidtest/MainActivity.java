package com.example.joker.androidtest;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


//TODO 11 implement ClickListner interface and override the methods and show toast of hero name clicked in it.
public class MainActivity extends AppCompatActivity  implements ClickListner {

    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private List<hero> heroesList = new ArrayList<hero>();
    private List<Movie> movieList = new ArrayList<Movie>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "HeroName", Toast.LENGTH_SHORT).show();

        //TODO 2: Create class Hero having a constructor with fields as id,name and detail and create setters and getters respectively.
        recyclerView = findViewById(R.id.recycler);




        //TODO 3: Get reference to recyclerVeiw and set its layout manager to Linear.
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);


        prepareMovieData();
    }

    private void prepareMovieData() {

        Movie movie = new Movie("batman","2017:Directed by Leslie");
        movie.setImage(R.drawable.batman);
        movieList.add(movie);

        movie = new Movie("iron_man","2017:American superhero film");
        movie.setImage(R.drawable.iron_man);

        movieList.add(movie);



    }

    @Override
    public void onClick(int position) {
        Toast.makeText(this, "Hero_Name", Toast.LENGTH_SHORT).show();

    }


    //TODO 12 Using shared preference find if user is new user or not. and show toast Welcome or Welcome again accordingly.


}
