package bai_thi.controller;

import bai_thi.model.Contact;
import bai_thi.service.ContactService;
import bai_thi.view.ContactView;

import java.util.List;

public class ContactController {
    private ContactService contactService = new ContactService();
    private ContactView contactView = new ContactView();

    public void start() {
        while (true) {
            contactView.displayMenu();
            int choice = contactView.getMenuChoice();
            switch (choice) {
                case 1:
                    // Xem danh bạ
                    List<Contact> contacts = contactService.loadContacts();
                    contactView.displayContacts(contacts);
                    break;
                case 2:
                    // Thêm danh bạ
                    Contact newContact = contactView.getContactDetails();
                    contactService.addContact(newContact);
                    System.out.println("Thêm danh bạ thành công!");
                    break;
                case 3:
                    // Cập nhật danh bạ
                    String phoneNumberToUpdate = contactView.getPhoneNumber();
                    Contact updatedContact = contactView.getUpdatedContactDetails();
                    contactService.updateContact(phoneNumberToUpdate, updatedContact);
                    System.out.println("Cập nhật danh bạ thành công!");
                    break;
                case 4:
                    // Xóa danh bạ
                    String phoneNumberToDelete = contactView.getPhoneNumber();
                    contactService.deleteContact(phoneNumberToDelete);
                    System.out.println("Xóa danh bạ thành công!");
                    break;
                case 5:
                    // Đọc danh bạ từ file
                    List<Contact> contactsFromFile = contactService.loadContacts();
                    contactView.displayContacts(contactsFromFile);
                    System.out.println("Đã đọc danh bạ từ file.");
                    break;
                case 6:
                    // Ghi danh bạ vào file
                    List<Contact> allContacts = contactService.loadContacts();
                    contactService.saveContacts(allContacts);
                    System.out.println("Đã ghi danh bạ vào file.");
                    break;
                case 7:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
