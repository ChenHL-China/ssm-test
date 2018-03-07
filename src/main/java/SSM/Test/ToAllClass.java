package SSM.Test;

import SSM.Pojo.User;
import SSM.utils.JsonUtil;

public class ToAllClass {
    //自我实例化
    private static volatile ToAllClass testClass = null;

    //对外提供实例化调用方法
    public static ToAllClass gettestClass() {
        synchronized (ToAllClass.class) {
            if (testClass == null) {
                testClass = new ToAllClass();
            }
        }
        return testClass;
    }

    private ToAllClass() {
        //在这里，我写下我这个被实例化的类所要做的事,例如：打印“请您吩咐，主人”
        System.out.println("请您吩咐，主人");
        User user = new User();
        user.setId(1);
        user.setUserName("陈宏雷");
        user.setUserMoney(33.22);
        user.setUserPhone("18951451459");

        String json = JsonUtil.obj2String(user);
        System.out.println(json);
    }

    public static void main(String[] args) {
        gettestClass();
    }
}
