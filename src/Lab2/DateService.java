/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Don
 */
public class DateService {

    public final void convertStringToDate(String dateString) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date = df.parse(dateString);
            System.out.println(df.format(date) + "\t\t - Date Object");
        } catch (ParseException pe) {
            System.out.println("Illegal format -- required: #/##/####");
        }

    }

    public final void convertStringToCalendar(final String dateString) {
        Calendar calendar = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("MMM dd, yyyy H:mm a");
        try {
            calendar.setTime(df.parse(dateString));
            Date d = calendar.getTime();
            System.out.println(df.format(d) + "\t - Calendar Object");
        } catch (ParseException pe) {
            System.out.println("Illegal format -- Example: March 15, 2014 2:30 PM");
        }
    }

}
