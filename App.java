import java.io.*;
import java.util.*;

public static void App(String[] args) {
public class AnimalManager {
        private ArrayList<Animal> animals = new ArrayList<>();
        private HashMap<String, Integer> speciesCount = new HashMap<>();

        public void readAnimals(String filename) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String species = parts[0];
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);

                Animal animal = switch (species) {
                    case "Hyena" -> {
                        int laughVolume = Integer.parseInt(parts[3]);
                        yield new Hyena(name, age, laughVolume);
                    }
                    case "Lion" -> {
                        boolean hasMane = Boolean.parseBoolean(parts[3]);
                        yield new Lion(name, age, hasMane);
                    }
                    case "Tiger" -> {
                        int stripeCount = Integer.parseInt(parts[3]);
                        yield new Tiger(name, age, stripeCount);
                    }
                    case "Bear" -> {
                        boolean likesHoney = Boolean.parseBoolean(parts[3]);
                        yield new Bear(name, age, likesHoney);
                    }
                    default -> null;
                };

                if (animal != null) {
                    animals.add(animal);
                    speciesCount.put(species, speciesCount.getOrDefault(species, 0) + 1);
                }
            }
            reader.close();
        }

        public void generateReport(String filename) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

            for (Animal animal : animals) {
                writer.write(animal.getSpecies() + " " + animal.getName() + " " + animal.getAge() + "\n");
            }

            writer.write("\nSpecies Count:\n");
            for (Map.Entry<String, Integer> entry : speciesCount.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }

        }


