package observer_pattern.solution_2;

import java.util.List;

public class StatisticView implements ObserverInterface {
    private ScoreRecord scoreRecord;

    public StatisticView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayStatistics(record);

    }

    private void displayStatistics(List<Integer> record) {
        int sum = 0;
        for (int score : record) {
            sum += score;
        }
        float avg = (float) sum / record.size();

        System.out.println("Sum : " + sum + " Average : " + avg);
    }
}
