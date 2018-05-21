package duanzu.dao;

import duanzu.entity.CityPictureUrl;
import duanzu.entity.CityPictureUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityPictureUrlMapper {
    int countByExample(CityPictureUrlExample example);

    int deleteByExample(CityPictureUrlExample example);

    int deleteByPrimaryKey(String cityPictureUrlId);

    int insert(CityPictureUrl record);

    int insertSelective(CityPictureUrl record);

    List<CityPictureUrl> selectByExample(CityPictureUrlExample example);

    CityPictureUrl selectByPrimaryKey(String cityPictureUrlId);

    int updateByExampleSelective(@Param("record") CityPictureUrl record, @Param("example") CityPictureUrlExample example);

    int updateByExample(@Param("record") CityPictureUrl record, @Param("example") CityPictureUrlExample example);

    int updateByPrimaryKeySelective(CityPictureUrl record);

    int updateByPrimaryKey(CityPictureUrl record);
}