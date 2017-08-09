package cn.eden.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "home") //前缀别名
public class HomeProperties {
	
	/**
	 * 省份 
	 */
	private String province;
	
	/**
	 * 城市
	 */
	private String city;
	
	/**
	 * 县区
	 */
	private String area;
	
	/**
	 * 描述
	 */
	private String description;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "HomeProperties [province=" + province + ", city=" + city
				+ ", area=" + area + ", description=" + description + "]";
	}
	
	
}
