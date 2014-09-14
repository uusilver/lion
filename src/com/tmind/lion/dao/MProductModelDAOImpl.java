package com.tmind.lion.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.tmind.lion.dao.inter.MProductModelDAO;
import com.tmind.lion.model.MProductModel;

public class MProductModelDAOImpl extends JdbcDaoSupport implements MProductModelDAO{

	@Override
	public void save(MProductModel pro) throws Exception {
		// TODO Auto-generated method stub
		String sql ="insert into m_product (pro_name, pro_type, pro_org_price, pro_cur_price, pro_vip_price,pro_mem_price,pro_store_nums,pro_img_adr,pro_detail_table_name,pro_order_seq) values(?,?,?,?,?,?,?,?,?,?)";
		Object args[] = {pro.getPro_name(),pro.getPro_type(),pro.getPro_org_price(),pro.getPro_cur_price(),pro.getPro_vip_price(),pro.getPro_mem_price(),pro.getPro_store_nums(),pro.getPro_img_adr(),pro.getPro_detail_table_name(),pro.getPro_order_seq()}; 
		this.getJdbcTemplate().update(sql, args);
	}

	@Override
	public void update(MProductModel pro) throws Exception {
		// TODO Auto-generated method stub
		String sql="update m_product set pro_name=?,pro_type=?,pro_org_price=?,pro_cur_price=?,pro_vip_price=?, pro_mem_price=?, pro_store_nums=? where id=?";  
        Object args[]={pro.getPro_name(),pro.getPro_type(),pro.getPro_org_price(),pro.getPro_cur_price(),pro.getPro_vip_price(),pro.getPro_mem_price(),pro.getPro_store_nums()};  
        this.getJdbcTemplate().update(sql, args);  
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		 String sql="delete from m_product where id=?";  
	        Object args[]={id};  
	        this.getJdbcTemplate().update(sql, args);  
	}

	@Override
	public MProductModel findById(int id) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String sql="select * from m_product where id=?";  
		        Object args[]={id};  
		        @SuppressWarnings({ "unchecked", "rawtypes" })
				List list=this.getJdbcTemplate().query(sql, args, new RowMapper(){  
		            public Object mapRow(ResultSet rs, int rowNum) throws SQLException { //rowNum没有用上  
		            	MProductModel p=new MProductModel();  
		                p.setId(rs.getInt("id"));  
		                
		                return p;  
		            }  
		        });  
//		      if(list.size()>0){  
//		          return (Emp)list.get(0);  
//		      }  
//		      return null;  
		        return list.size()>0?(MProductModel)list.get(0):null;  
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll() throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String sql="select * from m_product";  
		        @SuppressWarnings({ "unchecked" })
				List list=this.getJdbcTemplate().query(sql, new RowMapper(){  
		            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {  
		            	MProductModel p=new MProductModel();  
		                p.setId(rs.getInt("id"));  
		                return p;  
		            }  
		        });  
		        //return list;  
		        return list.size()>0?list:null;  
	}

	@Override
	public int findCount() throws Exception {
		// TODO Auto-generated method stub
		String sql="select count(id) from m_product";  
        return this.getJdbcTemplate().queryForInt(sql);  
	}

}
