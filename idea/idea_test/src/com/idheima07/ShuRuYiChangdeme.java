package com.idheima07;

import java.io.FileOutputStream;
import java.io.IOException;

public class ShuRuYiChangdeme {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = null;
        try {
            file = new FileOutputStream("h://dea_test\\ts.txt");
            file.write("adf".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
