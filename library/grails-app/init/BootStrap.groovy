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

}
    def destroy = {
    }
}
