package lab4_manuel_andrea;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_Manuel_Andrea {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<EVA> EVAs = new ArrayList();
        ArrayList<ANGELES> Angeles = new ArrayList();
        ArrayList<Piloto> Pilotos = new ArrayList();
        String[][] T = new String[10][10];
        llenar(T);
        T[9][0] = "PM ";
        T[9][9] = "PM ";
        T[9][2] = "PM ";
        T[9][7] = "PM ";
        T[9][3] = "EV0";
        T[9][4] = "EV1";
        T[9][5] = "EV2";
        T[9][6] = "EV0";

        T[0][2] = " R ";
        T[0][7] = " R ";

        T[1][1] = " Z ";
        T[3][2] = " Z ";
        T[1][8] = " Z ";
        T[3][7] = " Z ";

        T[1][4] = " S ";
        T[1][5] = " S ";
        print(T);
        EVAs.add(new EVA());
        EVAs.add(new EVA());
        Angeles.add(new ANGELES());
        Angeles.add(new ANGELES());
        Pilotos.add(new Piloto());
        Pilotos.add(new Piloto());
        Pilotos.add(new Piloto());
        Pilotos.add(new Piloto());
        System.out.println("");
        System.out.println("MAGI init\n"
                + "Bienvenido a Nerv \n"
                + "............................-*@WWWWWWWWWWWW+............... \n"
                + "...........................+WWWWWWWWWWWWWW+................ \n"
                + "................**.........@WWWWWWWWWWWWWWWWW@+............ \n"
                + "................=W+........#WWWWWWWWWWWWWWWWWWWWW=......... \n"
                + "..................#@-.....+WWWWWWWWWWWWWWWWWWWWWWWW+....... \n"
                + "....................#=...=WWWWWWWWWWWWWWWWWWWWWWWWWW@...... \n"
                + ".....................-#WWWWWWWWWWWWWWWWWWWWWWWWWWWW#=...... \n"
                + "........-:::-...-:::-::+WWWWWWWWWWWWWWWWW@#WWWW@@-......... \n"
                + "..........#WW@-...#...=WW+@WWWWWWWWWWWWWWW@#+.............. \n"
                + "..........=.#WW=..=...=WW-.#WWWWWWWWWWWWWWWWWW@-........... \n"
                + "..........=..:WWW:=...=WW#@@.:tWWWWWWWWWWWWWWWWW#........... \n"
                + "..........=....=WW#...=WW-.*..-*WWWWWWWWWWWWWWWW#.......... \n"
                + "..........#.....-@#...=WW:...*#..*WWWWWWWWWWWWWWW:......... \n"
                + "..................-................=WWWWWWWWWWWWW#......... \n"
                + "........................:WW#+*@W=.-#WWWWWWWWWWWWWW=........ \n"
                + "........................-WW=...WW#..@WW#WWWWWWWWWW=........ \n"
                + "........................-WW=..*WW:..-@W@-#WWWWWWWW#........ \n"
                + "........................-WW=:WW@.....-WW#++@WWWWWW#........ \n"
                + "........................-WW=..#WW+....:WW+..-@WWWW#........ \n"
                + ".......................:=@@@+-.+@@#:...+*.....-@WW=........ \n"
                + "................................................:WW........ \n"
                + "OPCIONES \n\nElija una opción: \n"
                + "A-Lista de EVAs \n"
                + "B-Lista de Angeles \n"
                + "C-CRUD Pilotos \n"
                + "D-Simulación \n"
                + "E-Salir");

        String resp = s.next();
        switch (resp) {
            case "A":
                for (EVA e : EVAs) {
                    System.out.println(e);
                }
                break;
            case "B":
                for (ANGELES a : Angeles) {
                    System.out.println(a);
                }
                break;
            case "C":
                System.out.println("¿Qué desea hacer?");
                System.out.println("1-Listar \n  2-Modificar datos \n  3-Eliminar \n  4-Crea");
                int resp2 = s.nextInt();
                switch (resp2) {
                    case 1:
                        System.out.println("-- LISTA DE PILOTOS --\n\n");
                        for (Piloto P : Pilotos) {
                            System.out.println(Pilotos.indexOf(P) + ".- " + P);
                        }
                        break;
                    case 2:
                        System.out.println("-- MODIFICACIÓN --");
                        System.out.print("Ingrese la posición del piloto que desea modificar: ");
                        int pos = s.nextInt();
                        System.out.println("\n+"
                                + "1.- Nombre\n"
                                + "2.- Edad\n"
                                + "3.- Nombre de Familiar Cercano\n"
                                + "4.- Encargado en Nerv\n"
                                + "5.- Escuela a la que Asiste\n"
                                + "6.- Porcentaje de Sincronización con el EVA\n"
                                + "7.- EVA Asignado");
                        System.out.print("Ingrese el número del dato que desea modificar: ");
                        int resp3 = s.nextInt();
                        switch (resp3) {
                            case 1:
                                System.out.println("Ingrese el nuevo nombre del piloto:");
                                String n = s.next();
                                ((Piloto) Pilotos.get(pos)).setNombre(n);
                                break;
                            case 2:
                                System.out.println("Ingrese la nueva edad del piloto:");
                                int e = s.nextInt();
                                ((Piloto) Pilotos.get(pos)).setEdad(e);
                                break;
                            case 3:
                                System.out.println("Ingrese el nuevo nombre del familiar cercano del piloto:");
                                n = s.next();
                                ((Piloto) Pilotos.get(pos)).setFam(n);
                                break;
                            case 4:
                                System.out.println("Ingrese el nuevo nombre del encargado en el Nerv:");
                                n = s.next();
                                ((Piloto) Pilotos.get(pos)).setEncargado(n);
                                break;
                            case 5:
                                System.out.println("Ingrese el nuevo nombre de la escuela a la que asiste:");
                                n = s.next();
                                ((Piloto) Pilotos.get(pos)).setEscuela(n);
                                break;
                            case 6:
                                System.out.println("Ingrese el nuevo porcentaje de sincronización con el EVA:");
                                double sync = s.nextDouble();
                                ((Piloto) Pilotos.get(pos)).setSinc(sync);
                                break;
                            case 7:
                                System.out.println("EVAs disponibles: \n");
                                for (EVA ev : EVAs) {
                                    System.out.println(EVAs.indexOf(ev) + ".- " + ev);
                                }
                                System.out.print("Ingrese el número correspondiente al EVA que desea asignar: ");
                                int eva = s.nextInt();
                                ((Piloto) Pilotos.get(pos)).setAsignado(EVAs.get(eva));
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("-- ELIMINACIÓN --");
                        System.out.print("Ingrese la posición del piloto que desea eliminar: ");
                        pos = s.nextInt();
                        Pilotos.remove(pos);
                        break;

                    case 4:
                        System.out.println(" -- CREACIÓN --");
                        System.out.println("Ingrese el nombre del piloto:");
                        String n = s.next();
                        System.out.println("Ingrese la edad del piloto:");
                        int e = s.nextInt();
                        System.out.println("Ingrese el nombre del familiar cercano:");
                        String nf = s.next();
                        System.out.println("Ingrese el nombre del encargado de Nerv:");
                        String enc = s.next();
                        System.out.println("Ingrese el nombre de la escuela a que asiste");
                        String esc = s.next();
                        System.out.println("Ingrese el porcentaje de Sincronización con el EVA: ");
                        double sync = s.nextDouble();
                        System.out.println("");
                        System.out.println("EVAs disponibles: \n");
                        for (EVA ev : EVAs) {
                            System.out.println(EVAs.indexOf(ev) + ".- " + ev);
                        }
                        System.out.print("Ingrese el número correspondiente al EVA que desea asignar.");
                        int eva = s.nextInt();
                        EVA v = EVAs.get(eva);
                        Pilotos.add(new Piloto(n, e, nf, enc, esc, sync, v));
                    default:
                }
                break;
            case "D":
                System.out.println("A L E R T A ! ! !");
                System.out.println("Tipo de Sangre Azul CONFIRMADO");
                System.out.println("Comienza despliegue de las unidades . . .");
                print(T);
                Eva(T);
                break;
            case "E":
                System.exit(0);
                break;
            default:

        }

    }

    public static void print(String[][] M) { // Imprimir matriz de String
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("[" + M[i][j] + "]");
            }
            System.out.println();
        }

    }

    public static void llenar(String[][] M) { // Imprimir matriz de String
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = "   ";
            }
            System.out.println();
        }
    }

    public static void Eva(String[][] M) {
        System.out.println("Elija un EVA ingreasando sus coordenadas:");
        System.out.print(" X --> ");
        int x = s.nextInt();
        System.out.print(" Y --> ");
        int y = s.nextInt();
        while (!(M[x][y].contains("EV") || M[x][y].contains("MP"))) {
            System.out.println("Las coordenadas ingresadas no pertenecen a una EVA.\n Ingrese nuevas coordenadas.");
            System.out.print(" X --> ");
            x = s.nextInt();
            System.out.print(" Y --> ");
            y = s.nextInt();
        }
        System.out.println(M[x][y] + " seleccionada.\n¿Qué desea hacer?\n A.- Mover\n B.- Atacar");
        String resp = s.next();
        Ancestrales J;
        if (M[x][y] == "PM") {
            J = new EVAPM();
        } else if (M[x][y] == "EV0") {
            J = new EVA00();
        } else if (M[x][y] == "EV1") {
            J = new EVA01();
        } else {
            J = new EVA02();
        }
        if (resp == "A") {
            System.out.println("Ingrese las coordenadas para moverse:");
            System.out.print(" X --> ");
            int x2 = s.nextInt();
            System.out.print(" Y --> ");
            int y2 = s.nextInt();
            J.movimiento(x2, y2, x, y);
        }
    }

}