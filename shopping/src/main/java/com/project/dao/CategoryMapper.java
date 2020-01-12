package com.project.dao;

import com.project.pojo.Category;
import java.util.List;

public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbg.generated
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbg.generated
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbg.generated
     */
    List<Category> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Category record);

    /**
     * 根据id获取平级
     */
    List<Category> selectCategoryById(int categoryId);
    /**
     * 获取类别
     */
    List<Category> showCategory();

}