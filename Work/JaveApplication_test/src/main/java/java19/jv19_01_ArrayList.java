package java19;

import java.util.*;

public class jv19_01_ArrayList {
    
    public static void main(String[] args) {
        
        int pos = 0;
        String value = "";
        
        /* List 선언 */
        List<String> list = null;
        
        list = new ArrayList<>();
        // list = new LinkedList<>();
        // list = new Vector<>();
        // list = new Stack<>();
        
        /*
         * C: 추가. 검색: "자바 arraylist 추가" MILK, BREAD, BUTTER 순으로 추가
         */
        list.add("MILK"); // 0번방
        list.add("BREAD"); // 1번방
        list.add("BUTTER"); // 2번방
        System.out.println("C: 추가 >> " + list);
        
        /*
         * APPLE 삽입. 검색: "자바 arraylist 삽입" 특정 위치에 추가하기 "BREAD" 앞에 "APPLE" 삽입 "BREAD" 가 들어있는 방번호 찾기
         */
        list.add(1, "APPLE");
        System.out.println("C: BREAD 앞에 APPLE 삽입 >> " + list);
        
        /*
         * R: 읽기 BUTTER 값을 출력하시오. "BUTTER" 가 들어있는 방번호 찾기
         */
        value = list.get(3);
        System.out.println("R: 읽기 >> " + value);
        
        /*
         * U: 수정. 검색: "자바 arraylist 수정" "BREAD" 를 "GRAPE"로 변경 "BREAD" 가 들어있는 방번호 찾기
         */
        list.set(2, "GRAPE");
        System.out.println("U: BREAD 를 GRAPE로 수정 >> " + list);
        
        /*
         * D: 인데스로 삭제. 검색: "자바 arraylist 삭제" 인덱스스를 이용하여 BUTTER 를 삭제
         */
        list.remove(3);
        System.out.println("D: BUTTER 를 삭제 >> " + list);
        
        /*
         * D: 값으로 찾아서 삭제. 검색: "자바 arraylist 값으로 삭제" 값으로 MILK를 찾아서 삭제하시오
         */
        list.remove("MILK");
        System.out.println("D: 값으로 MILK를 찾아서 삭제 >> " + list.toString());
        
        /*
         * 리스트를 for문으로 출력하시오. 검색: "자바 arraylist for 출력" 검색: "자바 arraylist 크기"
         */
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i) + " ");
        }
        
        /*
         * 리스트를 for-each문으로 출력하시오.
         */
        for (String string : list) {
            System.out.print(string + ", ");
        }
        System.out.println();
        
        // 테스트용 데이터 생성을 위한 코드. 수정하지 마시오.
        for (int i = 0; i < 4; i++) {
            list.add("APPLE");
            list.add("BANNA");
        }
        
        /*
         * S: 검색: "자바 ArrayList 검색 첫번째 APPLE을 찾으시오. List<String> 선언한 경우 Collections.binarySearch() 오작동.
         */
        pos = list.indexOf("APPLE"); // indexof로 APPLE의 방번호 찾기 ----->처음부터 하나만 찾아줌
        System.out.println("S: 검색>> " + pos); // ----> 0
        
        /*
         * S: 오름차순 정렬. 검색: "자바 ArrayList 오름차순 정렬"
         */
        Collections.sort(list);
        System.out.println("S: 오름차순으로 정렬>> " + list.toString());
        
        /*
         * S: 내림차순 정렬. 검색: "자바 ArrayList 내림차순 정렬"
         */
        Collections.reverse(list);
        System.out.println("S: 내림차순으로 정렬>> " + list.toString());
        
        
        
        
        /*
         * 검색2. APPLE 이 몇개 있나요?
         */
        int count = 0;
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i).equals("APPLE")) {
                count++;
            }
        }
        System.out.println("S: APPLE 개수>> " + count);
        
        
//-------------------------------------------------------------------
        
        
        /*
         * ArrayList 배열로 변환하시오. toArray() 사용 
         * "자바 ArrayList 배열 변환 검색"
         */
        String[] array = list.toArray(new String[list.size()]);
        
//-------------------------------------------------------------------
        
        /*
         * 변환된 배열을 for 문으로 출력.
         */
        System.out.print("P : 변환 결과를 for 문으로 출력 ");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        
//-------------------------------------------------------------------
        
        /*
         * 변환된 배열을 for each 문으로 출력.
         */
        System.out.print("P : 변환 결과를 for each 문으로 출력 : ");
        for (String val : array) {
            System.out.print(val + ", ");
        }
        System.out.println();
        
        
        /*
         * list의 모든 값을 for 문을 사용하여 삭제하시오
         * list.removeall()---------> 전체삭제
         */
        
        list.removeAll(list);
        
        for(int i = list.size()-1;i>=0;i--){
            list.remove(i);
        }
        
        System.out.println("list의 값을 for 문을 사용하여 삭제 >> " + list);
        
        
    }
}
