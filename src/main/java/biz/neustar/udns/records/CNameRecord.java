package biz.neustar.udns.records;

import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CNameRecord extends ResourceRecord {
    private Name cName;

    public CNameRecord() {
        this.type = Type.CNAME;
    }

    public CNameRecord(Name cName) {
        type = Type.CNAME;
        this.cName = cName;
    }
}