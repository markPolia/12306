package com.github.markPolia.log.service.impl;

import com.github.markPolia.log.dao.UserMapper;
import com.github.markPolia.log.domain.User;
import com.github.markPolia.log.service.LogService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.github.markPolia.log.app.controller.impl.LogActionImpl.CONTEXT_CACHE;

@Service("logService")
@Transactional
public class LogServiceImpl implements LogService {
    @Resource
    private UserMapper mapper;

    @Override
    public boolean logIn(User user) {
        if ((user = mapper.log(user)) == null) {
            return false;
        }
        CONTEXT_CACHE.put("user", user);
        return true;
    }
}
