package com.tasktoys.dropmd.service.impl;

import com.tasktoys.dropmd.entity.Role;
import com.tasktoys.dropmd.security.CurrentUser;
import com.tasktoys.dropmd.service.CurrentUserService;
import org.springframework.stereotype.Service;

/**
 * @author mikan
 */
@Service
public class CurrentUserServiceImpl implements CurrentUserService {

    @Override
    public boolean canAccessUser(CurrentUser currentUser, Long userId) {
        return currentUser != null
                && (currentUser.getRole() == Role.ADMIN || currentUser.getId().equals(userId));
    }

}