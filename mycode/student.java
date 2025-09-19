public class student {
    private String name;
    private int id;

    public student(){}
    public student(String name,int id){
        this.name=name;
        this.id=id;

    }
    public String getname(){
        return name;
    }

    public int getid(){
        return id;
    }

    public void setname(String name){
        this.name=name;
    }
    public void setid(int id){
        this.id=id;
    }

    public void print(){
        System.out.println("Name: "+name+", Id: "+id);
    }

}
