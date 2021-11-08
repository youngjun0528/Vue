package observer_pattern.solution_2;

import java.util.List;

// DataSheetView의 Observerㅏ의 기능, 즉, 실제 작동되는 update method 를 구현한다.
public class DataSheetView implements ObserverInterface {
    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public void update() { // 점수 변경을 통보받음.
        List<Integer> record = scoreRecord.getScoreRecord(); // 점수를 조회함.
        displayScores(record, viewCount); // 조회된 점수를 viewCount 만큼 출력함

    }

    private void displayScores(List<Integer> record, int viewCount) {
        System.out.print("List of " + viewCount + " entries: ");
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.print(record.get(i) + " ");
        }
        System.out.println();
    }

}
