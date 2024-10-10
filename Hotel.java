package AplikasiReservasiHotel;

import java.util.ArrayList;

public class Hotel {
    private String namaHotel;
    private ArrayList<Room> kamar;

    public Hotel(String namaHotel, int jumlahKamar) {
        this.namaHotel = namaHotel;
        this.kamar = new ArrayList<>();
        for (int i = 1; i <= jumlahKamar; i++) {
            kamar.add(new Room(i));
        }
    }

    // Mengecek ketersediaan kamar
    public boolean isRoomAvailable(int roomNumber) {
        return kamar.get(roomNumber - 1).isAvailable();
    }

    // Pesan kamar
    public boolean bookRoom(int roomNumber, String customerName) {
        if (isRoomAvailable(roomNumber)) {
            kamar.get(roomNumber - 1).book(customerName);
            return true;
        } else {
            return false;
        }
    }

    // Tambah kamar baru
    public void addRoom(int roomNumber) {
        kamar.add(new Room(roomNumber));
    }

    // Lihat detail semua kamar
    public void showRoomDetails() {
        for (Room room : kamar) {
            room.showDetails();
        }
    }

    // Batalkan pemesanan kamar
    public boolean cancelBooking(int roomNumber) {
        if (!isRoomAvailable(roomNumber)) {
            kamar.get(roomNumber - 1).cancel();
            return true;
        } else {
            return false;
        }
    }

    // Menampilkan kamar yang sudah dipesan
    public void showBookedRooms() {
        for (Room room : kamar) {
            if (!room.isAvailable()) {
                room.showDetails();
            }
        }
    }
}
