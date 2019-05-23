package com.ay.validation;

import com.ay.model.AyUser;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author Ay
 * @create 2018/05/26
 **/
@Component
public class AyUserValidation implements Validator {


    /**
     * This Validator validates *just* AyUser instances
     */
    public boolean supports(Class clazz) {
        return AyUser.class.equals(clazz);
    }

    public void validate(Object obj, Errors e) {
        //指定errors对象、验证失败的字段、错误码
        ValidationUtils.rejectIfEmpty(e, "name", "name.empty");

        AyUser p = (AyUser) obj;
        if(p.getPassword().length() < 8){
            e.rejectValue("password", "密码长度必须大于8位");
        }
        if(p.getPassword().length() > 16){
            e.rejectValue("password", "密码长度必须小于16位");
        }







    }

}
