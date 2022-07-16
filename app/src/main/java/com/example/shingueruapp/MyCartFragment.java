package com.example.shingueruapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shingueruapp.adapters.CartAdapter;
import com.example.shingueruapp.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.temaki_salmao_crucopia, "Temaki Salmão Cru", "R$17", "4.3"));
        list.add(new CartModel(R.drawable.temaki_california, "Temaki California", "R$17", "4.3"));
        list.add(new CartModel(R.drawable.hotroll8, "Hot Roll", "R$23", "4.3"));
        list.add(new CartModel(R.drawable.ramen2, "Ramen 1", "R$42", "4.7"));
        list.add(new CartModel(R.drawable.dango5, "Dango", "R$23", "4.8"));
        list.add(new CartModel(R.drawable.barca8, "Barca 2", "R$60", "4.4"));

        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

        return view;
    }
}