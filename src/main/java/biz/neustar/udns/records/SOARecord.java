package biz.neustar.udns.records;

import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
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

    // the time a NAME ERROR = NXDOMAIN result may be cached by any resolver in seconds
    private int negativeCacheTtl;

    public SOARecord() {
        type = Type.SOA;
    }

    public SOARecord(String email, long serial, int refreshTime, int retryTime, int expirationTime,
            int negativeCacheTtl) {
        type = Type.SOA;
        this.email = email;
        this.serial = serial;
        this.refreshTime = refreshTime;
        this.retryTime = retryTime;
        this.expirationTime = expirationTime;
        this.negativeCacheTtl = negativeCacheTtl;
    }

    public void setNegativeCacheTtl(int negativeCacheTtl) {
        if (negativeCacheTtl > MAX_NEGATIVE_CACHE_TTL) {
            negativeCacheTtl = MAX_NEGATIVE_CACHE_TTL;
        }
        this.negativeCacheTtl = negativeCacheTtl;
    }
}