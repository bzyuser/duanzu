package duanzu.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import duanzu.entity.HouseBaseInfo;

public interface AddFangyuanService {
	//保存房屋基本信息，返回房屋id
	Map<String,Object> saveHouseInfo(Map<String,Object> map)throws SQLException;
	boolean saveHousePicture(String houseId,String picName,String picType)throws SQLException;
	//根据用户ID查询房源
	List<HouseBaseInfo> selectAllFangYuanByUserId(String userId);
	//根据房屋id删除房源信息
	boolean deleteFangyuanById(String housiId)throws SQLException;
	
}
