package java20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class User {
    String name;
    Integer number;
    boolean ischeck;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public boolean isIscheck() {
        return ischeck;
    }
    public void setIscheck(boolean ischeck) {
        this.ischeck = ischeck;
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", number=" + number + ", ischeck=" + ischeck + "]"+"\n";
    }
    public User(String name, Integer number, boolean ischeck) {
        super();
        this.name = name;
        this.number = number;
        this.ischeck = ischeck;
    }
    public User() {
        super();
    }
    
    public static class MtPredicateContains implements Predicate{

        private String fieldName;
        private Object expected;
        
        public MtPredicateContains(String fieldName, Object expected) {
            super();
            this.fieldName = fieldName;
            this.expected = expected;
        }

        @Override
        public boolean evaluate(Object object) {
            if( fieldName.equals("name")){
                return((User)object).getName().contains(expected.toString());
                
            } else if( fieldName.equals("number")){
                return((User)object).getNumber().equals(expected);
                
            }else if( fieldName.equals("ischeck")){
                return((User)object).getIscheck().equals(expected);
                
            }
            
            return false;
        }
        
    }

    public Object getIscheck() {
        // TODO Auto-generated method stub
        return null;
    }
}

public class java20_15_Search {
    
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("User Name A", 1, true));
        users.add(new User("User Name B", 2, false));
        users.add(new User("Other User", 3, true));
        
        System.out.println("equal searching");
        List<User> result = users.stream().filter(e->e.getName().equals("User Name B")).collect(Collectors.toList());
        System.out.println(result.toString());
        
        System.out.println("contains searching");
        result = users.stream().filter(e->e.getName().contains("Na")).collect(Collectors.toList());
        System.out.println(result.toString());
        
        User.MtPredicateContains predicate = new User.MtPredicateContains("name", "Other");
        result = (List<User>) CollectionUtils.select(users, predicate);
        System.out.println(result.toString());

    }
}
