package casestudy_mvc.service;

import casestudy_mvc.model.XeMay;

import java.util.Scanner;

public class XeMayService implements IXeService {
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoi() {
        System.out.print("Nhập biển Số: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.print("Nhập công suất (mã lực): ");
        int congSuat = Integer.parseInt(scanner.nextLine());

        XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
        FileHandler.ghiFile(xeMay.toString());
        System.out.println("Thêm mới xe máy thành công!");
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("Danh sách xe máy:");
        FileHandler.docFile().stream()
                .filter(line -> line.startsWith("XeMay"))
                .forEach(System.out::println);
    }

    @Override
    public void xoaPhuongTien() {
        System.out.print("Nhập biển kiểm soát cần xóa: ");
        String bienKiemSoat = scanner.nextLine();
        FileHandler.xoaDong(bienKiemSoat);
        System.out.println("Xóa xe máy thành công!");
    }
}