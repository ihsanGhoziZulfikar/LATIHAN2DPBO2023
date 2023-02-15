import java.util.ArrayList;

public class Main
{
	public static void main(String[] args){
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.setNim("2103303");
		mhs1.setNama("Ihsan Ghozi Zulfikar");
		mhs1.setJenis_kelamin('L');
		mhs1.setFakultas("FPMIPA");
		mhs1.setProdi("Ilmu Komputer");
		mhs1.setNik("123456789");
		mhs1.setAsal_universitas("UPI");
		mhs1.setEmail_edu("ihsan@ubi.edu");
		
		System.out.println("Nim : " + mhs1.getNim());
		System.out.println("Nama : " + mhs1.getNama());
		System.out.println("Jenis Kelamin : " + mhs1.getJenis_kelamin());
		System.out.println("Fakultas : " + mhs1.getFakultas());
		System.out.println("Prodi : " + mhs1.getProdi());
		System.out.println("NIK : " + mhs1.getNik());
		System.out.println("Asal Universitas : " + mhs1.getAsal_universitas());
		System.out.println("Email edu : " + mhs1.getEmail_edu());
	}
}