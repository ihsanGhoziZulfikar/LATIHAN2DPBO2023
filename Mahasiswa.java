public class Mahasiswa extends SivitasAkademik
{
	private String nim;
	private String prodi;
	private String fakultas;
	
	Mahasiswa(){
	}
	public void setNim(String nim){
		this.nim = nim;
	}
	public String getNim(){
		return this.nim;
	}
	public void setProdi(String prodi){
		this.prodi = prodi;
	}
	public String getProdi(){
		return this.prodi;
	}
	public void setFakultas(String fakultas){
		this.fakultas = fakultas;
	}
	public String getFakultas(){
		return this.fakultas;
	}
}