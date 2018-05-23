package duanzu.service;

import java.sql.SQLException;
import java.util.Map;

public interface AddFangyuanService {
	//保存房屋基本信息，返回房屋id
	Map<String,Object> saveHouseInfo(Map<String,Object> map)throws SQLException;
	boolean saveHousePicture(String houseId,String picName,String picType)throws SQLException;
}
