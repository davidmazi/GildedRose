package edu.insightr.gildedrose;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class InventoryTest {

    protected Inventory inv;
    Item[] oldItems, items;

    @Before
    public void setUp() {
        inv = new Inventory();
        oldItems = inv.getItems();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testUpdateQualityWhenSellInFinished() throws Exception {
        inv.updateQuality();

        items = inv.getItems();
        for (int i = 0; i < items.length; i++) {
            if (items[i].getSellIn() == 0) assertEquals(oldItems[i].getQuality()-2, items[i].getQuality());
        }
    }




}
