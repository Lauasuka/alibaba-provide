package io.amoe.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.amoe.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Amoe
 */
@Mapper
public interface IUserMapper extends BaseMapper<User> {
}
