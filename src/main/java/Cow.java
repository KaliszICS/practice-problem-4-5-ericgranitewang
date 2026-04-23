/**
 * class about cow
 * @author Eric Wang
 */
public class Cow {
    private String name;
    private int age;
    private double weight;
    /**
     * create cow
     * @param name String name of cow
     * @param age int age of cow
     * @param weight double weight of cow
     */
    public Cow (String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    /**
     * gets name
     * @return returns String name
     */
    public String getName () {
        return name;
    }
    /**
     * gets age
     * @return returns int age
     */
    public int getAge () {
        return age;
    }
    /**
     * gets weight
     * @return returns int weight
     */
    public double getWeight () {
        return weight;
    }
    /**
     * converts student object to string
     * @return returns in format "name, age - weight"
     */
    @Override
    public String toString () {
        return name + ", " + age + " - " + weight;
    }
    /**
     * compares two Cows
     * returns false if object isn't a cow
     * @return returns true if name string and age are all the same, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass()!=obj.getClass()) {
            return false;
        }
        Cow a = (Cow)obj;
        return ((age == a.getAge()) && (name.equals(a.getName()))) && weight == a.getWeight();
    }


}