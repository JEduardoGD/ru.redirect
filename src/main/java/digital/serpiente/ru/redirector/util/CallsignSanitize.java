package digital.serpiente.ru.redirector.util;

public final class CallsignSanitize {
	private CallsignSanitize() {
		
	}
	public static String sanitizeCallsign(String callsign) {
		if (callsign == null) {
			return null;
		}
		return callsign.replaceAll("\\/", "");
	}
}
