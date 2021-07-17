package com.naufalshidqi.dicoding.manchesterunitedplayers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlayer;
    private ArrayList<Player> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlayer = (RecyclerView)findViewById(R.id.rv_player);
        rvPlayer.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(PlayerData.getListData());

        setActionBarTitle("Manchester United Players");
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvPlayer.setLayoutManager(new LinearLayoutManager(this));
        CardViewPlayerAdapter cardViewPresidentAdapter = new CardViewPlayerAdapter(this);
        cardViewPresidentAdapter.setListPlayer(list);
        rvPlayer.setAdapter(cardViewPresidentAdapter);

        ItemClickSupport.addTo(rvPlayer).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedPlayer(list.get(position));
            }
        });
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    private void showSelectedPlayer(Player player){
        //Toast.makeText(this, "You choose "+player.getName(), Toast.LENGTH_SHORT).show();

        // Move data
        Intent moveDataIntent = new Intent(MainActivity.this, DetailPlayerActivity.class);
        moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_NAME, player.getName());
        moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_NUMBER, player.getNumber());
        moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_POSITION, player.getPosition());
        moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_NATIONALITY, player.getNationality());
        moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_AGE, player.getAge());
        moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_BIRTH, player.getBirth());
        moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_HEIGHT, player.getHeight());
        moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_REMARKS, player.getRemarks());
        moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_PHOTO, player.getPhoto());

        startActivity(moveDataIntent);
    }
}
