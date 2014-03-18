/**
 * Project: test File Created at 2014-3-1 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is the
 * confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered
 * into with dianping.com.
 */
package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * TODO Comment of Game
 * 
 * @author chong.zhu
 */
public class Game {

    private List<Candidate> candidates;

    public void init() throws FileNotFoundException, IOException {
        initAllCandidates();
        sortCandidateByInitiative();
    }

    public void startBattle() {
        int battleNum = 0;
        for (int i = 0; i < candidates.size(); i++) {
            for (int j = i + 1; j < candidates.size(); j++) {
                battleNum++;
                BattleContext context = new BattleContext();
                initBattleContext(context, candidates.get(i), candidates.get(j), battleNum);

                Battle battle = new Battle(context);
                battle.start();

                recordResult(context);
            }
        }
    }

    public Candidate decideWinner() {
        Candidate winner = new Candidate();
        for (Candidate candidate : candidates) {
            double winRate = candidate.getWinNum() / candidate.getBattleNum();
            candidate.setWinRate(winRate);

            if (winRate > winner.getWinRate()) {
                winner = candidate;
            }
        }
        return winner;
    }

    /**
     * @param context
     */
    private void recordResult(BattleContext context) {
        if (context.getWinner() == null) {
            return;
        }

        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(context.getWinner().getName())) {
                candidate.setWinNum(candidate.getWinNum() + 1);
            }
            if (candidate.getName().equals(context.getFirstCandidate().getName())) {
                candidate.setBattleNum(candidate.getBattleNum() + 1);
            }
            if (candidate.getName().equals(context.getSecondCandidate().getName())) {
                candidate.setBattleNum(candidate.getBattleNum() + 1);
            }
        }
    }

    /**
     * @param battleNum
     */
    private void initBattleContext(BattleContext context, Candidate firstCandidate, Candidate secondCandidate,
                                   int battleNum) {
        context.setFirstCandidate(firstCandidate);
        context.setSecondCandidate(secondCandidate);
        context.setFirstCurHealth(firstCandidate.getHealth());
        context.setSecondCurHealth(secondCandidate.getHealth());
        context.setBattleNum(battleNum);
    }

    /**
     * @throws IOException
     * @throws FileNotFoundException
     */
    private void initAllCandidates() throws FileNotFoundException, IOException {
        candidates = new ArrayList<Candidate>();

        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream("D:\\BattleTest.xls"));
        workbook.getActiveSheetIndex();
        
        HSSFSheet sheet = workbook.getSheet("Sheet1");
        for (int rowi = 1; rowi < 100; rowi++) {
            HSSFRow row = sheet.getRow(rowi);
            if (row == null || row.getCell(0) == null || row.getCell(0).equals("")) {
                continue;
            }

            Candidate candidate = new Candidate();
            candidate.setName(row.getCell(0).getStringCellValue());
            candidate.setHealth((int) row.getCell(1).getNumericCellValue());
            candidate.setDamage((int) row.getCell(2).getNumericCellValue());
            candidate.setAttacks((int) row.getCell(3).getNumericCellValue());
            candidate.setDodge((int) row.getCell(4).getNumericCellValue());
            candidate.setCritical((int) row.getCell(5).getNumericCellValue());
            candidate.setInitiative((int) row.getCell(6).getNumericCellValue());
            candidates.add(candidate);
        }
    }

    /**
     * @param candidates
     */
    private void sortCandidateByInitiative() {
        Collections.sort(candidates, new Comparator<Candidate>() {

            @Override
            public int compare(Candidate o1, Candidate o2) {
                if (o1.getInitiative() >= o2.getInitiative()) {
                    return 0;
                }
                return 1;
            }

        });
    }

    /**
     * @return the candidates
     */
    public List<Candidate> getCandidates() {
        return candidates;
    }

    /**
     * @param candidates the candidates to set
     */
    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

}
