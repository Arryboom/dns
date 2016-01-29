package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class AAAARecord extends ResourceRecord {
	private String address;
	
	public AAAARecord() {
		this.type = Type.AAAA;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
