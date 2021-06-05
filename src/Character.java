public class Character {
    String name;
    String race;
    int sex; // 0 - male, 1- female, 2 - alpha, 3 - beta, 4 - gamma // not bool because of buluscays

    int str;
    int dex;
    int con;
    int intel;
    int wid;
    int cha;

    String[] perk; // skills and languages here
    //String perk; // skills and languages here
    String disadvantage;
    String prehistory;
    String spell;

    int ap;// Action Point
    int initiative; // int result = (int)Math.ceil(n); // round up
    int dodge;
    int hp;

    int sk=0; //Accounting of skills

    Character(String charName, String charRace, int charSex, String charPrehistory, int charStr, int charDex, int charCon, int charIntel, int charWid, int charCha) {
        perk = new String[100]; // Max number of skills

        name = charName;
        str = charStr;
        dex = charDex;
        con = charCon;
        intel = charIntel;
        wid = charWid;
        cha = charCha;

        prehistory = charPrehistory;
        if (prehistory.equals("Veteran")) {
            perk[sk] = "Athletics+2"; sk=sk+1;
            perk[sk] = "Medicine"; sk=sk+1;
            perk[sk] = "Weapon"; sk=sk+1;
        }

        race = charRace;
        if (race.equals("Imperial")) {
            intel = intel + 1;
            perk[sk] = "Language Imperial (Hight)"; sk=sk+1;
            perk[sk] = "History"; sk=sk+1;
            perk[sk] = "Magic"; sk = sk+1;
            perk[sk] = "Nature"; sk = sk+1;
            perk[sk] = "Religion"; sk = sk+1;
        }
        if (race.equals("Svardian")) {
            cha = cha + 1;
            perk[sk] = "Language Imperial (Svardian)"; sk=sk+1;
            perk[sk] = "Conviction"; sk=sk+1;
            perk[sk] = "Armor"; sk = sk+1;
        }
        if (race.equals("Buluskay")) { // some skills are in sex
            perk[sk] = "Coastal dweller"; sk = sk+1;
            perk[sk] = "Language Buluskay"; sk=sk+1;
        }

        sex = charSex;
        if (sex==0) str = str+1; //Male // Gender accouting
        if (sex==1) dex = dex+1; //Female
        if (sex==2) { //alpha
            cha = cha+2;
            str = str+2;
            wid = wid-1;
        }
        if (sex==3) { //beta
            con = con+4;
            dex = dex-1;
            perk[sk] = "Strong body"; sk=sk+1;

        }
        if (sex==4) { //gamma
            str = str +2;
            dex = dex +1;
            con = con +1;
            cha = cha -1;
            perk[sk] = "Common touch"; sk=sk+1;
        }

    }

    void displayInfo(){
        System.out.printf("Name %s %s Sex-%d\n Strength %d Intelligence %d\n Dexterity %d Wisdom %d\n Constitution %d Charisma %d\n",name, race, sex, str, intel, dex, wid, con, cha);
    }
    void displayPerks(){
        while (sk > 0){
            sk--;
            System.out.printf(" %s\n",perk[sk]);
        }
    }
}
