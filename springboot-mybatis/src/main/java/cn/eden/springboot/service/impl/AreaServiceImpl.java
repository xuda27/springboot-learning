package cn.eden.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.eden.springboot.domain.Area;
import cn.eden.springboot.domain.AreaExample;
import cn.eden.springboot.mapper.AreaMapper;
import cn.eden.springboot.service.AreaService;
/**
 * 地区业务逻辑实现类
 * 
 * @author Eden
 *
 */
@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaMapper areaMapper;
	
	@Override
	public List<Area> getAreaList(Area Area) {
		AreaExample example = new AreaExample();
		List<Area> list = areaMapper.selectByExample(example);
		return list;
	}

}
