import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dolphin dolphinObject = new Dolphin();
        Tiger tigerObject = new Tiger();
        Penguin penguinObject = new Penguin()


        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age of the tiger: ");
                                tigerObject.setAge(keyboard.nextInt());

                                System.out.println("Enter weight of the tiger: ");
                                tigerObject.setWeight(keyboard.nextInt());

                                System.out.println("Enter height of the tiger: ");
                                tigerObject.setHeight(keyboard.nextInt());

                                System.out.println("Enter speed : ");
                                tigerObject.setSpeed(keyboard.nextInt());

                                System.out.println("Enter number of stripes: ");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());

                                System.out.println("Enter sound level of roar: ");
                                tigerObject.setSoundLevelOfRoar(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("age: " + tigerObject.getAge());
                                System.out.println("weight: " + tigerObject.getWeight());
                                System.out.println("height " + tigerObject.getHeight());
                                System.out.println("speed: " + tigerObject.getSpeed());
                                System.out.println("number of stripes: " + tigerObject.getNumberOfStripes());
                                System.out.println("sound level of roar: " + tigerObject.getSoundLevelOfRoar());
                                break;

                            case 3:
                                tigerObject.walking();
                                break;

                            case 4:
                                //tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age of the dolphin: ");
                                dolphinObject.setAge(keyboard.nextInt());

                                System.out.println("Enter weight of the dolphin: ");
                                dolphinObject.setWeight(keyboard.nextInt());

                                System.out.println("Enter height of the dolphin: ");
                                dolphinObject.setHeight(keyboard.nextInt());

                                System.out.println("Enter the color of the Dolphin: ");
                                keyboard.nextLine();
                                dolphinObject.setColorOfDolphin(keyboard.nextLine());

                                System.out.println("Enter the swimming speed: ");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("age: " + dolphinObject.getAge());
                                System.out.println("weight: " + dolphinObject.getWeight());
                                System.out.println("height " + dolphinObject.getHeight());
                                System.out.println("color: " + dolphinObject.getColorOfDolphin());
                                System.out.println("swimming speed: " + dolphinObject.getSwimmingSpeed());
                                break;

                            case 3:
                                dolphinObject.swimming();
                                break;

                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;

                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age of the penguin: ");
                                penguinObject.setAge(keyboard.nextInt());

                                System.out.println("Enter weight of the penguin: ");
                                penguinObject.setWeight(keyboard.nextInt());

                                System.out.println("Enter height of the penguin: ");
                                penguinObject.setHeight(keyboard.nextInt());

                                System.out.println("is the penguin swimming? ");
                                penguinObject.setSwimming(keyboard.nextBoolean());

                                System.out.println("Enter the penguin walk speed: ");
                                penguinObject.setWalkSpeed(keyboard.nextInt());

                                System.out.println("Enter the penguin swimming speed: ");
                                penguinObject.setSwimSpeed(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("age: " + penguinObject.getAge());
                                System.out.println("weight: " + penguinObject.getWeight());
                                System.out.println("height " + penguinObject.getHeight());
                                System.out.println("swimming : " + penguinObject.isSwimming());
                                System.out.println("swimming speed: " + penguinObject.getSwimSpeed());
                                System.out.println("walking speed: " + penguinObject.getWalkSpeed());
                                break;

                            case 3:

                                if (penguinObject.isSwimming())
                                {
                                    penguinObject.swimming();
                                }
                                else
                                {
                                penguinObject.walking();
                                }
                                break;

                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}
