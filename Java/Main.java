//Saya Ihsan Ghozi Zulfikar NIM 2103303 mengerjakan soal Latihan Praktikum 2
//dalam mata kuliah DPBO untuk keberkahanNya maka
//saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args){
		ArrayList<Mahasiswa> listMhs = new ArrayList<>();		//membuat list berisi mahasiswa
		
		Mahasiswa mhs1 = new Mahasiswa();		//inisialisasi mahasiswa pertama
		mhs1.setNim("2103303");					//menambahkan data mahasiswa pertama
		mhs1.setNama("Ihsan Ghozi Zulfikar");
		mhs1.setJenis_kelamin('L');
		mhs1.setFakultas("FPMIPA");
		mhs1.setProdi("Ilmu Komputer");
		mhs1.setNik("123456789");
		mhs1.setAsal_universitas("UPI");
		mhs1.setEmail_edu("ihsan@ubi.edu");
		listMhs.add(mhs1);
		
		Mahasiswa mhs2 = new Mahasiswa();		//inisialisasi mahasiswa kedua
		mhs2.setNim("432123");					//menambahkan data mahasiswa kedua
		mhs2.setNama("Budi Tono");
		mhs2.setJenis_kelamin('L');
		mhs2.setFakultas("FPTK");
		mhs2.setProdi("Ilmu Teknik");
		mhs2.setNik("98761234");
		mhs2.setAsal_universitas("UPI");
		mhs2.setEmail_edu("Budi@umi.edu");
		listMhs.add(mhs2);
		
		for(int i=0;i<listMhs.size();i++){			//print data mahasiswa
			System.out.println("Mahasiswa Ke " + Integer.toString(i+1));
			System.out.println("Nim : " + listMhs.get(i).getNim());
			System.out.println("Nama : " + listMhs.get(i).getNama());
			System.out.println("Jenis Kelamin : " + listMhs.get(i).getJenis_kelamin());
			System.out.println("Fakultas : " + listMhs.get(i).getFakultas());
			System.out.println("Prodi : " + listMhs.get(i).getProdi());
			System.out.println("NIK : " + listMhs.get(i).getNik());
			System.out.println("Asal Universitas : " + listMhs.get(i).getAsal_universitas());
			System.out.println("Email edu : " + listMhs.get(i).getEmail_edu());
			System.out.println();
		}
	}
}