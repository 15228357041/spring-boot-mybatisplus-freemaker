package cn.chinau8.serviceImpl;

import cn.chinau8.entity.Users;
import cn.chinau8.mapper.UsersMapper;
import cn.chinau8.service.IUsersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhuxufeng
 * @since 2019-01-18
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {
	
}
