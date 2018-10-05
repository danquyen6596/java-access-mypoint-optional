package vn.codegym.QuyenLeSy;

public class MyPointMain {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint();
        MyPoint myPoint1 = new MyPoint(10, 30.5);

        System.out.println("Khoảng các tọa độ 1:{" + myPoint.getX()+", "+myPoint.getY()+"} là: "+myPoint.distance());
        System.out.println("Khoảng các tọa độ 2:{" + myPoint1.getX()+", "+myPoint1.getY()+"} là: "+myPoint1.distance());
    }
}
