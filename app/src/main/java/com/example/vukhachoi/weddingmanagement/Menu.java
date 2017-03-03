package com.example.vukhachoi.weddingmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {
    ImageView imgTiepNhan,imgDatTiec,imgTraCuu,imgHoaDon,imgBaoCao,imgThayDoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        addControls();
        addEvents();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        recreate();
    }

    private void addEvents() {
        HoatAnh();

    }

    private void addControls() {
        imgTiepNhan= (ImageView) findViewById(R.id.imgTiepNhan);
        imgTraCuu= (ImageView) findViewById(R.id.imgTraCuu);
        imgHoaDon= (ImageView) findViewById(R.id.imgHoaDon);
        imgBaoCao= (ImageView) findViewById(R.id.imgBaoCao);
        imgThayDoi= (ImageView) findViewById(R.id.imgThayDoi);

    }
    private void HoatAnh()
    {
        ThayDoiAnh(imgTiepNhan,R.drawable.sanh2);
        ThayDoiAnh(imgTraCuu,R.drawable.tiec2);
        ThayDoiAnh(imgHoaDon,R.drawable.hoadon2);
        ThayDoiAnh(imgBaoCao,R.drawable.baocao2);
        ThayDoiAnh(imgThayDoi,R.drawable.thaydoi2);

        imgTraCuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Menu.this,activityTraCuu.class);
                startActivity(intent);
            }
        });

    }

    private void ThayDoiAnh(final ImageView id1, final int id2)
    {
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id1.setImageResource(id2);
            }
        });
    }
}