package di01.reflection;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.BeforeClass;
import org.junit.Test;

import di01.model.Employee;

public class TestEmployee {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void test_Make_instance_with_new() {
        
        di01.model.Employee emp1 = new di01.model.Employee();
        emp1.setName("name");
        emp1.setAddress("emp1 address");
        emp1.setSalary(10000);
        emp1.setRrn("emp1rrn");
        
        assertEquals("emp1 address", emp1.getAddress());
        
        
        di01.model.Employee emp2 = new di01.model.Employee("emp2 name", "emp2 address", 10000, "emp2 rrn");
        
        assertEquals("emp2 address", emp2.getAddress());
        
    }
    @Test
    public void test_Make_instance_with_reflection() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        
        //reflection을 이용하여 인스턴스 만들기
        Class klass = Class.forName("di01.model.Employee");
        Class[] paramTypes = {String.class, String.class, int.class, String.class};

        //매개변수 값 설정
        Object[] objs = { "emp2 name", "emp2 address", 10000, "emp2 rrn" };
        
        //생성자 함수 가져오기
        java.lang.reflect.Constructor cons = klass.getConstructor(paramTypes);
        
        //인스턴스 만들기
        Object instance = cons.newInstance(objs);
        
        //실행해서 결과 출력
        System.out.println(instance.toString());
        assertEquals("emp2 address", ((di01.model.Employee)instance).getAddress());
        
        /*setter를 이용하여 필드 값 바꾸기*/
        Method m = klass.getMethod("setName", String.class);
        
        //매개 변수 값 설정
        Object[] params = {"hello"};
        
        //메서드 호출
        m.invoke(instance, params); //Employee.setName("hello"); 가 실행
        
        //실행해서 결과 출력
        System.out.println(instance.toString());
        
        /*getter를 이용하여 필드값 가져오기*/
        m = klass.getMethod("getName");  // 매개변수가 없어서...
        Object result = m.invoke(instance);
        
        //검증
        assertEquals("hello", result);
        
        
    }
    

}
