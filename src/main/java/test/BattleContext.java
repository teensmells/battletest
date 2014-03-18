/**
 * Project: test File Created at 2014-3-1 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is the
 * confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered
 * into with dianping.com.
 */
package test;

/**
 * TODO Comment of BattleContext
 * 
 * @author chong.zhu
 */
public class BattleContext {

    private int       battleNum;

    private Candidate firstCandidate;
    private Candidate secondCandidate;

    private int       firstCurHealth;
    private int       secondCurHealth;

    private int       firstCurAttacks;
    private int       secondCurAttacks;

    private boolean   isBattleEnd;

    private Candidate winner;

    /**
     * @return the battleNum
     */
    public int getBattleNum() {
        return battleNum;
    }

    /**
     * @param battleNum the battleNum to set
     */
    public void setBattleNum(int battleNum) {
        this.battleNum = battleNum;
    }

    /**
     * @return the firstCandidate
     */
    public Candidate getFirstCandidate() {
        return firstCandidate;
    }

    /**
     * @param firstCandidate the firstCandidate to set
     */
    public void setFirstCandidate(Candidate firstCandidate) {
        this.firstCandidate = firstCandidate;
    }

    /**
     * @return the secondCandidate
     */
    public Candidate getSecondCandidate() {
        return secondCandidate;
    }

    /**
     * @param secondCandidate the secondCandidate to set
     */
    public void setSecondCandidate(Candidate secondCandidate) {
        this.secondCandidate = secondCandidate;
    }

    /**
     * @return the firstCurHealth
     */
    public int getFirstCurHealth() {
        return firstCurHealth;
    }

    /**
     * @param firstCurHealth the firstCurHealth to set
     */
    public void setFirstCurHealth(int firstCurHealth) {
        this.firstCurHealth = firstCurHealth;
    }

    /**
     * @return the firstCurAttacks
     */
    public int getFirstCurAttacks() {
        return firstCurAttacks;
    }

    /**
     * @param firstCurAttacks the firstCurAttacks to set
     */
    public void setFirstCurAttacks(int firstCurAttacks) {
        this.firstCurAttacks = firstCurAttacks;
    }

    /**
     * @return the isBattleEnd
     */
    public boolean isBattleEnd() {
        return isBattleEnd;
    }

    /**
     * @param isBattleEnd the isBattleEnd to set
     */
    public void setBattleEnd(boolean isBattleEnd) {
        this.isBattleEnd = isBattleEnd;
    }

    /**
     * @return the winner
     */
    public Candidate getWinner() {
        return winner;
    }

    /**
     * @param winner the winner to set
     */
    public void setWinner(Candidate winner) {
        this.winner = winner;
    }

    /**
     * @return the secondCurHealth
     */
    public int getSecondCurHealth() {
        return secondCurHealth;
    }

    /**
     * @param secondCurHealth the secondCurHealth to set
     */
    public void setSecondCurHealth(int secondCurHealth) {
        this.secondCurHealth = secondCurHealth;
    }

    /**
     * @return the secondCurAttacks
     */
    public int getSecondCurAttacks() {
        return secondCurAttacks;
    }

    /**
     * @param secondCurAttacks the secondCurAttacks to set
     */
    public void setSecondCurAttacks(int secondCurAttacks) {
        this.secondCurAttacks = secondCurAttacks;
    }
}
