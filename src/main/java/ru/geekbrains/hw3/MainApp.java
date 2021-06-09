package ru.geekbrains.hw3;

public class MainApp {
    public static void main(String[] args) {
        list();

    }
    public static void list(){
        PhoneList phoneList = new PhoneList();

        phoneList.add("Вася", "123");
        phoneList.add("Петя", "1234");
        phoneList.add("Сергей", "1236");
        phoneList.add("Владимир", "123");
        phoneList.add("Вася", "1238");
        phoneList.add("Вася", "1234");

        System.out.println(phoneList.find("Вася"));
        System.out.println(phoneList.find("Петя"));
        System.out.println(phoneList.find("Сергей"));
        

    }
}
