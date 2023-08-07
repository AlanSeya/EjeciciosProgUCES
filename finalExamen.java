public class finalExamen {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[2];
        estudiantes[0]= new Estudiante("Nico", 21, 15);
        estudiantes[1]= new Estudiante("Ramiro",33 ,8);
        estudiantes[2]= new Estudiante("Carlos",55 ,10);
    
        int estMayor = getEstudianteMayor(estudiantes);


        System.out.println("El estudiante con la mejor calificacion es "+ estudiantes[estMayor].getNombre() + " de edad " + estudiantes[estMayor].getEdad() + " y se sacó "+ estudiantes[estMayor].getCalificacion());
    }
    public static int getEstudianteMayor(Estudiante[] estudiantes){
        int mayorCalificacion = 0;
        int estMayor = 0;
        for(int i = 0; i <= estudiantes.length; i++){
        if(estudiantes[i].getCalificacion() > mayorCalificacion ){
            mayorCalificacion = estudiantes[i].getCalificacion();
            estMayor = i;
        }
        }
        return estMayor;
    }

}


