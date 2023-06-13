package Postwork.FinalProject.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = OtherNamesValidator.class)
public @interface OtherNames {

    String message() default "Ingrese un nombre entre 5 y 20 caracteres";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
