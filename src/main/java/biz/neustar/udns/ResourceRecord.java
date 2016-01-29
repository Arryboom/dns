package biz.neustar.udns;

import biz.neustar.udns.enums.DnsClass;
import biz.neustar.udns.enums.Type;

public abstract class ResourceRecord {
	protected String name;
	protected Type type;
	protected DnsClass klass;
    protected int ttl;
    
    public ResourceRecord() {
		this.klass = DnsClass.IN;
    }

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
}
