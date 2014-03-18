/**
 * Project: test File Created at 2014-3-1 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is the
 * confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered
 * into with dianping.com.
 */
package test;

/**
 * TODO Comment of Round
 * 
 * @author chong.zhu
 */
public class Round {

    private BattleContext context;

    private int           roundNum;

    private int           curAttackNum;

    private Round         nextRound;

    public Round(BattleContext context, int roundNum) {
        this.context = context;
        this.roundNum = roundNum;

        context.setFirstCurAttacks(0);
        context.setSecondCurAttacks(0);
    }

    public void start() {
        System.out.println("Round " + roundNum + ":");

        do {
            Attack attack = initAttack();
            attack.attack();
            curAttackNum++;

            if (context.isBattleEnd()) {
                System.out.println(context.getWinner().getName() + " wins!");
                return;
            }

        } while (!isRoundEnd());

        nextRound = new Round(context, ++roundNum);
        nextRound.start();
    }

    /**
     * 
     */
    private Attack initAttack() {
        if (curAttackNum == 0) {
            return new Attack(context, true);
        }

        if (curAttackNum % 2 == 0 && context.getFirstCurAttacks() < context.getFirstCandidate().getAttacks()) {
            return new Attack(context, true);
        }

        if (curAttackNum % 2 == 1 && context.getSecondCurAttacks() < context.getSecondCandidate().getAttacks()) {
            return new Attack(context, false);
        }

        if (context.getFirstCurAttacks() >= context.getFirstCandidate().getAttacks()
            && context.getSecondCurAttacks() < context.getSecondCandidate().getAttacks()) {
            return new Attack(context, false);
        }

        if (context.getFirstCurAttacks() < context.getFirstCandidate().getAttacks()
            && context.getSecondCurAttacks() >= context.getSecondCandidate().getAttacks()) {
            return new Attack(context, true);
        }

        return null;
    }

    private boolean isRoundEnd() {
        return context.getFirstCurAttacks() >= context.getFirstCandidate().getAttacks()
               && context.getSecondCurAttacks() >= context.getSecondCandidate().getAttacks();
    }
}
