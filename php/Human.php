<?php

class Human
{
	private $nama;
	private $nik;
	private $jenis_kelamin;
	
	public function __construct(){
		$this->nama = "-";
		$this->nik = "-";
		$this->jenis_kelamin = '-';
	}
	public function setNama($nama){
		$this->nama = $nama;
	}
	public function getNama(){
		return $this->nama;
	}
	public function setNik($nik){
		$this->nik = $nik;
	}
	public function getNik(){
		return $this->nik;
	}
	public function setJenis_kelamin($jenis_kelamin){
		$this->jenis_kelamin = $jenis_kelamin;
	}
	public function getJenis_kelamin(){
		return $this->jenis_kelamin;
	}
}
?>