package com.metaxiii.fr.craft;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GildedRoseTest {

  private static final String ITEM_OTHER = "Other";
  private static final String ITEM_SULFURA = "Sulfuras, Hand of Ragnaros";
  private static final String ITEM_AGED_BRIE = "Aged Brie";
  private static final String ITEM_BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

  @Test
  public void quality_should_be_0_when_name_is_Other_and_quality_is_1_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_OTHER, 1, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_0_when_name_is_Other_and_quality_is_1_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_OTHER, 1, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_0_when_name_is_Other_and_quality_is_0_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_OTHER, 1, 0);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_0_when_name_is_Other_and_quality_is_0_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_OTHER, 1, 0);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_0_when_name_is_Sulfura_and_quality_is_0_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_SULFURA, 1, 0);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_1_when_name_is_Sulfura_and_quality_is_0_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_SULFURA, 1, 0);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 1;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_0_when_name_is_Not_Sulfura_and_quality_is_1_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_OTHER, 1, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_0_when_name_is_Not_Sulfura_and_quality_is_1_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_OTHER, 1, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_1_when_name_is_Sulfura_and_quality_is_1_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_SULFURA, 1, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 1;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_1_when_name_is_Sulfura_and_quality_is_1_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_SULFURA, 1, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 1;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_2_when_name_is_Brie_and_quality_is_1_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_AGED_BRIE, 1, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 2;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_0_when_name_is_Brie_and_quality_is_1_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_AGED_BRIE, 1, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_4_when_name_is_Backstage_and_quality_is_1_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_BACKSTAGE, 1, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 4;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_0_when_name_is_Backstage_and_quality_is_1_and_sellin_is_1() {
    // Given
    final Item item1 = new Item(ITEM_BACKSTAGE, 1, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_3_when_name_is_Backstage_and_quality_is_1_and_sellin_is_6() {
    // Given
    final Item item1 = new Item(ITEM_BACKSTAGE, 6, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 3;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_5_when_name_is_Backstage_and_quality_is_1_and_sellin_is_6() {
    // Given
    final Item item1 = new Item(ITEM_BACKSTAGE, 6, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 5;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_2_when_name_is_Backstage_and_quality_is_1_and_sellin_is_11() {
    // Given
    final Item item1 = new Item(ITEM_BACKSTAGE, 11, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 2;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_10_when_name_is_Backstage_and_quality_is_1_and_sellin_is_11() {
    // Given
    final Item item1 = new Item(ITEM_BACKSTAGE, 11, 1);
    final Item[] items = new Item[] { item1 };
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 10;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(item1.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_8_when_name_is_Other_and_quality_is_10_and_sellin_is_minus3() {
    // Given
    final Item item = new Item(ITEM_OTHER, -3, 10);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = 8;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_minus4_when_name_is_Other_and_quality_is_10_and_sellin_is_minus3() {
    // Given
    final Item item = new Item(ITEM_OTHER, -3, 10);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = -4;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_0_when_name_is_Other_and_quality_is_2_and_sellin_is_minus3() {
    // Given
    final Item item = new Item(ITEM_OTHER, -3, 2);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_minus4_when_name_is_Other_and_quality_is_2_and_sellin_is_minus3() {
    // Given
    final Item item = new Item(ITEM_OTHER, -3, 2);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = -4;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_0_when_name_is_Backstage_and_quality_is_2_and_sellin_is_minus3() {
    // Given
    final Item item = new Item(ITEM_BACKSTAGE, -3, 10);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_minus4_when_name_is_Backstage_and_quality_is_2_and_sellin_is_minus3() {
    // Given
    final Item item = new Item(ITEM_BACKSTAGE, -3, 10);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = -4;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_50_when_name_is_Brie_and_quality_is_48_and_sellin_is_minus3() {
    // Given
    final Item item = new Item(ITEM_AGED_BRIE, -3, 48);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = 50;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_minus4_when_name_is_Brie_and_quality_is_48_and_sellin_is_minus3() {
    // Given
    final Item item = new Item(ITEM_AGED_BRIE, -3, 48);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = -4;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_49_when_name_is_Brie_and_quality_is_50_and_sellin_is_1() {
    // Given
    final Item item = new Item(ITEM_AGED_BRIE, 1, 50);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = 50;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.quality).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_50_when_name_is_Backstage_and_quality_is_49_and_sellin_is_1() {
    // Given
    final Item item = new Item(ITEM_BACKSTAGE, 1, 49);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = 50;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_0_when_name_is_Backstage_and_quality_is_49_and_sellin_is_1() {
    // Given
    final Item item = new Item(ITEM_BACKSTAGE, 1, 49);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_50_when_name_is_Brie_and_quality_is_49_and_sellin_is_minus1() {
    // Given
    final Item item = new Item(ITEM_AGED_BRIE, -1, 49);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = 50;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_minus2_when_name_is_Brie_and_quality_is_49_and_sellin_is_minus1() {
    // Given
    final Item item = new Item(ITEM_AGED_BRIE, -1, 49);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = -2;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.sellIn).isEqualTo(expected);
  }

  @Test
  public void quality_should_be_0_when_name_is_Other_and_quality_is_1_and_sellin_is_minus1() {
    // Given
    final Item item = new Item(ITEM_OTHER, -1, 1);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.quality).isEqualTo(expected);
  }

  @Test
  public void sellin_should_be_minus2_when_name_is_Other_and_quality_is_1_and_sellin_is_minus1() {
    // Given
    final Item item = new Item(ITEM_OTHER, -1, 1);
    final Item[] items = new Item[] { item };
    final GildedRose gildedrose = new GildedRose(items);
    final int expected = -2;

    // When
    gildedrose.updateQuality();

    // Then
    Assertions.assertThat(item.sellIn).isEqualTo(expected);
  }

  @Test
  public void items_should_be_empty_when_no_item() {
    // Given
    final Item[] items = new Item[0];
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 0;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(items).isEmpty();
  }

  @Test
  public void items_should_have2_elements_when_there_are_2_item() {
    // Given
    final Item[] items = new Item[2];
    items[0] = new Item(ITEM_OTHER, 1, 1);
    items[1] = new Item(ITEM_SULFURA, 3, 9);
    final GildedRose gildedRose = new GildedRose(items);
    final int expected = 2;

    // When
    gildedRose.updateQuality();

    // Then
    Assertions.assertThat(items).hasSize(expected);
  }
}
