package poly.com.data;

public class ModelNhanVienFind  extends ModelNhanVien{
    private int nvIndex;
    
    public int getNvIndex() {
        return nvIndex;
    }

    public void setNvIndex(int nvIndex) {
        this.nvIndex = nvIndex;
    }

    public ModelNhanVienFind() {

    }

    public ModelNhanVienFind(int nvIndex, String MaNV, String hoten, int tuoi, String email, double luong, String link) {
        super(MaNV, hoten, tuoi, email, luong, link);
        this.nvIndex = nvIndex;
    }
}
