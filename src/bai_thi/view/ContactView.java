package bai_thi.view;

import bai_thi.model.Contact;

import java.util.List;
import java.util.Scanner;

public class ContactView {

    private Scanner scanner = new Scanner(System.in);

    // Hiển thị menu
    public void displayMenu() {
        System.out.println("\n==== Menu ====");
        System.out.println("1. Xem danh bạ");
        System.out.println("2. Thêm danh bạ");
        System.out.println("3. Cập nhật danh bạ");
        System.out.println("4. Xóa danh bạ");
        System.out.println("5. Đọc danh bạ từ file");
        System.out.println("6. Ghi danh bạ vào file");
        System.out.println("7. Thoát");
    }

    public int getMenuChoice() {
        System.out.print("Chọn một lựa chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }

    // Nhập thông tin liên lạc mới
    public Contact getContactDetails() {
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Nhập nhóm: ");
        String group = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String fullName = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dob = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        return new Contact(phoneNumber, group, fullName, gender, address, dob, email);
    }

    // Hiển thị danh sách danh bạ
    public void displayContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ rỗng.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    // Nhập thông tin cần cập nhật
    public Contact getUpdatedContactDetails() {
        System.out.print("Nhập nhóm mới: ");
        String group = scanner.nextLine();
        System.out.print("Nhập họ tên mới: ");
        String fullName = scanner.nextLine();
        System.out.print("Nhập giới tính mới: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập địa chỉ mới: ");
        String address = scanner.nextLine();
        System.out.print("Nhập ngày sinh mới: ");
        String dob = scanner.nextLine();
        System.out.print("Nhập email mới: ");
        String email = scanner.nextLine();
        return new Contact("", group, fullName, gender, address, dob, email); // Số điện thoại không thay đổi
    }

    // Nhập số điện thoại cần cập nhật hoặc xóa
    public String getPhoneNumber() {
        System.out.print("Nhập số điện thoại cần cập nhật hoặc xóa: ");
        return scanner.nextLine();
    }
}
