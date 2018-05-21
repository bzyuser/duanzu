package duanzu.dao;

import duanzu.entity.HostFamilyInfo;
import duanzu.entity.HostFamilyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostFamilyInfoMapper {
    int countByExample(HostFamilyInfoExample example);

    int deleteByExample(HostFamilyInfoExample example);

    int deleteByPrimaryKey(String hostFamilyId);

    int insert(HostFamilyInfo record);

    int insertSelective(HostFamilyInfo record);

    List<HostFamilyInfo> selectByExample(HostFamilyInfoExample example);

    HostFamilyInfo selectByPrimaryKey(String hostFamilyId);

    int updateByExampleSelective(@Param("record") HostFamilyInfo record, @Param("example") HostFamilyInfoExample example);

    int updateByExample(@Param("record") HostFamilyInfo record, @Param("example") HostFamilyInfoExample example);

    int updateByPrimaryKeySelective(HostFamilyInfo record);

    int updateByPrimaryKey(HostFamilyInfo record);
}