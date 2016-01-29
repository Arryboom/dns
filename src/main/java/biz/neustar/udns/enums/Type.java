package biz.neustar.udns.enums;

public enum Type {
	A(1), // Address
	NS(2), //Name Server 
	MD(3), //Mail destination (Obsolete - use MX)
	MF(4), //Mail forwarder (Obsolete - use MX)
	CNAME(5), //Canonical name (alias)
	SOA(6), //Start of authority
	MB(7), // Mailbox domain name (Obsolete)
	MG(8), //Mail group member (Obsolete)
	MR(9), //Mail rename name (Obsolete)
	NULL(10), //Null record (Obsolete)
	WKS(11), //Well known services (Obsolete)
	PTR(12), //Domain name pointer
	HINFO(13), //Host information (Not in use)
	MINFO(14), //Mailbox information (Obsolete)
	MX(15), //Mail routing information
	TXT(16), //Text strings
	RP(17), //Responsible person (Not in use)
	AFSDB(18), //AFS cell database
	X25(19), //X.25 calling address (Not in use)
	ISDN(20), //ISDN calling address (Not in use)
	RT(21), //Router (Not in use)
	NSAP(22), //NSAP address (Not in use)
	NSAP_PTR(23), //Reverse NSAP address (deprecated)
	SIG(24), //Signature
	KEY(25), //Key
	PX(26), //X.400 mail mapping (Not in use)
	GPOS(27), //Geographical position (withdrawn)
	AAAA(28), //IPv6 address
	LOC(29), //Location
	NXT(30), //Next valid name in zone (Obsolete)
	EID(31), //Endpoint identifier (Not in use)
	NIMLOC(32), //Nimrod locator (Not in use)
	SRV(33), //Server selection
	ATMA(34), //ATM address (Not in use)
	NAPTR(35), //Naming authority pointer
	KX(36), //Key exchange
	CERT(37), //Certificate
	A6(38), //IPv6 address (Obsolete)
	DNAME(39), //Non-terminal name redirection
	OPT(41), //Options - contains EDNS metadata (Not in use)
	APL(42), //Address Prefix List (Not in use)
	DS(43), //Delegation Signer
	SSHFP(44), //SSH Key Fingerprint
	IPSECKEY(45), //IPSEC key
	RRSIG(46), //Resource Record Signature
	NSEC(47), //Next Secure Name
	DNSKEY(48), //DNSSEC Key
	DHCID(49), //Dynamic Host Configuration Protocol (DHCP) ID
	NSEC3(50), //Next SECure, 3rd edition, RFC 5155
	NSEC3PARAM(51),
	TLSA(51), //TLSA (DANE) record
	SPF(99), //Sender Policy Framework (Obsolete)
	TKEY(249), //Transaction key - used to compute a shared secret or exchange a key
	TSIG(250), //Transaction signature
	IXFR(251), //Incremental zone transfer
	AXFR(252), //Zone transfer
	MAILB(253), //Transfer mailbox records (Obsolete)
	MAILA(254), //Transfer mail agent records (Obsolete)
	ANY(255), //Matches any type
	CAA(257), //Certification Authority Restriction type
	DLV(32769), //DNSSEC Lookaside Validation, RFC 4431
	RNAME(65282); //CNAME@apex internal record type
	
	int type;
	
	Type(int type) {
		this.type = type;
	}

	public int valueOf() {
		return type;
	}
}
