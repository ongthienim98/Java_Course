package thanhdnh.hueic.edu.vn;

import java.util.Scanner;

public class KhachHang {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		password = password;
	}
	
	public void MuaHang(String th , String nsx , double dg , int sl) {
		HangHoa hh = new HangHoa();
		hh.settenhang(th);
		hh.setngaysanxuat(nsx);
		hh.setdongia(dg);
		hh.setsoluong(sl);
		hh.tinhtien();
	}
}
