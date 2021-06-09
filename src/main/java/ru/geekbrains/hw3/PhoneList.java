package ru.geekbrains.hw3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneList {
    private HashMap<String, HashSet<String>> map;

    public PhoneList() {
        this.map = new HashMap<>();
    }
    public void add(String name, String phone){
        if (!map.containsKey(name)){
            map.put(name, new HashSet<>());
        }
        map.get(name).add(phone);
    }
    public HashSet<String> find(String name){
        if(!map.containsKey(name)){
            return new HashSet<>();
        }
        return map.get(name);
    }
}
