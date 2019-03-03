package com.example.practicewithrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PlayerListAdapter extends RecyclerView.Adapter<PlayerListAdapter.PlayerListViewHolder> {
    private Context context;
    List<PlayerListPojo> playerListPojoList;

    public PlayerListAdapter(Context context, List<PlayerListPojo> playerListPojoList) {
        this.context = context;
        this.playerListPojoList = playerListPojoList;
    }

    @NonNull
    @Override
    public PlayerListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.model_playerlist_item, viewGroup, false);
        return new PlayerListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerListViewHolder playerListViewHolder, int i) {
         PlayerListPojo getItemId = playerListPojoList.get(i);
         playerListViewHolder.playerNameTv.setText(getItemId.getPlayerName());
         playerListViewHolder.playerAgeTv.setText(getItemId.getAge());
         playerListViewHolder.playerRoleTv.setText(getItemId.getRole());
         playerListViewHolder.playerCountryNameTv.setText(getItemId.getCountryName());
    }

    @Override
    public int getItemCount() {
        return playerListPojoList.size();
    }

    class PlayerListViewHolder extends RecyclerView.ViewHolder{
        private TextView playerNameTv, playerAgeTv, playerRoleTv, playerCountryNameTv;

        public PlayerListViewHolder(@NonNull View itemView) {
            super(itemView);
            playerNameTv = itemView.findViewById(R.id.playerNameTvId);
            playerAgeTv = itemView.findViewById(R.id.playerAgeTvId);
            playerRoleTv = itemView.findViewById(R.id.playerRoleTvId);
            playerCountryNameTv = itemView.findViewById(R.id.playerCountryNameTVId);

        }
    }
}
