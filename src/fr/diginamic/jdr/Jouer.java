package fr.diginamic.jdr;

import java.util.Scanner;

public class Jouer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;
        Personnage personnage = new Personnage(0,0,0);
        while (!stop) {
            System.out.println(
                    "Veuillez sélectionner : \n Taper 1 pour creer un presonnage \n Taper 2 pour Combattre une créature:");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Vous avez choisi de creer un personnage");
                    personnage.setForce(getRandom(12,6));
                    personnage.setPointDeVie(getRandom(50,20));
                    personnage.setScore(0);
                    break;
                case 2:
                    if (personnage.getPointDeVie() > 0) {
                        System.out.println("Vous avez choisi de commencer le combat :");
                        Loup loup = new Loup(getRandom(3,8), getRandom(5,10));
                        Gobelin gobelin = new Gobelin(getRandom(5,10), getRandom(10,15));
                        Troll troll = new Troll(getRandom(10,15), getRandom(20,30));

                        Creature[] creatures = {loup, gobelin, troll};
                        System.out.println("Veuillez sélectionner : \n Taper 1 pour jouer contre le loup \n Taper 2 pour jouer contre le goblin \n Taper 3 pour jouer contre le troll ");
                        int choixJouer = scanner.nextInt();
                        String typeChoisi = "";
                        switch (choixJouer) {
                            case 1:
                                typeChoisi = "Loup";
                                break;
                            case 2:
                                typeChoisi = "Gobelin";
                                break;
                            case 3:
                                typeChoisi = "Troll";
                                break;
                        }
                        for (Creature creature :
                                creatures) {
                            if (creature.getType().equals(typeChoisi)) {
                                int attaquePersonnage;
                                int attaqueCreature;
                                do {
                                    attaquePersonnage = personnage.getForce() + getRandom(1,10);
                                    attaqueCreature = creature.getForce() + getRandom(1,10);

                                    if (attaqueCreature > attaquePersonnage) {
                                        int pointDeViePer = personnage.getPointDeVie();
                                        personnage.setPointDeVie(pointDeViePer - (attaqueCreature - attaquePersonnage));
                                        creature.setPointDeVie(creature.getPointDeVie() + (attaqueCreature - attaquePersonnage));
                                    } else {
                                        int pointDeVieCreature = creature.getPointDeVie();
                                        creature.setPointDeVie(pointDeVieCreature - (attaquePersonnage - attaqueCreature));
                                        personnage.setPointDeVie(personnage.getPointDeVie() + (attaquePersonnage - attaqueCreature));
                                    }

                                } while (personnage.getPointDeVie() > 0 && creature.getPointDeVie() > 0);
                                if (personnage.getPointDeVie() < 1) {
                                    System.out.println("Vous avez perdu");
                                    System.out.println("Votre score est : " + personnage.getScore());
                                } else if (creature.getPointDeVie() < 1) {
                                    System.out.println("Vous avez gagné");
                                    if (creature.getType().equals("Loup")) {
                                        personnage.setScore(personnage.getScore() + 1);
                                    } else if (creature.getType().equals("Gobelin")) {
                                        personnage.setScore(personnage.getScore() + 2);
                                    } else {
                                        personnage.setScore(personnage.getScore() + 5);
                                    }
                                    System.out.println(personnage.getScore());
                                    System.out.println("Votre score est : " + personnage.getScore());
                                }
                            }
                        }
                    } else {
                        System.out.println("Vous avez " + personnage.getPointDeVie() + " vie il faut creer un personnage");
                    }
                    break;
                default:
                    System.out.println(
                            "Oups, vous n'avez pas rentré un chiffre valide...");
            }
        }
    }

    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}

