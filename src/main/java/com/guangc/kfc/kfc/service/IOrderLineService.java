package com.guangc.kfc.kfc.service;


import com.guangc.kfc.kfc.bean.OrderLine;

import java.util.List;

public interface IOrderLineService {

    List<OrderLine> findAll();

    public OrderLine findOrderLineById(Integer id);

    public void saveOrupdateOrderLine(OrderLine order);

    public void deleteOrderLineById(Integer id);
}