package use_case.forgotpassword;

public interface ForgotOutputBoundary {
    void prepareSuccessView(ForgotOutputData user);
    void prepareFailView(String error);
}
