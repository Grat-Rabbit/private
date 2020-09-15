package cn.onlineexam.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.onlineexam.manager.domain.Manager;
import cn.onlineexam.student.dao.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.itcast.jdbc.TxQueryRunner;

/**
 * 管理员模块红持久层
 * 
 * @author Administrator
 * 
 */
public class ManagerDao {

	/**
	 * 按用户名和密码查询
	 * 
	 * @param name
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	public Manager findByLoginnameAndLoginpass(String name, String password)
			throws SQLException {
		Manager manager = new Manager();
		String sql = "select * from manager where name=? and password=?";
		Connection connection= JdbcUtils.getConnection();
		String sqlString="select * from student where loginname=? and loginpass=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, password);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()){
		manager.setId(resultSet.getString("id"));
		manager.setName(resultSet.getString("name"));
		manager.setPassword(resultSet.getString("password"));}
		return manager;
	}

}
