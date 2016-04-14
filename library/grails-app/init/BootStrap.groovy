import com.library.*

class BootStrap {

    def init = { servletContext ->

def course1= new Course(title:'Interactive Media with Animation',
code:'IMA101',
department:'Computing',
tutor:'Emily Ledger',
description:'This course is fantastic for students wants to going into media production').save()
  

def course2= new Course(title:'Web Systems Design',
code:'WSD101',
department:'Computing',
tutor:'Will Smith',
description:'This course is fantastic for students wants to going into website design').save()

def book1=new Book(title:'How to play Football',
author:'Elliot Basford',
isbn:'A101',
student:'Chloe Acland',
dateBorrowed: new Date('14/04/2016'),
returnDate: new Date('20/04/2016')).save()

def book2=new Book(title:'How to code C#',
author:'Elliot Manson',
isbn:'A102',
student:'Oli Jones',
dateBorrowed: new Date('14/04/2016'),
returnDate: new Date('22/04/2016')).save()

def student1=new Student(name:'Oli Jones',
studentid:'OJ101',
email:'O.Jones@gmail.com',
course:'Aircraft Engineering').save()

def student2=new Student(name:'Chloe Northedge',
studentid:'CN101',
email:'C.Northedge@gmail.com',
course:'Hair and Beauty').save()

def library1=new Library(location:'City Campus',
openingHours:'24hours',
librarian:'Mrs Taylor Jones',
book:'Hair and Beauty',
student:'Chloe Acland').save()

def library2=new Library(location:'Collegiate Campus',
openingHours:'24hours',
librarian:'Mrs Angela Price',
book:'How to code c#',
student:'Oli Jones').save()
}
    def destroy = {
    }
}
