package com.guangc.kfc.kfc.service.impl;

import com.guangc.kfc.kfc.bean.OrderLine;
import com.guangc.kfc.kfc.bean.OrderLineExample;
import com.guangc.kfc.kfc.mapper.OrderLineMapper;
import com.guangc.kfc.kfc.service.IOrderLineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderLineServiceImpl implements IOrderLineService {

    @Resource
    private OrderLineMapper orderLineMapper;

    @Override
    public List<OrderLine> findAll() {
        OrderLineExample example=new OrderLineExample();
        List<OrderLine> list=orderLineMapper.selectByExample(example);
        return list;
    }

    @Override
    public OrderLine findOrderLineById(Integer id) {
        return orderLineMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateOrderLine(OrderLine orderLine) {
        if(orderLine.getId()!=null){
            orderLineMapper.updateByPrimaryKey(orderLine);
        }else{
            orderLineMapper.insert(orderLine);
        }
    }

    @Override
    public void deleteOrderLineById(Integer id) {
        orderLineMapper.deleteByPrimaryKey(id);
    }
}
