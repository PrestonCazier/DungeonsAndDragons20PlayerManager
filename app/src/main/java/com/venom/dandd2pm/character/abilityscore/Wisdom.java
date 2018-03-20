package com.venom.dandd2pm.character.abilityscore;

import java.util.List;

/**
 * Created by Venom on 3/19/2018.
 */

public class Wisdom extends AbilityScore {
    public int magDefAdj;
    public List<Integer> bonusSpellLvls;
    public int spellFailChance;
    public List<String> spellImmunity;

    public Wisdom() {
        score = 0;
        magDefAdj = -6;
        spellFailChance = 80;
    }

    public Wisdom(int newScore) {
        score = newScore;
        determineMagDefAdj();
        determineBonusSpells();
        determineSpellFailChance();
        determineSpellImmunity();
    }

    private void determineSpellImmunity() {
        if (score >= 19) {
            spellImmunity.add("Cause Fear");
            spellImmunity.add("Charm Person");
            spellImmunity.add("Command");
            spellImmunity.add("Friends");
            spellImmunity.add("Hypnotism");
        }
        if (score >= 20) {
            spellImmunity.add("Forget");
            spellImmunity.add("Hold Person");
            spellImmunity.add("Ray of Enfeeblement");
            spellImmunity.add("Scare");
        }
        if (score >= 21) {
            spellImmunity.add("Fear");
        }
        if (score >= 22) {
            spellImmunity.add("Charm Monster");
            spellImmunity.add("Confusion");
            spellImmunity.add("Emotion");
            spellImmunity.add("Fumble");
            spellImmunity.add("Suggestion");
        }
        if (score >= 23) {
            spellImmunity.add("Chaos");
            spellImmunity.add("Feeblemind");
            spellImmunity.add("Hold Monster");
            spellImmunity.add("Magic Jar");
            spellImmunity.add("Quest");
        }
        if (score >= 24) {
            spellImmunity.add("Geas");
            spellImmunity.add("Mass Suggestion");
            spellImmunity.add("Rod of Rulership");
        }
        if (score >= 25) {
            spellImmunity.add("Antipathy");
            spellImmunity.add("Sympathy");
            spellImmunity.add("Death Spell");
            spellImmunity.add("Mass Charm");
        }
    }

    private void determineSpellFailChance() {
        switch (score) {
            case 0: spellFailChance = 80; return;
            case 1: spellFailChance = 80; return;
            case 2: spellFailChance = 60; return;
            case 3: spellFailChance = 50; return;
            case 4: spellFailChance = 45; return;
            case 5: spellFailChance = 40; return;
            case 6: spellFailChance = 35; return;
            case 7: spellFailChance = 30; return;
            case 8: spellFailChance = 25; return;
            case 9: spellFailChance = 20; return;
            case 10: spellFailChance = 15; return;
            case 11: spellFailChance = 10; return;
            case 12: spellFailChance = 5; return;
        }
    }

    private void determineBonusSpells() {
        if (score >= 13) bonusSpellLvls.add(1);
        if (score >= 14) bonusSpellLvls.add(1);
        if (score >= 15) bonusSpellLvls.add(2);
        if (score >= 16) bonusSpellLvls.add(2);
        if (score >= 17) bonusSpellLvls.add(3);
        if (score >= 18) bonusSpellLvls.add(4);
        if (score >= 19) bonusSpellLvls.add(1); bonusSpellLvls.add(4);
        if (score >= 20) bonusSpellLvls.add(2); bonusSpellLvls.add(4);
        if (score >= 21) bonusSpellLvls.add(3); bonusSpellLvls.add(5);
        if (score >= 22) bonusSpellLvls.add(4); bonusSpellLvls.add(5);
        if (score >= 23) bonusSpellLvls.add(5); bonusSpellLvls.add(5);
        if (score >= 24) bonusSpellLvls.add(6); bonusSpellLvls.add(6);
        if (score >= 25) bonusSpellLvls.add(6); bonusSpellLvls.add(7);
        if (score >= 26) bonusSpellLvls.add(1);
        if (score >= 27) bonusSpellLvls.add(1);
        if (score >= 28) bonusSpellLvls.add(1);
        if (score >= 29) bonusSpellLvls.add(1);
        if (score >= 30) bonusSpellLvls.add(1);
        if (score >= 31) bonusSpellLvls.add(1);
        if (score >= 32) bonusSpellLvls.add(1);
        if (score >= 33) bonusSpellLvls.add(1);
        if (score >= 34) bonusSpellLvls.add(1);
        if (score >= 35) bonusSpellLvls.add(1);
    }

    private void determineMagDefAdj() {
        switch (score) {
            case 0: magDefAdj = -6; return;
            case 1: magDefAdj = -4; return;
            case 2: magDefAdj = -3; return;
            case 3: magDefAdj = -2; return;
            case 4: magDefAdj = -1; return;
            case 5: magDefAdj = -1; return;
            case 6: magDefAdj = -1; return;
            case 7: magDefAdj = 0; return;
            case 8: magDefAdj = 0; return;
            case 9: magDefAdj = 0; return;
            case 10: magDefAdj = 0; return;
            case 11: magDefAdj = 0; return;
            case 12: magDefAdj = 0; return;
            case 13: magDefAdj = 0; return;
            case 14: magDefAdj = 0; return;
            case 15: magDefAdj = 1; return;
            case 16: magDefAdj = 2; return;
            case 17: magDefAdj = 3; return;
            case 18: magDefAdj = 4; return;
            case 19: magDefAdj = 4; return;
            case 20: magDefAdj = 4; return;
            case 21: magDefAdj = 4; return;
            case 22: magDefAdj = 4; return;
            case 23: magDefAdj = 4; return;
            case 24: magDefAdj = 4; return;
            case 25: magDefAdj = 4; return;
            case 26: magDefAdj = 4; return;
            case 27: magDefAdj = 4; return;
            case 28: magDefAdj = 4; return;
            case 29: magDefAdj = 4; return;
            case 30: magDefAdj = 4; return;
            case 31: magDefAdj = 4; return;
            case 32: magDefAdj = 4; return;
            case 33: magDefAdj = 4; return;
            case 34: magDefAdj = 4; return;
            case 35: magDefAdj = 4; return;
        }
    }
}
