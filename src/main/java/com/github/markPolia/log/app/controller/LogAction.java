package com.github.markPolia.log.app.controller;

import com.github.markPolia.log.domain.User;

public interface LogAction {
    /**
     *  验证登录
     * @param user 登录用户
     * @return 是否能够登录
     */
    boolean doLogIn(User user);
}
