package com.gome.wp.dao;

import com.gome.wp.model.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangpeng24
 * @date 2016/08/26 16:17
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public interface CityMapper{

    //@Select("SELECT * FROM CITY WHERE id = #{id}")
    City selectOneByPrimaryKey(@Param("id") Integer id);

    List<City> selectList(City city);
}
