package kage;

public class Opskrift {
    private String navn;
    private int antal;
    private Ingrediens[] ingredienser;



    //Constructor
    public Opskrift(String navn, int antal) {
        this.navn = navn;
        //Opret ingrediens objekter
        Ingrediens æg = new Ingrediens("Æg", 12, "stk.", 137, 60);
        Ingrediens mælk = new Ingrediens("Mælk", 16, "dL", 42.3, 100);
        Ingrediens smør = new Ingrediens("Smør", 200, "g", 716);
        Ingrediens hvedemel = new Ingrediens("Hvedemel", 600, "g", 343);
        ingredienser = new Ingrediens[]{æg, mælk, smør, hvedemel};

        //Sæt nyt antal for hver ingrediens
        for (Ingrediens ingrediens: ingredienser) {
            ingrediens.setNytAntal(antal);
        }
    }

    //Gettere
    public String getNavn() {
        return navn;
    }

    public Ingrediens[] getIngredienser() {
        return ingredienser;
    }

    //Servicemetoder
//Find totalVægt
    public double beregnTotalVægt() {
        double totalVægt = 0;
        for (Ingrediens ingrediens : ingredienser) {
            totalVægt += ingrediens.beregnVægt();
        }
        return totalVægt;
    }

    //Find gennemsnit vægt
    public double beregnGennemsnitVægt() {
        double gennemsnitVægt = 0;
        gennemsnitVægt = beregnTotalVægt() / ingredienser.length;
        return gennemsnitVægt;
    }

    //Find totalKcal
    public double beregnTotalKcal() {
        double totalKcal = 0;
        for (Ingrediens ingrediens : ingredienser) {
            totalKcal += ingrediens.beregnKcal();
        }
        return totalKcal;
    }

    //Find gennemsnitKcal
    public double beregnGennemsnitKcal() {
        double gennemsnitKcal = 0;
        gennemsnitKcal = beregnTotalKcal() / ingredienser.length;
        return gennemsnitKcal;
    }
    //Find gennemsnitKJ
    public double beregnGennemsnitKJ() {
        double gennemsnitKJ = 0;
        // Gange med faktor 4.2 for omregning fra kcal til KJ
        gennemsnitKJ = beregnGennemsnitKcal() * 4.2;
        return gennemsnitKJ;
    }
}



