/**
 * Project: test File Created at 2014-3-1 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is the
 * confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered
 * into with dianping.com.
 */
package test;

/**
 * TODO Comment of Candidate
 * 
 * @author chong.zhu
 */
public class Candidate {

    // 姓名
    private String name;
    // 生命值
    private int    health;
    // 每一拳伤害
    private int    damage;
    // 每回合允许的最大攻击次数
    private int    attacks;

    // 闪避成功机率
    private int    dodge;
    // 给对方造成加倍伤害概率
    private int    critical;
    // 优先攻击指数
    private int    initiative;

    private int    battleNum;

    private int    winNum;

    private double winRate;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the attacks
     */
    public int getAttacks() {
        return attacks;
    }

    /**
     * @param attacks the attacks to set
     */
    public void setAttacks(int attacks) {
        this.attacks = attacks;
    }

    /**
     * @return the dodge
     */
    public int getDodge() {
        return dodge;
    }

    /**
     * @param dodge the dodge to set
     */
    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    /**
     * @return the critical
     */
    public int getCritical() {
        return critical;
    }

    /**
     * @param critical the critical to set
     */
    public void setCritical(int critical) {
        this.critical = critical;
    }

    /**
     * @return the initiative
     */
    public int getInitiative() {
        return initiative;
    }

    /**
     * @param initiative the initiative to set
     */
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

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
     * @return the winNum
     */
    public int getWinNum() {
        return winNum;
    }

    /**
     * @param winNum the winNum to set
     */
    public void setWinNum(int winNum) {
        this.winNum = winNum;
    }

    /**
     * @return the winRate
     */
    public double getWinRate() {
        return winRate;
    }

    /**
     * @param winRate the winRate to set
     */
    public void setWinRate(double winRate) {
        this.winRate = winRate;
    }
}
