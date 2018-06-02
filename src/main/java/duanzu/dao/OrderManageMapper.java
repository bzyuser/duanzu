package duanzu.dao;

import duanzu.entity.OrderManage;
import duanzu.entity.OrderManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderManageMapper {
    int countByExample(OrderManageExample example);

    int deleteByExample(OrderManageExample example);

    int deleteByPrimaryKey(Integer orderNum);

    int insert(OrderManage record);

    int insertSelective(OrderManage record);

    List<OrderManage> selectByExample(OrderManageExample example);

    OrderManage selectByPrimaryKey(Integer orderNum);

    int updateByExampleSelective(@Param("record") OrderManage record, @Param("example") OrderManageExample example);

    int updateByExample(@Param("record") OrderManage record, @Param("example") OrderManageExample example);

    int updateByPrimaryKeySelective(OrderManage record);

    int updateByPrimaryKey(OrderManage record);
}