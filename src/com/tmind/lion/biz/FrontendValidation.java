package com.tmind.lion.biz;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmind.lion.utils.DBUtils;

@Controller
public class FrontendValidation {

	@RequestMapping(value="/checkAgentCode/{telno}", method=RequestMethod.GET,produces="application/json")
	public @ResponseBody int checkTelno4AgentCode(@PathVariable("telno")String telno){
		Connection conn = null;
 		PreparedStatement ps = null;
 		ResultSet rs = null;
 		try{
     		conn = DBUtils.getConnection();
     		String sql = "SELECT ID FROM m_agent_tb where A_TELNO=?";
     		ps = conn.prepareStatement(sql);
     		ps.setString(1, telno);
     		rs = ps.executeQuery();
     		if(rs.next()){
     			System.out.println(telno+"有记录存在，申请失败");
     			return 1;
     		}
 		}catch(Exception e){
 			e.getMessage();
 		}finally{
 			DBUtils.free(conn, ps, rs);
 		}
		return 0;
	}
	
	@RequestMapping(value="/queryAgentCode/{telno}", method=RequestMethod.GET)
	public @ResponseBody String query4AgentCode(@PathVariable("telno")String telno){
		Connection conn = null;
 		PreparedStatement ps = null;
 		ResultSet rs = null;
 		String result = null;
 		try{
     		conn = DBUtils.getConnection();
     		String sql = "SELECT AGENT_CODE FROM m_agent_code a, m_agent_tb b where a.AGENT_ID=b.ID and b.A_TELNO=?";
     		ps = conn.prepareStatement(sql);
     		ps.setString(1, telno);
     		rs = ps.executeQuery();
     		if(rs.next()){
     			result = rs.getString("AGENT_CODE");
     			System.out.println(telno+"的推广码是:"+result);
     		}else{
     			result = "none";
     		}
 		}catch(Exception e){
 			e.getMessage();
 		}finally{
 			DBUtils.free(conn, ps, rs);
 		}
		return result;
	}
}
