package cn.eden.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.eden.springboot.domain.Area;
import cn.eden.springboot.service.AreaService;
/**
 * 地区restful类
 * 
 * @author 
 */
@RestController
public class AreaController {
	
	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value = "/api/area", method = RequestMethod.GET)
    public List<Area> getArea(@RequestParam(value = "area", required = true) String cityName) {
		Area area = new Area();
		area.setCity(cityName);
        return areaService.getAreaList(area);
    }
	
	@RequestMapping(value = "/api/area/{id}", method = RequestMethod.GET)
    public Area getAreaById(@PathVariable(value = "id", required = true) Integer id) {
        return areaService.getAreaById(id);
    }

}
