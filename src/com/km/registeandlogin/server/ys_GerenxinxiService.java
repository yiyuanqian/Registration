package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.UserDao;
import com.km.pojo.t_yisheng;

public class ys_GerenxinxiService {
	UserDao dao = new UserDao();

	public t_yisheng getYishengxinxi(t_yisheng ys) {
		
		return dao.getYishengxinxi(ys);
	}

}
