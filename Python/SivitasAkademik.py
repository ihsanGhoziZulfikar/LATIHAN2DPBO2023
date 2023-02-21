# sivitas akademik adalah manusia

from Human import Human

class SivitasAkademik(Human):
    def __init__(self, __asal_universitas="-", __email_edu="-"):
        super().__init__()
        self.__asal_universitas = __asal_universitas
        self.__email_edu = __email_edu
    
    def setAsal_universitas(self, asal_universitas):
        self.__asal_universitas = asal_universitas

    def getAsal_universitas(self):
        return self.__asal_universitas

    def setEmail_edu(self, email_edu):
        self.__email_edu = email_edu

    def getEmail_edu(self):
        return self.__email_edu
	