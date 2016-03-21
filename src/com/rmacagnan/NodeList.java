package com.rmacagnan;

/**
 * Created by ricardomacagnan on 3/18/16.
 */
public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
