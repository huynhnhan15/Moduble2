package casestudy_mvc.model;

public abstract  class Xe {
    private String bienKiemSoat;
    private String hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;


    public Xe(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public abstract String getAttribute1();
    public abstract String getAttribute2();

    @Override
    public String toString() {
        return String.join(",",
                this.getClass().getSimpleName(),
                bienKiemSoat,
                hangSanXuat,
                String.valueOf(namSanXuat),
                chuSoHuu,
                getAttribute1(),
                getAttribute2()
        );
    }
}
