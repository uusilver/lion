package com.tmind.lion.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.tmind.lion.model.Emp;

public class EmpDAOImpl extends JdbcDaoSupport implements EmpDAO {

	@Override
	public void save(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		String sql ="insert into emp (name, passwor, email, birthday, info) values(?,?,?,?,?)";
		Object args[] = {emp.getName(),emp.getPassword(),emp.getEmail(),emp.getBirthday(),emp.getInfo()}; 
		this.getJdbcTemplate().update(sql, args);

	}

	@Override
	public void update(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		String sql="update emp set name=?,password=?,email=?,birthday=?,info=? where id=?";  
        Object args[]={emp.getName(),emp.getPassword(),emp.getEmail(),emp.getBirthday(),emp.getInfo(),emp.getId()};  
        this.getJdbcTemplate().update(sql, args);  
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		 String sql="delete from emp where id=?";  
	        Object args[]={id};  
	        this.getJdbcTemplate().update(sql, args);  
	}

	@Override
	public Emp findById(int id) throws Exception {
		// TODO Auto-generated method stub
		String sql="select * from emp where id=?";  
        Object args[]={id};  
        @SuppressWarnings({ "unchecked", "rawtypes" })
		List list=this.getJdbcTemplate().query(sql, args, new RowMapper(){  
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException { //rowNum没有用上  
                Emp emp=new Emp();  
                emp.setId(rs.getInt("id"));  
                emp.setName(rs.getString("name"));  
                emp.setPassword(rs.getString("password"));  
                emp.setEmail(rs.getString("email"));  
                emp.setBirthday(rs.getDate("birthday"));  
                emp.setInfo(rs.getString("info"));  
                return emp;  
            }  
        });  
//      if(list.size()>0){  
//          return (Emp)list.get(0);  
//      }  
//      return null;  
        return list.size()>0?(Emp)list.get(0):null;  
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll() throws Exception {
		// TODO Auto-generated method stub
		String sql="select * from emp";  
        @SuppressWarnings({ "unchecked" })
		List list=this.getJdbcTemplate().query(sql, new RowMapper(){  
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {  
                Emp emp=new Emp();  
                emp.setId(rs.getInt("id"));  
                emp.setName(rs.getString("name"));  
                emp.setPassword(rs.getString("password"));  
                emp.setEmail(rs.getString("email"));  
                emp.setBirthday(rs.getDate("birthday"));  
                emp.setInfo(rs.getString("info"));  
                return emp;  
            }  
        });  
        //return list;  
        return list.size()>0?list:null;  
	}

	@Override
	public int findCount() throws Exception {
		// TODO Auto-generated method stub
		String sql="select count(id) from emp";  
        return this.getJdbcTemplate().queryForInt(sql);  
	}

}
