package com.project.dao;

import com.project.pojo.Order_item;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Order_itemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbg.generated
     */
    int insert(Order_item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbg.generated
     */
    Order_item selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbg.generated
     */
    List<Order_item> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Order_item record);


    int insertBath(@Param("orderItems") List<Order_item> orderItems);

    List<Order_item> findOrderitemsByUserid(Integer userId);

    List<Order_item> findOrderitemByOrdernumber(Long orderNumber);
}