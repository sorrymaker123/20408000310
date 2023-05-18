package spring.service.impl;

import spring.service.Userservice;
import spring.dao.Userdao;

public class Userserviceimpl implements Userservice {
    private Userdao userdao;

    public void setUserdao(Userdao userdao) {
        this.userdao = userdao;
    }

    @Override
    public boolean login(String name, String password) {
        return userdao.login(name,password );
    }
}
