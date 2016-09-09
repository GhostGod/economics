package org.ly.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 股票
 * @author liuyang
 * @Email y_liu@hiersun.com | 745089707@qq.com
 * @Date 2016年9月9日
 */
@Entity
public class Stock implements Serializable {

	private static final long serialVersionUID = -4656719772490139880L;

	/**  主键，年月日-代码=yyyyMMdd-code  **/
	@Id
	private String id;
	
	/** 代码  **/
	private String code;
	
	/** 名称  **/
	private String name;
	
	/** 父类代码  **/
	private String parentCode;

	/** 父类名称  **/
	private String parentName;
	
	/** 类型  **/
	private Type type;
	
	/** 指数  **/
	private double price;
	
	/** 涨跌幅  **/
	private double upAndDown;
	
	/** 涨跌幅百分比  **/
	private double percent;

	/** 创建时间  **/
	private Date createTime;

	public enum Type {
		ShenZhen, ShangHai
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getUpAndDown() {
		return upAndDown;
	}

	public void setUpAndDown(double upAndDown) {
		this.upAndDown = upAndDown;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", code=" + code + ", name=" + name + ", parentCode=" + parentCode + ", parentName=" + parentName
				+ ", type=" + type + ", price=" + price + ", upAndDown=" + upAndDown + ", percent=" + percent + ", createTime="
				+ createTime + "]";
	}

}
