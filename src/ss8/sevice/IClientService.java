package ss8.sevice;

import ss8.model.Client;

import java.time.LocalDate;

public interface IClientService {
    Client[] findAll();

    void addClient(Client client);
    boolean updateClient(int id, String name, LocalDate birthDate, String address);
    boolean deleteClient(int id);
}