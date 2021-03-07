package booking;

public class WriteRegistry {
    private final ReadRegistry readRegistry;

    public WriteRegistry(ReadRegistry readRegistry) {
        this.readRegistry = readRegistry;
    }

    public void bookARoom(Booking booking) {
        readRegistry.booked(booking);
    }
}
