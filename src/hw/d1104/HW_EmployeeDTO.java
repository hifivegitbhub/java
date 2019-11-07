package hw.d1104;

public class HW_EmployeeDTO {
	private String no;
	private String name;
	private String addr;

	public HW_EmployeeDTO(String no, String name, String addr) {
		this.no = no;
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HW_EmployeeDTO other = (HW_EmployeeDTO) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return no + "\t" + name + "\t" + addr;
	}
}
