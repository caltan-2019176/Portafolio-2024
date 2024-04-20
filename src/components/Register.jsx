import { useState } from "react"
import { Input } from "./Input.jsx";
import { useRegister } from "../shared/hooks/useRegister.jsx";
import { emailValidationMessage, passwordConfirmValidateMessage, passwordValidateMessage, usernameValidationMessage, validateEmail, validatePassword, validatePasswordConfirm, validateUsername } from "../shared/validators/validator.js";

export const Register = ({SwitchAuthAndler}) => {
    const {register, isLoading} = useRegister()
    const [formData, setFormData] = useState(
        {
            email: {
                value: '',
                isValid: false,
                showError: false
            },
            username: {
                value: '',
                isValid: false,
                showError: false
            },
            password: {
                value: '',
                isValid: false,
                showError: false
            },
            passwordConfirm: {
                value: '',
                isValid: false,
                showError: false
            }
        }
    )

    const isSubmitButtonDisable = !formData.email.isValid || 
                                  !formData.username.isValid || 
                                  !formData.password.isValid || 
                                  !formData.passwordConfirm.isValid

    const handleValueChange = (value, field)=>{
        setFormData((prevData)=>(
            {
                ...prevData,
                [field]: {
                    ...prevData[field],
                    value
                }
            }
        ))
    }

    const handleValidationOnBlur= (value, field)=>{
        let isValid = false
        switch(field){
            case 'email':
                isValid = validateEmail(value) 
                break
            case 'username': 
                isValid = validateUsername(value)
                break
            case 'password': 
                isValid = validatePassword(value)
            case 'passwordConfirm':
                isValid = validatePasswordConfirm(formData.password.value, value)
                break
            default: 
            break
        }
        setFormData((prevData) =>(
            {
                ...prevData, 
                [field]: {
                    ...prevData[field], 
                    isValid,
                    showError: !isValid
                    
                }
            }
        ))

    }

    const handleRegister = async (e) => {
        e.preventDefault()
        register(
            formData.email.value, 
            formData.username.value,
            formData.password.value
        )
    }

    return (
        <div className="register-container">
            <form
                className="auth-form"
                onSubmit={handleRegister}
            >
                <Input
                    field='email'
                    label='Email'
                    value={formData.email.value}
                    onChangeHandler={handleValueChange}
                    type='email'
                    onBlurHandler={handleValidationOnBlur}
                    showErrorMessage={formData.email.showError}
                    validationMessage={emailValidationMessage}
                />
                <Input
                    field='username'
                    label='Username'
                    value={formData.username.value}
                    onChangeHandler={handleValueChange}
                    type='text'
                    onBlurHandler={handleValidationOnBlur}
                    showErrorMessage={formData.username.showError}
                    validationMessage={usernameValidationMessage}
                />
                <Input
                    field='password'
                    label='Password'
                    value={formData.password.value}
                    onChangeHandler={handleValueChange}
                    type='password'
                    onBlurHandler={handleValidationOnBlur}
                    showErrorMessage={formData.password.showError}
                    validationMessage={passwordValidateMessage}
                />
                <Input
                    field='passwordConfirm'
                    label='passwordConfirm'
                    value={formData.passwordConfirm.value}
                    onChangeHandler={handleValueChange}
                    type='password'
                    onBlurHandler={handleValidationOnBlur}
                    showErrorMessage={formData.passwordConfirm.showError}
                    validationMessage={passwordConfirmValidateMessage}
                />
            <button
                disabled={isSubmitButtonDisable}
            >
                Register
            </button>
            </form>
            <span onClick={SwitchAuthAndler}>
                ¿Ya tienes una cuenta? !Inicia Sesión acá!
            </span>
        </div>
    )
}