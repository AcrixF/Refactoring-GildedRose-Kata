package org.neoa.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class GildedRoseTest {

    @Test
    void foo() {
        CombinationApprovals.verifyAllCombinations(this::updateItem,
                new String []{"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"},
                new Integer []{-1, 0, 11, 15},
                new Integer []{0, 5, 49, 50});
    }

    private String updateItem(String name, int sellIn, int quality) {
        Item[] items = new Item[] {Item.createItem(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }
}
