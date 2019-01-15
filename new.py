class Student:
    admno=0
    name=""
    marksEng=0.0
    marksMath=0.0
    marksSci=0.0
    def __init__(self):#,admno,marksEng,marksmath,marksSci):
        pass
    def read(self,admno,name,marksEng,marksMath,marksSci):
        self.admno=admno
        self.name=name
        self.marksEng=marksEng
        self.marksMath=marksMath
        self.marksSci=marksSci
        
        
    def compute(self):
        print(self.marksEng+self.marksMath+self.marksSci)
        
    def showData(self): 
        print("admno" + str(self.admno) +
         "name " + str(self.name) +
         "marks "+ str(self.marksEng) +
         "marks Math " + str(self.marksMath) +
         "marks Science " + str(self.marksSci))
         
student1=Student()
student1.read(1,"jay",10,20,120)
student1.compute()
student1.showData()
