package biz.neustar.udns.records;

import biz.neustar.udns.enums.KeyType;
import biz.neustar.udns.enums.SigningAlgorithm;
import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class DNSKEYRecord extends ResourceRecord {
    private KeyType keyType;
    private SigningAlgorithm algorithm;
    private String key; //base64 encoded
    
    public DNSKEYRecord() {
        type = Type.DNSKEY;
    }
    
    public DNSKEYRecord(KeyType keyType, SigningAlgorithm algorithm, String key) {
        super();
        this.keyType = keyType;
        this.algorithm = algorithm;
        this.key = key;
        type = Type.DNSKEY;
    }
    
    public int getProtocol() {
        return 3;
    }
}
