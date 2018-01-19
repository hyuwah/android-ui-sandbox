package io.github.hyuwah.uisandbox;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

public class PickerActivity extends AppCompatActivity{

    EditText etDatePicker, etTimePicker;
    NumberPicker numberPicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);

        etDatePicker = findViewById(R.id.et_date_picker);
        etTimePicker = findViewById(R.id.et_time_picker);
        numberPicker = findViewById(R.id.numberPicker);

        numberPicker.setMaxValue(10);
        numberPicker.setMinValue(0);
        numberPicker.setValue(0);

        // TODO: Hide Soft Keyboard

        etDatePicker.setOnClickListener(view -> {
            Toast.makeText(this, "Shows Date Picker", Toast.LENGTH_SHORT).show();
        });

        etTimePicker.setOnClickListener(view->{
            Toast.makeText(this, "Shows Time Picker", Toast.LENGTH_SHORT).show();
        });
    }
}
