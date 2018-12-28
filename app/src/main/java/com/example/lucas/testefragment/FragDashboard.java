package com.example.lucas.testefragment;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lucas.JsonClasses.DataList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragDashboard extends Fragment {


    public FragDashboard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_dashboard, container, false);
        TextView txtRA = (TextView) view.findViewById(R.id.txtRA);
        TextView txtCurso = (TextView) view.findViewById(R.id.txtCurso);
        TextView txtRG = (TextView) view.findViewById(R.id.txtRG);
        TextView txtNome = (TextView) view.findViewById(R.id.txtNome);

        DataList d =  new DataList();
        Bundle bundle = getArguments();

        if (bundle.getString("nome_selecionado") != null ) {

            txtNome.setText(bundle.getString("nome_selecionado"));
            txtCurso.setText(bundle.getString("curso"));
            txtRA.setText(bundle.getString("ra"));
            txtRG.setText(bundle.getString("rg"));

        }

        return view;
    }

}
