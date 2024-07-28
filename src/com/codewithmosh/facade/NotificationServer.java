package com.codewithmosh.facade;

public class NotificationServer {
    // connect() -> connection
    // authenticate)appID, key) -> AuthToken
    // send(authToken, message, target)
    // conn.disconnect()

    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Seding a message");
    }
}
