package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class TXTRecord extends ResourceRecord {
	private String text;
	
	public TXTRecord() {
		type = Type.TXT;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
