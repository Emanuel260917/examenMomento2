package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputData = new Scanner(System.in);

        List<Watchman> watchmanList = new ArrayList<>();
        List<Cleaningstaff> cleaningstaffList = new ArrayList<>();
        List<Accountant> accountantList = new ArrayList<>();
        List<Admin> adminList = new ArrayList<>();
    boolean stop = true;
    while (stop){
        System.out.println("ingrese 1=vigilante, 2=listar los vigilantes, 3=limpieza, \n" +
                "4=listar limpieza, 5=contador, 6=listar contador, 7=edministrador, \n" +
                "8=listar administrador, 9=salir");
        int option = Integer.parseInt(inputData.nextLine());
        switch (option){
            case 1:
                Watchman watchman = new Watchman();
                System.out.println("ingrese su nombre: ");
                watchman.setName(inputData.nextLine());
                System.out.println("ingrese su identificacion: ");
                watchman.setIdentification(inputData.nextLine());
                System.out.println("ingrese la edad: ");
                watchman.setAge(Integer.parseInt(inputData.nextLine()));
                System.out.println("ingrese su arma");
                watchman.setWeapon(inputData.nextLine());
                System.out.println("ingrese su dia de trabajo");
                watchman.setWorkday(inputData.nextLine());
                watchmanList.add(watchman);
                break;
            case 2:
                for (int i = 0; i < watchmanList.size(); i++) {
                    System.out.println("Name " + watchmanList.get(i).getName());
                    System.out.println("Identification " + watchmanList.get(i).getIdentification());
                    System.out.println("Age " + watchmanList.get(i).getAge());
                    System.out.println("Weapon" + watchmanList.get(i).getWeapon());
                    System.out.println("WorkDay" + watchmanList.get(i).getWorkday());
                }
                break;
            case 3:
                Cleaningstaff cleaningstaff = new Cleaningstaff();
                System.out.println("ingrese su nombre: ");
                cleaningstaff.setName(inputData.nextLine());
                System.out.println("ingrese su identificacion: ");
                cleaningstaff.setIdentification(inputData.nextLine());
                System.out.println("ingrese la edad: ");
                cleaningstaff.setAge(Integer.parseInt(inputData.nextLine()));
                System.out.println("ingrese su dia libre");
                cleaningstaff.setDayOff(inputData.nextLine());
                cleaningstaffList.add(cleaningstaff);
                break;
            case 4:
                for (int i = 0; i < cleaningstaffList.size(); i++) {
                    System.out.println("Name " + cleaningstaffList.get(i).getName());
                    System.out.println("Identification " + cleaningstaffList.get(i).getIdentification());
                    System.out.println("Age " + cleaningstaffList.get(i).getAge());
                    System.out.println("DayOff " + cleaningstaffList.get(i).getDayOff());

                }
                break;
            case 5:
                Accountant accountant = new Accountant();
                System.out.println("ingrese su nombre: ");
                accountant.setName(inputData.nextLine());
                System.out.println("ingrese su identificacion: ");
                accountant.setIdentification(inputData.nextLine());
                System.out.println("ingrese la edad: ");
                accountant.setAge(Integer.parseInt(inputData.nextLine()));
                System.out.println("ingrese su lider");
                accountant.setLeader(inputData.nextLine());
                System.out.println("ingrese estacionamiento");
                accountant.setParking(inputData.nextLine());
                accountantList.add(accountant);
                break;
            case 6:
                for (int i = 0; i < accountantList.size(); i++) {
                    System.out.println("Name " + accountantList.get(i).getName());
                    System.out.println("Identification " + accountantList.get(i).getIdentification());
                    System.out.println("Age" + accountantList.get(i).getAge());
                    System.out.println("Leader " + accountantList.get(i).getLeader());
                    System.out.println("Parking " + accountantList.get(i).getParking());
                }
                break;
            case 7:
                Admin admin = new Admin();
                System.out.println("ingrese su nombre: ");
                admin.setName(inputData.nextLine());
                System.out.println("ingrese su identificacion: ");
                admin.setIdentification(inputData.nextLine());
                System.out.println("ingrese la edad: ");
                admin.setAge(Integer.parseInt(inputData.nextLine()));
                System.out.println("ingrese su lider");
                admin.setLeader(inputData.nextLine());
                System.out.println("ingrese estacionamiento");
                admin.setParking(inputData.nextLine());
                adminList.add(admin);
                break;
            case 8:
                for (int i = 0; i < adminList.size(); i++) {
                    System.out.println("Name " + adminList.get(i).getName());
                    System.out.println("Identification " + adminList.get(i).getIdentification());
                    System.out.println("Age" + adminList.get(i).getAge());
                    System.out.println("Leader " + adminList.get(i).getLeader());
                    System.out.println("Parking " + adminList.get(i).getParking());
                }
                break;
            case 9:
                stop = false;
                break;
        }
    }
    }
}
