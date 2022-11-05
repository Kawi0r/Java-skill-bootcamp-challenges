public class OverloadingChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        String checker = getDurationString(5000);
        System.out.println(checker);
        checker = getDurationString(422);
        System.out.println(checker);
    }
    public static String getDurationString(long min, long sec) {
        if ( min < 0 || sec < 0 || sec > 59) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long hours = min / 60;
            long remainingMinutes = min % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondString = sec + "s";
            if (sec < 10) {
                secondString = "0" + secondString;
            }

            return hoursString + ": " + minutesString + ": " + secondString;
        }
    }

    public static String getDurationString(long sec) {
        if (sec < 0) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long minutes = sec / 60;
            long remainingSec = sec % 60;
            System.out.println(sec + "sec = " + minutes + "min + " + remainingSec + "sec");
            return getDurationString(minutes, remainingSec);
        }
    }
}
