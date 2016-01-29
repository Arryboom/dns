package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class NSRecord extends ResourceRecord {
	Name target;
	
	public NSRecord() {
		type = Type.NS;
	}

	public Name getTarget() {
		return target;
	}

	public void setTarget(Name target) {
		this.target = target;
	}
}
