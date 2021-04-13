/* 
 * The MIT License
 *
 * Copyright 2021 Bear Au Jus - ジュースとくま.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package validator;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Bear Au Jus - ジュースとくま
 */
@FacesValidator("validator.reg.confpassword")
public class Register_PasswordConfirm implements Validator, Serializable {

    @Override
    public void validate(FacesContext context, UIComponent component, Object obj) throws ValidatorException {
        UIInput passwordComponent = (UIInput) component.getAttributes().get("passwordComponent");
        String password = (String) passwordComponent.getValue();
        if (null == (String) obj || "".equals((String) obj)) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_WARN, "Register Info", "Confirm Password is required"));
        } else if (((String) obj).length() < 6) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_WARN, "Register Info", "Confirm Password minimum character is 6"));
        } else if (((String) obj).length() > 12) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_WARN, "Register Info", "Confirm Password maximum character is 12"));
        } else if (!((String) obj).equals(password)) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_WARN, "Register Info", "Confirm Password is not the same as Password"));
        }
    }
}