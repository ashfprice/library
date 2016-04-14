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


}
    def destroy = {
    }
}
