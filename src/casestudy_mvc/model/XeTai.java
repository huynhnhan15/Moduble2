package casestudy_mvc.model;

public class XeTai extends Xe {
    private double taiTrong;

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, double taiTrong) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    @Override
    public String getAttribute1() {
        return taiTrong + " tấn";
    }

    @Override
    public String getAttribute2() {
        return "N/A";
    }


}

