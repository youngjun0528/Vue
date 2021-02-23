package observer_pattern.basic_problem1;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<Integer>(); // 점수를 저장함.
    // private DataSheetView dataSheetView; // 목록형태로 점수를 출력하는 Class
    private MinMaxView minMaxView;

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    public void addScore(int score) { // 새로운 첨수를 추가함.
        scores.add(score); // scores 목록에 주어진 점수를 추가함.
        minMaxView.update(); // scores 가 변경됨을 통보함.
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }

}
