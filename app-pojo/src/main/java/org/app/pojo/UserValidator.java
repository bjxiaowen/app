package org.app.pojo;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "username", null, "Username is empty.");
		User user = (User) target;
		if (null == user.getPassword() || "".equals(user.getPassword()))
			errors.rejectValue("password", null, "Password is empty.");
	}

}
