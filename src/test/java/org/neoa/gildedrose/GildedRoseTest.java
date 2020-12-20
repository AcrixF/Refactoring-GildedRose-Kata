package org.neoa.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class GildedRoseTest {

    @Test
    void foo() {
        CombinationApprovals.verifyAllCombinations(this::updateItem,
                new String []{"foo"},
                new Integer []{0},
                new Integer []{0});
    }

    private String updateItem(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }
}
