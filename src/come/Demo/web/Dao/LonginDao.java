package come.Demo.web.Dao;

import come.Demo.web.entity.Loginentity;

import java.sql.*;

//模型层：验证登录
public class LonginDao {
    //登录
    public static int login(Loginentity loginentity) {
//        boolean flag = false;//登录成功失败标识
        int flag = -1;//-1系统异常， 0登录失败， 1登录成功
        PreparedStatement pstmt = null;
        int count = -1;
        ResultSet result = null;
        Connection connection = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取数据库链接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "123456");
            //3.sql语句
            String sql = "select count(*) from user_login where uname = ? and pwd = ?";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, loginentity.getUname());
            pstmt.setString(2, loginentity.getPwd());
            //4.预编译
            //执行
            result = pstmt.executeQuery();
            if (result.next()) {
                count = result.getInt(1);
            }
            if (count > 0) {
                return 1;
            } else {
                return 0;//用户名或密码有误
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return -1;//系统异常 登录失败
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;//系统异常 登录失败
        } catch (Exception e) {
            e.printStackTrace();
            return -1;//系统异常 登录失败
        } finally {
            try {
                if (result != null) result.close();
                if (pstmt != null) pstmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
