package com.example.a207_1.androidcafe;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.Nullable;

/**
 * Created by 207-1 on 21/01/2018.
 */

public class FragmentList extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, null);
        setupRecyclerView(view);
        return view;
    }

    public void setupRecyclerView(View View) {
        RecyclerView recyclerview= (RecyclerView)
                View.findViewById(R.id.recyclerview);
        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(),
                MenuData.getListMenu());
        recyclerview.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(manager);
    }
}
