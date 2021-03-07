package booking;

import java.time.LocalDate;
import java.util.Collection;

public class ReadRegistry {
    private final Collection<Room> rooms;

    public ReadRegistry(Collection<Room> rooms) {
        this.rooms = rooms;
    }

    public Collection<Room> freeRooms(LocalDate arrival, LocalDate departure) {
        return rooms;
    }

    public void booked(Booking booking) {
    }
}
