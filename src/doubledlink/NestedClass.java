package doubledlink;

/**
 * @author 30038637 Takuya Hasama 21/07/2021
 */
public class NestedClass {

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFirst("Australia", "Canberra");
        dll.addFirst("Japan", "Tokyo");
        dll.addNext("Brazil", "Brasilia");
        dll.addNext("America", "Washinton");
        dll.addNext("Taiwan", "Taipei");
        dll.iterateForward();
        dll.iterateBackward();

        
    }

}
