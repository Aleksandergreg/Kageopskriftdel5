package kage;

public class Ingrediens {
    private String type;
    private double mængde;
    private String enhed;
    final private int OPRINDELIGT_ANTAL = 4;
    private double vægtPrEnhed;
    private double kcalPr100g;
    private int nytAntal;


    //Constructore
    public Ingrediens(String type, double mængde, String enhed, double kcalPr100g) {
        this.type = type;
        this.enhed = enhed;
        this.mængde = mængde;
        this.kcalPr100g = kcalPr100g;
        this.vægtPrEnhed = 1;
    }

    public Ingrediens(String type, double mængde, String enhed, double kcalPr100g, double vægtPrEnhed) {
        this.type = type;
        this.enhed = enhed;
        this.mængde = mængde;
        this.kcalPr100g = kcalPr100g;
        this.vægtPrEnhed = vægtPrEnhed;
    }

    //Gettere
    public String getType() {
        return type;
    }
    public double getMængde() {
        return mængde;
    }
    public String getEnhed() {
        return enhed;
    }

    //Settere
    public void setNytAntal(int nytAntal) {
        this.nytAntal = nytAntal;
    }

    //Service metoder
    public double beregnMængde() {
        return mængde / OPRINDELIGT_ANTAL * nytAntal;
    }

    public double beregnVægt() {
        return (mængde / OPRINDELIGT_ANTAL * nytAntal) * vægtPrEnhed;
    }

    public double beregnKcal() {
        // Vi dividerer med 100 for at finde ud af hvor mange kcal der er pr g.
        return kcalPr100g / 100 * beregnVægt();
    }
}


