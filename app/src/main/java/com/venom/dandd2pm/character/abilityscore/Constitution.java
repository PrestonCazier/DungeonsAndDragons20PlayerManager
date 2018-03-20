package com.venom.dandd2pm.character.abilityscore;

import android.text.BoringLayout;

/**
 * Created by Venom on 3/19/2018.
 */

public class Constitution extends AbilityScore {
    int mHitProbAdj, mSystemShock, mResurrectionSurvival, mPoisonSave, mRegeneration;
    Boolean mIsWarrior = false;

    public Constitution() {
        score = 0;
    }

    public Constitution(int newScore, Boolean isWarrior) {
        score = newScore;
        mIsWarrior = isWarrior;
        determineHitProbAdj();
        determineSystemShock();
        determineRezSurvival();
        determinePoisonSave();
        determineRegeneration();
    }

    private void determineHitProbAdj() {
        if (!mIsWarrior && score >= 16) {
            mHitProbAdj = 2;
            return;
        }
        switch (score) {
            case 0: mHitProbAdj = -3; return;
            case 1: mHitProbAdj = -3; return;
            case 2: mHitProbAdj = -2; return;
            case 3: mHitProbAdj = -2; return;
            case 4: mHitProbAdj = -1; return;
            case 5: mHitProbAdj = -1; return;
            case 6: mHitProbAdj = -1; return;
            case 7: mHitProbAdj = 0; return;
            case 8: mHitProbAdj = 0; return;
            case 9: mHitProbAdj = 0; return;
            case 10: mHitProbAdj = 0; return;
            case 11: mHitProbAdj = 0; return;
            case 12: mHitProbAdj = 0; return;
            case 13: mHitProbAdj = 0; return;
            case 14: mHitProbAdj = 0; return;
            case 15: mHitProbAdj = 1; return;
            case 16: mHitProbAdj = 2; return;
            case 17: mHitProbAdj = 3; return;
            case 18: mHitProbAdj = 4; return;
            case 19: mHitProbAdj = 5; return;
            case 20: mHitProbAdj = 5; return;
            case 21: mHitProbAdj = 6; return;
            case 22: mHitProbAdj = 6; return;
            case 23: mHitProbAdj = 6; return;
            case 24: mHitProbAdj = 7; return;
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

    private void determineSystemShock() {
        switch (score) {
            case 0: mSystemShock = 25; return;
            case 1: mSystemShock = 25; return;
            case 2: mSystemShock = 30; return;
            case 3: mSystemShock = 35; return;
            case 4: mSystemShock = 40; return;
            case 5: mSystemShock = 45; return;
            case 6: mSystemShock = 50; return;
            case 7: mSystemShock = 55; return;
            case 8: mSystemShock = 60; return;
            case 9: mSystemShock = 65; return;
            case 10: mSystemShock = 70; return;
            case 11: mSystemShock = 75; return;
            case 12: mSystemShock = 80; return;
            case 13: mSystemShock = 85; return;
            case 14: mSystemShock = 88; return;
            case 15: mSystemShock = 90; return;
            case 16: mSystemShock = 95; return;
            case 17: mSystemShock = 97; return;
            case 18: mSystemShock = 99; return;
            case 19: mSystemShock = 99; return;
            case 20: mSystemShock = 99; return;
            case 21: mSystemShock = 99; return;
            case 22: mSystemShock = 99; return;
            case 23: mSystemShock = 99; return;
            case 24: mSystemShock = 99; return;
            case 25: mSystemShock = 99; return;
            case 26: mSystemShock = 99; return;
            case 27: mSystemShock = 99; return;
            case 28: mSystemShock = 99; return;
            case 29: mSystemShock = 99; return;
            case 30: mSystemShock = 99; return;
            case 31: mSystemShock = 99; return;
            case 32: mSystemShock = 99; return;
            case 33: mSystemShock = 99; return;
            case 34: mSystemShock = 99; return;
            case 35: mSystemShock = 99; return;
        }
    }

    private void determineRezSurvival() {
        switch (score) {
            case 0: mResurrectionSurvival = 30; return;
            case 1: mResurrectionSurvival = 30; return;
            case 2: mResurrectionSurvival = 35; return;
            case 3: mResurrectionSurvival = 40; return;
            case 4: mResurrectionSurvival = 45; return;
            case 5: mResurrectionSurvival = 50; return;
            case 6: mResurrectionSurvival = 55; return;
            case 7: mResurrectionSurvival = 60; return;
            case 8: mResurrectionSurvival = 65; return;
            case 9: mResurrectionSurvival = 70; return;
            case 10: mResurrectionSurvival = 75; return;
            case 11: mResurrectionSurvival = 80; return;
            case 12: mResurrectionSurvival = 85; return;
            case 13: mResurrectionSurvival = 90; return;
            case 14: mResurrectionSurvival = 92; return;
            case 15: mResurrectionSurvival = 94; return;
            case 16: mResurrectionSurvival = 96; return;
            case 17: mResurrectionSurvival = 98; return;
            case 18: mResurrectionSurvival = 100; return;
            case 19: mResurrectionSurvival = 100; return;
            case 20: mResurrectionSurvival = 100; return;
            case 21: mResurrectionSurvival = 100; return;
            case 22: mResurrectionSurvival = 100; return;
            case 23: mResurrectionSurvival = 100; return;
            case 24: mResurrectionSurvival = 100; return;
            case 25: mResurrectionSurvival = 100; return;
            case 26: mResurrectionSurvival = 100; return;
            case 27: mResurrectionSurvival = 100; return;
            case 28: mResurrectionSurvival = 100; return;
            case 29: mResurrectionSurvival = 100; return;
            case 30: mResurrectionSurvival = 100; return;
            case 31: mResurrectionSurvival = 100; return;
            case 32: mResurrectionSurvival = 100; return;
            case 33: mResurrectionSurvival = 100; return;
            case 34: mResurrectionSurvival = 100; return;
            case 35: mResurrectionSurvival = 100; return;
        }
    }

    private void determinePoisonSave() {
        switch (score) {
            case 0: mPoisonSave = -2; return;
            case 1: mPoisonSave = -2; return;
            case 2: mPoisonSave = -1; return;
            case 3: mPoisonSave = 0; return;
            case 4: mPoisonSave = 0; return;
            case 5: mPoisonSave = 0; return;
            case 6: mPoisonSave = 0; return;
            case 7: mPoisonSave = 0; return;
            case 8: mPoisonSave = 0; return;
            case 9: mPoisonSave = 0; return;
            case 10: mPoisonSave = 0; return;
            case 11: mPoisonSave = 0; return;
            case 12: mPoisonSave = 0; return;
            case 13: mPoisonSave = 0; return;
            case 14: mPoisonSave = 0; return;
            case 15: mPoisonSave = 0; return;
            case 16: mPoisonSave = 0; return;
            case 17: mPoisonSave = 0; return;
            case 18: mPoisonSave = 0; return;
            case 19: mPoisonSave = 1; return;
            case 20: mPoisonSave = 1; return;
            case 21: mPoisonSave = 2; return;
            case 22: mPoisonSave = 2; return;
            case 23: mPoisonSave = 3; return;
            case 24: mPoisonSave = 3; return;
            case 25: mPoisonSave = 4; return;
            case 26: mPoisonSave = 0; return;
            case 27: mPoisonSave = 0; return;
            case 28: mPoisonSave = 0; return;
            case 29: mPoisonSave = 0; return;
            case 30: mPoisonSave = 0; return;
            case 31: mPoisonSave = 0; return;
            case 32: mPoisonSave = 0; return;
            case 33: mPoisonSave = 0; return;
            case 34: mPoisonSave = 0; return;
            case 35: mPoisonSave = 0; return;
        }
    }

    private void determineRegeneration() {
        switch (score) {
            case 0: mRegeneration = 0; return;
            case 1: mRegeneration = 0; return;
            case 2: mRegeneration = 0; return;
            case 3: mRegeneration = 0; return;
            case 4: mRegeneration = 0; return;
            case 5: mRegeneration = 0; return;
            case 6: mRegeneration = 0; return;
            case 7: mRegeneration = 0; return;
            case 8: mRegeneration = 0; return;
            case 9: mRegeneration = 0; return;
            case 10: mRegeneration = 0; return;
            case 11: mRegeneration = 0; return;
            case 12: mRegeneration = 0; return;
            case 13: mRegeneration = 0; return;
            case 14: mRegeneration = 0; return;
            case 15: mRegeneration = 0; return;
            case 16: mRegeneration = 0; return;
            case 17: mRegeneration = 0; return;
            case 18: mRegeneration = 0; return;
            case 19: mRegeneration = 0; return;
            case 20: mRegeneration = 6; return;
            case 21: mRegeneration = 5; return;
            case 22: mRegeneration = 4; return;
            case 23: mRegeneration = 3; return;
            case 24: mRegeneration = 2; return;
            case 25: mRegeneration = 1; return;
            case 26: mRegeneration = 0; return;
            case 27: mRegeneration = 0; return;
            case 28: mRegeneration = 0; return;
            case 29: mRegeneration = 0; return;
            case 30: mRegeneration = 0; return;
            case 31: mRegeneration = 0; return;
            case 32: mRegeneration = 0; return;
            case 33: mRegeneration = 0; return;
            case 34: mRegeneration = 0; return;
            case 35: mRegeneration = 0; return;
        }
    }
}
