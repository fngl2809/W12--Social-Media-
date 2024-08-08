package package1.data;

public class Company {
    private String name;
    public String getName(){
        return this.name;
    }  
public void setName(String name){
    this.name = name;
    }

public class Employee {
    private String name;
public String getName(){
    return this.name;
    }
public void setName(String name){
    this.name = name;
    }  

    public String getCompany(){
        return Company.this.name;
    }

    }
}


