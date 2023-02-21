<?php

// sivitas akademik adalah manusia

class SivitasAkademik extends Human
{
	private $asal_universitas;
	private $email_edu;
	
	public function __construct(){
		parent::__construct();
		$this->asal_universitas = "-";
		$this->email_edu = "-";
	}
	public function setAsal_universitas($asal_universitas){
		$this->asal_universitas = $asal_universitas;
	}
	public function getAsal_universitas(){
		return $this->asal_universitas;
	}
	public function setEmail_edu($email_edu){
		$this->email_edu = $email_edu;
	}
	public function getEmail_edu(){
		return $this->email_edu;
	}
}
?>