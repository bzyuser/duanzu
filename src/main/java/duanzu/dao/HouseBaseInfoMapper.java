package duanzu.dao;

import duanzu.entity.HouseBaseInfo;
import duanzu.entity.HouseBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseBaseInfoMapper {
    int countByExample(HouseBaseInfoExample example);

    int deleteByExample(HouseBaseInfoExample example);

    int deleteByPrimaryKey(String houseId);

    int insert(HouseBaseInfo record);

    int insertSelective(HouseBaseInfo record);

    List<HouseBaseInfo> selectByExample(HouseBaseInfoExample example);

    HouseBaseInfo selectByPrimaryKey(String houseId);

    int updateByExampleSelective(@Param("record") HouseBaseInfo record, @Param("example") HouseBaseInfoExample example);

    int updateByExample(@Param("record") HouseBaseInfo record, @Param("example") HouseBaseInfoExample example);

    int updateByPrimaryKeySelective(HouseBaseInfo record);

    int updateByPrimaryKey(HouseBaseInfo record);
}