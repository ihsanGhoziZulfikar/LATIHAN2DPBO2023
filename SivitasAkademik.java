public class SivitasAkademik extends Human
{
	protected String asal_universitas;
	protected String email_edu;
	
	SivitasAkademik(){
	}
	public void setAsal_universitas(String asal_universitas){
		this.asal_universitas = asal_universitas;
	}
	public String getAsal_universitas(){
		return this.asal_universitas;
	}
	public void setEmail_edu(String email_edu){
		this.email_edu = email_edu;
	}
	public String getEmail_edu(){
		return this.email_edu;
	}
}