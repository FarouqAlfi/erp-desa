package com.example.win10.bahanpercobaan2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentDashboard extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view   = inflater.inflate(R.layout.sidebardashboard, container, false);

        Button btnopen  =   (Button) view.findViewById(R.id.btnopen2);
        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent  =   new Intent(getActivity(), Sidebar_Pertanian.class);
                intent.putExtra("some", "some data");
                startActivity(intent);
            }
        });

        return view;
    }
}