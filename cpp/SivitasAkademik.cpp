// sivitas akademik adalah manusia

class SivitasAkademik : public Human
{
	private:
		string asal_universitas;
		string email_edu;
	public:
		SivitasAkademik(){
			this->asal_universitas = "-";
			this->email_edu = "-";
		}
		void setAsal_universitas(string asal_universitas){
			this->asal_universitas = asal_universitas;
		}
		string getAsal_universitas(){
			return this->asal_universitas;
		}
		void setEmail_edu(string email_edu){
			this->email_edu = email_edu;
		}
		string getEmail_edu(){
			return this->email_edu;
		}
};