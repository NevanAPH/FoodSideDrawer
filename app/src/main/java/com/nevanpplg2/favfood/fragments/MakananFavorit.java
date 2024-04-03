package com.nevanpplg2.favfood.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nevanpplg2.favfood.R;
import com.nevanpplg2.favfood.adapters.FoodAdapter;
import com.nevanpplg2.favfood.models.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class MakananFavorit extends Fragment {
    RecyclerView recyclerView;
    List<FoodItem> selection = new ArrayList<>();

    public MakananFavorit() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSelection();

        recyclerView = view.findViewById(R.id.content_list);
        recyclerView.setAdapter(new FoodAdapter(this.requireContext(), selection));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.requireContext(), LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.recycler_fragment, container, false);
    }

    private void addSelection() {
        selection.add(new FoodItem("Nasi Goreng", "Nasi goreng", "https://ik.imagekit.io/mynepworks/img_nasgor.jpg"));
        selection.add(new FoodItem("Ayam Geprek", "Ayam geprek", "https://ik.imagekit.io/mynepworks/img_ayam_geprek.png"));
        selection.add(new FoodItem("Mie Ayam", "Mie ayam", "https://ik.imagekit.io/mynepworks/img_mie_ayam.jpeg"));
        selection.add(new FoodItem("Bakso", "Bakso", "https://ik.imagekit.io/mynepworks/img_bakso.jpg"));
        selection.add(new FoodItem("Sate Ayam", "Sate ayam", "https://ik.imagekit.io/mynepworks/img_sate_ayam.jpg"));
    }
}
