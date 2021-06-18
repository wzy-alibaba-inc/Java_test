package test;

public class teacher {


    private Object name;
    private int age;

    public teacher(String 张三, int i) {
    }

    public void Teacher(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return (String) name;
        }

        public void setAge(int age) {
            if (age > 18 && age <= 56) {
                this.age = age;
            } else {
                System.out.println("输入的年龄不合法");
            }
        }

        public int getAge() {
            return age;
        }


        public String toString() {
            return "Teacher{" + "name'=" + name + '\'' + ",age=" + age + '}';
        }


    }

