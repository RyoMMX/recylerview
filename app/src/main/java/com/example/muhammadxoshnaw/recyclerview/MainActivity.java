package com.example.muhammadxoshnaw.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));
        movies.add(new Movie("hello"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new MovieAdapter(movies));

    }
}
