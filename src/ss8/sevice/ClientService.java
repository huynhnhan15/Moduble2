package ss8.sevice;

import ss8.model.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClientService {
    private static Client[] clients = new Client[10];


    static {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        clients[0] = new Client(1, "Huỳnh Nhân 1 ", LocalDate.parse("10/02/2003", formatter), "Đà Nẵng");
        clients[1] = new Client(2, "Huỳnh Nhân 2", LocalDate.parse("17/12/2003", formatter), "Đà Nẵng");
        clients[2] = new Client(3, "Huỳnh Nhân 3", LocalDate.parse("28/02/2003", formatter), "Đà Nẵng");
    }


    public Client[] findAll() {
        return clients;
    }


    public void addClient(Client client) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null) {
                clients[i] = client;
                System.out.println("Khách hàng đã được thêm vào danh sách.");
                return;
            }
        }
        System.out.println("Danh sách khách hàng đã đầy, không thể thêm mới.");
    }

    public boolean updateClient(int id, String name, LocalDate birthDay, String address) {
        for (Client client : clients) {
            if (client != null && client.getId() == id) {
                client.setName(name);
                client.setBirthday(birthDay);
                client.setAddress(address);
                return true;
            }
        }
        return false;
    }

    public boolean deleteClient(int id) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null && clients[i].getId() == id) {
                clients[i] = null; // Đặt giá trị null để xóa
                return true;
            }
        }
        return false;
    }
}
