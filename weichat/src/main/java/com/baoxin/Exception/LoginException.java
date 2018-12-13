/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LoginException
 * Author:   hasee
 * Date:     2018/11/28 9:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.baoxin.Exception;

import com.baoxin.common.ResultEnum;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hasee
 * @create 2018/11/28
 * @since 1.0.0
 */
public class LoginException extends RuntimeException {

    private String code;

    public LoginException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public LoginException(String code,String message){
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

