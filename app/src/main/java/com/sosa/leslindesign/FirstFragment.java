package com.sosa.leslindesign;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    RecyclerAdapter adapter;
    List<ModelHome> model=new ArrayList<>();
    RecyclerView rv_home;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv_home=view.findViewById(R.id.rv_home);
        rv_home.setHasFixedSize(true);

        rv_home.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        model.clear();

        model.add(new ModelHome("Leslin",R.drawable.soccer_one,R.drawable.bg_blue));
        model.add(new ModelHome("Steve jobbs",R.drawable.soccer_three,R.drawable.bg_green));

        model.add(new ModelHome("Unni Ashlin",R.drawable.soccer_two,R.drawable.bg_orange));
        model.add(new ModelHome("Sibin N B",R.drawable.soccer_four,R.drawable.bg_red));
        model.add(new ModelHome("Anandhu Dileep",R.drawable.soccer_seven,R.drawable.bg_rectangle_curved));

        adapter=new RecyclerAdapter(getContext(),model);
        rv_home.setAdapter(adapter);


    }
}
