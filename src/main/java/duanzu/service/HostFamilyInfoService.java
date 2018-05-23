package duanzu.service;

import java.sql.SQLException;

import duanzu.entity.HostFamilyInfo;

public interface HostFamilyInfoService {
	boolean saveHostInfo(HostFamilyInfo hostInfo)throws SQLException;
	HostFamilyInfo selectHostInfoByUserId(String userId)throws SQLException;
}
