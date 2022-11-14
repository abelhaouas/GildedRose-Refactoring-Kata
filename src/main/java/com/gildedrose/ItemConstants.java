package com.gildedrose;

public enum ItemConstants {
    AGED_BRIE ("Aged Brie"),
    BACKSTAGE_PASSES ("Backstage passes to a TAFKAL80ETC concert"),
    SULFURAS ("Sulfuras, Hand of Ragnaros");
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ItemConstants(String name) {
        this.name = name;
    }
}
