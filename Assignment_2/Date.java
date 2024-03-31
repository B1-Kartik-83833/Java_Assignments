public class Date
{
    private int month;
    private int day;
    private int year;

    Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void displayDate(){
        System.out.println(month + "/"+day +"/" +year);
    }

    public static void main(String[] args)
    {
        Date date1 = new Date(3, 30, 2022);
        Date date2 = new Date(3, 31, 2022);
        System.out.println("date1 : ");
        date1.displayDate();
        System.out.println("date2 : ");
        date2.displayDate();
        date2.setMonth(4);
        date2.setDay(1);
        System.out.println("Updated date2 : ");
        date2.displayDate();
    }
}
