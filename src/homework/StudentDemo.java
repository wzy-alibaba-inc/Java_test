package homework;

import homework.Student;

public class StudentDemo {
    public static void main(String[] args){
        Student st =new Student();
        Student st1=new Student("tone",18,190);
        st.setName("曹操");
        st.setAge(18);
        st.show();
    }
}
