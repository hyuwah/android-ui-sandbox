package io.github.hyuwah.uisandbox.component.button;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import io.github.hyuwah.uisandbox.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RadioButtonFragment extends Fragment {

    RadioGroup radioGroup;
    TextView tvRadioSelected;

    public RadioButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_radio_button, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        radioGroup = getActivity().findViewById(R.id.radio_group);
        tvRadioSelected = getActivity().findViewById(R.id.radio_selected_text);

        radioGroup.setOnCheckedChangeListener((rg, i) -> {
            switch (i){
                case R.id.rb_1:
                    tvRadioSelected.setText("Selected : Option 1");
                    break;
                case R.id.rb_2:
                    tvRadioSelected.setText("Selected : Option 2");
                    break;
                case R.id.rb_3:
                    tvRadioSelected.setText("Selected : Option 3");
                    break;
            }
        });


    }
}
