package thanhdnh.hueic.edu.vn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainProgram {
	public static void main(String[] args) throws IOException {
		String tt = new String();
		HangHoa hh = new HangHoa();
		KhachHang kh = new KhachHang();
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Mời nhập Username : ");
		String usr = buff.readLine();
		System.out.println("Mời nhập Password : ");
		String pass = buff.readLine();
		
		if (usr.equals(kh.getUsername()) && pass.equals(kh.getPassword())) {
			int x;
			do {
				System.out.println("Bạn có muốn mua hàng không ? ");
				System.out.println("1 . Có");
				System.out.println("2 . Không");
				x = Integer.parseInt(buff.readLine());
				if(x == 2) {
					break;
				}
				HangHoa haH = new HangHoa();
				System.out.println("Nhập tên hàng : ");
				String th = buff.readLine();
				System.out.println("Nhập ngày sản xuất : ");
				String nsx = buff.readLine();
				System.out.println("Nhập đơn giá : ");
				double dg = Double.parseDouble(buff.readLine());
				System.out.println("Nhập số lượng : ");
				int sl = Integer.parseInt(buff.readLine());				
			} while (true);			
		}

	}
}