package com.venom.dandd2pm.character.abilityscore;

/**
 * Created by Venom on 3/19/2018.
 */

public class Intelligence extends AbilityScore {
    int mNumLang, mSpellLvl, mChanceToLearnSpell, mMaxSpellPerLvl, mSpellImmunity;

    public Intelligence() {
        score = 0;
    }

    public Intelligence(int newScore) {
        score = newScore;
        determineNumOfLanguages();
        determineSpellLevel();
        determineChanceToLearn();
        determineMaxSpellPerLevel();
        determineSpellImmunity();
    }

    private void determineNumOfLanguages() {
        switch (score) {
            case 0: mNumLang = 0; return;
            case 1: mNumLang = 0; return;
            case 2: mNumLang = 1; return;
            case 3: mNumLang = 1; return;
            case 4: mNumLang = 1; return;
            case 5: mNumLang = 1; return;
            case 6: mNumLang = 1; return;
            case 7: mNumLang = 1; return;
            case 8: mNumLang = 1; return;
            case 9: mNumLang = 2; return;
            case 10: mNumLang = 2; return;
            case 11: mNumLang = 2; return;
            case 12: mNumLang = 3; return;
            case 13: mNumLang = 3; return;
            case 14: mNumLang = 4; return;
            case 15: mNumLang = 4; return;
            case 16: mNumLang = 5; return;
            case 17: mNumLang = 6; return;
            case 18: mNumLang = 7; return;
            case 19: mNumLang = 8; return;
            case 20: mNumLang = 9; return;
            case 21: mNumLang = 10; return;
            case 22: mNumLang = 11; return;
            case 23: mNumLang = 12; return;
            case 24: mNumLang = 15; return;
            case 25: mNumLang = 20; return;
            case 26: mNumLang = 0; return;
            case 27: mNumLang = 0; return;
            case 28: mNumLang = 0; return;
            case 29: mNumLang = 0; return;
            case 30: mNumLang = 0; return;
            case 31: mNumLang = 0; return;
            case 32: mNumLang = 0; return;
            case 33: mNumLang = 0; return;
            case 34: mNumLang = 0; return;
            case 35: mNumLang = 0; return;
        }
    }

    private void determineSpellLevel() {
        switch (score) {
            case 0: mSpellLvl = 0; return;
            case 1: mSpellLvl = 0; return;
            case 2: mSpellLvl = 0; return;
            case 3: mSpellLvl = 0; return;
            case 4: mSpellLvl = 0; return;
            case 5: mSpellLvl = 0; return;
            case 6: mSpellLvl = 0; return;
            case 7: mSpellLvl = 0; return;
            case 8: mSpellLvl = 0; return;
            case 9: mSpellLvl = 4; return;
            case 10: mSpellLvl = 5; return;
            case 11: mSpellLvl = 5; return;
            case 12: mSpellLvl = 6; return;
            case 13: mSpellLvl = 6; return;
            case 14: mSpellLvl = 7; return;
            case 15: mSpellLvl = 7; return;
            case 16: mSpellLvl = 8; return;
            case 17: mSpellLvl = 8; return;
            case 18: mSpellLvl = 9; return;
            case 19: mSpellLvl = 9; return;
            case 20: mSpellLvl = 9; return;
            case 21: mSpellLvl = 9; return;
            case 22: mSpellLvl = 9; return;
            case 23: mSpellLvl = 9; return;
            case 24: mSpellLvl = 9; return;
            case 25: mSpellLvl = 9; return;
            case 26: mSpellLvl = 9; return;
            case 27: mSpellLvl = 9; return;
            case 28: mSpellLvl = 9; return;
            case 29: mSpellLvl = 9; return;
            case 30: mSpellLvl = 9; return;
            case 31: mSpellLvl = 9; return;
            case 32: mSpellLvl = 9; return;
            case 33: mSpellLvl = 9; return;
            case 34: mSpellLvl = 9; return;
            case 35: mSpellLvl = 9; return;
        }
    }

