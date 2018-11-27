package edu.insightr.gildedrose;

public class BackstagePass extends Item {
    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);

            if (getSellIn() < 11) {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 1);
                }
            }

            if (getSellIn() < 6) {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 1);
                }
            }
        }
    }
}
