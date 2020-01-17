package cn.chinau8.mapper;

import cn.chinau8.entity.Users;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author zhuxufeng
 * @since 2020-01-14
 */
public interface UsersMapper extends BaseMapper<Users> {

    List<Users> selectPageTemp(Page<Users> page);

    List<Users> selectAll();
}