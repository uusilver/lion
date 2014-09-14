package com.tmind.lion.model;

/*
 * @Author:VL
 * @@Desc: map to physical table m_product of lion database
 */
public class MProductModel extends CommonModel{
	private int id;
	private String pro_name;
	private String pro_type;
	private String pro_org_price;
	private String pro_cur_price;
	private String pro_vip_price;
	private String pro_mem_price;
	private int pro_store_nums;
	private String pro_img_adr;
	private String pro_detail_table_name;
	private int pro_order_seq;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPro_name() {
		return pro_name;
	}


	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}


	public String getPro_type() {
		return pro_type;
	}


	public void setPro_type(String pro_type) {
		this.pro_type = pro_type;
	}


	public String getPro_org_price() {
		return pro_org_price;
	}


	public void setPro_org_price(String pro_org_price) {
		this.pro_org_price = pro_org_price;
	}


	public String getPro_cur_price() {
		return pro_cur_price;
	}


	public void setPro_cur_price(String pro_cur_price) {
		this.pro_cur_price = pro_cur_price;
	}


	public String getPro_vip_price() {
		return pro_vip_price;
	}


	public void setPro_vip_price(String pro_vip_price) {
		this.pro_vip_price = pro_vip_price;
	}


	public String getPro_mem_price() {
		return pro_mem_price;
	}


	public void setPro_mem_price(String pro_mem_price) {
		this.pro_mem_price = pro_mem_price;
	}


	public int getPro_store_nums() {
		return pro_store_nums;
	}


	public void setPro_store_nums(int pro_store_nums) {
		this.pro_store_nums = pro_store_nums;
	}


	public String getPro_img_adr() {
		return pro_img_adr;
	}


	public void setPro_img_adr(String pro_img_adr) {
		this.pro_img_adr = pro_img_adr;
	}


	public String getPro_detail_table_name() {
		return pro_detail_table_name;
	}


	public void setPro_detail_table_name(String pro_detail_table_name) {
		this.pro_detail_table_name = pro_detail_table_name;
	}


	public int getPro_order_seq() {
		return pro_order_seq;
	}


	public void setPro_order_seq(int pro_order_seq) {
		this.pro_order_seq = pro_order_seq;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((pro_cur_price == null) ? 0 : pro_cur_price.hashCode());
		result = prime
				* result
				+ ((pro_detail_table_name == null) ? 0 : pro_detail_table_name
						.hashCode());
		result = prime * result
				+ ((pro_img_adr == null) ? 0 : pro_img_adr.hashCode());
		result = prime * result
				+ ((pro_mem_price == null) ? 0 : pro_mem_price.hashCode());
		result = prime * result
				+ ((pro_name == null) ? 0 : pro_name.hashCode());
		result = prime * result + pro_order_seq;
		result = prime * result
				+ ((pro_org_price == null) ? 0 : pro_org_price.hashCode());
		result = prime * result + pro_store_nums;
		result = prime * result
				+ ((pro_type == null) ? 0 : pro_type.hashCode());
		result = prime * result
				+ ((pro_vip_price == null) ? 0 : pro_vip_price.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MProductModel))
			return false;
		MProductModel other = (MProductModel) obj;
		if (id != other.id)
			return false;
		return true;
	}




	
	
	
}
