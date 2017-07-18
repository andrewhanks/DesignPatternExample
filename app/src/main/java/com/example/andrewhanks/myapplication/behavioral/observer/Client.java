package com.example.andrewhanks.myapplication.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

class Client {
    private String ip;
    private String name;

    // ... 其它資料...
    public Client(String ip, String name) {
        this.ip = ip;
        this.name = name;
    }

    void setIp(String ip) {
        this.ip = ip;
    }

    void setName(String name) {
        this.name = name;
    }

    String getIp() {
        return ip;
    }

    String getName() {
        return name;
    }
    // ... 其它方法...
}

class ClientEvent {
    final String ip;
    final String name;

    ClientEvent(Client client) {
        this.ip = client.getIp();
        this.name = client.getName();
    }
}

interface ClientListener {
    void clientAdded(ClientEvent event);

    void clientRemoved(ClientEvent event);
}

class ClientQueue {
    private List<Client> clients = new LinkedList<Client>();
    private List<ClientListener> listeners = new LinkedList<ClientListener>();

    void addClientListener(ClientListener listener) {
        listeners.add(listener);
    }

    void removeClientListener(ClientListener listener) {
        listeners.remove(listener);
    }

    void notifyAdded(Client client) {
        ClientEvent event = new ClientEvent(client);
        for (ClientListener listener : listeners) {
            listener.clientAdded(event);
        }
    }

    void notifyRemoved(Client client) {
        ClientEvent event = new ClientEvent(client);
        for (ClientListener listener : listeners) {
            listener.clientRemoved(event);
        }
    }

    void add(Client client) {
        clients.add(client);
        notifyAdded(client);
    }

    void remove(Client client) {
        clients.remove(client);
        notifyRemoved(client);
    }

    // 還有一些客戶管理佇列的其它職責....
}