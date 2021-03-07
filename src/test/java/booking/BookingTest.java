package booking;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class BookingTest {

    private Collection<Room> initialRooms = Arrays.asList(
            new Room(),
            new Room()
    );

    @Test
    void should_see_free_rooms() {
        ReadRegistry readRegistry = new ReadRegistry(initialRooms);
        LocalDate arrival = LocalDate.of(2021, 1, 1);
        LocalDate departure = LocalDate.of(2021, 2, 1);
        Collection<Room> rooms = readRegistry.freeRooms(arrival, departure);
        assertThat(rooms).isEqualTo(initialRooms);
    }
}
