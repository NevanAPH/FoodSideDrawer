package com.nevanpplg2.favfood.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nevanpplg2.favfood.R;
import com.nevanpplg2.favfood.adapters.FoodAdapter;
import com.nevanpplg2.favfood.models.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class MinumanKhas extends Fragment {
    RecyclerView recyclerView;
    List<FoodItem> selection = new ArrayList<>();

    public MinumanKhas() {
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
        selection.add(new FoodItem("Wedang Tahu", "Wedang tahu", "https://asset.kompas.com/crops/TCaJKaD6g38G-oDacqR5XrB_NOg=/0x0:750x500/750x500/data/photo/2023/04/19/643f96f5e5963.jpg"));
        selection.add(new FoodItem("Jamu jun", "Jamu jun", "https://cdn0-production-images-kly.akamaized.net/fd3LfDmgFNdrakAVX4w6ETdrMw8=/640x640/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/4386707/original/014121000_1680859055-175169141_290865705867189_4844340946326746712_n.jpg"));
        selection.add(new FoodItem("Wedang Ronde", "Wedang Ronde", "https://img-global.cpcdn.com/recipes/c0da170a95e73250/680x482cq70/wedang-ronde-foto-resep-utama.webp"));
//        selection.add(new FoodItem("Wingko Babat", "Wingko babat", "https://akcdn.detik.net.id/community/media/visual/2023/03/30/resep-wingko-babat.jpeg"));
//        selection.add(new FoodItem("Soto Bangkong", "Soto bangkong", "https://cdn.idntimes.com/content-images/community/2022/02/screenshot-2022-02-13-10-00-25-667-cominstagramandroid-439827467e6df7cf57626141dd14bb18-ce50a486a7aa41bc712402d88cf9e097_600x400.png"));
    }
}
