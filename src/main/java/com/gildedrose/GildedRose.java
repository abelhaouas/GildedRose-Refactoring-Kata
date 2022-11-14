package com.gildedrose;

import static com.gildedrose.ItemConstants.*;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        for (Item item : items) {
            if (AGED_BRIE.getName().equals(item.getName())) {
                updateAgedBrie(item);
            } else if (BACKSTAGE_PASSES.getName().equals(item.getName())) {
                updateBackstagePasses(item);
            } else if (SULFURAS.getName().equals(item.getName())) {
            } else if (CONJURED.getName().equals(item.getName())) {
                // "Conjured" items degrade in Quality twice as fast as normal items
                updateNormal(item, 2);
            } else {
                updateNormal(item, 1);
            }
        }
    }

    private void updateAgedBrie(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0 && item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    private void updateBackstagePasses(Item item) {

        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
            if (item.getSellIn() < 11 && item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }

            if (item.getSellIn() < 6 && item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - item.getQuality());
        }
    }

    private void updateNormal(Item item,int value) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - value);
        }
        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - value);
        }
    }

}
