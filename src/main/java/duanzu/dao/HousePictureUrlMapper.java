package duanzu.dao;

import duanzu.entity.HousePictureUrl;
import duanzu.entity.HousePictureUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousePictureUrlMapper {
    int countByExample(HousePictureUrlExample example);

    int deleteByExample(HousePictureUrlExample example);

    int deleteByPrimaryKey(String housePictureUrlId);

    int insert(HousePictureUrl record);

    int insertSelective(HousePictureUrl record);

    List<HousePictureUrl> selectByExample(HousePictureUrlExample example);

    HousePictureUrl selectByPrimaryKey(String housePictureUrlId);

    int updateByExampleSelective(@Param("record") HousePictureUrl record, @Param("example") HousePictureUrlExample example);

    int updateByExample(@Param("record") HousePictureUrl record, @Param("example") HousePictureUrlExample example);

    int updateByPrimaryKeySelective(HousePictureUrl record);

    int updateByPrimaryKey(HousePictureUrl record);
}