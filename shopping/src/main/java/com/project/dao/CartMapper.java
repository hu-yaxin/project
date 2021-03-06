package com.project.dao;

import com.project.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    Cart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    List<Cart> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Cart record);

    /**
     * 根据用户id和商品id查询购物车信息
     */
    Cart findCartByUserIdAndProductId(@Param("userId") Integer userId,@Param("productId") Integer productId);

    /**
     * 查询用户的购物车信息
     */
    List<Cart> findCartsByUserid(Integer userId);
    /**
     * 统计购物车中未选中的商品数量
     */
    Integer isAllChecked(@Param("userId")Integer userId);

    /**
     * 修改商品数量or选中取消选中
     */
    Integer updateQuantityOrCheckedById(@Param("id")Integer id,@Param("count")Integer count,@Param("checked")Integer checked);

    /**
     * 查询购物车中用户勾选的商品
     */
    List<Cart> findCartsByUseridAndChecked(Integer userId);

    /**
     * 清空购物车中已选中的商品
     */
    int deleteBath(@Param("cartList")List<Cart> cartList);
}
