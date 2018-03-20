package com.venom.dandd2pm.character.abilityscore;

/**
 * Created by Venom on 3/19/2018.
 */

public class Dexterity extends AbilityScore {
    int reactionAdj, missileAttackAdj, defensiveAdj;

    public Dexterity() {
        score = 0;
        reactionAdj = -6;
        missileAttackAdj = -6;
        defensiveAdj = 5;
    }

    public Dexterity(int newScore) {
        score = newScore;
        determineReactAdj();
        determineMissileAttackAdj();
        determineDefensiveAdj();
    }

    private void determineReactAdj() {
        switch (score) {
            case 0: reactionAdj = -6; return;
            case 1: reactionAdj = -6; return;
            case 2: reactionAdj = -4; return;
            case 3: reactionAdj = -3; return;
            case 4: reactionAdj = -2; return;
            case 5: reactionAdj = -1; return;
            case 6: reactionAdj = 0; return;
            case 7: reactionAdj = 0; return;
            case 8: reactionAdj = 0; return;
            case 9: reactionAdj = 0; return;
            case 10: reactionAdj = 0; return;
            case 11: reactionAdj = 0; return;
            case 12: reactionAdj = 0; return;
            case 13: reactionAdj = 0; return;
            case 14: reactionAdj = 0; return;
            case 15: reactionAdj = 0; return;
            case 16: reactionAdj = 1; return;
            case 17: reactionAdj = 2; return;
            case 18: reactionAdj = 2; return;
            case 19: reactionAdj = 3; return;
            case 20: reactionAdj = 3; return;
            case 21: reactionAdj = 4; return;
            case 22: reactionAdj = 4; return;
            case 23: reactionAdj = 4; return;
            case 24: reactionAdj = 5; return;
            case 25: reactionAdj = 5; return;
            case 26: reactionAdj = -6; return;
            case 27: reactionAdj = -6; return;
            case 28: reactionAdj = -6; return;
            case 29: reactionAdj = -6; return;
            case 30: reactionAdj = -6; return;
            case 31: reactionAdj = -6; return;
            case 32: reactionAdj = -6; return;
            case 33: reactionAdj = -6; return;
            case 34: reactionAdj = -6; return;
            case 35: reactionAdj = -6; return;
        }
    }

    private void determineMissileAttackAdj() {
        switch (score) {
            case 0: missileAttackAdj = -6; return;
            case 1: missileAttackAdj = -6; return;
            case 2: missileAttackAdj = -4; return;
            case 3: missileAttackAdj = -3; return;
            case 4: missileAttackAdj = -2; return;
            case 5: missileAttackAdj = -1; return;
            case 6: missileAttackAdj = 0; return;
            case 7: missileAttackAdj = 0; return;
            case 8: missileAttackAdj = 0; return;
            case 9: missileAttackAdj = 0; return;
            case 10: missileAttackAdj = 0; return;
            case 11: missileAttackAdj = 0; return;
            case 12: missileAttackAdj = 0; return;
            case 13: missileAttackAdj = 0; return;
            case 14: missileAttackAdj = 0; return;
            case 15: missileAttackAdj = 0; return;
            case 16: missileAttackAdj = 1; return;
            case 17: missileAttackAdj = 2; return;
            case 18: missileAttackAdj = 2; return;
            case 19: missileAttackAdj = 3; return;
            case 20: missileAttackAdj = 3; return;
            case 21: missileAttackAdj = 4; return;
            case 22: missileAttackAdj = 4; return;
            case 23: missileAttackAdj = 4; return;
            case 24: missileAttackAdj = 5; return;
            case 25: missileAttackAdj = 5; return;
            case 26: missileAttackAdj = -6; return;
            case 27: missileAttackAdj = -6; return;
            case 28: missileAttackAdj = -6; return;
            case 29: missileAttackAdj = -6; return;
            case 30: missileAttackAdj = -6; return;
            case 31: missileAttackAdj = -6; return;
            case 32: missileAttackAdj = -6; return;
            case 33: missileAttackAdj = -6; return;
            case 34: missileAttackAdj = -6; return;
            case 35: missileAttackAdj = -6; return;
        }
    }

    private void determineDefensiveAdj() {
        switch (score) {
            case 0: defensiveAdj = 5; return;
            case 1: defensiveAdj = 5; return;
            case 2: defensiveAdj = 5; return;
            case 3: defensiveAdj = 4; return;
            case 4: defensiveAdj = 3; return;
            case 5: defensiveAdj = 2; return;
            case 6: defensiveAdj = 1; return;
            case 7: defensiveAdj = 0; return;
            case 8: defensiveAdj = 0; return;
            case 9: defensiveAdj = 0; return;
            case 10: defensiveAdj = 0; return;
            case 11: defensiveAdj = 0; return;
            case 12: defensiveAdj = 0; return;
            case 13: defensiveAdj = 0; return;
            case 14: defensiveAdj = 0; return;
            case 15: defensiveAdj = -1; return;
            case 16: defensiveAdj = -2; return;
            case 17: defensiveAdj = -3; return;
            case 18: defensiveAdj = -4; return;
            case 19: defensiveAdj = -4; return;
            case 20: defensiveAdj = -4; return;
            case 21: defensiveAdj = -5; return;
            case 22: defensiveAdj = -5; return;
            case 23: defensiveAdj = -5; return;
            case 24: defensiveAdj = -6; return;
            case 25: defensiveAdj = -6; return;
            case 26: defensiveAdj = -6; return;
            case 27: defensiveAdj = -6; return;
            case 28: defensiveAdj = -6; return;
            case 29: defensiveAdj = -6; return;
            case 30: defensiveAdj = -6; return;
            case 31: defensiveAdj = -6; return;
            case 32: defensiveAdj = -6; return;
            case 33: defensiveAdj = -6; return;
            case 34: defensiveAdj = -6; return;
            case 35: defensiveAdj = -6; return;
        }
    }
}
