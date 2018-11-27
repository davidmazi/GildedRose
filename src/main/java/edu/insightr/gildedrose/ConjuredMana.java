package edu.insightr.gildedrose;

public class ConjuredMana extends Item{
    public ConjuredMana(String name, int sellIn, int quality)
    {
        super(name, sellIn, quality);
    }

    public void updateQuality()
    {
        if(getQuality() < 50)
        {
            if(getQuality()>1)
            {
                setQuality(getQuality() - 2);
            }
        }
    }
}
