package com.example.ntu_63132630.TinhToan;

public class TinhBMI {
    private String Loi;
    public String getLoi()
    {
        return Loi;
    }
    public double TinhToanBMI(double chieuCao, double canNang){
        double bmiNhap = -1;
        if (chieuCao <= 0 && canNang <=0)
        {
            Loi = "xin nhap lai";
        }else
        {
            bmiNhap = canNang/((chieuCao/100)*(chieuCao/100));
        }
        return bmiNhap;
    }
}
