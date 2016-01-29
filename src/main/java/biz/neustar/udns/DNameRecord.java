package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class DNameRecord extends ResourceRecord {
	private String dName;

	public DNameRecord() {
		this.type = Type.DNAME;
	}

	public String getDName() {
		return dName;
	}

	public void setDName(String name) {
		this.dName = name;
	}
}
