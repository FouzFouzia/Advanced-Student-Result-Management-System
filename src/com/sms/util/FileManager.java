package com.sms.util;

import java.io.*;
import java.util.ArrayList;

import com.sms.model.Student;

public class FileManager {

    public void saveData(ArrayList<Student> list) {

        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("students.txt"));

            out.writeObject(list);
            out.close();

        } catch (Exception e) {
            System.out.println("Error Saving File");
        }
    }

    public ArrayList<Student> loadData() {

        try {
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("students.txt"));

            ArrayList<Student> list =
                    (ArrayList<Student>) in.readObject();

            in.close();
            return list;

        } catch (Exception e) {
            return new ArrayList<Student>();
        }
    }
}
