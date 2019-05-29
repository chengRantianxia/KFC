package com.guangc.kfc.kfc.web.controller;

import com.guangc.kfc.kfc.bean.Order;
import com.guangc.kfc.kfc.service.IOrderService;
import com.guangc.kfc.kfc.utils.Message;
import com.guangc.kfc.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Order> list=orderService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findOrderById")
    public Message findOrderById(Long id){
        Order order=orderService.findOrderById(id);
        return MessageUtil.success(order);
    }

    @PostMapping("saveOrupdateOrder")
    public Message saveOrupdateOrder(Order order){
        orderService.saveOrupdateOrder(order);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteOrderById")
    public Message deleteOrderById(Long id){
        orderService.deleteOrderById(id);
        return MessageUtil.success("success");
    }
}
