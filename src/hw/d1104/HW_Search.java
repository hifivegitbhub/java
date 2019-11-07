package hw.d1104;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

interface HW_Search {
	ArrayList<HW_EmployeeDTO> search(List<HW_EmployeeDTO> dtoArr, String userIn);
	String getMessage();
}
