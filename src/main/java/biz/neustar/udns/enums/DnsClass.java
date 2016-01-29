package biz.neustar.udns.enums;

public enum DnsClass {
	IN(1), // Internet
	CS(2), // the CSNET class (Obsolete - used only for examples in some
			// obsolete RFCs)
	CH(3), // CHAOS
	HS(4); // Hesiod

	int klass;

	DnsClass(int klass) {
		this.klass = klass;
	}

	public int valueOf() {
		return klass;
	}
}
