package at.campus02.zam.pr2;

public class LongDrink extends Drink{
    protected Liquid spirit;
    protected Liquid filler;

    public LongDrink(String name, Liquid spirit, Liquid filler) {
        super(name);
        this.spirit = spirit;
        this.filler = filler;
    }

    public Liquid getSpirit() {
        return spirit;
    }

    public void setSpirit(Liquid spirit) {
        this.spirit = spirit;
    }

    public Liquid getFiller() {
        return filler;
    }

    public void setFiller(Liquid filler) {
        this.filler = filler;
    }

    @Override
    public double getVolume() {
        return filler.getVolume() + spirit.getVolume();
    }

    @Override
    public double getAlcoholPercent() {
        return (filler.getAlcoholPercent() * filler.getVolume() + spirit.getAlcoholPercent() * spirit.getVolume()) / getVolume();
    }

    @Override
    public boolean isAlcoholic() {
        if(filler.getAlcoholPercent() > 0 || spirit.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }
}
