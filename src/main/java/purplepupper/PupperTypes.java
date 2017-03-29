package purplepupper;

import org.apache.commons.lang3.EnumUtils;

public enum PupperTypes {
    DOGGO,
    DOGGERINO,
    DOGGEST,
    DOGGOR,
    SHIBER,
    DOGE,
    SHIBE,
    CORGO,
    SHOOB,
    SHOOBER,
    SHOOBERINO,
    PUGGERINO,
    PUGGO,
    LONGBOYS,
    PUPPER,
    PUPPERINO,
    BORFER,
    WOOFER,
    PUPPERWISH;

    public static boolean isPupperType(String type) {
        return EnumUtils.isValidEnum(PupperTypes.class, type);
    }
}