    private void determineChanceToLearn() {
        switch (score) {
            case 0: mChanceToLearnSpell = 0; return;
            case 1: mChanceToLearnSpell = 0; return;
            case 2: mChanceToLearnSpell = 0; return;
            case 3: mChanceToLearnSpell = 0; return;
            case 4: mChanceToLearnSpell = 0; return;
            case 5: mChanceToLearnSpell = 0; return;
            case 6: mChanceToLearnSpell = 0; return;
            case 7: mChanceToLearnSpell = 0; return;
            case 8: mChanceToLearnSpell = 0; return;
            case 9: mChanceToLearnSpell = 35; return;
            case 10: mChanceToLearnSpell = 40; return;
            case 11: mChanceToLearnSpell = 45; return;
            case 12: mChanceToLearnSpell = 50; return;
            case 13: mChanceToLearnSpell = 55; return;
            case 14: mChanceToLearnSpell = 60; return;
            case 15: mChanceToLearnSpell = 65; return;
            case 16: mChanceToLearnSpell = 70; return;
            case 17: mChanceToLearnSpell = 75; return;
            case 18: mChanceToLearnSpell = 85; return;
            case 19: mChanceToLearnSpell = 95; return;
            case 20: mChanceToLearnSpell = 96; return;
            case 21: mChanceToLearnSpell = 97; return;
            case 22: mChanceToLearnSpell = 98; return;
            case 23: mChanceToLearnSpell = 99; return;
            case 24: mChanceToLearnSpell = 100; return;
            case 25: mChanceToLearnSpell = 100; return;
            case 26: mChanceToLearnSpell = 100; return;
            case 27: mChanceToLearnSpell = 100; return;
            case 28: mChanceToLearnSpell = 100; return;
            case 29: mChanceToLearnSpell = 100; return;
            case 30: mChanceToLearnSpell = 100; return;
            case 31: mChanceToLearnSpell = 100; return;
            case 32: mChanceToLearnSpell = 100; return;
            case 33: mChanceToLearnSpell = 100; return;
            case 34: mChanceToLearnSpell = 100; return;
            case 35: mChanceToLearnSpell = 100; return;
        }
    }

    private void determineMaxSpellPerLevel() {
        switch (score) {
            case 0: mMaxSpellPerLvl = 0; return;
            case 1: mMaxSpellPerLvl = 0; return;
            case 2: mMaxSpellPerLvl = 0; return;
            case 3: mMaxSpellPerLvl = 0; return;
            case 4: mMaxSpellPerLvl = 0; return;
            case 5: mMaxSpellPerLvl = 0; return;
            case 6: mMaxSpellPerLvl = 0; return;
            case 7: mMaxSpellPerLvl = 0; return;
            case 8: mMaxSpellPerLvl = 6; return;
            case 9: mMaxSpellPerLvl = 7; return;
            case 10: mMaxSpellPerLvl = 7; return;
            case 11: mMaxSpellPerLvl = 7; return;
            case 12: mMaxSpellPerLvl = 7; return;
            case 13: mMaxSpellPerLvl = 9; return;
            case 14: mMaxSpellPerLvl = 9; return;
            case 15: mMaxSpellPerLvl = 11; return;
            case 16: mMaxSpellPerLvl = 11; return;
            case 17: mMaxSpellPerLvl = 14; return;
            case 18: mMaxSpellPerLvl = 18; return;
            case 19: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 20: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 21: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 22: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 23: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 24: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 25: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 26: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 27: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 28: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 29: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 30: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 31: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 32: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 33: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 34: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
            case 35: mMaxSpellPerLvl = Integer.MAX_VALUE; return;
        }
    }

    private void determineSpellImmunity() {
        switch (score) {
            case 19: mSpellImmunity = 1; return;
            case 20: mSpellImmunity = 2; return;
            case 21: mSpellImmunity = 3; return;
            case 22: mSpellImmunity = 4; return;
            case 23: mSpellImmunity = 5; return;
            case 24: mSpellImmunity = 6; return;
            case 25: mSpellImmunity = 7; return;
            case 26: mSpellImmunity = 7; return;
            case 27: mSpellImmunity = 7; return;
            case 28: mSpellImmunity = 7; return;
            case 29: mSpellImmunity = 7; return;
            case 30: mSpellImmunity = 7; return;
            case 31: mSpellImmunity = 7; return;
            case 32: mSpellImmunity = 7; return;
            case 33: mSpellImmunity = 7; return;
            case 34: mSpellImmunity = 7; return;
            case 35: mSpellImmunity = 7; return;
            default: mSpellImmunity = 0;
        }
    }
}
