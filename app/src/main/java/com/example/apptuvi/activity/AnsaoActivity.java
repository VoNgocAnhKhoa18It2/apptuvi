package com.example.apptuvi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.apptuvi.R;
import com.example.apptuvi.model.ThongTin;

public class AnsaoActivity extends AppCompatActivity {
    TextView txtNgayAm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ansao);

        addControls();
    }

    private void addControls() {
        txtNgayAm = findViewById(R.id.txtngayam);

        Intent intent = getIntent();
        if (intent.hasExtra("ThongTin")) {
            ThongTin thongTin = (ThongTin) intent.getSerializableExtra("ThongTin");
            txtNgayAm.setText("Âm Nam, sinh ngày "+thongTin.convertSolar2Lunar()+" Kỷ Mão giờ Tý");
        }
    }


}