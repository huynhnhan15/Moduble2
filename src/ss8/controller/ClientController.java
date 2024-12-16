package ss8.controller;

import ss8.model.Client;
import ss8.sevice.ClientService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClientController {
    static ClientService clientService = new ClientService();

    public static void displayClientMenu() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.println("\n----------Chọn chức năng:");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Sửa");
            System.out.println("4. Xoá");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn: ");

            int choose;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ.");
                continue;
            }

            switch (choose) {
                case 1:
                    Client[] clients = clientService.findAll();
                    if (clients.length == 0) {
                        System.out.println("Danh sách khách hàng trống.");
                    } else {
                        for (Client client : clients) {
                            if (client != null) {
                                System.out.println(client);
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.print("Nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();

                    System.out.print("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
                    LocalDate birthday;
                    try {
                        birthday = LocalDate.parse(scanner.nextLine(), formatter);
                    } catch (Exception e) {
                        System.out.println("Ngày tháng không hợp lệ. Vui lòng nhập lại.");
                        break;
                    }

                    System.out.print("Nhập địa chỉ: ");
                    String address = scanner.nextLine();

                    clientService.addClient(new Client(id, name, birthday, address));
                    System.out.println("Thêm mới thành công!");
                    break;

                case 3:
                    System.out.print("Nhập id của khách hàng cần sửa: ");
                    int updateId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();

                    System.out.print("Nhập ngày tháng năm sinh mới (dd/MM/yyyy): ");
                    LocalDate newBirthday;
                    try {
                        newBirthday = LocalDate.parse(scanner.nextLine(), formatter);
                    } catch (Exception e) {
                        System.out.println("Ngày tháng không hợp lệ. Vui lòng nhập lại.");
                        break;
                    }

                    System.out.print("Nhập địa chỉ mới: ");
                    String newAddress = scanner.nextLine();

                    boolean updated = clientService.updateClient(updateId, newName, newBirthday, newAddress);
                    if (updated) {
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Không tìm thấy khách hàng có id: " + updateId);
                    }
                    break;

                case 4:
                    System.out.print("Nhập id của khách hàng cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());

                    boolean deleted = clientService.deleteClient(deleteId);
                    if (deleted) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Không tìm thấy khách hàng có id: " + deleteId);
                    }
                    break;

                case 5:
                    System.out.println("-------- Kết thúc chương trình --------");
                    System.exit(0);

                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
