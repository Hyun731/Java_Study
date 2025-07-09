package src.variable;

public class var4 {
    public static void main(String[] args){
        byte  b = 127; // -128 ~ 127
        short s = 32767; //-32768 ~ 32767
        int i = 2147483647; //-2147483648 ~ 2147483647
        long l = 9223372036854775807L; //-9223372036854775808 ~ 9223372036854775807

        //실수
        float f = 3.14f;
        double d = 3.14;

        //그외
        boolean bool = true;
        char c = 'a';
        String str = "abc"; //-> 참고로 문자열 형태여도 문자 하나만 저장 할 수 있음 아래처럼
        String str1 = "a"; //-> 또한 C처럼 ''(문자)와 ""(문자열)은 다름
        //변수의 명은 낙타 표기법을 이용하여 많이 표기한다 -> myAccount
        //자바에서는 클래스는 대문자 시작, 나머지는 소문자로 시작한다.
        //예외 적으로 상수 모두 대문자를 사용하고 언더바로 구분한다.
        //패키지는 모두 소문자를 사용한다

    }
}
