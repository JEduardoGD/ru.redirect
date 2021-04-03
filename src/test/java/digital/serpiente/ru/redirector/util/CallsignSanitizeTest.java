package digital.serpiente.ru.redirector.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CallsignSanitizeTest {

    @Test
    void sanitizeCallsignTest() {
        String result = CallsignSanitize.sanitizeCallsign(null);
        assertNull(result);
    }

}
