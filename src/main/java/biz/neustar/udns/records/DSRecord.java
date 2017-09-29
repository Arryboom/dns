package biz.neustar.udns.records;

import biz.neustar.udns.enums.DigestType;
import biz.neustar.udns.enums.SigningAlgorithm;
import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DSRecord extends ResourceRecord {
    private int keyTag;
    private SigningAlgorithm alg;
    private DigestType digestType;
    private String digest;

    public DSRecord() {
        type = Type.DS;
    }

    public DSRecord(int keyTag, SigningAlgorithm alg, DigestType digestType, String digest) {
        super();
        this.keyTag = keyTag;
        this.alg = alg;
        this.digestType = digestType;
        this.digest = digest;
        type = Type.DS;
    }
}
