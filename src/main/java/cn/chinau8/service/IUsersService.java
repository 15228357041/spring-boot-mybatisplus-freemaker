package cn.chinau8.service;

import cn.chinau8.entity.Users;
import cn.chinau8.util.PageBean;
import cn.chinau8.util.PageData;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhuxufeng
 * @since 2020-01-14
 */
public interface IUsersService extends IService<Users> {
    PageBean<PageData> getUserByPage(Integer pageNum, Integer pageSize, Wrapper id);

    Page<Users> selectPageTemp(Page page);

}
