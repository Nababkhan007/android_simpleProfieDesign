package com.example.practicewithrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ShowPlayerInfoActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlayerListAdapter playerListAdapter;
    List<PlayerListPojo> playerListPojoList;
    private TextView playerNameTv, playerAgeTv, playerRoleTv, playerCountryNameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_player_info);

        playerNameTv = findViewById(R.id.playerNameTvId);
        playerAgeTv = findViewById(R.id.playerAgeTvId);
        playerRoleTv = findViewById(R.id.playerRoleTvId);
        playerCountryNameTv = findViewById(R.id.playerCountryNameTVId);

        String name = getIntent().getStringExtra("name");
        String age =  getIntent().getStringExtra("age");
        String role =  getIntent().getStringExtra("role");
        String country = getIntent().getStringExtra("countryName");

        playerNameTv.setText(name);
        playerAgeTv.setText(age);
        playerRoleTv.setText(role);
        playerCountryNameTv.setText(country);

       /* List<String> addPlayerList = new ArrayList<>();
        addPlayerList.add(name);
        addPlayerList.add(age);
        addPlayerList.add(role);
        addPlayerList.add(country);*/

       /* playerListPojoList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        playerListAdapter = new PlayerListAdapter(this, playerListPojoList);
        recyclerView.setAdapter(playerListAdapter);*/
    }
}
