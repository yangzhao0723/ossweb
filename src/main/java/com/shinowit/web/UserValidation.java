package com.shinowit.web;

/**
 * Created by Administrator on 2014/12/25.
 */
import com.shinowit.entity.TbaMemberinfo;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;



@Component("userValidator")
public class UserValidation {
    public boolean supports(Class<?> klass) {
        return TbaMemberinfo.class.isAssignableFrom(klass);
    }

    public void validate(Object target, Errors errors) {
        TbaMemberinfo registration = (TbaMemberinfo) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName",
                "NotEmpty.registration.userName",
                "用户名不能为空.");
        String userName = registration.getUsername();
        if ((userName.length()) > 50) {
            errors.rejectValue("userName",
                    "lengthOfUser.registration.userName",
                    "User Name must not more than 50 characters.");
        }
        String userPass = registration.getPwd();
        if (userPass.length()>3   ) {
            errors.rejectValue("password",
                    "matchingPassword.registration.password",
                    "Password and Confirm Password Not match.");
        }
    }
}
