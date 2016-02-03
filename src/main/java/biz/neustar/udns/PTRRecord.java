package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class PTRRecord extends ResourceRecord {
	private Name pointer;
	
	public PTRRecord() {
		type = Type.PTR;
	}

	public Name getPointer() {
		return pointer;
	}

	public void setPointer(Name pointer) {
		this.pointer = pointer;
	}
}
