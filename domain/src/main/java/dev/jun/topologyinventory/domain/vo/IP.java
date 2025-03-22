package dev.jun.topologyinventory.domain.vo;

import lombok.Getter;

@Getter
public class IP {
    private String ipAddress;
    private Protocol protocol;
    
    public IP(String ipAddress) {
        if (ipAddress == null) {
            throw new IllegalArgumentException("IP address cannot be null");
        }

        this.ipAddress = ipAddress;

        if (ipAddress.length() <= 15) {
            this.protocol = Protocol.IPV4;
        } else {
            this.protocol = Protocol.IPV6;
        }
    }
}
