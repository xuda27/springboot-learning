package org.spring.springboot.controller;

import java.util.List;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 *
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    /**
     * 根据id查询城市
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    /**
     * 查询所有城市
     * @return
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public List<City> findAllCity() {
        return cityService.findAllCity();
    }

    /**
     * 创建城市
     * @param city
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    /**
     * 修改城市
     * @param city
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    /**
     * 修改城市
     * @param id
     */
    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}
