package poly.com.asmqlnv;

public class ModelNhanVien {
    private String MaNV;
    private String hoten;
    private int tuoi;
    private String email;
    private double luong;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public ModelNhanVien() {
    }

    public ModelNhanVien(String MaNV, String hoten, int tuoi, String email, double luong) {
        this.MaNV = MaNV;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return String.format("|%-10s|%-10s|%4d|%-20s|%.3f|\n", MaNV, hoten, tuoi, email, luong);
    }
    
    
    
}
