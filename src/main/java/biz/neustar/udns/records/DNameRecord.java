package biz.neustar.udns.records;

import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DNameRecord extends ResourceRecord {
    private Name dName;

    public DNameRecord() {
        this.type = Type.DNAME;
    }

    public DNameRecord(Name dName) {
        type = Type.DNAME;
        this.dName = dName;
    }
}
