package biz.neustar.udns.records;

import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TXTRecord extends ResourceRecord {
    private String text;

    public TXTRecord() {
        type = Type.TXT;
    }

    public TXTRecord(String text) {
        type = Type.TXT;
        this.text = text;
    }
}
