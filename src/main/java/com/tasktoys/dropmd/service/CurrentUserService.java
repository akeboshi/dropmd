package com.tasktoys.dropmd.service;

import com.tasktoys.dropmd.security.CurrentUser;

/**
 * @author mikan
 */
public interface CurrentUserService {
    boolean canAccessUser(CurrentUser currentUser, Long userId);
}