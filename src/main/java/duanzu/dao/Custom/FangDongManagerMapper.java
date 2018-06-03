package duanzu.dao.Custom;

import java.util.List;

import duanzu.entity.HouseBaseInfo;

public interface FangDongManagerMapper {
	List<HouseBaseInfo> selectAllFangYuanByUserId(String userId);
}
