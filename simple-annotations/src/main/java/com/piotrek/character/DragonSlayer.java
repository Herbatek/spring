package com.piotrek.character;

import com.piotrek.armor.Armor;
import com.piotrek.weapon.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class DragonSlayer extends Warrior {

    public DragonSlayer(@Qualifier("dragonArmor") Armor armor) {
        super(armor);
    }

    @Value("${dragon-slayer.name}")
    public void setName(String name) {
        super.setName(name);
    }

    @Autowired
    @Qualifier("sword")
    public void setWeapon(Weapon weapon) {
        super.setWeapon(weapon);
    }

    public String fight() {
        return super.fight();
    }

    public String run() {
        return super.run();
    }

}
