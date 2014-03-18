/**
 * Project: test File Created at 2014-3-1 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is the
 * confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered
 * into with dianping.com.
 */
package test;

/**
 * TODO Comment of Attack
 * 
 * @author chong.zhu
 */
public class Attack {

    private BattleContext context;
    private boolean       firstCandidateAttack;

    public Attack(BattleContext context, boolean firstCandidateAttack) {
        this.context = context;
        this.firstCandidateAttack = firstCandidateAttack;
    }

    public void attack() {
        StringBuilder sb = new StringBuilder();

        if (firstCandidateAttack) {
            sb.append(context.getFirstCandidate().getName());
            sb.append(" hits for ");
            sb.append(context.getSecondCandidate().getName() + " ");
            sb.append(context.getFirstCandidate().getDamage());
            sb.append(" damage(");
            sb.append(context.getSecondCurHealth());
            sb.append("->");
            sb.append(context.getSecondCurHealth() - context.getFirstCandidate().getDamage());
            sb.append(")");

            context.setFirstCurAttacks(context.getFirstCurAttacks() + 1);
            context.setSecondCurHealth(context.getSecondCurHealth() - context.getFirstCandidate().getDamage());
        } else {
            sb.append(context.getSecondCandidate().getName());
            sb.append(" hits for ");
            sb.append(context.getFirstCandidate().getName() + " ");
            sb.append(context.getSecondCandidate().getDamage());
            sb.append(" damage(");
            sb.append(context.getFirstCurHealth());
            sb.append("->");
            sb.append(context.getFirstCurHealth() - context.getSecondCandidate().getDamage());
            sb.append(")");

            context.setSecondCurAttacks(context.getSecondCurAttacks() + 1);
            context.setFirstCurHealth(context.getFirstCurHealth() - context.getSecondCandidate().getDamage());
        }

        System.out.println(sb.toString());

        context.setBattleEnd(isBattleEnd());
    }

    public boolean isBattleEnd() {
        if (context.getFirstCurHealth() <= 0) {
            context.setWinner(context.getSecondCandidate());
            return true;
        }

        if (context.getSecondCurHealth() <= 0) {
            context.setWinner(context.getFirstCandidate());
            return true;
        }

        return false;
    }

    /**
     * @return the context
     */
    public BattleContext getContext() {
        return context;
    }

    /**
     * @param context the context to set
     */
    public void setContext(BattleContext context) {
        this.context = context;
    }
}
