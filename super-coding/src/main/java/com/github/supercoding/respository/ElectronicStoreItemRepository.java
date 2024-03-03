package com.github.supercoding.respository;

import com.github.supercoding.web.dto.Item;
import com.github.supercoding.web.dto.ItemBody;

import java.util.List;

public interface ElectronicStoreItemRepository {

    List<ItemEntity> findAllItems();

    Integer saveItem(ItemEntity itemEntity);

    Item findItemByPathId(String itemId);

    Item queryFindItem(String itemId);

    List<Item> queryFindItem(List<String> itemId);

    void deleteItem(String itemId);

    ItemEntity updateItemEntity(String itemId, ItemEntity itemEntity);
}
