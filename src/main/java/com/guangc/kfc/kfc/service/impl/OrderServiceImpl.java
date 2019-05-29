package com.guangc.kfc.kfc.service.impl;

import com.guangc.kfc.kfc.bean.Order;
import com.guangc.kfc.kfc.bean.OrderExample;
import com.guangc.kfc.kfc.mapper.OrderMapper;
import com.guangc.kfc.kfc.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> findAll() {
        OrderExample example=new OrderExample();
        List<Order> list=orderMapper.selectByExample(example);
        return list;
    }

    @Override
    public Order findOrderById(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateOrder(Order order) {
        if(order.getId()!=null){
            orderMapper.updateByPrimaryKey(order);
        }else{
            orderMapper.insert(order);
        }
    }

    @Override
    public void deleteOrderById(Long id) {
        orderMapper.deleteByPrimaryKey(id);
    }
}
    