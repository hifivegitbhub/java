package hw.d1104;

import java.util.List;
import hw.d1104.CRUDEmployee;

public class HW_EmployeeCreation implements CRUDEmployee {
	private String successMessage = "사원이 추가되었습니다.";
	private String failureMessage = "사원 추가를 실패하였습니다.";

	@Override
	public String getSuccessMessage() {
		return successMessage;
	}

	@Override
	public String getFailureMessage() {
		return failureMessage;
	}

	@Override
	public boolean manipulate(List<HW_EmployeeDTO> arr) {
		return arr.add(setEmpData());
	}

	public HW_EmployeeDTO setEmpData() {
		return new HW_EmployeeDTO(HW_UserInput.getStrInput("사원번호: "), HW_UserInput.getStrInput("이름: "),
				HW_UserInput.getStrInput("주소: "));
	}
}
