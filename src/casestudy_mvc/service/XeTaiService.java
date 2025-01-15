package casestudy_mvc.service;

import casestudy_mvc.model.XeTai;

import java.util.Scanner;

public class XeTaiService implements IXeService {
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoi() {
        System.out.print("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.print("Nhập tải trọng (tấn): ");
        double taiTrong = Double.parseDouble(scanner.nextLine());

        XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong);
        FileHandler.ghiFile(xeTai.toString());
        System.out.println("Thêm mới xe tải thành công!");
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("Danh sách xe tải:");
        FileHandler.docFile().stream()
                .filter(line -> line.startsWith("XeTai"))
                .forEach(System.out::println);
    }

    @Override
    public void xoaPhuongTien() {
        System.out.print("Nhập biển kiểm soát cần xóa: ");
        String bienKiemSoat = scanner.nextLine();
        FileHandler.xoaDong(bienKiemSoat);
        System.out.println("Xóa xe tải thành công!");
    }
}