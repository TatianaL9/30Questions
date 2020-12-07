package ClassWork;

public class MonthUtils {


    public static final Month January = new Month("Jan", 31, 25);
    public static final Month February = new Month("Feb", 28, 20);
    public static final Month March = new Month("Mar", 31, 23);
    public static final Month April = new Month("Apr", 30, 22);
    public static final Month May = new Month("May", 31, 23);
    public static final Month June = new Month("Jun", 30, 20);
    public static final Month July = new Month("Jul", 30, 22);
    public static final Month August = new Month("Aug", 31, 22);
    public static final Month September = new Month("Sep", 30, 22);
    public static final Month October = new Month("Oct", 31, 20);
    public static final Month November = new Month("Nov", 30, 21);
    public static final Month December = new Month("Dec", 31, 20);

/*Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.*/
    public static Month[] getQ1() {
        return new Month[]{January, February, March};
    }
    public static Month[] getQ2() {
        return new Month[] {April, May, June};

    }
    public static Month[] getQ3() {
        return new Month[] {July, August, September};

    }
    public static Month[] getQ4() {
        return new Month[] {October, November, December};

    }
    public static Month[] getHaftOfYear1() {
        return new Month[]{January, February, March, April, May, June};
    }
    public static Month[] getHaftOfYear2() {
        return new Month[]{July, August, September, October, November, December};
    }
    public static Month[] getYear2020() {
        return new Month[]{January, February, March, April, May, June, July, August, September, October, November, December};
    }
}