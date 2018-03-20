package com.venom.dandd2pm.character.abilityscore;

/**
 * Created by Venom on 3/19/2018.
 */

public class Strength extends AbilityScore {
    int hitProbAdj, damageAdj, weightAllow, maxPress, openDoors, bblg;
    String note;

    public Strength() {
        score = 0;
        hitProbAdj = -5;
        damageAdj = -4;
        weightAllow = 1;
        maxPress = 3;
        openDoors = 1;
        bblg = 0;
        note = "";
    }

    public Strength(int newScore) {
        score = newScore;
        determineHitProbAdj();
        determineDamageAdj();
        determineWeightAllow();
        determineMaxPress();
        determineOpenDoors();
        determineBendBarLiftGrate();
        determineNote();
    }

    private void determineNote() {
        switch (score) {
            case 19: note = "Hill Giant"; return;
            case 20: note = "Stone Giant"; return;
            case 21: note = "Frost Giant"; return;
            case 22: note = "Fire Giant"; return;
            case 23: note = "Cloud Giant"; return;
            case 24: note = "Storm Giant"; return;
            case 25: note = "Titan"; return;
            case 26: note = ""; return;
            case 27: note = ""; return;
            case 28: note = ""; return;
            case 29: note = ""; return;
            case 30: note = ""; return;
            case 31: note = ""; return;
            case 32: note = ""; return;
            case 33: note = ""; return;
            case 34: note = ""; return;
            case 35: note = ""; return;
        }
    }

    private void determineHitProbAdj() {
        switch (score) {
            case 0: hitProbAdj = -5; return;
            case 1: hitProbAdj = -3; return;
            case 2: hitProbAdj = -3; return;
            case 3: hitProbAdj = -2; return;
            case 4: hitProbAdj = -1; return;
            case 5: hitProbAdj = 0; return;
            case 6: hitProbAdj = 0; return;
            case 7: hitProbAdj = 0; return;
            case 8: hitProbAdj = 0; return;
            case 9: hitProbAdj = 0; return;
            case 10: hitProbAdj = 0; return;
            case 11: hitProbAdj = 0; return;
            case 12: hitProbAdj = 0; return;
            case 13: hitProbAdj = 0; return;
            case 14: hitProbAdj = 0; return;
            case 15: hitProbAdj = 0; return;
            case 16: hitProbAdj = 0; return;
            case 17: hitProbAdj = 1; return;
            case 18: hitProbAdj = 1; return;


            case 19: hitProbAdj = 3; return;
            case 20: hitProbAdj = 3; return;
            case 21: hitProbAdj = 4; return;
            case 22: hitProbAdj = 4; return;
            case 23: hitProbAdj = 5; return;
            case 24: hitProbAdj = 6; return;
            case 25: hitProbAdj = 7; return;
            case 26: hitProbAdj = 0; return;
            case 27: hitProbAdj = 0; return;
            case 28: hitProbAdj = 0; return;
            case 29: hitProbAdj = 0; return;
            case 30: hitProbAdj = 0; return;
            case 31: hitProbAdj = 0; return;
            case 32: hitProbAdj = 0; return;
            case 33: hitProbAdj = 0; return;
            case 34: hitProbAdj = 0; return;
            case 35: hitProbAdj = 0; return;
        }
    }

