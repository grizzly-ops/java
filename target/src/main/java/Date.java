
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndabenhle
 */
public class Date {
    public static void main(String[] args) {
        LocalDateTime myDate = LocalDateTime.now();
        System.out.println("Today's date: " + myDate);
        
        String sDate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO_DATE_TIME format: " + sDate);
        
        String fDate = myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Formatted with MEDIUM Formatstyle: "+ fDate);
        
        DateTimeFormatter myFormatobj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = myDate.format(myFormatobj);
        System.out.println("After formatting: " + formattedDate);
    }
 
}


