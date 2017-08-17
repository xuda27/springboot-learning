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
	
	/**
	 * 查询地区根据ID
	 * 
	 * @param id
	 * @return
	 */
	Area getAreaById(Integer id);
	
	/**
	 * 保存地区
	 * 
	 * @param area
	 * @return
	 */
	Integer insertArea(Area area);
	
	/**
	 * 更新地区
	 * 
	 * @param area
	 * @return
	 */
	Integer updateArea(Area area);
	
	/**
	 * 删除地区根据id
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteAreaById(Integer id);
}
