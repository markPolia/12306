package com.github.markPolia.log.app.controller.impl;

import com.github.markPolia.action.app.controller.Action;
import com.github.markPolia.action.domain.Ride;
import com.github.markPolia.config.SpringConfig;
import com.github.markPolia.log.app.controller.LogAction;
import com.github.markPolia.log.domain.User;
import com.github.markPolia.log.service.LogService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.github.markPolia.view.impl.ViewFacadeImpl.print;
import static com.github.markPolia.view.impl.ViewFacadeImpl.println;

@Component("logAction")
public class LogActionImpl implements LogAction {
    private final static AnnotationConfigApplicationContext context;
    private final static LogAction logAction;
    private final static Action action;
    static {
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
        logAction = context.getBean("logAction", LogAction.class);
        action = context.getBean("action", Action.class);
    }

    /**
     *  会话缓存
     */
    public static final Map<String, Object> SESSION_CACHE = new HashMap<>(8);

    /**
     *  登录服务
     */
    @Resource
    private LogService logService;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            println("==================Welcome! 🎉🎉🎉======================");
            println("\t\t1)登录");
            println("\t\t2)注册");
            println("\t\t3)退出");
            int order = scanner.nextInt();
            if (order == 1) {
                User user;
                do {
                    user = (User) SESSION_CACHE.get("user");
                    if (user == null) {
                        print("账号：");
                        (user = new User()).setAct(scanner.next());
                        print("密码：");
                        user.setPwd(scanner.next());
                    }
                } while (!logAction.doLogIn(user));

                println("==========================next step！💨💨💨💨========================");
                println("\t\t1)订票");
                println("\t\t2)退出");
                order = scanner.nextInt();
                if (order == 1) {
                    // todo 订票
                    /*
                        1、查询车次信息并以序号编号
                            in   出发地、目的地
                            out 车次、到站时间、出站时间、目的地、价格、座位
                        2、
                     */
                    Ride ride = new Ride();
                    ride.setBeginStation("成都东");
                    ride.setGoalStation("秦皇岛");
                    System.out.println(action.doSearchTrainList(ride));
                } else if (order == 2) {
                    break;
                }
            } else if (order == 2) {
                // todo 注册
            } else if (order == 3) {
                break;
            }
        }
    }

    @Override
    public boolean doLogIn(User user) {
        if (user.getPwd() == null || user.getAct() == null) {
            throw new RuntimeException("用户名或密码不能为空！");
        }
        if (logService.logIn(user)) {
            SESSION_CACHE.put("user", user);
            return true;
        }
        return false;
    }
}
