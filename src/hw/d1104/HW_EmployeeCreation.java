package hw.d1104;

import java.util.List;
import hw.d1104.CRUDEmployee;

public class HW_EmployeeCreation implements CRUDEmployee {
	private String successMessage = "����� �߰��Ǿ����ϴ�.";
	private String failureMessage = "��� �߰��� �����Ͽ����ϴ�.";

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
		return new HW_EmployeeDTO(HW_UserInput.getStrInput("�����ȣ: "), HW_UserInput.getStrInput("�̸�: "),
				HW_UserInput.getStrInput("�ּ�: "));
	}
}
