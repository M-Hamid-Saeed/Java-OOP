

public class Employee {
    private int id;
    private String name;
    private date hireDate;
    private date birthDate;
    

    public Employee(int id, String name,date hireDate,date birthDate){
        setBirthDate(birthDate);
        setHireDate(hireDate);

        setId(id);
        setName(name);
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        if(id>0)
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Date return the hireDate
     */
    public date getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * @return Date return the birthDate
     */
    public date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(date birthDate) {
        this.birthDate = birthDate;
    }
    
    public String toString(){
        return String.format("ID :- %d%nName:- %s%nHire Date :%s%nBirthDate : %s%n",getId(),getName(),getHireDate(),getBirthDate());
    }

}
