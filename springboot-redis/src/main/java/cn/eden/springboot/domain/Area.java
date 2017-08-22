package cn.eden.springboot.domain;

import java.io.Serializable;

/**
 * 地区实现类
 * @author Eden
 *
 */
public class Area implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String province;

    private String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }
}