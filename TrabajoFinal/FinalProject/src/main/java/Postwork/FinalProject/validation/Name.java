package Postwork.FinalProject.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


    @Target({ ElementType.FIELD })
    @Retention(RetentionPolicy.RUNTIME)
    @Constraint(validatedBy = NameValidator.class)
    public @interface Name {

        String message() default "El nombre del cliente debe contener su primer nombre y apellido separados por un espacio";

        Class<?>[] groups() default {};

        Class<? extends Payload>[] payload() default {};
    }


