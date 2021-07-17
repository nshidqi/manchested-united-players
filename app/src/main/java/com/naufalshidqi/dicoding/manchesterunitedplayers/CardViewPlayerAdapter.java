package com.naufalshidqi.dicoding.manchesterunitedplayers;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewPlayerAdapter extends RecyclerView.Adapter<CardViewPlayerAdapter.CardViewViewHolder>{
    private ArrayList<Player> listPlayer;
    private Context context;

    public CardViewPlayerAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Player> getListPlayer() {
        return listPlayer;
    }

    public void setListPlayer(ArrayList<Player> listPlayer) {
        this.listPlayer = listPlayer;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_player, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {

        Player p = getListPlayer().get(position);

        Glide.with(context)
                .load(p.getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);

        holder.tvName.setText(p.getName());
        holder.tvNumber.setText(p.getNumber());
        holder.tvPosition.setText(p.getPosition());

        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite "+getListPlayer().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                //Toast.makeText(context, "Detail " + getListPlayer().get(position).getName(), Toast.LENGTH_SHORT).show();

                // Move data
                Intent moveDataIntent = new Intent(context, DetailPlayerActivity.class);
                moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_NAME, getListPlayer().get(position).getName());
                moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_NUMBER, getListPlayer().get(position).getNumber());
                moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_POSITION, getListPlayer().get(position).getPosition());
                moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_NATIONALITY, getListPlayer().get(position).getNationality());
                moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_AGE, getListPlayer().get(position).getAge());
                moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_BIRTH, getListPlayer().get(position).getBirth());
                moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_HEIGHT, getListPlayer().get(position).getHeight());
                moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_REMARKS, getListPlayer().get(position).getRemarks());
                moveDataIntent.putExtra(DetailPlayerActivity.EXTRA_PHOTO, getListPlayer().get(position).getPhoto());

                context.startActivity(moveDataIntent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListPlayer().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvNumber, tvPosition;
        Button btnFavorite, btnDetail;
        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvNumber = (TextView)itemView.findViewById(R.id.tv_item_number);
            tvPosition = (TextView)itemView.findViewById(R.id.tv_item_position);
            btnFavorite = (Button)itemView.findViewById(R.id.btn_set_favorite);
            btnDetail = (Button)itemView.findViewById(R.id.btn_set_detail);
        }
    }
}
