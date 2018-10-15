package com.niles.pandian_base.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.niles.pandian_base.model.UserModel;

/**
 * Created by Niles
 * Date 2018/10/12 18:02
 * Email niulinguo@163.com
 */
public interface LoginModuleService extends IProvider {

    UserModel getLoginInfo();

}
