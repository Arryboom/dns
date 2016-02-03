package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class CNameRecord extends ResourceRecord {
	private Name cName;

	public CNameRecord() {
		this.type = Type.CNAME;
	}

	public Name getCName() {
		return cName;
	}

	public void setCName(Name name) {
		this.cName = name;
	}
}