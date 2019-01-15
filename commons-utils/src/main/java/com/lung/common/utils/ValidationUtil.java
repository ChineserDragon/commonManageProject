package com.lung.common.utils;

import javax.validation.*;
import java.util.Set;

/**
 * @Title: ValidationUtil
 * @Author: long-zp
 * @Date: 2018/6/6 14:26
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 * <p>
 * bean 对象参数必要性校验
 **/
public class ValidationUtil {

    private static Validator validator;

    static {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    public static <T> void validate(T t) throws ValidationException {
        Set<ConstraintViolation<T>> set = validator.validate(t);
        if (set.size() > 0) {
            StringBuilder validateError = new StringBuilder();
            for (ConstraintViolation<T> val : set) {
                validateError.append(val.getMessage() + " ;");
            }
            throw new ValidationException(validateError.toString());
        }
    }
}
