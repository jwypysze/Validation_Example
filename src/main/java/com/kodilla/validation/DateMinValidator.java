package com.kodilla.validation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class DateMinValidator implements ConstraintValidator<DateMin, LocalDate> {
    private String annotationValue;

    public void initialize(DateMin constraintAnnotation) {
        annotationValue = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        LocalDate minDate = LocalDate.parse(annotationValue, DateTimeFormatter.ISO_DATE);
        return value.isAfter(minDate);
    }
}