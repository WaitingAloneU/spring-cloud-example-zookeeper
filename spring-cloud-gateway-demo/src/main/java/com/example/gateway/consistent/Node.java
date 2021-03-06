package com.example.gateway.consistent;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.TreeMap;

@Data
public class Node {

    private String domain;

    private String ip;

    private Map<String, Object> data;

    public Node(String domain, String ip){
        this.domain = domain;
        this.ip = ip;
        data = new TreeMap<>();
    }

    public <T> void put(String key, T value) {
        data.put(key, value);
    }

    public void remove(String key){
        data.remove(key);
    }

    public <T> T get(String key) {
        return (T) data.get(key);
    }
}