    private void determineDamageAdj() {
        switch (score) {
            case 0: hitProbAdj = 0; return;
            case 1: hitProbAdj = 0; return;
            case 2: hitProbAdj = 0; return;
            case 3: hitProbAdj = 0; return;
            case 4: hitProbAdj = 0; return;
            case 5: hitProbAdj = 0; return;
            case 6: hitProbAdj = 0; return;
            case 7: hitProbAdj = 0; return;
            case 8: hitProbAdj = 0; return;
            case 9: hitProbAdj = 0; return;
            case 10: hitProbAdj = 0; return;
            case 11: hitProbAdj = 0; return;
            case 12: hitProbAdj = 0; return;
            case 13: hitProbAdj = 0; return;
            case 14: hitProbAdj = 0; return;
            case 15: hitProbAdj = 0; return;
            case 16: hitProbAdj = 0; return;
            case 17: hitProbAdj = 0; return;
            case 18: hitProbAdj = 0; return;
            case 19: hitProbAdj = 0; return;
            case 20: hitProbAdj = 0; return;
            case 21: hitProbAdj = 0; return;
            case 22: hitProbAdj = 0; return;
            case 23: hitProbAdj = 0; return;
            case 24: hitProbAdj = 0; return;
            case 25: hitProbAdj = 0; return;
            case 26: hitProbAdj = 0; return;
            case 27: hitProbAdj = 0; return;
            case 28: hitProbAdj = 0; return;
            case 29: hitProbAdj = 0; return;
            case 30: hitProbAdj = 0; return;
            case 31: hitProbAdj = 0; return;
            case 32: hitProbAdj = 0; return;
            case 33: hitProbAdj = 0; return;
            case 34: hitProbAdj = 0; return;
            case 35: hitProbAdj = 0; return;
        }
    }

    private void determineWeightAllow() {
        switch (score) {
            case 0: hitProbAdj = 0; return;
            case 1: hitProbAdj = 0; return;
            case 2: hitProbAdj = 0; return;
            case 3: hitProbAdj = 0; return;
            case 4: hitProbAdj = 0; return;
            case 5: hitProbAdj = 0; return;
            case 6: hitProbAdj = 0; return;
            case 7: hitProbAdj = 0; return;
            case 8: hitProbAdj = 0; return;
            case 9: hitProbAdj = 0; return;
            case 10: hitProbAdj = 0; return;
            case 11: hitProbAdj = 0; return;
            case 12: hitProbAdj = 0; return;
            case 13: hitProbAdj = 0; return;
            case 14: hitProbAdj = 0; return;
            case 15: hitProbAdj = 0; return;
            case 16: hitProbAdj = 0; return;
            case 17: hitProbAdj = 0; return;
            case 18: hitProbAdj = 0; return;
            case 19: hitProbAdj = 0; return;
            case 20: hitProbAdj = 0; return;
            case 21: hitProbAdj = 0; return;
            case 22: hitProbAdj = 0; return;
            case 23: hitProbAdj = 0; return;
            case 24: hitProbAdj = 0; return;
            case 25: hitProbAdj = 0; return;
            case 26: hitProbAdj = 0; return;
            case 27: hitProbAdj = 0; return;
            case 28: hitProbAdj = 0; return;
            case 29: hitProbAdj = 0; return;
            case 30: hitProbAdj = 0; return;
            case 31: hitProbAdj = 0; return;
            case 32: hitProbAdj = 0; return;
            case 33: hitProbAdj = 0; return;
            case 34: hitProbAdj = 0; return;
            case 35: hitProbAdj = 0; return;
        }
    }

    private void determineMaxPress() {
        switch (score) {
            case 0: hitProbAdj = 0; return;
            case 1: hitProbAdj = 0; return;
            case 2: hitProbAdj = 0; return;
            case 3: hitProbAdj = 0; return;
            case 4: hitProbAdj = 0; return;
            case 5: hitProbAdj = 0; return;
            case 6: hitProbAdj = 0; return;
            case 7: hitProbAdj = 0; return;
            case 8: hitProbAdj = 0; return;
            case 9: hitProbAdj = 0; return;
            case 10: hitProbAdj = 0; return;
            case 11: hitProbAdj = 0; return;
            case 12: hitProbAdj = 0; return;
            case 13: hitProbAdj = 0; return;
            case 14: hitProbAdj = 0; return;
            case 15: hitProbAdj = 0; return;
            case 16: hitProbAdj = 0; return;
            case 17: hitProbAdj = 0; return;
            case 18: hitProbAdj = 0; return;
            case 19: hitProbAdj = 0; return;
            case 20: hitProbAdj = 0; return;
            case 21: hitProbAdj = 0; return;
            case 22: hitProbAdj = 0; return;
            case 23: hitProbAdj = 0; return;
            case 24: hitProbAdj = 0; return;
            case 25: hitProbAdj = 0; return;
            case 26: hitProbAdj = 0; return;
            case 27: hitProbAdj = 0; return;
            case 28: hitProbAdj = 0; return;
            case 29: hitProbAdj = 0; return;
            case 30: hitProbAdj = 0; return;
            case 31: hitProbAdj = 0; return;
            case 32: hitProbAdj = 0; return;
            case 33: hitProbAdj = 0; return;
            case 34: hitProbAdj = 0; return;
            case 35: hitProbAdj = 0; return;
        }
    }

