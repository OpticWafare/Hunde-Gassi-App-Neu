package model;

public class DateTime {

    private int year;
    /** Started bei 1 */
    private int month;
    private int dayOfMonth;
    private int hourOfDay;
    private int minute;

    public DateTime() {
    }

    public DateTime(int year, int month, int dayOfMonth, int hourOfDay, int minute) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.hourOfDay = hourOfDay;
        this.minute = minute;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(int hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "DateTime{" +
                "year=" + year +
                ", month=" + month +
                ", dayOfMonth=" + dayOfMonth +
                ", hourOfDay=" + hourOfDay +
                ", minute=" + minute +
                '}';
    }

    public String toURLParameter() {
        String s = "year="+getYear();
        s += "&month="+getMonth();
        s += "&date="+getDayOfMonth();
        s += "&hour="+getHourOfDay();
        s += "&minute"+getMinute();
        return s;
    }
}
