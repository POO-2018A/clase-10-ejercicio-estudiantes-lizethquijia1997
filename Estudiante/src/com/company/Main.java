package com.company;

public class Main {
    private String nombre;
    private String apellido;
    private String cedula;
    private String[] materias;

    public Main(String nombre, String apellido, String cedula) {//aqui NO permite el constructor vacio porque ya esta inicializado
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public static void main(String[] args) {

        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        int suma5 = 0;

        System.out.println("\t\tINFORMACIÓN ESTUDIANTES\n");
        Main[] estudiantes = new Main[3];


        System.out.println("\tEstudiante 1");
        //2MATERIAS

        estudiantes[0] = new Main("Joel", "Quijia", "1725094815");


        String[] m = {"m1", "m2"};
        estudiantes[0].setMaterias(m);

        System.out.println("Nombre completo: " + estudiantes[0].getNombre() + " " + estudiantes[0].getApellido());
        System.out.println("Cédula: " + estudiantes[0].getCedula());
        System.out.println("Materias:");

        String[] materiasEstudiante = estudiantes[0].getMaterias();
        for (int i = 0; i < materiasEstudiante.length; i++) {
            System.out.println(materiasEstudiante[i]);
        }


        System.out.println("\tEstudiante 2");
        //3MATERIAS

        estudiantes[1] = new Main("Mishell", "Cisneros", "1725078815");
        System.out.println("Nombre completo: " + estudiantes[1].getNombre() + " " + estudiantes[1].getApellido());
        System.out.println("Cédula: " + estudiantes[1].getCedula());
        System.out.println("Materias:");

        String[] m1 = {"m2", "m3", "m4"};
        estudiantes[1].setMaterias(m1);


        String[] materiasEstudiante1 = estudiantes[1].getMaterias();
        for (int i = 0; i < materiasEstudiante1.length; i++) {
            System.out.println(materiasEstudiante1[i]);
        }

        System.out.println("\tEstudiante 3");

        estudiantes[2] = new Main("Alexandra", "Portilla", "1845096352");
        System.out.println("Nombre completo: " + estudiantes[2].getNombre() + " " + estudiantes[2].getApellido());
        System.out.println("Cédula: " + estudiantes[2].getCedula());
        System.out.println("Materias:");

        String[] m2 = {"m2", "m3", "m4", "m5"};
        estudiantes[2].setMaterias(m2);

        String[] materiasEstudiante2 = estudiantes[2].getMaterias();
        for (int i = 0; i < materiasEstudiante2.length; i++) {
            System.out.println(materiasEstudiante2[i]);
        }


        System.out.println("\t\tRESUMEN MATERIAS\n");


        for (int i = 0; i < materiasEstudiante.length ; i++) {

            if (materiasEstudiante[i].equals("m1") ) {
                suma1 = suma1 + 1;

            } else if (materiasEstudiante[i].equals("m2")) {
                suma2 = suma2 + 1;

            } else if (materiasEstudiante[i].equals("m3")) {
                suma3 = suma3 + 1;
            }
            else if (materiasEstudiante[i].equals("m4")) {
                suma4 = suma4 + 1;

            }else if (materiasEstudiante[i].equals("m5")) {
                suma5 = suma5+ 1;
            }



            }
        for (int i = 0; i < materiasEstudiante1.length; i++) {

            if (materiasEstudiante1[i].equals("m1") ) {
                suma1 = suma1 + 1;

            } else
            if (materiasEstudiante1[i].equals("m2") ) {
                suma2 = suma2 + 1;

            } else if (materiasEstudiante1[i].equals("m3")) {
                suma3 = suma3 + 1;

            }else if (materiasEstudiante1[i].equals("m4")) {
                suma4 = suma4 + 1;

            }else if (materiasEstudiante1[i].equals("m5") ) {
                suma5 = suma5 + 1;

            }

        }

        for (int i = 0; i < materiasEstudiante2.length; i++) {

         if (materiasEstudiante2[i].equals("m1") ) {
                suma1 = suma1 + 1;

            } else if (materiasEstudiante2[i].equals("m2") ) {
                suma2 = suma2 + 1;

            } else if (materiasEstudiante2[i].equals("m3")) {
                suma3 = suma3 + 1;

            } else if (materiasEstudiante2[i].equals("m4")) {
                suma4 = suma4 + 1;

            } else if (materiasEstudiante2[i].equals("m5")) {
                suma5 = suma5 + 1;

            }

        }
            System.out.println("m1:" + suma1);
            System.out.println("m2:" + (suma2));
            System.out.println("m3:" + (suma3));
            System.out.println("m4:" + (suma4));
            System.out.println("m5:" + suma5);


    }
}










