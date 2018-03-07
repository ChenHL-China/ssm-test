package SSM.controller;

import SSM.Pojo.User;
import SSM.service.UserService;
import SSM.utils.CookieUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserInfo {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String Login(HttpServletResponse response, HttpServletRequest request, HttpSession session){
        CookieUtil.writeLoginToken(response,session.getId());
        return "login";
    }

    @RequestMapping(value = "/UserInfo", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public String GetUserInfo(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(id);
        System.out.println(user.getUserMoney());
        //放在需要session的方法里
        CookieUtil.readLoginToken(request);
        //放在用户退出登录方法里
        CookieUtil.delLoginToken(request,response);
        return "userinfo";
    }
}
