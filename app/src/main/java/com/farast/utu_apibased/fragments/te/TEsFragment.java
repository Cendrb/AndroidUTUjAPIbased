package com.farast.utu_apibased.fragments.te;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.farast.utu_apibased.Bullshit;
import com.farast.utu_apibased.R;
import com.farast.utu_apibased.listeners.OnListFragmentInteractionListener;
import com.farast.utuapi.data.TEItem;

/**
 * Created by cendr_000 on 05.08.2016.
 */

public class TEsFragment extends Fragment {

    public TEsFragment()
    {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(new TEsRecyclerViewAdapter(Bullshit.dataLoader.getTEsList(), new OnListFragmentInteractionListener<TEItem>() {
                @Override
                public void onListFragmentInteraction(TEItem item) {
                    Snackbar.make(getView(), "Article show screen", 3).show();
                }
            }));
        }
        return view;
    }
}
