package use_case.forgotpassword;

public class ForgotOutputData {
    private final String username;
    private boolean useCaseFailed;

    public ForgotOutputData(String username, boolean useCaseFailed) {
        this.username = username;
        this.useCaseFailed = useCaseFailed;
    }

    public String getUsername() {
        return username;
    }
}
