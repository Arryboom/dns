package biz.neustar.udns.records;

import biz.neustar.udns.enums.DnsClass;
import biz.neustar.udns.enums.Type;

public abstract class ResourceRecord {
	protected String name;
	protected Type type;
    protected int ttl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTtl() {
		return ttl;
	}

	public void setTtl(int ttl) {
		this.ttl = ttl;
	}

	public Type getType() {
		return type;
	}
	
	public DnsClass getDnsClass() {
	    return DnsClass.IN;
	}
}
