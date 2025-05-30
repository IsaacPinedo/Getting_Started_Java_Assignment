public class Main {
    public static void main(String[] args) {

        // Declaring and initializing variables
        String first_name = "Sandy";
        String last_name = "Jones";
        String movie_title = "The Source Code";
        int tickets_number = 8;
        double ticket_price = 10.57;

        // Total price
        double total_price = tickets_number * ticket_price;

        // Username
        String username = first_name.toLowerCase() + last_name.toLowerCase();

        // Movie title
        String movie_name = movie_title.toUpperCase();


        // Printing Final Expected Output
        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        System.out.println("Username: " + username);
        System.out.println("Movie: " + movie_name);
        System.out.println("Number of Tickets: " + tickets_number);
        System.out.println("Price per ticket : $" + ticket_price);
        System.out.println("Total Price of 8 tickets: $" + total_price +"\n");
        System.out.println("Thank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");

    }
}
