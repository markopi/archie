package com.nedap.archie.rm.datastructures;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pieter.bos on 04/11/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ITEM_TREE", propOrder = {
        "items"
})
public class ItemTree extends ItemStructure<Item> {
        private List<Item> items = new ArrayList<>();

        public List<Item> getItems() {
                return items;
        }

        public void setItems(List<Item> items) {
                this.items = items;
                setThisAsParent(items, "items");
        }

        public void addItem(Item item) {
                this.items.add(item);
                setThisAsParent(item, "items");
        }
}
