package com.example.baitaptuanhocsoonline;

public class Landscape {
    String LandHinhAnh;
    String LandViTri;

    public Landscape(String landHinhAnh, String landViTri) {
        LandHinhAnh = landHinhAnh;
        LandViTri = landViTri;
    }

    public String getLandHinhAnh() {
        return LandHinhAnh;
    }

    public void setLandHinhAnh(String landHinhAnh) {
        LandHinhAnh = landHinhAnh;
    }

    public String getLandViTri() {
        return LandViTri;
    }

    public void setLandViTri(String landViTri) {
        LandViTri = landViTri;
    }
}
