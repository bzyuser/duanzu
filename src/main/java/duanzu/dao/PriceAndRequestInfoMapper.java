package duanzu.dao;

import duanzu.entity.PriceAndRequestInfo;
import duanzu.entity.PriceAndRequestInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceAndRequestInfoMapper {
    int countByExample(PriceAndRequestInfoExample example);

    int deleteByExample(PriceAndRequestInfoExample example);

    int deleteByPrimaryKey(String priceInfoId);

    int insert(PriceAndRequestInfo record);

    int insertSelective(PriceAndRequestInfo record);

    List<PriceAndRequestInfo> selectByExample(PriceAndRequestInfoExample example);

    PriceAndRequestInfo selectByPrimaryKey(String priceInfoId);

    int updateByExampleSelective(@Param("record") PriceAndRequestInfo record, @Param("example") PriceAndRequestInfoExample example);

    int updateByExample(@Param("record") PriceAndRequestInfo record, @Param("example") PriceAndRequestInfoExample example);

    int updateByPrimaryKeySelective(PriceAndRequestInfo record);

    int updateByPrimaryKey(PriceAndRequestInfo record);
}