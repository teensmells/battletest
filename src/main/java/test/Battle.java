/**
 * Project: test File Created at 2014-3-1 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is the
 * confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered
 * into with dianping.com.
 */
package test;

/**
 * TODO Comment of Battle
 * 
 * @author chong.zhu
 */
public class Battle {

    private BattleContext context;

    public Battle(BattleContext context) {
        this.context = context;
    }

    public void start() {
        System.out.println("Battle " + context.getBattleNum() + ":" + context.getFirstCandidate().getName() + " VS "
                           + context.getSecondCandidate().getName());

        Round round = new Round(context, 1);
        round.start();
    }
}
