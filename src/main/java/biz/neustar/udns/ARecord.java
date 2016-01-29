package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class ARecord extends ResourceRecord{
	private String address;
	
	public ARecord() {
		this.type = Type.A;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
