//피자 나눠 먹기 (1)
//문자열 배열 strlist가 매개변수로 주어집니다.
// 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
// 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해
// 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

public class Solution19 {
    public int solution(int n) {
        int answer = 0;
        if(n>=1 && n<=100){
            if(n/7 <=1){
                answer = 1;
            }else if(n%7==0){
                answer= n/7;
            }else{
                answer= n/7 + 1;
            }
        }
        return answer;
    }
}

//class Solution {
//    public int solution(int n) {
//        int answer = (n%7==0) ? n/7 : n/7 + 1;
//
//        return answer;
//    }
//}