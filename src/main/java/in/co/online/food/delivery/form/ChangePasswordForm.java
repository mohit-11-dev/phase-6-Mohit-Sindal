package in.co.online.food.delivery.form;

import javax.validation.constraints.NotEmpty;

import in.co.online.food.delivery.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangePasswordForm extends BaseForm  {

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@NotEmpty(message = "Old Password is required")
	private String oldPassword;
	
	@NotEmpty(message = "Confirm Password is required")
	private String confirmPassword;
	
	@NotEmpty(message = "New Passeword is required")
	private String newPassword;

	

	@Override
	public BaseDTO getDTO() {
		return null;
	}

	@Override
	public void populate(BaseDTO bDto) {
	}
	
}
