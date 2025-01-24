package bai_thi.service;

import bai_thi.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private static final String FILE_PATH = "src/bai_thi/data/contacts.csv";

    // Đọc danh bạ từ file
    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        File file = new File(FILE_PATH);

        // Kiểm tra nếu file không tồn tại, tạo file mới
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return contacts; // Trả về danh sách rỗng nếu file không tồn tại
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                // Tạo đối tượng Contact từ các trường
                Contact contact = new Contact(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6]);
                contacts.add(contact);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    // Lưu danh bạ vào file
    public void saveContacts(List<Contact> contacts) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Contact contact : contacts) {
                // Ghi từng danh bạ vào file, mỗi trường cách nhau bằng dấu phẩy
                bw.write(contact.getPhoneNumber() + "," +
                        contact.getGroup() + "," +
                        contact.getFullName() + "," +
                        contact.getGender() + "," +
                        contact.getAddress() + "," +
                        contact.getDob() + "," +
                        contact.getEmail());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Thêm một contact vào danh sách và ghi lại vào file
    public void addContact(Contact newContact) {
        List<Contact> contacts = loadContacts(); // Đọc các liên hệ hiện có
        contacts.add(newContact); // Thêm contact mới vào danh sách
        saveContacts(contacts); // Lưu lại danh sách vào file
    }

    // Cập nhật thông tin contact
    public void updateContact(String phoneNumber, Contact updatedContact) {
        List<Contact> contacts = loadContacts();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                contacts.set(i, updatedContact);  // Thay thế contact cũ bằng contact mới
                saveContacts(contacts); // Lưu lại danh sách vào file
                return;
            }
        }
        System.out.println("Không tìm thấy số điện thoại này để cập nhật.");
    }

    // Xóa một contact
    public void deleteContact(String phoneNumber) {
        List<Contact> contacts = loadContacts();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(i); // Xóa contact theo số điện thoại
                saveContacts(contacts); // Lưu lại danh sách vào file
                return;
            }
        }
        System.out.println("Không tìm thấy số điện thoại này để xóa.");
    }
}
