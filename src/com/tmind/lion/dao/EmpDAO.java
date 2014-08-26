package com.tmind.lion.dao;

import java.util.List;

import com.tmind.lion.model.Emp;

public interface EmpDAO {
	/** 
     * 添加雇员 
     * @param emp 要添加的雇员 
     * @throws Exception 
     */  
    public void save(Emp emp) throws Exception;  
    /** 
     * 修改雇员 
     * @param emp 要修改的雇员 
     * @throws Exception 
     */  
    public void update(Emp emp) throws Exception;  
    /** 
     * 根据雇员id删除雇员 
     * @param id 要删除雇员的id 
     * @throws Exception 
     */  
    public void delete(int id) throws Exception;  
    /** 
     * 根据雇员id查询雇员 
     * @param id 要查询雇员的id 
     * @return 此id对应的雇员 
     * @throws Exception 
     */  
    public Emp findById(int id) throws Exception;  
    /** 
     * 查询全部雇员 
     * @return 全部雇员的集合 
     * @throws Exception 
     */  
    public List findAll() throws Exception;  
      
    /** 
     * 查询全部记录数字 
     * @return 
     * @throws Exception 
     */  
    public int findCount()throws Exception;  
}
