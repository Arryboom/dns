package biz.neustar.udns.records;

import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MXRecord extends ResourceRecord {
    private int priority;
    private Name target;

    public MXRecord() {
        type = Type.MX;
    }

    public MXRecord(int priority, Name target) {
        type = Type.MX;
        this.priority = priority;
        this.target = target;
    }
}
