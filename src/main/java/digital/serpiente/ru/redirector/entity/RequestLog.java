package digital.serpiente.ru.redirector.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HST_REQUEST_LOG")
public class RequestLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5076702474890551712L;
	@Id()
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "remote_address")
	private String remoteAddress;

	@Column(name = "requested_url")
	private String requestedUrl;

	@Column(name = "date_time")
	private Date date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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