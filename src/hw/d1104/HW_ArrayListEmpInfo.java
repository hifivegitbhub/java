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
		System.out.println("사원정보 입력 프로그램 입니다.\n");

		while (run) {
			System.out.println("메뉴를 선택해 주세요.");
			userIn = HW_UserInput.getStrInput("1. 사원정보 입력\n2. 전체사원 출력\n3. 이름 검색\n4. 주소 검색\n5. 종료\n");
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
				System.out.println("이용해 주셔서 감사합니다.");
				run = false;
				break;
			default:
				System.err.println("1~5 중에 선택 해 주세요.");
			}
		}
	}

	public void crudEmployee(CRUDEmployee service) {
		while (true) {
			System.out.println("다음 정보를 입력해 주세요.");

			if (service.manipulate(arr)) {
				System.out.println(service.getSuccessMessage());
			} else {
				System.out.println(service.getFailureMessage());
			}

			if (!continueEntering("계속 입력하시겠습니까? (y/n): ")) {
				break;
			}
		}
	}

	public void search(HW_Search service) {
		String userIn = null;
		ArrayList<HW_EmployeeDTO> resultArr = new ArrayList<>();

		while (true) {
			userIn = HW_UserInput.getStrInput("찾는 " + service.getMessage() + "을 입력하시오: ");
			System.out.println("===" + service.getMessage() + " " + userIn + "===");

			resultArr = service.search(arr, userIn);
			if (resultArr.size() <= 0) {
				System.err.println("찾으시는 " + service.getMessage() + "이 없습니다.");
			} else {
				for (HW_EmployeeDTO dto : resultArr) {
					System.out.println(dto);
				}
			}

			if (!continueEntering("계속 검색하시겠습니까? (y/n): ")) {
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
				System.err.println("y 또는 n을 입력해주세요.");
			}
		}
		return result;
	}

	public void printAllEmployee() {
		if (arr.size() <= 0) {
			System.out.println("출력할 내용이 없습니다.");
		} else {
			System.err.println("전체 사원 정보입니다.");
			for (HW_EmployeeDTO e : arr) {
				System.out.println(e);
			}
			System.out.println();
		}
	}
}