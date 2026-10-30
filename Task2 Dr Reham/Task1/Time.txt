public class Time {
    // Attributes
    private int hours;
    private int min;
    private int sec;
    private String timeStamp;

    // Constructors
    public Time() {
        hours = 0;
        min = 0;
        sec = 0;
        timeStamp = "";
    }

    public Time(int h, int m, int s, String ts) {
        hours = h;
        min = m;
        sec = s;
        timeStamp = ts;
    }

    // All Variables Setter & Getter
    public void setHours(int h) {
        if (h >= 0 && h < 24) {
            hours = h;
        }
    }
    public int getHours() { return hours; }

    public void setMinutes(int m) {
        if (m >= 0 && m < 60) {
            min = m;
        }
    }
    public int getMinutes() { return min; }
    
    public void setSeconds(int s) {
        if (s >= 0 && s < 60) {
            sec = s;
        }
    }
    public int getSeconds() { return sec; }

    public void setTimeStamp(String ts) {
        timeStamp = ts;
    }
    public String getTimeStamp() { return timeStamp; }
    
    // Sum Function
    public static Time sumTime(Time t1, Time t2) {
        Time result = new Time();

        int total_seconds = t1.getSeconds() + t2.getSeconds();
        result.setSeconds(total_seconds % 60);
        int carry_minutes = total_seconds / 60;

        int total_minutes = t1.getMinutes() + t2.getMinutes() + carry_minutes;
        result.setMinutes(total_minutes % 60);
        int carry_hours = total_minutes / 60;

        int total_hours = t1.getHours() + t2.getHours() + carry_hours;

        int final_hours = total_hours % 12;
        if (final_hours == 0) {
            final_hours = 12;
        } 
        result.setHours(final_hours);
        return result;
    }

    // Printing
    public void show() {
        System.out.println("Time: " + hours + ":" + min + ":" + sec + " " + timeStamp);
    }
}
