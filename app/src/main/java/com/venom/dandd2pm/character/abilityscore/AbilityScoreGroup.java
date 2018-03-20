package com.venom.dandd2pm.character.abilityscore;

/**
 * Created by Venom on 3/19/2018.
 */

public class AbilityScoreGroup {
    Strength STR;
    Dexterity DEX;
    Intelligence INT;
    Wisdom WIS;
    Constitution CON;
    Charisma CHA;
    Perception PER;
    Comeliness COM;

    public AbilityScoreGroup() {
        STR = new Strength();
        DEX = new Dexterity();
        INT = new Intelligence();
        WIS = new Wisdom();
        CON = new Constitution();
        CHA = new Charisma();
        PER = new Perception();
        COM = new Comeliness();
    }

    public AbilityScoreGroup(int s, int d, int cn, int i, int w, int cm, int p, int ch) {
        STR = new Strength(s);
        DEX = new Dexterity(d);
        INT = new Intelligence(i);
        WIS = new Wisdom(w);
        CON = new Constitution(cn);
        CHA = new Charisma(ch);
        PER = new Perception(p);
        COM = new Comeliness(cm);
    }
}
