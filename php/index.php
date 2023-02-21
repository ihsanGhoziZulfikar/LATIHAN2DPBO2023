<?php

// Saya Ihsan Ghozi Zulfikar NIM 2103303 mengerjakan soal Latihan Praktikum 2
// dalam mata kuliah DPBO untuk keberkahanNya maka
// saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

require('Human.php');
require('SivitasAkademik.php');
require('Mahasiswa.php');

$listMhs = array();
$mhs1 = new Mahasiswa();
$mhs1->setNim("2103303");					//menambahkan data mahasiswa pertama
$mhs1->setNama("Ihsan Ghozi Zulfikar");
$mhs1->setJenis_kelamin('L');
$mhs1->setFakultas("FPMIPA");
$mhs1->setProdi("Ilmu Komputer");
$mhs1->setNik("123456789");
$mhs1->setAsal_universitas("UPI");
$mhs1->setEmail_edu("ihsan@ubi.edu");
$listMhs[]=$mhs1;

$mhs2 = new Mahasiswa();
$mhs2->setNim("432123");					//menambahkan data mahasiswa kedua
$mhs2->setNama("Budi Tono");
// $mhs2->setJenis_kelamin('L');
$mhs2->setFakultas("FPTK");
$mhs2->setProdi("Ilmu Teknik");
$mhs2->setNik("98761234");
$mhs2->setAsal_universitas("UPI");
$mhs2->setEmail_edu("Budi@umi.edu");
$listMhs[] = $mhs2;

echo "<table border = '1'>";
echo "<tr>";
echo "<td> NIM </td>";
echo "<td> Nama </td>";
echo "<td> Jenis Kelamin </td>";
echo "<td> Fakultas </td>";
echo "<td> Prodi </td>";
echo "<td> NIK </td>";
echo "<td> Asal Universitas </td>";
echo "<td> Email Edu </td>";
echo "</tr>";

foreach ($listMhs as $mahasiswa) {
	echo "<tr>";
	echo "<td>" .  $mahasiswa->getNim() . "</td>";
	echo "<td>" .  $mahasiswa->getNama() . "</td>";
	echo "<td>" .  $mahasiswa->getJenis_kelamin() . "</td>";
	echo "<td>" .  $mahasiswa->getFakultas() . "</td>";
	echo "<td>" .  $mahasiswa->getProdi() . "</td>";
	echo "<td>" .  $mahasiswa->getNik() . "</td>";
	echo "<td>" .  $mahasiswa->getAsal_universitas() . "</td>";
	echo "<td>" .  $mahasiswa->getEmail_edu() . "</td>";
	echo "</tr>";
}
echo "</table>";

?>