package com.tmind.lion.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DBUtils {
	
    
    private DBUtils() {  
    }  
  
    public static Connection getConnection() throws SQLException {  
        //System.out.print(dataSource.getConnection("root","family"));  
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-jdbc.xml"); 
    	DataSource ds = (DataSource)ctx.getBean("dataSource");
        return ds.getConnection();
    }

    public static void free(Connection con, Statement st, ResultSet rs) {  
        try {  
            if (rs != null)  
                rs.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (st != null)  
                    st.close();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            } finally {  
  
                if (con != null)  
                    try {  
                        con.close();  
                    } catch (SQLException e) {  
                        // TODO Auto-generated catch block  
                        e.printStackTrace();  
                    }  
            }  
        }  
    }  
}
