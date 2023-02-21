//Saya Ihsan Ghozi Zulfikar NIM 2103303 mengerjakan soal Latihan Praktikum 2
//dalam mata kuliah DPBO untuk keberkahanNya maka
//saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

#include <bits/stdc++.h>
using namespace std;
#include "Human.cpp"
#include "SivitasAkademik.cpp"
#include "Mahasiswa.cpp"

int main(){
	vector<Mahasiswa> listMhs;
	Mahasiswa mhs1;
	mhs1.setNim("2103303");					//menambahkan data mahasiswa pertama
	mhs1.setNama("Ihsan Ghozi Zulfikar");
	mhs1.setJenis_kelamin('L');
	mhs1.setFakultas("FPMIPA");
	mhs1.setProdi("Ilmu Komputer");
	mhs1.setNik("123456789");
	mhs1.setAsal_universitas("UPI");
	mhs1.setEmail_edu("ihsan@ubi.edu");
	listMhs.push_back(mhs1);
	
	Mahasiswa mhs2;
	mhs2.setNim("432123");					//menambahkan data mahasiswa kedua
	mhs2.setNama("Budi cpp");
	mhs2.setJenis_kelamin('L');
	mhs2.setFakultas("FPTK");
	mhs2.setProdi("Ilmu Teknik");
	mhs2.setNik("98761234");
	// mhs2.setAsal_universitas("UPI");
	mhs2.setEmail_edu("Budi@umi.edu");
	listMhs.push_back(mhs2);
	
	for(int i=0; i<listMhs.size(); i++){
		cout << "====== Mahasiswa " << i+1 << " ======" << endl;
		cout << "NIM              : " << listMhs.at(i).getNim() << endl;
		cout << "Nama             : " << listMhs.at(i).getNama() << endl;
		cout << "Jenis_kelamin    : " << listMhs.at(i).getJenis_kelamin() << endl;
		cout << "Fakultas         : " << listMhs.at(i).getFakultas() << endl;
		cout << "Prodi            : " << listMhs.at(i).getProdi() << endl;
		cout << "NIK              : " << listMhs.at(i).getNik() << endl;
		cout << "Asal Universitas : " << listMhs.at(i).getAsal_universitas() << endl;
		cout << "Email Edu        : " << listMhs.at(i).getEmail_edu() << endl;
		cout << endl << endl;
	}
	
	
	return 0;
}