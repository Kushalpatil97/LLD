package main.PrototypePattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Create prototype registry
        ShapeRegistry registry = new ShapeRegistry();

        // Create and configure prototype objects
        Circle redCircle = new Circle();
        redCircle.setColor("Red");
        redCircle.setX(10);
        redCircle.setY(20);
        redCircle.setRadius(15);

        // Register prototypes
        registry.addPrototype("red-circle", redCircle);

        System.out.println("=== Prototype Pattern Demo ===\n");

        // List available prototypes
        registry.listPrototypes();

        System.out.println("\n=== Creating clones ===");

        // Clone prototypes
        Circle clonedCircle1 = (Circle) registry.getPrototype("red-circle");
        Circle clonedCircle2 = (Circle) registry.getPrototype("red-circle");


        // Modify cloned objects
        clonedCircle2.setColor("Green");
        clonedCircle2.setRadius(25);


        // Display results
        System.out.println("Original red circle: " + redCircle);
        System.out.println("Cloned circle 1: " + clonedCircle1);
        System.out.println("Modified cloned circle 2: " + clonedCircle2);


        // Verify they are different objects
        System.out.println("\n=== Object Identity Check ===");
        System.out.println("Original circle == Cloned circle 1: " +
                (redCircle == clonedCircle1));
        System.out.println("Cloned circle 1 == Cloned circle 2: " +
                (clonedCircle1 == clonedCircle2));

        System.out.println("\n=== Performance Comparison ===");
    }
}


}
