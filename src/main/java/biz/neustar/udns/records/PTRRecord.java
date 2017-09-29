package biz.neustar.udns.records;

import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class PTRRecord extends ResourceRecord {
	private Name pointer;
	
	public PTRRecord() {
		type = Type.PTR;
	}

    public PTRRecord(Name pointer) {
        type = Type.PTR;
        this.pointer = pointer;
    }
}
