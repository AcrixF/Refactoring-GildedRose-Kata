package org.neoa.gildedrose;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class GildedRoseTest {

    @Test
    void foo() {
        String name = "foo";
        int sellIn = 0;
        int quality = 0;
        String response = updateItem(name, sellIn, quality);
        Approvals.verify(response);
    }

    private String updateItem(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }
}
