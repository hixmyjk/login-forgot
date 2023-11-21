package interface_adapter.forgotpassword;

import use_case.forgotpassword.ForgotInputBoundary;
import use_case.forgotpassword.ForgotInputData;

public class ForgotPasswordController {
    final ForgotInputBoundary forgotUseCaseInteractor;

    public ForgotPasswordController(ForgotInputBoundary forgotUseCaseInteractor) {
        this.forgotUseCaseInteractor = forgotUseCaseInteractor;
    }

    public void execute(String username, String password){
        ForgotInputData forgotInputData = new ForgotInputData(username, password);
        forgotUseCaseInteractor.execute(forgotInputData);

    }
}
