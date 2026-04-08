package oop_groupproject.britishcouncil;

import java.io.*;
import java.util.ArrayList;

public class FileHelper {

    public static void writeObject(Object obj, String fileName) {

        try {
            File file = new File(fileName);
            ObjectOutputStream oos;

            if (file.exists()) {
                oos = new AppendableObjectOutputStream(
                        new FileOutputStream(file, true)
                );
            } else {
                oos = new ObjectOutputStream(
                        new FileOutputStream(file)
                );
            }

            oos.writeObject(obj);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Object> readObjects(String fileName) {

        ArrayList<Object> list = new ArrayList<>();

        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fileName)
            );

            while (true) {
                list.add(ois.readObject());
            }

        } catch (EOFException e) {
            return list;
        } catch (Exception e) {
            // File not found is normal at first run
        }

        return list;
    }
    public static void overwriteFile(ArrayList<Object> list, String fileName) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            for (Object obj : list) {
                oos.writeObject(obj);
            }
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}