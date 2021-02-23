package observer_pattern.solution_2;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
    private List<Integer> scores = new ArrayList<Integer>(); // 점수를 저장함.
    // private DataSheetView dataSheetView; // 목록형태로 점수를 출력하는 Class
    // private MinMaxView minMaxView;

    // public void setMinMaxView(MinMaxView minMaxView) {
    // this.minMaxView = minMaxView;
    // }

    public void addScore(int score) { // 새로운 첨수를 추가함.
        scores.add(score); // scores 목록에 주어진 점수를 추가함.
        // minMaxView.update(); // scores 가 변경됨을 통보함.

        // 데이터가 변경되면 Subject Class의 notifyObservers 메서드를 호출해
        // 각 옵서버(통보 대상 클래스)에게 데이터의 변경을 통보함.
        notifyObservers();
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }

}
