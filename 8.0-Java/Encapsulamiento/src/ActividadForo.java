public class ActividadForo {
    /**
     * En una matriz, almacenar las notas de 4 materias para un grupo de 6 estudiantes.
     * Mostrar el promedio de todo el grupo de estudiantes y cuántos de ellos
     * se encuentran por encima de dicho promedio.
     * @param args
     */
    public static void main(String[] args) {

        // Las materias son representada por []
        // Las notas de los estudiantes  son representadas por [][]
        double[][] notasEstudiantes = {
                {3.0, 3.5, 5.0, 4.2, 3.0, 3.1},
                {3.4, 4.2, 4.5, 3.8, 2.8, 4.1},
                {4.0, 2.9, 4.2, 4.2, 4.0, 3.9},
                {5.0, 4.5, 4.5, 4.2, 2.5, 4.3}
        };

        // Inicializando varibles de acumulado notas, promedio, por en cima de promedio
        double acumuladoNotasGrupo = 0.0;
        double promedioProGrupo = 0.0;
        double promedioPorEstudiante = 0;
        int count = 0;

        //Se itera sobre la matrix para obtener la sumatoria de las notas del grupo
        for (int i = 0; i < notasEstudiantes.length; i++) {

            for(int j = 0; j < notasEstudiantes[0].length; j++){
                acumuladoNotasGrupo += notasEstudiantes[i][j];
            }
        }
        // Calculando promedio
        promedioProGrupo = acumuladoNotasGrupo / (notasEstudiantes.length * notasEstudiantes[0].length);

        for (int i = 0; i < 6; i++) {

            for(int j = 0; j < 4; j++){
                promedioPorEstudiante += notasEstudiantes[j][i];
            }
            if (promedioPorEstudiante / notasEstudiantes.length > promedioProGrupo){
                count++;
            }
            promedioPorEstudiante = 0.0;
        }

        System.out.println("Promedio del grupo: " + Math.round(promedioProGrupo*100.0)/100.0);
        System.out.println("Cantidad estudiante por encima del promedio: " + count);
    }
}
