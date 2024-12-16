package ss8.model;

import java.time.LocalDate;

public class Client {
    private int id;
    private String name;
    private LocalDate birthday;
    private String address;

    public Client() {
    }

    public Client(int id, String name, LocalDate birthday, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
