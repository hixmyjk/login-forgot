package interface_adapter.forgotpassword;

import interface_adapter.ViewModel;
import interface_adapter.login.LoginState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ForgotPasswordViewModel extends ViewModel {
    public final String TITLE_LABEL = "Change Password View";
    public final String USERNAME_LABEL = "Enter new password";
    public final String PASSWORD_LABEL = "Repeat new password";

    public static final String FORGOTPASSWORD_BUTTON_LABEL = "Enter new password";
    public static final String REENTER_LABEL = "Repeat your new password";

    public static final String DONE_BUTTON_LABEL = "Done";

    public static final String CANCEL_BUTTON_LABEL = "Cancel";

    private ForgotPasswordState state = new ForgotPasswordState();

    public ForgotPasswordViewModel() {
        super("for got password");
    }

    public void setState(ForgotPasswordState state) {
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    @Override
    public void firePropertyChanged() {
            support.firePropertyChange("state", null, this.state);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ForgotPasswordState getState() { return state; }
}
