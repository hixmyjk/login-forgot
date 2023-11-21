package interface_adapter.forgotpassword;

import interface_adapter.ViewManagerModel;
import interface_adapter.login.LoginState;
import interface_adapter.login.LoginViewModel;
import use_case.forgotpassword.ForgotInputBoundary;
import use_case.forgotpassword.ForgotOutputBoundary;
import use_case.forgotpassword.ForgotOutputData;

public class ForgotPasswordPresenter implements ForgotOutputBoundary {
    private final ForgotPasswordViewModel forgotPasswordViewModel;
    private final LoginViewModel loginViewModel;

    private ViewManagerModel viewManagerModel;

    public ForgotPasswordPresenter(ForgotPasswordViewModel forgotPasswordViewModel, LoginViewModel loginViewModel,
                                   ViewManagerModel viewManagerModel) {
        this.forgotPasswordViewModel = forgotPasswordViewModel;
        this.loginViewModel = loginViewModel;
        this.viewManagerModel = viewManagerModel;

    }

    @Override
    public void prepareSuccessView(ForgotOutputData response) {
        LoginState loginState = loginViewModel.getState();
        loginState.setUsername(response.getUsername());
        this.loginViewModel.setState(loginState);
        this.loginViewModel.firePropertyChanged();

        this.viewManagerModel.setActiveView(loginViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {
        ForgotPasswordState forgotPasswordState = forgotPasswordViewModel.getState();
        forgotPasswordState.setUsernameError(error);
        forgotPasswordViewModel.firePropertyChanged();

    }
}
