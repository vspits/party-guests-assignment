package labpartyguest;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class LabPartyGuest {
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please enter 4 guests: ");
        int i = 1;
        do{
            System.out.printf("Guest %d: ", i);
            String guest = input.nextLine();
            guests.add(guest);
            i++;
        } while (i != 5);
        System.out.println();
        System.out.print("Guest List: ");
        System.out.println(guests);
        int guestToRemove = rand.nextInt(4);
        System.out.printf("%s can't come. %n", guests.get(guestToRemove));
        guests.remove(guests.get(guestToRemove));
        System.out.print("Updated Guest List: ");
        System.out.println(guests);
    }
    
}
