package booking;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class WriteRegistryTest {

    @Test
    void should_notify_readRegistry_on_booking() {
        ReadRegistry readRegistry = mock(ReadRegistry.class);
        WriteRegistry writeRegistry = new WriteRegistry(readRegistry);
        Booking booking = new Booking();
        writeRegistry.bookARoom(booking);

        verify(readRegistry).booked(booking);
    }
}
