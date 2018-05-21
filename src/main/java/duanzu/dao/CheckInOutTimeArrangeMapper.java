package duanzu.dao;

import duanzu.entity.CheckInOutTimeArrange;
import duanzu.entity.CheckInOutTimeArrangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckInOutTimeArrangeMapper {
    int countByExample(CheckInOutTimeArrangeExample example);

    int deleteByExample(CheckInOutTimeArrangeExample example);

    int deleteByPrimaryKey(String timeId);

    int insert(CheckInOutTimeArrange record);

    int insertSelective(CheckInOutTimeArrange record);

    List<CheckInOutTimeArrange> selectByExample(CheckInOutTimeArrangeExample example);

    CheckInOutTimeArrange selectByPrimaryKey(String timeId);

    int updateByExampleSelective(@Param("record") CheckInOutTimeArrange record, @Param("example") CheckInOutTimeArrangeExample example);

    int updateByExample(@Param("record") CheckInOutTimeArrange record, @Param("example") CheckInOutTimeArrangeExample example);

    int updateByPrimaryKeySelective(CheckInOutTimeArrange record);

    int updateByPrimaryKey(CheckInOutTimeArrange record);
}