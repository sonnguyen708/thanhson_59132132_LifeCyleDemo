package vn.ntu.edu.thanhson_59132132_lifecyledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView timeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecyle","onCreate ");
        timeText = findViewById(R.id.time);
        SimpleDateFormat formatDate= new SimpleDateFormat(" HH:mm:ss");
        timeText.setText(formatDate.format(new Date()));
        Toast.makeText(getApplicationContext(),"onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecyle","onStart called");
        Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecyle","onStop called");
        Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecyle","onDestroy called");
        Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecyle","onPause called");
        Toast.makeText(getApplicationContext(),"onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecyle","onResume called");
        Toast.makeText(getApplicationContext(),"onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecyle","onRestart called");
        SimpleDateFormat formatDate= new SimpleDateFormat(" HH:mm:ss");
        timeText.setText(formatDate.format(new Date()));
        Toast.makeText(getApplicationContext(),"onRestart",Toast.LENGTH_SHORT).show();
    }
}
