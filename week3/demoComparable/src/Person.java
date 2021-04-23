public class Person implements Comparable<Person>{
    private int age;
    private String name;
    public Person(){

    }
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        //sắp xếp theo số
        if(this.getAge()> o.getAge()) return 1;
        else if(this.getAge() == o.getAge()) return 0;
        else return -1;


        // sắp xêm theo chữ cái
//        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
