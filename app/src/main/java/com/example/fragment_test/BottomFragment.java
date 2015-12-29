package com.example.fragment_test;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class BottomFragment extends Fragment implements OnClickListener {
    private Button b_facepage;
    private Button b_hahaha;
    private Button b_shopcart;
    private Button b_mine;
    private FaceFragment lay_facefragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_fragment,
                container, false);
        b_facepage = (Button) view.findViewById(R.id.id_facepage);
        b_facepage.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d("click","hello world");
                b_facepage.setText("fanfan");
                Fragment fragment = new FaceFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.id_content, fragment)
                        .commit();
            }
        });
        return view;
    }


    @Override
    public void onClick(View v) {

    }

}
