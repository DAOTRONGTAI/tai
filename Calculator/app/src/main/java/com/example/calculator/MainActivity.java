package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvKetQua;
    Button btnCong,btnTru,btnNhan,btnChia,btnDelete;
    EditText edtST1,edtST2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvKetQua = findViewById(R.id.tv_KetQua);
        edtST1 = findViewById(R.id.edt_sothu1);
        edtST2 = findViewById(R.id.edt_sothu2);
        btnCong = findViewById(R.id.btn_Cong);
        btnTru = findViewById(R.id.btn_Tru);
        btnNhan = findViewById(R.id.btn_Nhan);
        btnChia = findViewById(R.id.btn_Chia);
        btnDelete = findViewById(R.id.btn_Delete);

        tinhtoan();
        detele();

    }
    public void  tinhtoan(){

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = edtST1.getText().toString();
                String s2 = edtST2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Bạn chưa nhập hết thông tin",Toast.LENGTH_LONG).show();
                    return;
                }
                float tong = Float.parseFloat(s1) + Float.parseFloat(s2);
                tvKetQua.setText(String.valueOf(tong));
                //Toast.makeText(MainActivity.this,"Button cộng", Toast.LENGTH_LONG).show();
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = edtST1.getText().toString();
                String s2 = edtST2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Bạn chưa nhập hết thông tin",Toast.LENGTH_LONG).show();
                    return;
                }
                float tru = Float.parseFloat(s1) - Float.parseFloat(s2);
                Log.d("bbb","Hiệu là: "+ tru);
                tvKetQua.setText(String.valueOf(tru));
                //Toast.makeText(MainActivity.this,"Button cộng", Toast.LENGTH_LONG).show();
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = edtST1.getText().toString();
                String s2 = edtST2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Bạn chưa nhập hết thông tin",Toast.LENGTH_LONG).show();
                    return;
                }
                float nhan = Float.parseFloat(s1) * Float.parseFloat(s2);
                tvKetQua.setText(String.valueOf(nhan));
                //Toast.makeText(MainActivity.this,"Button cộng", Toast.LENGTH_LONG).show();
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = edtST1.getText().toString();
                String s2 = edtST2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Bạn chưa nhập hết thông tin",Toast.LENGTH_LONG).show();
                    return;
                }
                float chia = Float.parseFloat(s1) / Float.parseFloat(s2);
                if(Float.parseFloat(s2) == 0)
                {
                    Toast.makeText(MainActivity.this,"mẫu ko là 0 đc",Toast.LENGTH_LONG).show();
                }else{
                    tvKetQua.setText(String.format("%.2f",chia));
                }

                //Toast.makeText(MainActivity.this,"Button cộng", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void detele(){

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtST1.setText("");
                edtST2.setText("");
                tvKetQua.setText("");
            }
        });

    }
}