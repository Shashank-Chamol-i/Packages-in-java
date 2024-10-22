package Pack02;
import Date01.Date;
import Pack01.*;
import Pack03.Program03;
public class Program02 {
    public static void main(String[] args) {
        Program01 p = new Program01();
        p.msg();
        Program03 pp = new Program03();
        pp.show();
        Date01.Date obj = new Date01.Date();
        obj.date();
        Date02.Date obj2 = new Date02.Date();
        obj2.date();
    }

}
