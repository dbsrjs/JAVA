package blackBox;

public class BlackBox {
    //필드, 메서드, 생성자

    //필드
    String modelName;   //모델명

    String resolution;  //해상도

    int price;  //가격

    String color;   //제품색상

    int serialNumber;

    //static = 클래스 변수
    static boolean canAutoReport = false;  //자동신고기능
    static  int counter = 0;    //시리얼 번호를 생성해주는 역함 (처음에는 0이었다가 ++ 연산자를 통해 값 증가)

    //생성자가 없는 경우에는 자바가 기본 생성자를 생성 및 호출한다.
    //개발자가 생성자를 만든 경우에는 기본 생상저를 자동으로 생성해주지 않는다.
    //생성자 오버로딩 가능하다.

    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price) {
        this(modelName, resolution, price, "블랙");
    }

    BlackBox(String modelName, String resolution, int price, String color) {
        this();

        System.out.println("사용자 저의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            System.out.println("판매자에게 문의하세요.");
        }
        return  resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }
    int getPrice() {
        return  price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    //메서드
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int gitVideoFileCount(int type) {
        if (type ==1) {    //type : 일반영상
            return  9;
        } else if (type == 2) {    //type2 : 이벤트영상(충돌 감지)
            return 2;
        }
        return 11;
    }

    // showDateTime : 날짜정보 표시여부
    // showDateSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }

        System.out.println("영상은" + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스센터(1588-0000)으로 연결합니다.");
        //modelName = "분홍이;
        canAutoReport = true;
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;    //this로 클래스 은스턴스 변수를 가리킬 수 있음.
    }
}
