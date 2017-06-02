package com.atrio.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arr_qty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arr_qty=new ArrayList<>();
        for(int i =0;i<50;i++){
            arr_qty.add(String.valueOf(i));

        }
        RecyclerView dummy = (RecyclerView)findViewById(R.id.dummy_recycle);
        DummyAdapter adapter = new DummyAdapter(getApplicationContext(), arr_qty);
        dummy.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        dummy.setAdapter(adapter);
    }

    void senddata(){
        Log.i("hello",""+"hii Arpita Patel");
        int i =0;
        i = i+i;
    }

    void fetchdata(){
        Log.i("hello",""+"working together");

        getIntent(123567890);
    }

    private void getIntent(int i) {
        Log.i("hello",""+"This is Arpita message");

    }

}
