package jp.te4a.spring.boot.mybootapp11;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TestValidator implements ConstraintValidator<Writter,String>{
    String param;
    @Override
    public void initialize(Writter nv){ param =  nv.ok(); }
    @Override
    public boolean isValid(String in,ConstraintValidatorContext cxt){
        if(in == null){
            return false;
        }
        System.out.println(in.equals(param));
        return !in.equals(param);
    }
}
