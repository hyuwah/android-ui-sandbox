package io.github.hyuwah.uisandbox;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.github.hyuwah.uisandbox.component.button.ButtonFragment;
import io.github.hyuwah.uisandbox.component.button.CheckboxFragment;
import io.github.hyuwah.uisandbox.component.button.ImageButtonFragment;
import io.github.hyuwah.uisandbox.component.button.RadioButtonFragment;
import io.github.hyuwah.uisandbox.component.button.ToggleSwitchButtonFragment;

public class ButtonComponentActivity extends AppCompatActivity {

    FragmentTransaction ft;
    ButtonFragment frgButton;
    ImageButtonFragment frgImageButton;
    ToggleSwitchButtonFragment frgToggleButton;
    CheckboxFragment frgCheckbox;
    RadioButtonFragment frgRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_component);

        Log.i("ButtonComponentActivity", "onCreate: [x]");


        // Attach Button Fragment
        frgButton = new ButtonFragment();
        ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.button_frg_container, frgButton).commit();

        // Attach ImageButton Fragment
        frgImageButton = new ImageButtonFragment();
        ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.image_button_frg_container, frgImageButton).commit();

        // Attach ToggleButton Fragment
        frgToggleButton = new ToggleSwitchButtonFragment();
        ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.toggle_button_frg_container, frgToggleButton).commit();

        // Attach Checkbox Fragment
        frgCheckbox = new CheckboxFragment();
        ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.checkbox_frg_container, frgCheckbox).commit();

        // Attach Checkbox Fragment
        frgRadioButton = new RadioButtonFragment();
        ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.radio_button_frg_container, frgRadioButton).commit();

        // Attach more fragment

    }

}
