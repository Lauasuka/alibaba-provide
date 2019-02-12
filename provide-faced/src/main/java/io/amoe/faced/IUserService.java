package io.amoe.faced;

import io.amoe.entity.User;

import java.util.List;

/**
 * @author Amoe
 */
public interface IUserService {
    /**
     * Get users
     * @return user list
     */
    List<User> listUser();

    /**
     * search user by fuzzy name
     * @param name fuzzy name condition
     * @return user list
     */
    List<User> queryUserByName(String name);

    /**
     * search user by fuzzy phone
     * @param phone fuzzy phone condition
     * @return user list
     */
    List<User> queryUserByPhone(String phone);
}
