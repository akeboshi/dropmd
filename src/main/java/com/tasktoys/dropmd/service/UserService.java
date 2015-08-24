package com.tasktoys.dropmd.service;

import com.tasktoys.dropmd.entity.User;
import com.tasktoys.dropmd.form.UserCreateForm;

import java.util.Collection;
import java.util.Optional;

/**
 * @author mikan
 */
public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);
}
