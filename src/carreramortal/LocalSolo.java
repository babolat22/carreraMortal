/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreramortal;

import java.time.LocalDate;
import java.time.LocalTime;



/**
 *
 * @author juanj
 */
public class LocalSolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       localDateExample();
        
    }
    
    private static void localDateExample() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

        LocalDate localDateOf = LocalDate.of(2017, 10, 10);
        System.out.println(localDateOf.toString()); // 2017-10-10

        LocalDate datePlus = localDateOf.plusDays(1);
        System.out.println(datePlus.toString());  // 2017-10-17

        LocalDate dateMinus = localDateOf.minusDays(7);
        System.out.println(dateMinus.toString()); // 2017-10-03

        boolean isBefore = LocalDate.of(2017, 10, 10).isBefore(LocalDate.of(2017, 8, 20));
        System.out.println(isBefore); // false

        boolean isAfter = LocalDate.of(2017, 10, 10).isAfter(LocalDate.of(2017, 8, 20));
        System.out.println(isAfter); // true
        
        LocalTime hora = LocalTime.of(20, 30);
        hora.plusHours(1);
        hora.plusMinutes(10);
        hora.minusMinutes(3);
    }
}
