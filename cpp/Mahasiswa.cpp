//Mahasiswa adalah bagian dari sivitas akademik

class Mahasiswa : public SivitasAkademik
{
	private:
		string nim;
		string prodi;
		string fakultas;
	public:
		Mahasiswa(){
			this->nim = "-";
			this->prodi = "-";
			this->fakultas = "-";
		}
		void setNim(string nim){
			this->nim = nim;
		}
		string getNim(){
			return this->nim;
		}
		void setProdi(string prodi){
			this->prodi = prodi;
		}
		string getProdi(){
			return this->prodi;
		}
		void setFakultas(string fakultas){
			this->fakultas = fakultas;
		}
		string getFakultas(){
			return this->fakultas;
		}
};