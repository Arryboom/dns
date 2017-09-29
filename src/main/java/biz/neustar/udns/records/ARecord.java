package biz.neustar.udns.records;

import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ARecord extends ResourceRecord {
    private String address;

    public ARecord() {
        this.type = Type.A;
    }

    public ARecord(String address) {
        type = Type.A;
        this.address = address;
    }
}
