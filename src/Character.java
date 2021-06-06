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

    String[] perk; // peills and languages here
    String disadvantage;
    String prehistory;
    String spell; // Make it class

    int ap;// Action Point
    int initiative; // int result = (int)Math.ceil(n); // round up
    int dodge;
    int hp;

    int pe=0; //Accounting of perks

    Character(String charName, String charRace, int charSex, String charPrehistory, int charStr, int charDex, int charCon, int charIntel, int charWid, int charCha) {
        perk = new String[100]; // Max number of peills

        name = charName;
        str = charStr;
        dex = charDex;
        con = charCon;
        intel = charIntel;
        wid = charWid;
        cha = charCha;

        prehistory = charPrehistory;
        if (prehistory.equals("Veteran")) {
            perk[pe] = "Athletics+2"; pe=pe+1;
            perk[pe] = "Medicine"; pe=pe+1;
            perk[pe] = "Weapon"; pe=pe+1;
        }

        race = charRace;
        if (race.equals("Imperial")) {
            intel = intel + 1;
            perk[pe] = "Language Imperial (Hight)"; pe=pe+1;
            perk[pe] = "History"; pe=pe+1;
            perk[pe] = "Magic"; pe = pe+1;
            perk[pe] = "Nature"; pe = pe+1;
            perk[pe] = "Religion"; pe = pe+1;
        }
        if (race.equals("Svardian")) {
            cha = cha + 1;
            perk[pe] = "Language Imperial (Svardian)"; pe=pe+1;
            perk[pe] = "Conviction"; pe=pe+1;
            perk[pe] = "Armor"; pe = pe+1;
        }
        if (race.equals("Bulupeay")) { // some peills are in sex
            perk[pe] = "Coastal dweller"; pe = pe+1;
            perk[pe] = "Language Bulupeay"; pe=pe+1;
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
            perk[pe] = "Strong body"; pe=pe+1;

        }
        if (sex==4) { //gamma
            str = str +2;
            dex = dex +1;
            con = con +1;
            cha = cha -1;
            perk[pe] = "Common touch"; pe=pe+1;
        }

    }

    void displayInfo(){
        System.out.printf("Name %s %s Sex-%d\n Strength %d Intelligence %d\n Dexterity %d Wisdom %d\n Constitution %d Charisma %d\n",name, race, sex, str, intel, dex, wid, con, cha);
    }
    void displayPerks(){
        while (pe > 0){
            pe--;
            System.out.printf(" %s\n",perk[pe]);
        }
    }
}
