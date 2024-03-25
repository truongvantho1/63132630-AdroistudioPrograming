package com.example.ntu_63132630;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ntu_63132630.BMI.TinhBMI;

public class MainActivity extends AppCompatActivity {
    EditText Cao, Nang;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cao = findViewById(R.id.nhapCao);
        Nang = findViewById(R.id.nhapcanNang);
        tvKetQua = findViewById(R.id.tvKetQua);
    }

    public void onCaculateButtonClick(View view) {
        double ChieuCao = 0;
        double CanNang = 0;

        if (!Cao.getText().toString().isEmpty()) {
            ChieuCao = Double.parseDouble(Cao.getText().toString());
        }

        if (!Nang.getText().toString().isEmpty()) {
            CanNang = Double.parseDouble(Nang.getText().toString());
        }

        TinhBMI tinhBMI = new TinhBMI();
        double BMI = tinhBMI.TinhToanBMI(ChieuCao, CanNang);

        String Ketqua;

        if (BMI != -1) {
            String BMIcat = tinhBMI.PhanLoai(BMI);
            Ketqua = "Chỉ số BMI của bạn là: " + BMI + "\n" + "Phân loại BMI: " + BMIcat;
        } else {
            Ketqua = "Vui lòng nhập đúng chiều cao và cân nặng";
        }

        tvKetQua.setText(Ketqua);
    }
}