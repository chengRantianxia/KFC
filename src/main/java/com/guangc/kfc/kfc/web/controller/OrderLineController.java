package com.guangc.kfc.kfc.web.controller;


import com.guangc.kfc.kfc.bean.OrderLine;
import com.guangc.kfc.kfc.service.IOrderLineService;
import com.guangc.kfc.kfc.utils.Message;
import com.guangc.kfc.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OrderLine")
public class OrderLineController {

    @Autowired
    private IOrderLineService orderLineService;

    @GetMapping("findAll")
    public Message findAll(){
        List<OrderLine> list=orderLineService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findOrderLineById")
    public Message findOrderLineById(Integer id){
        OrderLine orderLine=orderLineService.findOrderLineById(id);
        return MessageUtil.success(orderLine);
    }

    @PostMapping("saveOrupdateOrderLine")
    public Message saveOrupdateOrderLine(OrderLine orderLine){
        orderLineService.saveOrupdateOrderLine(orderLine);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteOrderLineById")
    public Message deleteOrderLineById(Integer id){
        orderLineService.deleteOrderLineById(id);
        return MessageUtil.success("success");
    }
}
