package oopsjava;

public class TeaPoly {
    public static void main(String[] args) {
        
        Tea[] teas = new Tea[4]; 

        
        teas[0] = new BlackTea();
        teas[1] = new GreenTea();
        teas[2] = new HerbalTea();
        teas[3] = new Tea(); 

        
        for (Tea tea : teas) {
            tea.prepareTea();
        }
    }
}
