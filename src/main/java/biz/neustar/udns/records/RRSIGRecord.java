package biz.neustar.udns.records;

import biz.neustar.udns.enums.SigningAlgorithm;
import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RRSIGRecord extends ResourceRecord {
    private Type coveredType;
    private SigningAlgorithm algorithm;
    private int labels;
    private int ttl;
    private long signatureInception;
    private long signatureExpiration;
    private int keyTag;
    private Name signedRecordName;
    private String signature; //base64 encoded
    
    public RRSIGRecord() {
        type = Type.RRSIG;
    }
}
