// 자바의 Person 클래스와 접근 메서드

class Person {
    // 멤버 필드
    private String name;
    private int age;
    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 게터와 세터
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
