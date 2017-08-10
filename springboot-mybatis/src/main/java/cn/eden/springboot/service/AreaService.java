package cn.eden.springboot.service;

import java.util.List;

import cn.eden.springboot.domain.Area;

/**
 * 地区业务接口类
 * @author Eden
 *
 */
public interface AreaService {
	
	/**
	 * 查询地区集合
	 * 
	 * @param Area
	 * @return
	 */
	List<Area> getAreaList(Area area);
}
