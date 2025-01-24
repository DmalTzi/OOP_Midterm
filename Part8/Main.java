public class Main {

    public static void main(String[] args) {
        AreaCir cir = (r) -> 3.14f*r*r;
        System.out.println(cir.area(2));

        AreaRec rec = (w, h) -> w*h;
        System.out.println(rec.area(5, 2));

        AreaSqu squ = (w) -> w*w;
        System.out.println(squ.area(2));

        AreaTri tri = (b, h) -> 0.5f*b*h;
        System.out.println(tri.area(2,2));
    }
}