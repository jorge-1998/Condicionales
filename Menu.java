package Menu;

public class Menu {
    Integer opcion = 0;
    public void Menu(){
        opciones();
    }
    
    public void setMenu(int op){
        opcion = op;
        switch (opcion){
            case 1: System.out.println("Caso 1");
                        break;
            case 2: System.out.println("Caso 2");
                        break;
            case 3: System.out.println("Salir");
                        break;
            default:
                throw new AssertionError();
        }
    }
    
    public void opciones(){
        System.out.println("1. Opcion numero uno");
        System.out.println("2. Opcion numero dos");
        System.out.println("3. Opcion salir");
    }
}
