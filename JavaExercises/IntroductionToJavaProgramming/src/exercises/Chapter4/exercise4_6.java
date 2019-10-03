package exercises.Chapter4;

public class exercise4_6 {
    /** Random points on a circle */
    public static void main(String[] args) {
        final int RADIUS = 40;
        // Assign three random angles
        double angle1 = Math.random() * Math.PI * 2;
        double angle2 = Math.random() * Math.PI * 2;
        double angle3 = Math.random() * Math.PI * 2;

        System.out.printf("Angle 1 (%f, %f)\n", Math.cos(angle1) * RADIUS, Math.sin(angle1) * RADIUS);
        System.out.printf("Angle 2 (%f, %f)\n", Math.cos(angle2) * RADIUS, Math.sin(angle2) * RADIUS);
        System.out.printf("Angle 3 (%f, %f)\n", Math.cos(angle3) * RADIUS, Math.sin(angle3) * RADIUS);
    }
}
