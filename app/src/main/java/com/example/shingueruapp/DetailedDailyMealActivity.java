package com.example.shingueruapp;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shingueruapp.adapters.DetailedDailyAdapter;
import com.example.shingueruapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("1")) {

            imageView.setImageResource(R.drawable.ramen2);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.combinado4, "Ramen + Hot Roll ", "", "4.4", "R$27", "2"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.combinado3, "Ramen + Hot Roll 2", "", "4.5", "R$26", "2"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("2")) {

            imageView.setImageResource(R.drawable.combinado9);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.combinado5, "Combo Sushi 1", "", "4.8", "R$28", "1"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.combinado6, "Combo Sushi 2", "", "4.7", "R$25", "1"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("3")) {

            imageView.setImageResource(R.drawable.barca4);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.barca5, "Barca 1", "", "4.8", "R$70", "2"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.barca8, "Barca 2", "", "4.4", "R$60", "2"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.barca7, "Barca 3", "", "4.7", "R$130", "4"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("4")) {

            imageView.setImageResource(R.drawable.temakipagina);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.combinado8, "Temaki + Sushi", "", "4.8", "R$32", "1"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.combinado7, "Temaki + Sushi 2", "", "4.7", "R$30", "1"));
            dailyAdapter.notifyDataSetChanged();
        }

    }
}