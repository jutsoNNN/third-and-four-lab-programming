package interfaces;

public interface CityActions {
    void generating();
    default void doSmth(){
        System.out.println("Процесс завершён.");
    }
}