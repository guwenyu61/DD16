package model;

import java.util.List;

/**
 *The decorator of weapon
 * @author Jiayao, Ruijia
 */
public abstract class PWeaponDecorator extends PWeapon {
    protected final PWeapon weapon;

    /**
     * Initialize a weapon decorator
     * @param weapon Weapon instance
     */
    public PWeaponDecorator(PWeapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Get enchantments
     * @return list of enchantments
     */
    public List<String> getEnchantments(){
        return weapon.getEnchantments();
    }

    /**
     * Get type
     * @return String type
     */
    public String getType() { return weapon.getType();}

    public int getAttributeValue() {
        return weapon.getAttributeValue();
    }
}
