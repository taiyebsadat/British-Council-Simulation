package oop_groupproject.britishcouncil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataHandler {
    public static <T> void writeData(T object, String fileName) {
        List<T> list = readData(fileName);
        list.add(object);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> readData(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<T>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}