package pbouda.inline;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Press Enter to start it off!");
        System.in.read();

        for (int i = 0; i < 1_000_000; i++) {
            System.out.println(i + " - " + entity());
            if (i % 5 == 0) {
                Thread.sleep(10);
            }
        }
    }

    private static Entity entity() {
        Entity entity = new Entity();
        entity.i0 = "1";
        entity.i1 = Integer.valueOf(1);
        entity.i2 = Integer.valueOf(2);
        entity.i3 = Integer.valueOf(3);
        entity.i4 = Integer.valueOf(4);
        entity.i5 = Integer.valueOf(5);
        entity.i6 = Integer.valueOf(6);
        entity.i7 = Integer.valueOf(7);
        entity.i8 = Integer.valueOf(8);
        entity.i9 = Integer.valueOf(9);
        entity.i10 = Integer.valueOf(10);
        entity.i11 = Integer.valueOf(11);
        entity.i12 = Integer.valueOf(12);
        entity.i13 = Integer.valueOf(13);
        entity.i14 = Integer.valueOf(14);
        entity.i15 = Integer.valueOf(15);
        entity.i16 = Integer.valueOf(16);
        entity.i17 = Integer.valueOf(17);
        entity.i18 = Integer.valueOf(18);
        entity.i19 = Integer.valueOf(19);
        entity.i20 = Integer.valueOf(20);
        return entity;
    }

    public static class Entity {

        private String i0;
        private Integer i1;
        private Integer i2;
        private Integer i3;
        private Integer i4;
        private Integer i5;
        private Integer i6;
        private Integer i7;
        private Integer i8;
        private Integer i9;
        private Integer i10;
        private Integer i11;
        private Integer i12;
        private Integer i13;
        private Integer i14;
        private Integer i15;
        private Integer i16;
        private Integer i17;
        private Integer i18;
        private Integer i19;
        private Integer i20;

        public String toString() {
            return "i0=" + i0 +
                   ", i1=" + i1 +
                   ", i2=" + i2 +
                   ", i3=" + i3 +
                   ", i4=" + i4 +
                   ", i5=" + i5 +
                   ", i6=" + i6 +
                   ", i7=" + i7 +
                   ", i8=" + i8 +
                   ", i9=" + i9 +
                   ", i10=" + i10 +
                   ", i11=" + i11 +
                   ", i12=" + i12 +
                   ", i13=" + i13 +
                   ", i14=" + i14 +
                   ", i15=" + i15 +
                   ", i16=" + i16 +
                   ", i17=" + i17 +
                   ", i18=" + i18 +
                   ", i19=" + i19 +
                   ", i20=" + i20
                    ;
        }
    }

}
