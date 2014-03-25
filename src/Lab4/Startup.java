/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Don
 */
public class Startup {

    public static void main(String[] args) {
        DateService dateService1 = new DateService();

        String date = "03/15/2014";
        try {
            dateService1.convertStringToDate(date);

        } catch (NullPointerException | EmptyValueException exception1) {
            System.out.println(exception1.getLocalizedMessage());
        }
        date = "March 15, 2014 2:30 PM";
        try {
            dateService1.convertStringToCalendar(date);
        } catch (NullPointerException | EmptyValueException exception2) {
            System.out.println(exception2.getLocalizedMessage());
        }
    }

}
