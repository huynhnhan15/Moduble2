package casestudy_mvc.service;
import casestudy_mvc.model.OTo;

import java.util.Scanner;

public class OtoService implements IXeService {
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
        System.out.print("Nhập số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu xe : ");
        String kieuXe = scanner.nextLine();

        OTo oto = new OTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        FileHandler.ghiFile(oto.toString());
        System.out.println("Thêm mới ô tô thành công!");
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("Danh sách ô tô:");
        FileHandler.docFile().stream()
                .filter(line -> line.startsWith("Oto"))
                .forEach(System.out::println);
    }

    @Override
    public void xoaPhuongTien() {
        System.out.print("Nhập biển kiểm soát cần xóa: ");
        String bienKiemSoat = scanner.nextLine();
        FileHandler.xoaDong(bienKiemSoat);
        System.out.println("Xóa ô tô thành công!");
    }
}