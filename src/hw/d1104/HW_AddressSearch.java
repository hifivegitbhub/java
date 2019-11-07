package hw.d1104;

import java.util.ArrayList;
import java.util.List;

public class HW_AddressSearch implements HW_Search{
	private final String message = "Áö¿ª"; 
	
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public ArrayList<HW_EmployeeDTO> search(List<HW_EmployeeDTO> dtoArr, String userIn) {
		ArrayList<HW_EmployeeDTO> resultArr = new ArrayList<>();
		HW_EmployeeDTO dto = null;
		for (int i = 0; i < dtoArr.size(); i++) {
			dto = dtoArr.get(i);
			if (dto.getAddr().equals(userIn)) {
				resultArr.add(dto);
			}
		}
		return resultArr;
	}
}
