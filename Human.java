public class Human
{
	private String nik;
	private String nama;
	private char jenis_kelamin;
	
	public Human(){
	}
	
	public String getNik(){
		return this.nik;
	}
	public void setNik(String nik){
		this.nik = nik;
	}
	public String getNama(){
		return this.nama;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public char getJenis_kelamin(){
		return this.jenis_kelamin;
	}
	public void setJenis_kelamin(char jenis_kelamin){
		this.jenis_kelamin = jenis_kelamin;
	}
}
