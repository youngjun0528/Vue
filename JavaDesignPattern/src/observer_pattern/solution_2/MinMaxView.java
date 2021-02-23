package observer_pattern.solution_2;

import java.util.Collections;
import java.util.List;

// MinMaxView의 Observerㅏ의 기능, 즉, 실제 작동되는 update method 를 구현한다.
public class MinMaxView implements ObserverInterface {
    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayMinMax(record);
    }

    private void displayMinMax(List<Integer> record) {
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("Min : " + min + " Max : " + max);
    }
}
