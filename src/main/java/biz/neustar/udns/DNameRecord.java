package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class DNameRecord extends ResourceRecord {
	private Name dName;

	public DNameRecord() {
		this.type = Type.DNAME;
	}

	public Name getDName() {
		return dName;
	}

	public void setDName(Name name) {
		this.dName = name;
	}
}
