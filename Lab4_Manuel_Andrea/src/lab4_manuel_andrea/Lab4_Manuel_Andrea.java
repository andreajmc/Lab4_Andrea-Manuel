package lab4_manuel_andrea;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_Manuel_Andrea {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<EVA> EVAs = new ArrayList();
        ArrayList<ANGELES> Angeles = new ArrayList();
        ArrayList<Piloto> Pilotos = new ArrayList();
        EVAs.add(new EVA());
        EVAs.add(new EVA());
        Angeles.add(new ANGELES());
        Angeles.add(new ANGELES());
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
                + "..........=..:WWW:=...=WW#@@.:WWWWWWWWWWWWWWWWW#........... \n"
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
                                System.out.print("Ingrese el número correspondiente al EVA que desea asignar.");
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
                        Pilotos.add(new Piloto(n,e,nf,enc,esc,sync,v));
                    default:
                }
                break;
            case "D":
                break;
            case "E":
                System.exit(0);
                break;
            default:

        }
    }

}
