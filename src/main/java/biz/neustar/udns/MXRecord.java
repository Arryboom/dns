package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class MXRecord extends ResourceRecord {
	private int priority;
	
	private Name target;
	
	public MXRecord() {
		type = Type.MX;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int preference) {
		this.priority = preference;
	}

	public Name getTarget() {
		return target;
	}

	public void setTarget(Name target) {
		this.target = target;
	}
}
