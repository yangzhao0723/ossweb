package com.shinowit.dao.mapper;

import com.shinowit.entity.Gouwuche1;
import com.shinowit.entity.Gouwuche1Criteria;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Gouwuche1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    int countByExample(Gouwuche1Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    int deleteByExample(Gouwuche1Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    int deleteByPrimaryKey(String merchandiseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    int insert(Gouwuche1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    int insertSelective(Gouwuche1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    List<Gouwuche1> selectByExample(Gouwuche1Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    Gouwuche1 selectByPrimaryKey(String merchandiseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    int updateByExampleSelective(@Param("record") Gouwuche1 record, @Param("example") Gouwuche1Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    int updateByExample(@Param("record") Gouwuche1 record, @Param("example") Gouwuche1Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    int updateByPrimaryKeySelective(Gouwuche1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gouwuche1
     *
     * @mbggenerated Wed Jan 07 16:45:07 CST 2015
     */
    int updateByPrimaryKey(Gouwuche1 record);
    int deleteAll (String username);
    BigDecimal selectsum(String username);
}