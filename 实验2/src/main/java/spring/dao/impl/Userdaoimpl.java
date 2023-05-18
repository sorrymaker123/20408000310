package spring.dao.impl;

import spring.dao.Userdao;

public class Userdaoimpl implements Userdao {
    @Override
    public boolean login(String name, String password) {
        if("张三".equals(name) && ("123".equals(password)))
            return true;
        else
        return false;
    }
}
