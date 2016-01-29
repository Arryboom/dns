package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class CNameRecord extends ResourceRecord {
	private String cName;

	public CNameRecord() {
		this.type = Type.CNAME;
	}

	public String getCName() {
		return cName;
	}

	public void setCName(String name) {
		this.cName = name;
	}
}