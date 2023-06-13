package Postwork.FinalProject.validation;

import Postwork.FinalProject.service.ClienteService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class IdValidator implements ConstraintValidator<Id, Long> {

    private ClienteService agenda;

    @Autowired
    public IdValidator(ClienteService agenda) {
        this.agenda = agenda;
    }
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        return value != null && agenda.exists(value);
    }

}
