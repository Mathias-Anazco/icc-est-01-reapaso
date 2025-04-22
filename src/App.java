
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 20),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)

        };
        ViewConsole vc = new ViewConsole();
        PersonaController mI = new PersonaController();
        vc.printMessage("--------------El arreglo de las personas--------------");
        vc.printPersonaArray(personas);
        vc.printMessage("\n--------------El arreglo orgenado de las personas--------------");
        mI.ordenarPorEdad(personas);
        vc.printPersonaArray(personas);

        Persona personaEncontrada = mI.buscarPorEdad(personas, 40);
        vc.printMessage("\nBuscar persona con edad 40");
        if(personaEncontrada==null){
            vc.printMessage("No hay persona con esa edad");
        }else{
            vc.printMessage("La persona con la edad "+40+" es ");
            vc.printMessage(personaEncontrada.toString());


        Persona personaEncontrada2 = mI.buscarPorEdad(personas, 99);
        vc.printMessage("\nBuscar persona con edad 99");
        if(personaEncontrada2==null){
            vc.printMessage("No hay persona con esa edad");
        }else{
            vc.printMessage("La persona con la edad "+99+" es ");
            vc.printMessage(personaEncontrada2.toString());
        }

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD
    }
    }
}
