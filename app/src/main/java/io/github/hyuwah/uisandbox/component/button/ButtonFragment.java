package io.github.hyuwah.uisandbox.component.button;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import io.github.hyuwah.uisandbox.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {

    Button btnDefault, btnBorderless, btnBorderlessColored, btnColored, btnSmall, btnBarAlertDialog;

    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.i("ButtonFragment", "onCreateView: [x]");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.i("ButtonFragment", "onStart: [x]");

        btnDefault = getActivity().findViewById(R.id.btn_default);
        btnBorderless = getActivity().findViewById(R.id.btn_borderless);
        btnBorderlessColored = getActivity().findViewById(R.id.btn_borderless_colored);
        btnColored = getActivity().findViewById(R.id.btn_colored);
        btnSmall = getActivity().findViewById(R.id.btn_small);
        btnBarAlertDialog = getActivity().findViewById(R.id.btn_bar_alertdialog);


        // Set OnClickListener, Show Toast
        btnDefault.setOnClickListener(view->{
            Toast.makeText(getActivity().getBaseContext(), btnDefault.getText()+" clicked", Toast.LENGTH_SHORT).show();
        });

        btnBorderless.setOnClickListener(view -> {
            Toast.makeText(getActivity().getBaseContext(), btnBorderless.getText()+" clicked", Toast.LENGTH_SHORT).show();
        });

        btnBorderlessColored.setOnClickListener(view->{
            Toast.makeText(getActivity().getBaseContext(), btnBorderlessColored.getText()+" clicked", Toast.LENGTH_SHORT).show();
        });

        btnColored.setOnClickListener(view->{
            Toast.makeText(getActivity().getBaseContext(), btnColored.getText()+" clicked", Toast.LENGTH_SHORT).show();
        });

        btnSmall.setOnClickListener(view->{
            Toast.makeText(getActivity().getBaseContext(), btnSmall.getText()+" clicked", Toast.LENGTH_SHORT).show();
        });

        btnBarAlertDialog.setOnClickListener(view->{
            Toast.makeText(getActivity().getBaseContext(), btnBarAlertDialog.getText()+" clicked", Toast.LENGTH_SHORT).show();
        });
    }
}
