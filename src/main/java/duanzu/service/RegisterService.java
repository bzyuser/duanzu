package duanzu.service;

import java.sql.SQLException;
import java.util.Map;

import com.mysql.jdbc.SQLError;

import duanzu.entity.UserTable;

public interface RegisterService {
	Map<String,Object> register(UserTable userInfo)throws SQLException;
	UserTable selectByUserId(String userId)throws SQLException;
	boolean saveByUserId(UserTable userInfo)throws SQLException;
}
