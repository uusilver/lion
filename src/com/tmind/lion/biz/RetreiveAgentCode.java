package com.tmind.lion.biz;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tmind.lion.utils.DBUtils;




@SuppressWarnings("serial")
public class RetreiveAgentCode extends HttpServlet{
	

		 protected void doGet(HttpServletRequest req,HttpServletResponse resp)
			      throws ServletException, IOException
			      {
			        req.setCharacterEncoding("utf-8");
			        resp.setContentType("text/html;charset=utf-8");
			 		String username = new String(req.getParameter("name").getBytes("ISO-8859-1"),"utf-8");
			        String telno = new String(req.getParameter("telno").getBytes("ISO-8859-1"),"utf-8");
			        String account = new String(req.getParameter("account").getBytes("ISO-8859-1"),"utf-8");
			        
			        //鎺ㄥ箍鐮�
			        String agentCode = null;
			        //System.out.println(username+":"+telno+":"+account);
			        Connection conn = null;
            		PreparedStatement ps = null;
            		ResultSet rs = null;
            		try{
	            		conn = DBUtils.getConnection();
	            		String sql = "INSERT INTO m_agent_tb (A_NAME, A_TELNO, A_ADDDATE, A_EDITDATE) VALUES (?,?,?,?)";
	            		ps = conn.prepareStatement(sql);
	            		ps.setString(1, username);
	            		ps.setString(2, telno);
	            		java.util.Date date=new Date(); 
	            		java.sql.Date sqlDate = new java.sql.Date(date.getTime()); 
	            		ps.setDate(3, sqlDate);
	            		ps.setDate(4, sqlDate);
	            		ps.executeUpdate();
	            		ps.clearBatch();
	            		rs = ps.executeQuery("SELECT MAX(ID) FROM m_agent_tb");
	            		if(rs.next()){
	            			String chars = "abcdefghijklmnopqrstuvwxyz";
	            			String extraCode = String.valueOf(chars.charAt((int)(Math.random() * 26)))+String.valueOf(chars.charAt((int)(Math.random() * 26)));
	            			String agentID = String.valueOf(rs.getInt(1));
	            			agentCode = agentID+extraCode;
	            			sql = "INSERT INTO m_agent_code(AGENT_ID,AGENT_CODE) VALUES (?,?)";
	            			ps.clearBatch();
	            			ps = conn.prepareStatement(sql);
	            			ps.setString(1, agentID);
	            			ps.setString(2, agentCode);
	            			ps.executeUpdate();
	            		}
	            		sql = "UPDATE m_agent_code SET AGENT_ACCOUNT=?, AGENT_ACCOUNT_TYPE=? where AGENT_CODE=?";
	            		ps=conn.prepareStatement(sql);
	            		ps.setString(1, account);
	            		ps.setString(2, "支付宝");
	            		ps.setString(3, agentCode);
	            		ps.executeUpdate();
	            		resp.sendRedirect("agent_apply_done.html?agentCode="+agentCode);
            		}catch(Exception e){
            			System.out.println(e.getMessage());
            			//return "绯荤粺閿欒锛岃绋嶅悗鍐嶈瘯!";
            		}finally{
            			DBUtils.free(conn, ps, rs);
            		}
            		
            		
            	}//缁戝畾鏀粯瀹濇垨鑰呰储浠橀�璐﹀彿

}
