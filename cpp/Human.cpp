class Human
{
	private:
		string nama;
		string nik;
		char jenis_kelamin;
	public:
		Human(){		// set nilai atribut default
			this->nama = "-";
			this->nik = "-";
			this->jenis_kelamin = '-';
		}
		void setNama(string nama){
			this->nama = nama;
		}
		string getNama(){
			return this->nama;
		}
		void setNik(string nik){
			this->nik = nik;
		}
		string getNik(){
			return this->nik;
		}
		void setJenis_kelamin(char jenis_kelamin){
			this->jenis_kelamin = jenis_kelamin;
		}
		char getJenis_kelamin(){
			return this->jenis_kelamin;
		}
};