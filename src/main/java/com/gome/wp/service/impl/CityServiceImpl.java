package com.gome.wp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gome.wp.dao.CityMapper;
import com.gome.wp.model.City;
import com.gome.wp.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangpeng24
 * @date 2016/08/26 16:21
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public City getCityByParamyKey(Integer id) {
        if(null==id){
            return null;
        }
        return cityMapper.selectOneByPrimaryKey(id);
    }

    @Override
    public List<City> getCityPage(City city) {
        PageHelper.startPage(1,2);
        return new PageInfo<City>(cityMapper.selectList(city)).getList();
    }
}
