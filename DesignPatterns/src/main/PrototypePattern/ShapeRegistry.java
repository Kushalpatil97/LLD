package main.PrototypePattern;

class ShapeRegistry {
    private java.util.Map<String, Shape> prototypes = new java.util.HashMap<>();

    public void addPrototype(String key, Shape prototype) {
        prototypes.put(key, prototype);
    }

    public Shape getPrototype(String key) {
        Shape prototype = prototypes.get(key);
        return prototype != null ? prototype.clone() : null;
    }

    public void listPrototypes() {
        System.out.println("Available prototypes:");
        for (String key : prototypes.keySet()) {
            System.out.println("- " + key + ": " + prototypes.get(key));
        }
    }
}