package digital.serpiente.ru.redirector.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_REQ_REDIRECT")
public class RequestRedirect implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -878321911677664997L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "callsign")
	private String callsign;

	@Column(name = "new_url")
	private String newUrl;

	@Column(name = "enable_date_time")
	private Date enableDateTime;

	@Column(name = "disable_date_time")
	private Date disableDateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCallsign() {
		return callsign;
	}

	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}

	public String getNewUrl() {
		return newUrl;
	}

	public void setNewUrl(String newUrl) {
		this.newUrl = newUrl;
	}

	public Date getEnableDateTime() {
		return enableDateTime;
	}

	public void setEnableDateTime(Date enableDateTime) {
		this.enableDateTime = enableDateTime;
	}

	public Date getDisableDateTime() {
		return disableDateTime;
	}

	public void setDisableDateTime(Date disableDateTime) {
		this.disableDateTime = disableDateTime;
	}

}