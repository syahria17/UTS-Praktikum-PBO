package AplikasiReservasiHotel;

import java.util.Scanner;

public abstract class User {
    protected Hotel hotel;

    public User(Hotel hotel) {
        this.hotel = hotel;
    }

    public abstract void menu(Scanner scanner);
}
