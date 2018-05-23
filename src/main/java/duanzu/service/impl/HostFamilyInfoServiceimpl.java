package duanzu.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duanzu.dao.HostFamilyInfoMapper;
import duanzu.entity.HostFamilyInfo;
import duanzu.entity.HostFamilyInfoExample;
import duanzu.service.HostFamilyInfoService;
import duanzu.util.NoteUtil;

@Service
public class HostFamilyInfoServiceimpl implements HostFamilyInfoService {
	@Autowired
	private HostFamilyInfoMapper hostMapper;

	@Override
	public boolean saveHostInfo(HostFamilyInfo hostInfo) throws SQLException {
		String userId = hostInfo.getUserId();
		//查询是否有信息存在
		HostFamilyInfoExample hostEx = new HostFamilyInfoExample();
		HostFamilyInfoExample.Criteria criteria = hostEx.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<HostFamilyInfo> lists = hostMapper.selectByExample(hostEx);
		//信息存在，则保存
		if(lists.size()!=0){
			HostFamilyInfo oldHostInfo = lists.get(0);
			hostInfo.setHostFamilyId(oldHostInfo.getHostFamilyId());
			int n = hostMapper.updateByPrimaryKey(hostInfo);
			if(n==1){
				return true;
			}else return false;
		} else{
			//没有信息，新加一条信息
			hostInfo.setHostFamilyId(NoteUtil.createId());
			int n = hostMapper.insertSelective(hostInfo);
			if(n==1){
				return true;
			}
			else return false;
		}
		
	}

	@Override
	public HostFamilyInfo selectHostInfoByUserId(String userId) throws SQLException {
		HostFamilyInfo hostInfo = new HostFamilyInfo();
		HostFamilyInfoExample hostEx = new HostFamilyInfoExample();
		HostFamilyInfoExample.Criteria criteria = hostEx.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<HostFamilyInfo> lists = hostMapper.selectByExample(hostEx);
		if(lists.size()!=0){
			hostInfo = lists.get(0);
			return hostInfo;
		}
		return null;
	}

}
