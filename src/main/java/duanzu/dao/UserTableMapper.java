package duanzu.dao;

import duanzu.entity.UserTable;
import duanzu.entity.UserTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTableMapper {
    int countByExample(UserTableExample example);

    int deleteByExample(UserTableExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserTable record);

    int insertSelective(UserTable record);

    List<UserTable> selectByExample(UserTableExample example);

    UserTable selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserTable record, @Param("example") UserTableExample example);

    int updateByExample(@Param("record") UserTable record, @Param("example") UserTableExample example);

    int updateByPrimaryKeySelective(UserTable record);

    int updateByPrimaryKey(UserTable record);
}