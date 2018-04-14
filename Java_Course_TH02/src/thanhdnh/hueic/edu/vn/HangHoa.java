package thanhdnh.hueic.edu.vn;

public class HangHoa {
	private String tenhang;
	private String ngaysanxuat;
	private double dongia;
	private int soluong;

	public String gettenhang() {
		return tenhang;
	}

	public void settenhang(String th) {
		tenhang = th;
	}

	public String getngaysanxuat() {
		return ngaysanxuat;
	}

	public void setngaysanxuat(String nsx) {
		ngaysanxuat = nsx;
	}

	public double getdongia() {
		return dongia;
	}

	public void setdongia(double dg) {
		dongia = dg;
	}

	public int getsoluong() {
		return soluong;
	}

	public void setsoluong(int sl) {
		soluong = sl;
	}

	public double tinhtien() {
		return dongia * soluong;
	}

	public String HangHoa() {
		return"Tên hàng :"+tenhang+"Ngày Sản Xuất"+ngaysanxuat+"Đồng Giá"+dongia+"Số Lượng"+soluong;

	}

	public HangHoa(String th, String nsx, double dg, int sl) {
		tenhang = th;
		ngaysanxuat = nsx;
		dongia = dg;
		soluong = sl;
	}

	public HangHoa() {
		
	}
}
