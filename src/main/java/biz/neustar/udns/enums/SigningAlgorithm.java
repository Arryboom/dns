package biz.neustar.udns.enums;

public enum SigningAlgorithm {
    DSA(3), RSASHA1(5), DSA_NSEC3_SHA1(6), // RFC5155
    RSASHA1_NSEC3_SHA1(7), // RFC5155
    RSASHA256(8), // RFC5702
    RSASHA512(10), // RFC5702
    ECC_GOST(12), // RFC5933
    ECDSAP256SHA256(13), // RFC6605
    ECDSAP384SHA384(14), // RFC6605
    ED25519(15), // RFC8080
    ED448(16), // RFC8080
    PRIVATEDNS(253), PRIVATEOID(255);
    public int type;

    private SigningAlgorithm(int type) {
        this.type = type;
    }

    public int valueOf() {
        return type;
    }
}
