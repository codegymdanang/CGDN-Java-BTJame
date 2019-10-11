package B7_CleanCodeAndRefactoring.Refactoring;

public class TennisGameAfterRefactoring {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;
    private static boolean isScoreEquals;
    private static boolean isScoreAdvance;

    public static String getScore(String playerName1, String playerName2, int score1, int score2) {
        String score = "";
        int tempScore = 0;
        isScoreEquals = score1 == score2;
        if (isScoreEquals) {
            score = getResultScoreEquals(score1);
        } else {
            isScoreAdvance = score1 >= 4 || score2 >= 4;
            if (isScoreAdvance) {
                score = getResultScoreAdvance(score1, score2);
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = score1;
                    else {
                        score += "-";
                        tempScore = score2;
                    }
                    score = getResultScoreNormal(tempScore);
                }
            }
        }
        return score;
    }

    private static String getResultScoreAdvance(int score1, int score2) {
        String score;
        int minusResult = score1 - score2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getResultScoreNormal(int score) {
        String result = "";
        switch (score) {
            case LOVE:
                result += "Love";
                break;
            case FIFTEEN:
                result += "Fifteen";
                break;
            case THIRTY:
                result += "Thirty";
                break;
            case FORTY:
                result += "Forty";
                break;
        }
        return result;
    }

    private static String getResultScoreEquals(int score) {
        String result = "";
        switch (score) {
            case LOVE:
                result = "Love-All";
                break;
            case FIFTEEN:
                result = "Fifteen-All";
                break;
            case THIRTY:
                result = "Thirty-All";
                break;
            case FORTY:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;

        }
        return result;
    }
}
