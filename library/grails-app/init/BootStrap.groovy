import com.library.*

class BootStrap {

    def init = { servletContext ->

def course1= new Course(title:'Aircraft Engineering',
code:'AE101',
department:'Engineering',
tutor:'Emily Ledger',
description:'Studying the inner works of aircraft of all sizes').save()
  
def course2= new Course(title:'Hair and Beauty',
code:'HH101',
department:'Hair and Beauty',
tutor:'James Lorrigan',
description:'Studying how to become a hair dresser/stylist').save()

def course3= new Course(title:'Law',
code:'LW101',
department:'Law & Criminology',
tutor:'Will Smith',
description:'Studying all the different practices of law').save()

def book1=new Book(title:'Hair and Beauty tips/tricks',
author:'Chloe Acland',
isbn:'HBTT101',
student:'student2',
dateBorrowed: new Date('14/04/2016'),
returnDate: new Date('20/04/2016')).save()

def book2=new Book(title:'Aircraft Engineering for dummies ',
author:'George Mcdermott',
isbn:'AFE101',
student:'student1',
dateBorrowed: new Date('14/04/2016'),
returnDate: new Date('22/04/2016')).save()

def book3=new Book(title:'How to train as a lawyer',
author:'Gemma Whitehead',
isbn:'LAW102',
student:'student3',
dateBorrowed: new Date('14/04/2016'),
returnDate: new Date('26/04/2016')).save()

def student1=new Student(name:'Oli Jones',
studentid:'OJ101',
email:'O.Jones@gmail.com',
course:'course1').save()

def student2=new Student(name:'Chloe Northedge',
studentid:'CHN101',
email:'C.Northedge@gmail.com',
course:'course2').save()

def student3=new Student(name:'Hannah Gates',
studentid:'HHG101',
email:'H.Gates@gmail.com',
course:'course3').save()

def library1=new Library(location:'City Library',
openingHours:'24hours',
librarian:'librarian1',
book:'book1',
student:'student2').save()

def library2=new Library(location:'Collegiate Library',
openingHours:'24hours',
librarian:'librarian3',
book:'book3',
student:'student3').save()

def library3=new Library(location:'Sheffield Library',
openingHours:'24hours',
librarian:'librarian2',
book:'book2',
student:'student1').save()

def librarian1=new Librarian(userName:'jhillier',
password:'sam',
name:'Jane Hillier',
email:'J.Hillier@gmail.com',
telephone:'07463653109').save()

def librarian2=new Librarian(userName:'alprice',
password:'aka',
name:'Angela Price',
email:'A.Price@gmail.com',
telephone:'07413654091').save()

def librarian3=new Librarian(userName:'jlnation',
password:'JJJ',
name:'Jodi Nation',
email:'J.Nation@gmail.com',
telephone:'07413654010').save()
}
    def destroy = {
    }
}
