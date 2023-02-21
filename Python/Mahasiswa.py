# Mahasiswa adalah bagian dari sivitas akademik

from SivitasAkademik import SivitasAkademik

class Mahasiswa(SivitasAkademik):
    def __init__(self, nim="-", prodi="-", fakultas="-"):
        super().__init__()      # memanggil constructor parent nya
        self.__nim = nim
        self.__prodi = prodi
        self.__fakultas = fakultas

    def setNim(self, nim):
        self.__nim = nim

    def getNim(self):
        return self.__nim
	
    def setProdi(self, prodi):
        self.__prodi = prodi
	
    def getProdi(self):
        return self.__prodi
	
    def setFakultas(self, fakultas):
        self.__fakultas = fakultas
	
    def getFakultas(self):
        return self.__fakultas
	