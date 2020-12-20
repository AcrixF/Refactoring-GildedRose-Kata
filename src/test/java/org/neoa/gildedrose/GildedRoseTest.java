package org.neoa.gildedrose;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class GildedRoseTest {

    @Test
    void foo() {
        String name = "foo";
        int sellIn = 0;
        int quality = 0;
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        String response = app.items[0].toString();
        Approvals.verify(response);
    }
}
