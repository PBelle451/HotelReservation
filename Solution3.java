package co.pedrobelle.curso.Ex36;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            System.out.println("Room number: ");
            int number = scanner.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(scanner.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(scanner.next());
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println("Enter the data to update reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scanner.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scanner.next());
            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }

        scanner.close();
    }
}
