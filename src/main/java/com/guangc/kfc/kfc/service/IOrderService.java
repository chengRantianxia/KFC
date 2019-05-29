package com.guangc.kfc.kfc.service;


import com.guangc.kfc.kfc.bean.Order;

import java.util.List;

public interface IOrderService {

    List<Order> findAll();

    public Order findOrderById(Long id);

    public void saveOrupdateOrder(Order order);

    public void deleteOrderById(Long id);
}