package AplikasiReservasiHotel;

public class Hotel {
    private String namaHotel;
    private Room[] kamar;
    
    public Hotel(String namaHotel, int jumlahKamar) {
        this.namaHotel = namaHotel;
        this.kamar = new Room[jumlahKamar];
        for (int i = 0; i < jumlahKamar; i++) {
            kamar[i] = new Room(i + 1); // Kamar diberi nomor urut
        }
    }
    
    // Mengecek ketersediaan kamar
    public boolean isRoomAvailable(int roomNumber) {
        return kamar[roomNumber - 1].isAvailable();
    }
    
    // Pesan kamar
    public boolean bookRoom(int roomNumber, String customerName) {
        if (isRoomAvailable(roomNumber)) {
            kamar[roomNumber - 1].book(customerName);
            return true;
        } else {
            return false;
        }
    }

    public void showRoomDetails() {
        for (Room room : kamar) {
            room.showDetails();
        }
    }
}

