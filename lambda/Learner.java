/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author pshastri
 */
public class Learner {
    int age;
    String Name;
    float Marks;
    String Location;

    public Learner(int age, String Name, float Marks, String Location) {
        this.age = age;
        this.Name = Name;
        this.Marks = Marks;
        this.Location = Location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getMarks() {
        return Marks;
    }

    public void setMarks(float Marks) {
        this.Marks = Marks;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public String toString() {
        return "Learner{" + "age=" + age + ", Name=" + Name + ", Marks=" + Marks + ", Location=" + Location + '}';
    }

 
    
}
