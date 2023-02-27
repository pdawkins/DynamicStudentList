public class Student {
    // data fields
    private String name;
    private String form;

    public Student(String myName, String myForm){
        name = myName;
        form = myForm;
    }

    public String getName(){return name;}
    public void setName(String newName){name = newName;}

    public String getForm(){return form;}
    public void setForm(String newForm){form = newForm;}

    public String toString(){
        String result = "";
        result += name +", " + form ;
        return  result;
    }
}
