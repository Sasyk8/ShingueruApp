package com.example.shingueruapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shingueruapp.R;
import com.example.shingueruapp.adapters.HomeHorAdapter;
import com.example.shingueruapp.adapters.HomeVerAdapter;
import com.example.shingueruapp.adapters.UpdateVerticalRec;
import com.example.shingueruapp.models.HomeHorModel;
import com.example.shingueruapp.models.HomeVerModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec, homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    /////////////////////Vertical

    ArrayList<HomeVerModel> homeVerModelsList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        ///////////////////////////Horizoontal RecyclerView
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.temaki, "Temaki"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sushi5, "Sushi"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ramen, "Ramen"));
        homeHorModelList.add(new HomeHorModel(R.drawable.bebidas, "Bebidas"));
        homeHorModelList.add(new HomeHorModel(R.drawable.dango, "Doces"));


        homeHorAdapter = new HomeHorAdapter(this, getActivity(), homeHorModelList);

        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);

        ///////////////////////////Vertical RecyclerView

        homeVerModelsList = new ArrayList<>();


        homeVerAdapter = new HomeVerAdapter(getActivity(), homeVerModelsList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));


        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {
        homeVerAdapter = new HomeVerAdapter(getContext(), list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);
    }
}