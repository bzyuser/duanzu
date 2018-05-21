package duanzu.dao;

import duanzu.entity.HouseDetailInfo;
import duanzu.entity.HouseDetailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseDetailInfoMapper {
    int countByExample(HouseDetailInfoExample example);

    int deleteByExample(HouseDetailInfoExample example);

    int deleteByPrimaryKey(String detailId);

    int insert(HouseDetailInfo record);

    int insertSelective(HouseDetailInfo record);

    List<HouseDetailInfo> selectByExample(HouseDetailInfoExample example);

    HouseDetailInfo selectByPrimaryKey(String detailId);

    int updateByExampleSelective(@Param("record") HouseDetailInfo record, @Param("example") HouseDetailInfoExample example);

    int updateByExample(@Param("record") HouseDetailInfo record, @Param("example") HouseDetailInfoExample example);

    int updateByPrimaryKeySelective(HouseDetailInfo record);

    int updateByPrimaryKey(HouseDetailInfo record);
}