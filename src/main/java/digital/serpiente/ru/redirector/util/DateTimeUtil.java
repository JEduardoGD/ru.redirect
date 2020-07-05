package digital.serpiente.ru.redirector.util;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public final class DateTimeUtil {
	public static Date getUtcTime() {
		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
		return Date.from(utc.toInstant());
	}
}
