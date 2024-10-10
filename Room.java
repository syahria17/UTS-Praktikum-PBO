package AplikasiReservasiHotel;

public class Room {
    private int roomNumber;
    private boolean available;
    private String customerName;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.available = true; // Default kamar tersedia
    }

    public boolean isAvailable() {
        return available;
    }

    public void book(String customerName) {
        this.customerName = customerName;
        this.available = false;
    }

    public void cancel() {
        this.customerName = null;
        this.available = true;
    }

    public void showDetails() {
        System.out.println("Kamar Nomor: " + roomNumber);
        if (available) {
            System.out.println("Status: Tersedia");
        } else {
            System.out.println("Status: Dipesan oleh " + customerName);
        }
    }
}
