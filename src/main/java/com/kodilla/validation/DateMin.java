package com.kodilla.validation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateMinValidator.class)
public @interface DateMin {
    String message() default "Earlier date then expected";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String value() default "2020-01-01";

}