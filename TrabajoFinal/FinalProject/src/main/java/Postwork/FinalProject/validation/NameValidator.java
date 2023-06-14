package Postwork.FinalProject.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<Name, String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.length()>=5 && value.length()<=30 && value.matches("\\w+\\s{1}\\w+") ;
    }

}
