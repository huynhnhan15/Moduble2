package casestudy_mvc.model;

public class XeMay extends Xe{
    private int congSuat;
    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }
    @Override
    public String getAttribute1() {
        return congSuat + " mã lực";
    }

    @Override
    public String getAttribute2() {
        return "N/A";
    }
}
