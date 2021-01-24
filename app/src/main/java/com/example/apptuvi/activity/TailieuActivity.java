package com.example.apptuvi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.apptuvi.R;
import com.example.apptuvi.adapter.TailieuAdapter;
import com.example.apptuvi.model.tailieu;

import java.util.ArrayList;
import java.util.List;

public class TailieuActivity extends AppCompatActivity {

    private ListView listamduong;

    ArrayList<tailieu> tailieuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tailieu);

        Anhxa();
        Eventlist();
    }

    private void Eventlist() {
        tailieuList = new ArrayList<>();
        tailieuList.add(new tailieu(R.drawable.amduong,"Mệnh"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Phụ Mẫu"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Phúc Đức"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Điền Trạch"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Quan Lộc"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Nô Bộc"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Thiên Di"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Tật Ách"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Tài Bạch"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Tử Tức"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Phu Thê"));
        tailieuList.add(new tailieu(R.drawable.amduong,"Huynh Đệ"));
        TailieuAdapter tailieuAdapter = new TailieuAdapter(tailieuList,getApplicationContext());
        listamduong.setAdapter(tailieuAdapter);
    }

    private void Anhxa() {
        listamduong = findViewById(R.id.listamduong);
    }
}