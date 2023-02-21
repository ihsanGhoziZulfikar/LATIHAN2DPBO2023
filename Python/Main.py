# Saya Ihsan Ghozi Zulfikar NIM 2103303 mengerjakan soal Latihan Praktikum 2
# dalam mata kuliah DPBO untuk keberkahanNya maka
# saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

# from Human import Human
# from SivitasAkademik import SivitasAkademik
from Mahasiswa import Mahasiswa

listMhs = []

mhs1 = Mahasiswa()
mhs1.setNim("2103303")	
mhs1.setNama("Ihsan Ghozi Zulfikar")
mhs1.setJenis_kelamin('L')
mhs1.setFakultas("FPMIPA")
mhs1.setProdi("Ilmu Komputer")
mhs1.setNik("123456789")
mhs1.setAsal_universitas("UPI")
mhs1.setEmail_edu("ihsan@ubi.edu")
listMhs.append(mhs1);

mhs2 = Mahasiswa()
mhs2.setNim("432123")
mhs2.setNama("Budi Python")
mhs2.setJenis_kelamin('L')
mhs2.setFakultas("FPTK")
# mhs2.setProdi("Ilmu Teknik")
mhs2.setNik("98761234")
mhs2.setAsal_universitas("UPI")
mhs2.setEmail_edu("Budi@umi.edu")
listMhs.append(mhs2)

for i in range(len(listMhs)):
    print("====== Mahasiswa " + str(i+1) + " ======")
    print("NIM              : " + listMhs[i].getNim())
    print("Nama             : " + listMhs[i].getNama())
    print("Jenis Kelamin    : " + listMhs[i].getJenis_kelamin())
    print("Fakultas         : " + listMhs[i].getFakultas())
    print("Prodi            : " + listMhs[i].getProdi())
    print("NIK              : " + listMhs[i].getNik())
    print("Asal Universitas : " + listMhs[i].getAsal_universitas())
    print("Email Edu        : " + listMhs[i].getEmail_edu())
    print()