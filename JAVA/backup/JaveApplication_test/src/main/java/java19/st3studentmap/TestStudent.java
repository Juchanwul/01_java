package java19.st3studentmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestStudent {
    
    public static void main(String[] args) {
        
        // HashMap 인스턴스 생성
        HashMap<String, Student> map = new HashMap<>();
        
        // map에 추가
        // key --------> (이름, 학번)
        // 170101 --------> new Student(구준표, 170101)
        // 170102 --------> new Student(금잔디, 170102)
        // 170103 --------> new Student(윤지후, 170103)
        
        // Student s1 = new Student(170101, "구준표");
        // Student s2 = new Student(170102, "금잔디");
        // Student s3 = new Student(170103, "윤지후");
        // map.put("170101", s1);
        // map.put("170102", s2);
        // map.put("170103", s3);
        map.put("170101", new Student(170101, "구준표"));
        map.put("170102", new Student(170102, "금잔디"));
        map.put("170103", new Student(170103, "윤지후"));
        
        // entrySet과 foreach map 에 항목출력
        
        printMap(map); // 중복하는 코딩는 메서드로 넣는다
        
        // 학번 170102를 삭제.
        
        map.remove("170103");
        
        // 윤지후가 "윤후"로 개명
        // s3.setName("윤후");
        int key = 0;
        for (Student s : map.values()) {
            if (s.getName().equals("윤지후")) {
                key = s.getNumber();
                break;
            }
        }
        map.put(String.valueOf(key), new Student(170103, "윤후"));
        // == map.put("170102", new Student(170103, "윤후"));
        printMap(map);
        
    }
    
    public static void printMap(HashMap<String, Student> map) {
        System.out.println("학생 목록 출력 >> ");
        for (Entry<String, Student> elem : map.entrySet()) {
            int no = elem.getValue().getNumber();
            String name = elem.getValue().getName();
            System.out.format("학번 : %6d, 이름 : %3s", no, name);
            System.out.println();
        }
        
    }
    
}