    private void determineOpenDoors() {
        switch (score) {
            case 0: hitProbAdj = 0; return;
            case 1: hitProbAdj = 0; return;
            case 2: hitProbAdj = 0; return;
            case 3: hitProbAdj = 0; return;
            case 4: hitProbAdj = 0; return;
            case 5: hitProbAdj = 0; return;
            case 6: hitProbAdj = 0; return;
            case 7: hitProbAdj = 0; return;
            case 8: hitProbAdj = 0; return;
            case 9: hitProbAdj = 0; return;
            case 10: hitProbAdj = 0; return;
            case 11: hitProbAdj = 0; return;
            case 12: hitProbAdj = 0; return;
            case 13: hitProbAdj = 0; return;
            case 14: hitProbAdj = 0; return;
            case 15: hitProbAdj = 0; return;
            case 16: hitProbAdj = 0; return;
            case 17: hitProbAdj = 0; return;
            case 18: hitProbAdj = 0; return;
            case 19: hitProbAdj = 0; return;
            case 20: hitProbAdj = 0; return;
            case 21: hitProbAdj = 0; return;
            case 22: hitProbAdj = 0; return;
            case 23: hitProbAdj = 0; return;
            case 24: hitProbAdj = 0; return;
            case 25: hitProbAdj = 0; return;
            case 26: hitProbAdj = 0; return;
            case 27: hitProbAdj = 0; return;
            case 28: hitProbAdj = 0; return;
            case 29: hitProbAdj = 0; return;
            case 30: hitProbAdj = 0; return;
            case 31: hitProbAdj = 0; return;
            case 32: hitProbAdj = 0; return;
            case 33: hitProbAdj = 0; return;
            case 34: hitProbAdj = 0; return;
            case 35: hitProbAdj = 0; return;
        }
    }

    private void determineBendBarLiftGrate() {
        switch (score) {
            case 0: hitProbAdj = 0; return;
            case 1: hitProbAdj = 0; return;
            case 2: hitProbAdj = 0; return;
            case 3: hitProbAdj = 0; return;
            case 4: hitProbAdj = 0; return;
            case 5: hitProbAdj = 0; return;
            case 6: hitProbAdj = 0; return;
            case 7: hitProbAdj = 0; return;
            case 8: hitProbAdj = 0; return;
            case 9: hitProbAdj = 0; return;
            case 10: hitProbAdj = 0; return;
            case 11: hitProbAdj = 0; return;
            case 12: hitProbAdj = 0; return;
            case 13: hitProbAdj = 0; return;
            case 14: hitProbAdj = 0; return;
            case 15: hitProbAdj = 0; return;
            case 16: hitProbAdj = 0; return;
            case 17: hitProbAdj = 0; return;
            case 18: hitProbAdj = 0; return;
            case 19: hitProbAdj = 0; return;
            case 20: hitProbAdj = 0; return;
            case 21: hitProbAdj = 0; return;
            case 22: hitProbAdj = 0; return;
            case 23: hitProbAdj = 0; return;
            case 24: hitProbAdj = 0; return;
            case 25: hitProbAdj = 0; return;
            case 26: hitProbAdj = 0; return;
            case 27: hitProbAdj = 0; return;
            case 28: hitProbAdj = 0; return;
            case 29: hitProbAdj = 0; return;
            case 30: hitProbAdj = 0; return;
            case 31: hitProbAdj = 0; return;
            case 32: hitProbAdj = 0; return;
            case 33: hitProbAdj = 0; return;
            case 34: hitProbAdj = 0; return;
            case 35: hitProbAdj = 0; return;
        }
    }
}
