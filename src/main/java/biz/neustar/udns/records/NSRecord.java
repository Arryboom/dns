package biz.neustar.udns.records;

import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class NSRecord extends ResourceRecord {
	Name target;
	
	public NSRecord() {
		type = Type.NS;
	}

    public NSRecord(Name target) {
        this.target = target;
        type = Type.NS;
    }
}
