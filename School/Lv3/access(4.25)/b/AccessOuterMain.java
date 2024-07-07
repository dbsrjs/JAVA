package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public
        data.publicField = 1;
        data.publicMethod();

        //default - 다른 패캐지 이므로 호출 불가
        //data.defaultField = 2;
        //data.defaultMethod();

        //private - 다른 클래스에서 호출 불가
        //data.privateField = 1;
        //data.privateMethod();

        data.innerAccess();
    }
}
