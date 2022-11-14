package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].getName());
    }

    @Test
    void testDexterity() {
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].getSellIn());
        assertEquals(19, app.items[0].getQuality());

    }

    @Test
    void testAged() {
        Item[] items = new Item[] {
            new Item("Aged Brie", 2, 0), //
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].getSellIn());
        assertEquals(1, app.items[0].getQuality());

    }

    @Test
    void testElixir() {
        Item[] items = new Item[] {
            new Item("Elixir of the Mongoose", 5, 7), //
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.items[0].getSellIn());
        assertEquals(6, app.items[0].getQuality());

    }

    @Test
    void testSulfuras1() {
        Item[] items = new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].getSellIn());
        assertEquals(80, app.items[0].getQuality());

    }

    @Test
    void testSulfuras2() {
        Item[] items = new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].getSellIn());
        assertEquals(80, app.items[0].getQuality());

    }

    @Test
    void testBackstage1() {
        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(14, app.items[0].getSellIn());
        assertEquals(21, app.items[0].getQuality());

    }

    @Test
    void testBackstage2() {
        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].getSellIn());
        assertEquals(50, app.items[0].getQuality());

    }

    @Test
    void testBackstage3() {
        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.items[0].getSellIn());
        assertEquals(50, app.items[0].getQuality());

    }

    @Test
    void testConjured() {
        Item[] items = new Item[] {
            new Item("Conjured", 3, 6)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].getSellIn());
        assertEquals(4, app.items[0].getQuality());
    }
}
