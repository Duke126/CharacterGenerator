//import Character;
public class Main {

    public static int[] generateStat(int points){
        int[] myStat = new int[2];
        if (points==0) {
            myStat[0]=8; //Value of stat
            myStat[1]=points; //Remainings points
        }
        if (points==1) {
            myStat[0]=9;
            myStat[1]=points-1;
        }
        if (points==2) {
            myStat[0]=10;
            myStat[1]=points-2;
        }
        if (points==3) {
            myStat[0]=11;
            myStat[1]=points-3;
        }
        if (points>=5 & points<7) {
            myStat[0]=12;
            myStat[1]=points-5;
        }
        if (points>=7 & points<9) {
            myStat[0]=13;
            myStat[1]=points-7;
        }
        if (points>=9 & points<11) {
            myStat[0]=14;
            myStat[1]=points-9;
        }
        if (points>=11 & points<14) {
            myStat[0]=15;
            myStat[1]=points-11;
        }
        if (points>=14 & points<17) {
            myStat[0]=16;
            myStat[1]=points-14;
        }
        if (points>=17 & points<20) {
            myStat[0]=17;
            myStat[1]=points-17;
        }
        if (points>=20 & points<23) {
            myStat[0]=18;
            myStat[1]=points-20;
        }
        if (points>=23 & points<27) {
            myStat[0]=19;
            myStat[1]=points-23;
        }if (points>=27) {
            myStat[0]=20;
            myStat[1]=points-27;
        }

        return myStat;
    }

    public static void main(String[] args) {

    int[] stat = new int[2];
    stat = generateStat(10);
    System.out.printf(" %d %d\n", stat[0], stat[1]);

    Character Robert = new Character("Robert", "Svardian", 0, "Veteran", 14, 13, 14, 10, 12, 12 );

    //Robert.displayInfo();
    //Robert.displayPerks();
    }
}
