package com.example.timestablebowman;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    SeekBar simpleSeekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        int num=3;
        List<String> data = new ArrayList<> (  );

        MyAdapter  adapter = new MyAdapter ( data );
        RecyclerView recyclerView = findViewById ( R.id.rv );
        recyclerView.setLayoutManager ( new LinearLayoutManager ( this ) );


        simpleSeekBar=(SeekBar)findViewById(R.id.multseekBar);

        // perform seek bar change listener event used for getting the progress value
        simpleSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
                recyclerView.setAdapter ( adapter);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub


            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.i("msgg", "convert: button clicked! ");
                data.clear ();
                for(int i=0; i < 10; i++){
                    data.add(progressChangedValue + "*"+ i + " = " + progressChangedValue*i );
                }

            }


        });



    }
}



//public class MainActivity extends AppCompatActivity {
//
//
//    SeekBar simpleSeekBar;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        // initiate  views
//        simpleSeekBar=(SeekBar)findViewById(R.id.multseekBar);
//
//        // perform seek bar change listener event used for getting the progress value
//        simpleSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            int progressChangedValue = 0;
//
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                progressChangedValue = progress;
//            }
//
//            public void onStartTrackingTouch(SeekBar seekBar) {
//                // TODO Auto-generated method stub
//            }
//
//            public void onStopTrackingTouch(SeekBar seekBar) {
//                Log.i("msgg", "convert: button clicked! ");
//
//            }
//
//
//        });
//
//    }
//
//
//}