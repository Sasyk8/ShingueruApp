package com.example.shingueruapp.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.shingueruapp.R;
import com.example.shingueruapp.databinding.FavoriteFragmentBinding;

public class FavoriteFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.favorite_fragment, container, false);


        return root;
    }
}