package Postwork.FinalProject.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdValidator.class)
public @interface Id {

    String message() default "El Id no coincide con ningún cliente de la agenda";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
