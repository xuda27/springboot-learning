package cn.eden.springboot.service.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import cn.eden.springboot.domain.Area;
import cn.eden.springboot.domain.AreaExample;
import cn.eden.springboot.domain.AreaExample.Criteria;
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
	private static final Logger LOGGER = LoggerFactory.getLogger(AreaServiceImpl.class);
	
	@Autowired
	private AreaMapper areaMapper;
	
	@Autowired
    private StringRedisTemplate redisTemplate;
	
	
	@Override
	public List<Area> getAreaList(Area area) {
		AreaExample example = new AreaExample();
		Criteria criteria = example.createCriteria();
		criteria.andCityEqualTo(area.getCity());
		List<Area> list = areaMapper.selectByExample(example);
		return list;
	}

	@Override
	public Area getAreaById(Integer id) {
		Boolean hasArea = redisTemplate.hasKey("Area:id:" + id);
		ValueOperations ops = redisTemplate.opsForValue();
		if (hasArea) {
			Area area = (Area) ops.get("Area:id:" + id);
			return area;
		}
		Area area = areaMapper.selectByPrimaryKey(id);
		ops.set("Area:id:" + id, area.toString(), 10, TimeUnit.MINUTES);
		return area;
	}

	@Override
	public Integer insertArea(Area area) {
		int result = areaMapper.insert(area);
		String key = "Area:id:" + area.getId();
		Boolean hasArea = redisTemplate.hasKey(key);
		if (hasArea && result > 0) {
			redisTemplate.delete(key);
		}
		return result;
	}

	@Override
	public Integer updateArea(Area area) {
		int result = areaMapper.updateByPrimaryKey(area);
		String key = "Area:id:" + area.getId();
		Boolean hasArea = redisTemplate.hasKey(key);
		if (hasArea && result > 0) {
			redisTemplate.delete(key);
		}
		return result;
	}

	@Override
	public Integer deleteAreaById(Integer id) {
		int result = areaMapper.deleteByPrimaryKey(id);
		String key = "Area:id:" + id;
		Boolean hasArea = redisTemplate.hasKey(key);
		if (hasArea && result > 0) {
			redisTemplate.delete(key);
		}
		return result;
	}

}
