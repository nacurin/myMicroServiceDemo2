package com.ms.demo.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

/**
 * Created by mac on 16/2/24.
 */
@Component
@ConfigurationProperties(prefix="connection")
public class ConnectionSettings {
    private String username;

    private InetAddress remoteAddress;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
}
