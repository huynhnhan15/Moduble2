package casestudy_mvc.model;

public class OTo extends Xe{
    private int soChoNgoi;
    private String kieuXe;

    public OTo(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    @Override
    public String getAttribute1() {
        return soChoNgoi + " chỗ ngồi";
    }

    @Override
    public String getAttribute2() {
        return kieuXe;
    }
}
