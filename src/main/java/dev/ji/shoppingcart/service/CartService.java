package dev.ji.shoppingcart.service;

import java.util.List;

public interface CartService {
    List<Integer> addItems(List<Integer> idList);

    List<Integer> getItems();
}
