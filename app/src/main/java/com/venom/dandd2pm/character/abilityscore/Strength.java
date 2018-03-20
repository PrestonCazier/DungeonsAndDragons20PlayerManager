package com.venom.dandd2pm.character.abilityscore;

/**
 * Created by Venom on 3/19/2018.
 */

public class Strength extends AbilityScore {
    int mHitProbAdj, mDamageAdj, mWeightAllow, mMaxPress, mOpenDoors, mBBLG;
    int mPercentile;
    int mOpenDoorAdjust;
    String mNote;
    Boolean mIsWarrior = false;

    public Strength() {
        score = 0;
        mHitProbAdj = -5;
        mDamageAdj = -4;
        mWeightAllow = 1;
        mMaxPress = 3;
        mOpenDoors = 1;
        mBBLG = 0;
        mNote = "";
    }

    public Strength(int newScore, Boolean isWarrior, int percentile) {
        score = newScore;
        mIsWarrior = isWarrior;
        mPercentile = (isWarrior) ? percentile : -1;
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
            case 19: mNote = "Hill Giant"; return;
            case 20: mNote = "Stone Giant"; return;
            case 21: mNote = "Frost Giant"; return;
            case 22: mNote = "Fire Giant"; return;
            case 23: mNote = "Cloud Giant"; return;
            case 24: mNote = "Storm Giant"; return;
            case 25: mNote = "Titan"; return;
            case 26: mNote = ""; return;
            case 27: mNote = ""; return;
            case 28: mNote = ""; return;
            case 29: mNote = ""; return;
            case 30: mNote = ""; return;
            case 31: mNote = ""; return;
            case 32: mNote = ""; return;
            case 33: mNote = ""; return;
            case 34: mNote = ""; return;
            case 35: mNote = ""; return;
        }
    }

    private void determineHitProbAdj() {
        switch (score) {
            case 0: mHitProbAdj = -5; return;
            case 1: mHitProbAdj = -5; return;
            case 2: mHitProbAdj = -3; return;
            case 3: mHitProbAdj = -3; return;
            case 4: mHitProbAdj = -2; return;
            case 5: mHitProbAdj = -2; return;
            case 6: mHitProbAdj = -1; return;
            case 7: mHitProbAdj = -1; return;
            case 8: mHitProbAdj = 0; return;
            case 9: mHitProbAdj = 0; return;
            case 10: mHitProbAdj = 0; return;
            case 11: mHitProbAdj = 0; return;
            case 12: mHitProbAdj = 0; return;
            case 13: mHitProbAdj = 0; return;
            case 14: mHitProbAdj = 0; return;
            case 15: mHitProbAdj = 0; return;
            case 16: mHitProbAdj = 0; return;
            case 17: mHitProbAdj = 1; return;
            case 18:
                if (mIsWarrior) {
                    if (mPercentile >= 1 && mPercentile <= 50) mHitProbAdj = 1;
                    else if (mPercentile >= 51 && mPercentile <= 76) mHitProbAdj = 2;
                    else if (mPercentile >= 76 && mPercentile <= 90) mHitProbAdj = 2;
                    else if (mPercentile >= 91 && mPercentile <= 99) mHitProbAdj = 2;
                    else if (mPercentile == 0) mHitProbAdj = 3;
                } else {
                    mHitProbAdj = 1;
                }
                return;
            case 19: mHitProbAdj = 3; return;
            case 20: mHitProbAdj = 3; return;
            case 21: mHitProbAdj = 4; return;
            case 22: mHitProbAdj = 4; return;
            case 23: mHitProbAdj = 5; return;
            case 24: mHitProbAdj = 6; return;
            case 25: mHitProbAdj = 7; return;
            case 26: mHitProbAdj = 0; return;
            case 27: mHitProbAdj = 0; return;
            case 28: mHitProbAdj = 0; return;
            case 29: mHitProbAdj = 0; return;
            case 30: mHitProbAdj = 0; return;
            case 31: mHitProbAdj = 0; return;
            case 32: mHitProbAdj = 0; return;
            case 33: mHitProbAdj = 0; return;
            case 34: mHitProbAdj = 0; return;
            case 35: mHitProbAdj = 0; return;
        }
    }

    private void determineDamageAdj() {
        switch (score) {
            case 0: mDamageAdj = -4; return;
            case 1: mDamageAdj = -4; return;
            case 2: mDamageAdj = -2; return;
            case 3: mDamageAdj = -1; return;
            case 4: mDamageAdj = -1; return;
            case 5: mDamageAdj = -1; return;
            case 6: mDamageAdj = 0; return;
            case 7: mDamageAdj = 0; return;
            case 8: mDamageAdj = 0; return;
            case 9: mDamageAdj = 0; return;
            case 10: mDamageAdj = 0; return;
            case 11: mDamageAdj = 0; return;
            case 12: mDamageAdj = 0; return;
            case 13: mDamageAdj = 0; return;
            case 14: mDamageAdj = 0; return;
            case 15: mDamageAdj = 0; return;
            case 16: mDamageAdj = 1; return;
            case 17: mDamageAdj = 1; return;
            case 18:
                if (mIsWarrior) {
                    if (mPercentile >= 1 && mPercentile <= 50) mDamageAdj = 3;
                    else if (mPercentile >= 51 && mPercentile <= 76) mDamageAdj = 3;
                    else if (mPercentile >= 76 && mPercentile <= 90) mDamageAdj = 4;
                    else if (mPercentile >= 91 && mPercentile <= 99) mDamageAdj = 5;
                    else if (mPercentile == 0) mDamageAdj = 6;
                } else {
                    mDamageAdj = 2;
                }
                return;
            case 19: mDamageAdj = 7; return;
            case 20: mDamageAdj = 8; return;
            case 21: mDamageAdj = 9; return;
            case 22: mDamageAdj = 10; return;
            case 23: mDamageAdj = 11; return;
            case 24: mDamageAdj = 12; return;
            case 25: mDamageAdj = 14; return;
            case 26: mDamageAdj = 0; return;
            case 27: mDamageAdj = 0; return;
            case 28: mDamageAdj = 0; return;
            case 29: mDamageAdj = 0; return;
            case 30: mDamageAdj = 0; return;
            case 31: mDamageAdj = 0; return;
            case 32: mDamageAdj = 0; return;
            case 33: mDamageAdj = 0; return;
            case 34: mDamageAdj = 0; return;
            case 35: mDamageAdj = 0; return;
        }
    }

    private void determineWeightAllow() {
        switch (score) {
            case 0: mWeightAllow = 1; return;
            case 1: mWeightAllow = 1; return;
            case 2: mWeightAllow = 1; return;
            case 3: mWeightAllow = 5; return;
            case 4: mWeightAllow = 10; return;
            case 5: mWeightAllow = 10; return;
            case 6: mWeightAllow = 20; return;
            case 7: mWeightAllow = 20; return;
            case 8: mWeightAllow = 35; return;
            case 9: mWeightAllow = 35; return;
            case 10: mWeightAllow = 40; return;
            case 11: mWeightAllow = 40; return;
            case 12: mWeightAllow = 45; return;
            case 13: mWeightAllow = 45; return;
            case 14: mWeightAllow = 55; return;
            case 15: mWeightAllow = 55; return;
            case 16: mWeightAllow = 70; return;
            case 17: mWeightAllow = 85; return;
            case 18:
                if (mIsWarrior) {
                    if (mPercentile >= 1 && mPercentile <= 50) mWeightAllow = 135;
                    else if (mPercentile >= 51 && mPercentile <= 76) mWeightAllow = 160;
                    else if (mPercentile >= 76 && mPercentile <= 90) mWeightAllow = 185;
                    else if (mPercentile >= 91 && mPercentile <= 99) mWeightAllow = 235;
                    else if (mPercentile == 0) mWeightAllow = 335;
                } else {
                    mWeightAllow = 110;
                }
                return;
            case 19: mWeightAllow = 485; return;
            case 20: mWeightAllow = 535; return;
            case 21: mWeightAllow = 635; return;
            case 22: mWeightAllow = 785; return;
            case 23: mWeightAllow = 935; return;
            case 24: mWeightAllow = 1235; return;
            case 25: mWeightAllow = 1535; return;
            case 26: mWeightAllow = 0; return;
            case 27: mWeightAllow = 0; return;
            case 28: mWeightAllow = 0; return;
            case 29: mWeightAllow = 0; return;
            case 30: mWeightAllow = 0; return;
            case 31: mWeightAllow = 0; return;
            case 32: mWeightAllow = 0; return;
            case 33: mWeightAllow = 0; return;
            case 34: mWeightAllow = 0; return;
            case 35: mWeightAllow = 0; return;
        }
    }

    private void determineMaxPress() {
        switch (score) {
            case 0: mMaxPress = 3; return;
            case 1: mMaxPress = 3; return;
            case 2: mMaxPress = 5; return;
            case 3: mMaxPress = 10; return;
            case 4: mMaxPress = 25; return;
            case 5: mMaxPress = 25; return;
            case 6: mMaxPress = 55; return;
            case 7: mMaxPress = 55; return;
            case 8: mMaxPress = 90; return;
            case 9: mMaxPress = 90; return;
            case 10: mMaxPress = 115; return;
            case 11: mMaxPress = 115; return;
            case 12: mMaxPress = 140; return;
            case 13: mMaxPress = 140; return;
            case 14: mMaxPress = 170; return;
            case 15: mMaxPress = 170; return;
            case 16: mMaxPress = 195; return;
            case 17: mMaxPress = 220; return;
            case 18:
                if (mIsWarrior) {
                    if (mPercentile >= 1 && mPercentile <= 50) mMaxPress = 280;
                    else if (mPercentile >= 51 && mPercentile <= 76) mMaxPress = 305;
                    else if (mPercentile >= 76 && mPercentile <= 90) mMaxPress = 330;
                    else if (mPercentile >= 91 && mPercentile <= 99) mMaxPress = 380;
                    else if (mPercentile == 0) mMaxPress = 480;
                } else {
                    mMaxPress = 255;
                }
                return;
            case 19: mMaxPress = 640; return;
            case 20: mMaxPress = 700; return;
            case 21: mMaxPress = 810; return;
            case 22: mMaxPress = 970; return;
            case 23: mMaxPress = 1130; return;
            case 24: mMaxPress = 1440; return;
            case 25: mMaxPress = 1535; return;
            case 26: mMaxPress = 0; return;
            case 27: mMaxPress = 0; return;
            case 28: mMaxPress = 0; return;
            case 29: mMaxPress = 0; return;
            case 30: mMaxPress = 0; return;
            case 31: mMaxPress = 0; return;
            case 32: mMaxPress = 0; return;
            case 33: mMaxPress = 0; return;
            case 34: mMaxPress = 0; return;
            case 35: mMaxPress = 0; return;
        }
    }

    private void determineOpenDoors() {
        switch (score) {
            case 0: mOpenDoors = 1; return;
            case 1: mOpenDoors = 1; return;
            case 2: mOpenDoors = 1; return;
            case 3: mOpenDoors = 2; return;
            case 4: mOpenDoors = 3; return;
            case 5: mOpenDoors = 3; return;
            case 6: mOpenDoors = 4; return;
            case 7: mOpenDoors = 4; return;
            case 8: mOpenDoors = 5; return;
            case 9: mOpenDoors = 5; return;
            case 10: mOpenDoors = 6; return;
            case 11: mOpenDoors = 6; return;
            case 12: mOpenDoors = 7; return;
            case 13: mOpenDoors = 7; return;
            case 14: mOpenDoors = 8; return;
            case 15: mOpenDoors = 8; return;
            case 16: mOpenDoors = 9; return;
            case 17: mOpenDoors = 10; return;
            case 18:
                if (mIsWarrior) {
                    if (mPercentile >= 1 && mPercentile <= 50) mOpenDoors = 12;
                    else if (mPercentile >= 51 && mPercentile <= 76) mOpenDoors = 13;
                    else if (mPercentile >= 76 && mPercentile <= 90) mOpenDoors = 14;
                    else if (mPercentile >= 91 && mPercentile <= 99) { mOpenDoors = 15; mOpenDoorAdjust = 3; }
                    else if (mPercentile == 0) { mOpenDoors = 16; mOpenDoorAdjust = 6; }
                } else {
                    mOpenDoors = 11;
                }
                return;
            case 19: mOpenDoors = 16; mOpenDoorAdjust = 6; return;
            case 20: mOpenDoors = 17; mOpenDoorAdjust = 10; return;
            case 21: mOpenDoors = 17; mOpenDoorAdjust = 12; return;
            case 22: mOpenDoors = 18; mOpenDoorAdjust = 14; return;
            case 23: mOpenDoors = 18; mOpenDoorAdjust = 16; return;
            case 24: mOpenDoors = 19; mOpenDoorAdjust = 17; return;
            case 25: mOpenDoors = 19; mOpenDoorAdjust = 18; return;
            case 26: mOpenDoors = 0; return;
            case 27: mOpenDoors = 0; return;
            case 28: mOpenDoors = 0; return;
            case 29: mOpenDoors = 0; return;
            case 30: mOpenDoors = 0; return;
            case 31: mOpenDoors = 0; return;
            case 32: mOpenDoors = 0; return;
            case 33: mOpenDoors = 0; return;
            case 34: mOpenDoors = 0; return;
            case 35: mOpenDoors = 0; return;
        }
    }

    private void determineBendBarLiftGrate() {
        switch (score) {
            case 0: mBBLG = 0; return;
            case 1: mBBLG = 0; return;
            case 2: mBBLG = 0; return;
            case 3: mBBLG = 0; return;
            case 4: mBBLG = 0; return;
            case 5: mBBLG = 0; return;
            case 6: mBBLG = 0; return;
            case 7: mBBLG = 0; return;
            case 8: mBBLG = 1; return;
            case 9: mBBLG = 1; return;
            case 10: mBBLG = 2; return;
            case 11: mBBLG = 2; return;
            case 12: mBBLG = 4; return;
            case 13: mBBLG = 4; return;
            case 14: mBBLG = 7; return;
            case 15: mBBLG = 7; return;
            case 16: mBBLG = 10; return;
            case 17: mBBLG = 13; return;
            case 18:
                if (mIsWarrior) {
                    if (mPercentile >= 1 && mPercentile <= 50) mBBLG = 20;
                    else if (mPercentile >= 51 && mPercentile <= 76) mBBLG = 25;
                    else if (mPercentile >= 76 && mPercentile <= 90) mBBLG = 30;
                    else if (mPercentile >= 91 && mPercentile <= 99) mBBLG = 35;
                    else if (mPercentile == 0) mBBLG = 40;
                } else {
                    mBBLG = 16;
                }
                return;
            case 19: mBBLG = 50; return;
            case 20: mBBLG = 60; return;
            case 21: mBBLG = 70; return;
            case 22: mBBLG = 80; return;
            case 23: mBBLG = 90; return;
            case 24: mBBLG = 95; return;
            case 25: mBBLG = 99; return;
            case 26: mBBLG = 0; return;
            case 27: mBBLG = 0; return;
            case 28: mBBLG = 0; return;
            case 29: mBBLG = 0; return;
            case 30: mBBLG = 0; return;
            case 31: mBBLG = 0; return;
            case 32: mBBLG = 0; return;
            case 33: mBBLG = 0; return;
            case 34: mBBLG = 0; return;
            case 35: mBBLG = 0; return;
        }
    }
}
