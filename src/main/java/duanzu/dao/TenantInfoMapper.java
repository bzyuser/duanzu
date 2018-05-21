package duanzu.dao;

import duanzu.entity.TenantInfo;
import duanzu.entity.TenantInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenantInfoMapper {
    int countByExample(TenantInfoExample example);

    int deleteByExample(TenantInfoExample example);

    int deleteByPrimaryKey(String tenantId);

    int insert(TenantInfo record);

    int insertSelective(TenantInfo record);

    List<TenantInfo> selectByExample(TenantInfoExample example);

    TenantInfo selectByPrimaryKey(String tenantId);

    int updateByExampleSelective(@Param("record") TenantInfo record, @Param("example") TenantInfoExample example);

    int updateByExample(@Param("record") TenantInfo record, @Param("example") TenantInfoExample example);

    int updateByPrimaryKeySelective(TenantInfo record);

    int updateByPrimaryKey(TenantInfo record);
}