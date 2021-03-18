package com.example.demo.objects;

import java.util.HashMap;

public class Cache {

    HashMap<Integer, String> map = new HashMap<>();

    public String get(int key){
        return map.get(key);
    }
    public void set(int key, String value) {
        map.put(key, value);
    }

    public boolean has(int key) {
        if (map.containsKey(key)) {
            return true;
        } else {
            return false;
        }
    }
    public void delete(int key){
        map.remove(key);
    }
}