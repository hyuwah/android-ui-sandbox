package io.github.hyuwah.uisandbox.component.button;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.hyuwah.uisandbox.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageButtonFragment extends Fragment {


    public ImageButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_button, container, false);
    }

}
