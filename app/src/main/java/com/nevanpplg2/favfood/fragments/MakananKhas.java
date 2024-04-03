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

public class MakananKhas extends Fragment {
    RecyclerView recyclerView;
    List<FoodItem> selection = new ArrayList<>();

    public MakananKhas() {
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
        selection.add(new FoodItem("Lunpia Semarang", "Lunpia semarang", "https://assets.kompasiana.com/items/album/2022/08/25/9289dacfeb83aaa10ba3ee7452e2b3dd-6306b05708a8b50e653cb3f2.jpeg"));
        selection.add(new FoodItem("Tahu Gimbal", "Tahu gimbal", "https://radarbanyumas.disway.id/upload/410721ef76611372f60c9be56cdaee25.jpg"));
        selection.add(new FoodItem("Bandeng Presto", "Bandeng presto", "https://paxelmarket.co/wp-content/uploads/2022/03/WhatsApp-Image-2022-03-08-at-21.25.04-600x442.jpeg"));
        selection.add(new FoodItem("Wingko Babat", "Wingko babat", "https://akcdn.detik.net.id/community/media/visual/2023/03/30/resep-wingko-babat.jpeg"));
        selection.add(new FoodItem("Soto Bangkong", "Soto bangkong", "https://cdn.idntimes.com/content-images/community/2022/02/screenshot-2022-02-13-10-00-25-667-cominstagramandroid-439827467e6df7cf57626141dd14bb18-ce50a486a7aa41bc712402d88cf9e097_600x400.png"));
    }
}
