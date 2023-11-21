package use_case.forgotpassword;

public class ForgotInteractor implements ForgotInputBoundary{
    private final ForgotUserDataAccessInterface forgotUserDataAccessObject;
    private final ForgotOutputBoundary forgotPresenter;

    public ForgotInteractor(ForgotUserDataAccessInterface forgotUserDataAccessObject, ForgotOutputBoundary forgotPresenter) {
        this.forgotUserDataAccessObject = forgotUserDataAccessObject;
        this.forgotPresenter = forgotPresenter;
    }

    @Override
    public void execute(ForgotInputData forgotinputdata) {
        String username = forgotinputdata.getUsername();
        if(!forgotUserDataAccessObject.existByName(username)){

        }

    }
}
