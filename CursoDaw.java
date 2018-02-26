
/**
 *  Modela un grupo de alumnos de un curso
 */
public class CursoDaw
{

    private static final int MAX_ALUMNOS = 10;

    private String nombreCurso;
    private Alumno[] alumnos;
    private int total;

    /**
     * Constructor de la clase CursoDai
     */
    public CursoDaw(String nombreCurso)
    {
        this.nombreCurso = nombreCurso;
        alumnos = new Alumno[MAX_ALUMNOS];
        total = 0;
        
    }

    /**
     *   Añade un alumno al curso al final - Si el curso está completo se mostrará un mensaje    
     */
    public void addAlumno(String nombre, int nota)
    {
        if(total < alumnos.length)
        {
            total ++;
        
        }
        else
        {
            System.out.println("EL curso esta completo");
        }
        
    }

    /**
     *    Añade un alumno al curso al final - Si el curso está completo se mostrará un mensaje  
     */
    public void addAlumno(Alumno alumno)
    {
        
            
    }

    // /**
     // * devuelve la cantidad de aprobados en el curso
     // */ 
    // public int totalAprobados()
    // { 
        
    // }
    
    // /**
     // * devuelve un array de String con los nombres de los alumnos que han aprobado todo
     // */ 
    // public String[] alumnosConTodoAprobado()
    // {

            
    // }

    // /**
     // * ordena el curso de mayor a menor nota por el método de selección directa (se modifica el array original)
     // */
    // public  void ordenarPorSeleccionDirecta()
    // {

            
    // }
    // /**
     // * Borrar los alumnos que han obtenido un 3 devolviendo la cantidad de alumnos borrados
     // */
    // public  int borrarLosDeNota3()
    // {

            
    // }
        
    // /**
     // * Representación textual del curso
     // */
    // public String toString()
    // { 

    // }
    
  
    
     // /**
     // *  crea una copia del array alumnos
     // *  Ordena la copia de menor a mayor nota por el método de inserción directa y lo devuelve.
     // */
    // public Alumno[] ordenarPorInsercionDirecta()
    // {

    // }
    
      
    // /**
     // *  obtiene un array con los nombres de los alumnos que han aprobado todo
     // *  Ordena alfabéticamente ese  array usando un método de la clase Arrays
     // */
    // public String[] ordenarPorNombreAprobados()
    // {

    // }
    
    

}
