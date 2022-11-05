public class OverloadingChallenge {
    public static void main(String[] args) {
        int checker = getDurationString(5000);
        if (checker < 0) {
            System.out.println("Invalid input");
        }
    }
    public static int getDurationString(int min, int sec) {
        if ( min < 0 || sec < 0 || sec > 59) {
            return -1;
        } else {
            int hours = min / 60;
            int remainingHours = min % 60;
            System.out.println(hours + "h: " + remainingHours + "min : " + sec + "sec");
            return 1;
        }
    }

    public static int getDurationString(int sec) {
        if (sec < 0) {
            return -1;
        } else {
            int minutes = sec / 60;
            int remainingSec = sec % 60;
            System.out.println(sec + "sec = " + minutes + "min + " + remainingSec + "sec");
            return getDurationString(minutes, remainingSec);
        }
    }
}
