package com.km.registeandlogin.server;

import com.km.loginandregister.Dao.hz_Dao;
import com.km.pojo.t_yuyue;

public class Hz_KeshiyishengyuyueService {
	hz_Dao dao = new hz_Dao();

	public boolean getyuyueyisheng(t_yuyue yuyue) {

		return dao.getyuyueyisheng(yuyue);
	}

}
