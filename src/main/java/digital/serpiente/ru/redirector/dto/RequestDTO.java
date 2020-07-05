package digital.serpiente.ru.redirector.dto;

import java.io.Serializable;
import java.util.Date;

public class RequestDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8166744429462458977L;
	private int id;
	private String remoteAddress;
	private String requestedUrl;
	private Date date;

	public RequestDTO(String remoteAddress, String requestedUrl, Date date) {
		this.remoteAddress = remoteAddress;
		this.requestedUrl = requestedUrl;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRemoteAddress() {
		return remoteAddress;
	}

	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

	public String getRequestedUrl() {
		return requestedUrl;
	}

	public void setRequestedUrl(String requestedUrl) {
		this.requestedUrl = requestedUrl;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
