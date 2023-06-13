package Postwork.FinalProject.validation;

import Postwork.FinalProject.service.ClienteService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class OtherNamesValidator implements ConstraintValidator<OtherNames, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.length()>= 5 && value.length()<= 20;
    }

}
