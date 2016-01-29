package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class SOARecord extends ResourceRecord {
	public static final int MAX_NEGATIVE_CACHE_TTL = 10800;
	
	private String email;
	private long serial;

	// Indicates the time when the slave will try to refresh the
	// zone from the masterin seconds
	private int refreshTime;

	// Defines the time between retries if the slave (secondary)
	// fails to contact the master when refresh (above) has expired or a NOTIFY
	// message is received in seconds
	private int retryTime;

	// Indicates when the zone data is no longer authoritative in seconds
	private int expirationTime;
	
	//the time a NAME ERROR = NXDOMAIN result may be cached by any resolver in seconds
	private int negativeCacheTtl;

	public SOARecord() {
		type = Type.SOA;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getSerial() {
		return serial;
	}

	public void setSerial(long serial) {
		this.serial = serial;
	}

	public int getRefreshTime() {
		return refreshTime;
	}

	public void setRefreshTime(int refreshTime) {
		this.refreshTime = refreshTime;
	}

	public int getRetryTime() {
		return retryTime;
	}

	public void setRetryTime(int retryTime) {
		this.retryTime = retryTime;
	}

	public int getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(int expirationTime) {
		this.expirationTime = expirationTime;
	}

	public int getNegativeCacheTtl() {
		return negativeCacheTtl;
	}

	public void setNegativeCacheTtl(int negativeCacheTtl) {
		if(negativeCacheTtl > MAX_NEGATIVE_CACHE_TTL) {
			negativeCacheTtl = MAX_NEGATIVE_CACHE_TTL;
		}
		this.negativeCacheTtl = negativeCacheTtl;
	}
}