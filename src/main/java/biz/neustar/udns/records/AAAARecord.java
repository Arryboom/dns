package biz.neustar.udns.records;

import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AAAARecord extends ResourceRecord {
    private String address;

    public AAAARecord() {
        this.type = Type.AAAA;
    }
}
