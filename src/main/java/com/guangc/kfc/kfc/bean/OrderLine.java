package com.guangc.kfc.kfc.bean;

public class OrderLine {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kfc_order_line.id
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kfc_order_line.num
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kfc_order_line.order_id
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kfc_order_line.product_id
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    private Long productId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kfc_order_line.id
     *
     * @return the value of kfc_order_line.id
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kfc_order_line.id
     *
     * @param id the value for kfc_order_line.id
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kfc_order_line.num
     *
     * @return the value of kfc_order_line.num
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kfc_order_line.num
     *
     * @param num the value for kfc_order_line.num
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kfc_order_line.order_id
     *
     * @return the value of kfc_order_line.order_id
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kfc_order_line.order_id
     *
     * @param orderId the value for kfc_order_line.order_id
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kfc_order_line.product_id
     *
     * @return the value of kfc_order_line.product_id
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kfc_order_line.product_id
     *
     * @param productId the value for kfc_order_line.product_id
     *
     * @mbg.generated Fri May 17 10:34:17 CST 2019
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }
}