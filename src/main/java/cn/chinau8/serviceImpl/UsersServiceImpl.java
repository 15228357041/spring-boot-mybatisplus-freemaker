package cn.chinau8.serviceImpl;

import cn.chinau8.entity.Users;
import cn.chinau8.mapper.UsersMapper;
import cn.chinau8.service.IUsersService;
import cn.chinau8.util.PageBean;
import cn.chinau8.util.PageData;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhuxufeng
 * @since 2020-01-14
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public PageBean<PageData> getUserByPage(Integer pageNum, Integer pageSize, Wrapper wrapper) {
        PageHelper.startPage(pageNum, pageSize);
        List<PageData> list = usersMapper.selectList(wrapper);
        return new PageBean<PageData>(list);
    }

    @Override
    public Page<Users> selectPageTemp(Page page) {
        List<Users> q =  this.baseMapper.selectPageTemp(page);
        page.setRecords(q);
        return page;
    }

}
