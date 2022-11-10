public class Dancer extends Person{
    private String groupName;
    private String dancing;

        public Dancer(String name, String designation,String groupName, String dancing) {
        super(name, designation);
        this.groupName=groupName;
        this.dancing=dancing;
    }

    public String getGroupName() {
        return groupName;

    }
    public void Music(){

        System.out.println(getName()+" is dancer");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                ", dancing='" + dancing + '\'' +
                '}'+super.toString();
    }
}


