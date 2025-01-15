package casestudy_mvc.controller;

import casestudy_mvc.service.OtoService;
import casestudy_mvc.service.XeMayService;
import casestudy_mvc.service.XeTaiService;

import java.util.Scanner;

public class XeController {
    private static final XeTaiService xeTaiService = new XeTaiService();
    private static final OtoService otoService = new OtoService();
    private static final XeMayService xeMayService = new XeMayService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void quanLy() {
        boolean isRunning = true;
        while (isRunning) {
            // Hiển thị menu chính
            hienThiMenuChinh();
            int luaChon = nhapLuaChon();

            // Xử lý lựa chọn
            switch (luaChon) {
                case 1 -> hienThiDanhSachPhuongTien(); // Hiển thị phương tiện
                case 2 -> themMoiPhuongTien(); // Thêm mới phương tiện
                case 3 -> xoaPhuongTien(); // Xóa phương tiện
                case 4 -> {
                    System.out.println("Đã thoát chương trình. Tạm biệt!");
                    isRunning = false; // Thoát chương trình
                }
                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        }
    }

    /**
     * Hiển thị menu chính.
     */
    private static void hienThiMenuChinh() {
        System.out.println("\n===== QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG =====");
        System.out.println("1. Hiển thị phương tiện");
        System.out.println("2. Thêm mới phương tiện");
        System.out.println("3. Xóa phương tiện");
        System.out.println("4. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    /**
     * Nhập lựa chọn từ người dùng.
     */
    private static int nhapLuaChon() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập một số hợp lệ!");
            return -1; // Trả về -1 nếu nhập không hợp lệ
        }
    }

    /**
     * Thêm mới phương tiện.
     */
    private static void themMoiPhuongTien() {
        boolean isAdding = true;
        while (isAdding) {
            System.out.println("\n===== THÊM MỚI PHƯƠNG TIỆN =====");
            System.out.println("1. Thêm xe tải");
            System.out.println("2. Thêm ô tô");
            System.out.println("3. Thêm xe máy");
            System.out.println("4. Thoát thêm mới");
            System.out.print("Chọn loại phương tiện cần thêm: ");
            int loaiPhuongTien = nhapLuaChon();

            switch (loaiPhuongTien) {
                case 1 -> xeTaiService.themMoi(); // Thêm xe tải
                case 2 -> otoService.themMoi(); // Thêm ô tô
                case 3 -> xeMayService.themMoi(); // Thêm xe máy
                case 4 -> {
                    System.out.println("Thoát thêm mới phương tiện!");
                    isAdding = false; // Dừng thêm mới
                }
                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
            }
        }
    }

    /**
     * Hiển thị danh sách phương tiện.
     */
    private static void hienThiDanhSachPhuongTien() {
        System.out.println("\n===== HIỂN THỊ DANH SÁCH PHƯƠNG TIỆN =====");
        System.out.println("1. Hiển thị xe tải");
        System.out.println("2. Hiển thị ô tô");
        System.out.println("3. Hiển thị xe máy");
        System.out.print("Chọn loại phương tiện cần hiển thị: ");
        int loaiPhuongTien = nhapLuaChon();

        switch (loaiPhuongTien) {
            case 1 -> xeTaiService.hienThiDanhSach(); // Hiển thị xe tải
            case 2 -> otoService.hienThiDanhSach(); // Hiển thị ô tô
            case 3 -> xeMayService.hienThiDanhSach(); // Hiển thị xe máy
            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
        }
    }

    /**
     * Xóa phương tiện.
     */
    private static void xoaPhuongTien() {
        System.out.println("\n===== XÓA PHƯƠNG TIỆN =====");
        System.out.println("1. Xóa xe tải");
        System.out.println("2. Xóa ô tô");
        System.out.println("3. Xóa xe máy");
        System.out.print("Chọn loại phương tiện cần xóa: ");
        int loaiPhuongTien = nhapLuaChon();

        switch (loaiPhuongTien) {
            case 1 -> xeTaiService.xoaPhuongTien(); // Xóa xe tải
            case 2 -> otoService.xoaPhuongTien(); // Xóa ô tô
            case 3 -> xeMayService.xoaPhuongTien(); // Xóa xe máy
            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
        }
    }
}


