package com.example.shingueruapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shingueruapp.R;
import com.example.shingueruapp.models.HomeHorModel;
import com.example.shingueruapp.models.HomeVerModel;

import java.util.ArrayList;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        //holder.

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

            homeVerModels.add(new HomeVerModel(R.drawable.temaki_salmao_crucopia, "Temaki Salmão Cru", "1", "4,9", "R$19"));
            homeVerModels.add(new HomeVerModel(R.drawable.temaki_california, "Temaki California", "1", "4,3", "R$17"));
            homeVerModels.add(new HomeVerModel(R.drawable.temaki_salmao_grelhado, "Temaki Salmão Grelhado", "1", "4,5", "R$19"));
            homeVerModels.add(new HomeVerModel(R.drawable.temaki_skin, "Temaki Skin", "1", "4,3", "R$18"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.temaki_salmao_crucopia, "Temaki Salmão Cru", "1", "4,9", "R$19"));
                        homeVerModels.add(new HomeVerModel(R.drawable.temaki_california, "Temaki California", "1", "4,3", "R$17"));
                        homeVerModels.add(new HomeVerModel(R.drawable.temaki_salmao_grelhado, "Temaki Salmão Grelhado", "1", "4,5", "R$19"));
                        homeVerModels.add(new HomeVerModel(R.drawable.temaki_skin, "Temaki Skin", "1", "4,3", "R$18"));



                        updateVerticalRec.callBack(position, homeVerModels);

                    } else if (position == 1) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.hotroll8, "Hot Roll", "1", "4,3", "R$23"));
                        homeVerModels.add(new HomeVerModel(R.drawable.gunkan, "Gunkan", "1", "4,6", "R$24"));
                        homeVerModels.add(new HomeVerModel(R.drawable.maki2, "Maki", "1", "5.0", "R$23"));



                        updateVerticalRec.callBack(position, homeVerModels);

                    } else if (position == 2) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.ramen2, "Ramen 1", "2", "4,7", "R$42"));
                        homeVerModels.add(new HomeVerModel(R.drawable.ramen5, "Ramen 2", "2", "5.0", "R$42"));
                        homeVerModels.add(new HomeVerModel(R.drawable.ramen6, "Ramen 3", "2", "4,8", "R$42"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }

                    else if (position == 3) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.suco, "Suco", "1", "4,9", "R$6"));
                        homeVerModels.add(new HomeVerModel(R.drawable.guarana, "Refrigerante Guaraná", "10", "4,9", "R$9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cocacola, "Refrigerante Coca-Cola", "10", "4,9", "R$10"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }

                    else if (position == 4) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.dango5, "Dango", "1", "4,8", "R$23"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mochi, "Mochi", "1", "4,7", "R$20"));
                        homeVerModels.add(new HomeVerModel(R.drawable.wagashicopia, "Wagashi", "1", "4,5", "R$25"));


                        updateVerticalRec.callBack(position, homeVerModels);
                    }
                }
            });

            if (select){
                if (position == 0);
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
                select = false;
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
