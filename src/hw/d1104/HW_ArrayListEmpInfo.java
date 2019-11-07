package hw.d1104;

import java.util.ArrayList;
import java.util.List;
import hw.d1104.CRUDEmployee;

public class HW_ArrayListEmpInfo {
	private List<HW_EmployeeDTO> arr;

	public HW_ArrayListEmpInfo(List<HW_EmployeeDTO> arr) {
		this.arr = arr;
	}

	public void start() {
		String userIn = "";
		boolean run = true;
		System.out.println("������� �Է� ���α׷� �Դϴ�.\n");

		while (run) {
			System.out.println("�޴��� ������ �ּ���.");
			userIn = HW_UserInput.getStrInput("1. ������� �Է�\n2. ��ü��� ���\n3. �̸� �˻�\n4. �ּ� �˻�\n5. ����\n");
			switch (userIn) {
			case "1":
				crudEmployee(new HW_EmployeeCreation());
				break;
			case "2":
				printAllEmployee();
				break;
			case "3":
				search(new HW_NameSearch());
				break;
			case "4":
				search(new HW_AddressSearch());
				break;
			case "5":
				System.out.println("�̿��� �ּż� �����մϴ�.");
				run = false;
				break;
			default:
				System.err.println("1~5 �߿� ���� �� �ּ���.");
			}
		}
	}

	public void crudEmployee(CRUDEmployee service) {
		while (true) {
			System.out.println("���� ������ �Է��� �ּ���.");

			if (service.manipulate(arr)) {
				System.out.println(service.getSuccessMessage());
			} else {
				System.out.println(service.getFailureMessage());
			}

			if (!continueEntering("��� �Է��Ͻðڽ��ϱ�? (y/n): ")) {
				break;
			}
		}
	}

	public void search(HW_Search service) {
		String userIn = null;
		ArrayList<HW_EmployeeDTO> resultArr = new ArrayList<>();

		while (true) {
			userIn = HW_UserInput.getStrInput("ã�� " + service.getMessage() + "�� �Է��Ͻÿ�: ");
			System.out.println("===" + service.getMessage() + " " + userIn + "===");

			resultArr = service.search(arr, userIn);
			if (resultArr.size() <= 0) {
				System.err.println("ã���ô� " + service.getMessage() + "�� �����ϴ�.");
			} else {
				for (HW_EmployeeDTO dto : resultArr) {
					System.out.println(dto);
				}
			}

			if (!continueEntering("��� �˻��Ͻðڽ��ϱ�? (y/n): ")) {
				break;
			}
		}
	}

	public boolean continueEntering(String message) {
		boolean result = false;
		String yesNo = null;

		while (true) {
			yesNo = HW_UserInput.getStrInput(message);
			if ("n".equalsIgnoreCase(yesNo)) {
				break;
			} else if ("y".equalsIgnoreCase(yesNo)) {
				result = true;
				break;
			} else {
				System.err.println("y �Ǵ� n�� �Է����ּ���.");
			}
		}
		return result;
	}

	public void printAllEmployee() {
		if (arr.size() <= 0) {
			System.out.println("����� ������ �����ϴ�.");
		} else {
			System.err.println("��ü ��� �����Դϴ�.");
			for (HW_EmployeeDTO e : arr) {
				System.out.println(e);
			}
			System.out.println();
		}
	}
}