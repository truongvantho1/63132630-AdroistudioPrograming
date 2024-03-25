package com.example.ntu_63132630.BMI;

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
    public String PhanLoai( double bmiNhap){
        String bmiPhanLoai= "";
        if(bmiNhap<16)
        {
            bmiPhanLoai="Gay";
        }else if ( bmiNhap>=16 &&  bmiNhap<18.5)
        {
            bmiPhanLoai = "vua";
        } else if ( bmiNhap>=18.5 &&  bmiNhap< 30 )
        {
            bmiPhanLoai = " Trung binh";
        }else
        {
            bmiPhanLoai = "Beo";
        }
        return bmiPhanLoai;

    }
}
