package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputdata = new Scanner(System.in);

        List<watchman> vigilante = new ArrayList<>();
        List<cleaningstaff> limpieza = new ArrayList<>();
        List<accountant> contador = new ArrayList<>();
        List<admin> administrador = new ArrayList<>();
    boolean flagstop = false;
    while (!flagstop){
        System.out.println("digite 1 para ingresar vigilante, 2 para listar los vigilantes, 3 para ingresar limpieza, \n" +
                "4 para listar limpieza, 5 para ingresar contador, 6 para listar contador, 7 para ingresar edministrador, \n" +
                "8 para listar administrador, digite 9 para salir");
        int option = Integer.parseInt(inputdata.nextLine());
        switch (option){
            case 1:
                watchman wat = new watchman();
                System.out.println("ingrese su nombre: ");
                wat.setName(inputdata.nextLine());
                System.out.println("ingrese su identificacion: ");
                wat.setIdentification(inputdata.nextLine());
                System.out.println("ingrese la edad: ");
                wat.setAge(Integer.parseInt(inputdata.nextLine()));
                System.out.println("ingrese su arma");
                wat.setWeapon(inputdata.nextLine());
                System.out.println("ingrese su dia de trabajo");
                wat.setWorkday(inputdata.nextLine());
                vigilante.add(wat);
                break;
            case 2:
                for (int i = 0; i < vigilante.size(); i++) {
                    System.out.println(vigilante.get(i).getName());
                    System.out.println(vigilante.get(i).getIdentification());
                    System.out.println(vigilante.get(i).getAge());
                    System.out.println(vigilante.get(i).getWeapon());
                    System.out.println(vigilante.get(i).getWorkday());
                }
                break;
            case 3:
                cleaningstaff cle = new cleaningstaff();
                System.out.println("ingrese su nombre: ");
                cle.setName(inputdata.nextLine());
                System.out.println("ingrese su identificacion: ");
                cle.setIdentification(inputdata.nextLine());
                System.out.println("ingrese la edad: ");
                cle.setAge(Integer.parseInt(inputdata.nextLine()));
                System.out.println("ingrese su dia libre");
                cle.setDayOff(inputdata.nextLine());
                limpieza.add(cle);
                break;
            case 4:
                for (int i = 0; i < limpieza.size(); i++) {
                    System.out.println(limpieza.get(i).getName());
                    System.out.println(limpieza.get(i).getIdentification());
                    System.out.println(limpieza.get(i).getAge());
                    System.out.println(limpieza.get(i).getDayOff());

                }
                break;
            case 5:
                accountant acc = new accountant();
                System.out.println("ingrese su nombre: ");
                acc.setName(inputdata.nextLine());
                System.out.println("ingrese su identificacion: ");
                acc.setIdentification(inputdata.nextLine());
                System.out.println("ingrese la edad: ");
                acc.setAge(Integer.parseInt(inputdata.nextLine()));
                System.out.println("ingrese su lider");
                acc.setLeader(inputdata.nextLine());
                System.out.println("ingrese estacionamiento");
                acc.setParking(inputdata.nextLine());
                contador.add(acc);
                break;
            case 6:
                for (int i = 0; i < contador.size(); i++) {
                    System.out.println(contador.get(i).getName());
                    System.out.println(contador.get(i).getIdentification());
                    System.out.println(contador.get(i).getAge());
                    System.out.println(contador.get(i).getLeader());
                    System.out.println(contador.get(i).getParking());
                }
                break;
            case 7:
                admin ad = new admin();
                System.out.println("ingrese su nombre: ");
                ad.setName(inputdata.nextLine());
                System.out.println("ingrese su identificacion: ");
                ad.setIdentification(inputdata.nextLine());
                System.out.println("ingrese la edad: ");
                ad.setAge(Integer.parseInt(inputdata.nextLine()));
                System.out.println("ingrese su lider");
                ad.setLeader(inputdata.nextLine());
                System.out.println("ingrese estacionamiento");
                ad.setParking(inputdata.nextLine());
                administrador.add(ad);
                break;
            case 8:
                for (int i = 0; i < administrador.size(); i++) {
                    System.out.println(administrador.get(i).getName());
                    System.out.println(administrador.get(i).getIdentification());
                    System.out.println(administrador.get(i).getAge());
                    System.out.println(administrador.get(i).getLeader());
                    System.out.println(administrador.get(i).getParking());
                }
                break;
            case 9:
                flagstop = true;
                break;
        }
    }
    }
}
