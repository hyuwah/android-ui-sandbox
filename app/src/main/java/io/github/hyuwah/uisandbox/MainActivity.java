package io.github.hyuwah.uisandbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout glHome;

    final int GRID_ITEM_TV_ET = 0;
    final int GRID_ITEM_BTN = 1;
    final int GRID_ITEM_SPINNER = 2;
    final int GRID_ITEM_IV = 3;
    final int GRID_ITEM_SEEKBAR = 4;
    final int GRID_ITEM_PICKERS = 5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        glHome = (GridLayout) findViewById(R.id.main_gl_home);

        // Set Event
        setGridItemClickEvent(glHome);
    }

    private void setGridItemClickEvent(GridLayout glHome){
        // Loop all child item of Grid Layout
        for(int i=0; i<glHome.getChildCount(); i++){

            CardView cvCurrentItem = (CardView) glHome.getChildAt(i);

            final int index = i;

            cvCurrentItem.setOnClickListener(view->{

                switch(index){
                    case GRID_ITEM_TV_ET:
                        Toast.makeText(this, "TextView & EditText", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(this,TextComponentActivity.class);
                        startActivity(intent);
                        break;
                    case GRID_ITEM_BTN:
                        Toast.makeText(this, "Buttons", Toast.LENGTH_SHORT).show();
                        break;
                    case GRID_ITEM_SPINNER:
                        Toast.makeText(this, "Spinner", Toast.LENGTH_SHORT).show();

                        break;
                    case GRID_ITEM_IV:
                        Toast.makeText(this, "ImageView", Toast.LENGTH_SHORT).show();

                        break;
                    case GRID_ITEM_SEEKBAR:
                        Toast.makeText(this, "Seekbar", Toast.LENGTH_SHORT).show();

                        break;
                    case GRID_ITEM_PICKERS:
                        Toast.makeText(this, "Pickers", Toast.LENGTH_SHORT).show();

                        break;
                    case 6:
                        Toast.makeText(this, "Toast 6", Toast.LENGTH_SHORT).show();

                        break;
                    case 7:
                        Toast.makeText(this, "Toast 7", Toast.LENGTH_SHORT).show();

                        break;
                    case 8:
                        Toast.makeText(this, "Toast 8", Toast.LENGTH_SHORT).show();

                        break;
                    case 9:
                        Toast.makeText(this, "Toast 9", Toast.LENGTH_SHORT).show();

                        break;
                    case 10:
                        Toast.makeText(this, "Toast 10", Toast.LENGTH_SHORT).show();

                        break;
                    case 11:
                        Toast.makeText(this, "Toast 11", Toast.LENGTH_SHORT).show();

                        break;
                }

            });

        }
    }
}
