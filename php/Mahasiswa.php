<?php

//Mahasiswa adalah bagian dari sivitas akademik

class Mahasiswa extends SivitasAkademik
{
	private $nim;
	private $prodi;
	private $fakultas;
	
	public function __construct(){
		parent::__construct();
		$this->nim = "-";
		$this->prodi = "-";
		$this->fakultas = "-";
	}
	public function setNim($nim){
		$this->nim = $nim;
	}
	public function getNim(){
		return $this->nim;
	}
	public function setProdi($prodi){
		$this->prodi = $prodi;
	}
	public function getProdi(){
		return $this->prodi;
	}
	public function setFakultas($fakultas){
		$this->fakultas = $fakultas;
	}
	public function getFakultas(){
		return $this->fakultas;
	}
}

?>