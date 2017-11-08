package com.example.hp_hp.recyclerviewdummy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private RecyclerView recyclerView;
   private DummyAdapter dummyAdapter;
   private GridLayoutManager gridLayoutManager;
   private Button plus;
   private Button minus;
   private int spanCount = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.RecylerView);
        plus = (Button)findViewById(R.id.btnPlus);
        minus = (Button)findViewById(R.id.btnMinus);

        dummyAdapter = new DummyAdapter();
        dummyAdapter.setHasStableIds(true);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(dummyAdapter);



        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
    }
    public int calculateRange() {
        int start = gridLayoutManager.findFirstVisibleItemPosition();
        int end = gridLayoutManager.findLastVisibleItemPosition();
        if (start < 0)
            start = 0;
        if (end < 0)
            end = 0;
        return end - start;
    }
    @Override
    public void onClick(View v) {
        if(v == plus){
            spanCount ++;
    gridLayoutManager.setSpanCount(spanCount);



        }
        if(v == minus){
            spanCount --;
            gridLayoutManager.setSpanCount(spanCount);

        }
    }


}
