/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROCESOS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class date {
      public static void searchDatesInRange(Date startDate, Date endDate) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Catalogo.txt"))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    Date currentDate = dateFormat.parse(line);
                    if (currentDate.compareTo(startDate) >= 0 && currentDate.compareTo(endDate) <= 0) {
                        System.out.println("File found for date " + line);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
