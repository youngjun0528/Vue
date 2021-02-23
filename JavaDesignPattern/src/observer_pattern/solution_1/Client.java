package observer_pattern.solution_1;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        // 치대 최소 출력
        // MinMaxView minMaxView = new MinMaxView(scoreRecord);

        // scoreRecord.setMinMaxView(minMaxView);

        // 3개의 목록 DataSheetView 생성
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);

        // 5개의 목록 DataSheetView 생성
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.attach(dataSheetView3);
        scoreRecord.attach(dataSheetView5);

        scoreRecord.attach(minMaxView);

        for (int index = 0; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding.. " + score);

            // 10, 20, 30, 40, 50 을 추가함, 추가할때마다, 최대 3개까지의 점수만 출력함.
            scoreRecord.addScore(score);
        }
    }
}
