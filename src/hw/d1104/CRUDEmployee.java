package hw.d1104;

import java.util.List;

public interface CRUDEmployee {
	String getSuccessMessage();
	String getFailureMessage();
	boolean manipulate(List<HW_EmployeeDTO> arr);

}
