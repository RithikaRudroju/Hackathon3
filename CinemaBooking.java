class CinemaBooking {
    String movieName;
    double ticketPrice;
    int numberOfTickets;
    String customerName;
    CinemaBooking() {

        movieName = "AVATAR";
        ticketPrice = 200.00;
        numberOfTickets = 0;
        customerName = "UNKNOWN";
    }

    CinemaBooking(String customerName, String movieName,
                  double ticketPrice, int numberOfTickets) {
        this.customerName = customerName;
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    void bookTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    void bookTickets(String customerName, int numberOfTickets) {
        this.customerName = customerName;
        this.numberOfTickets = numberOfTickets;
    }

    void bookTickets(String customerName, String movieName,
                     int numberOfTickets) {
        this.customerName = customerName;
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
    }

    void displayBooking() {
        System.out.println("Customer Name      : "
                + customerName.toUpperCase());

        System.out.println("Movie Name         : "
                + movieName.toUpperCase());

        System.out.printf("Ticket Price       : Rs. %.2f%n",
                ticketPrice);

        System.out.println("Number of Tickets  : "
                + numberOfTickets);

        if (numberOfTickets <= 0) {
            System.out.println("Booking Status     : Invalid ticket count");
            return;
        }

        double totalAmount = ticketPrice * numberOfTickets;
        double discount = 0.0;

        if (numberOfTickets >= 5) {
            discount = totalAmount * 0.10;
        }

        double finalAmount = totalAmount - discount;

        System.out.println("Booking Status     : Booking Successful");

        System.out.printf("Total Amount       : Rs. %.2f%n",
                totalAmount);

        System.out.printf("Discount           : Rs. %.2f%n",
                discount);

        System.out.printf("Final Amount       : Rs. %.2f%n",
                finalAmount);
    }

    boolean compareCustomers(CinemaBooking other) {
        return this.customerName.equalsIgnoreCase(
                other.customerName);
    }

    public static void main(String[] args) {
        System.out.println("========== CINEMA TICKET BOOKING ==========");

        CinemaBooking b1 = new CinemaBooking(
                "Sneha", "Avatar", 200.00, 5);

        b1.displayBooking();

        System.out.println();

        CinemaBooking b2 = new CinemaBooking();
        b2.bookTickets("Arjun", 2);

        b2.displayBooking();

        System.out.println();

        if (b1.compareCustomers(b2)) {
            System.out.println(
                    "Customer Verification: Names Match");
        } else {
            System.out.println(
                    "Customer Verification: Names Do Not Match");
        }

        System.out.println("===========================================");
    }
}
