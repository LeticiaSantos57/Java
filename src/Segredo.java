public class Segredo {
    static void main(){
        String Segredo = "777";
        String tentativa = "";
        while (!Segredo.equals(tentativa)){
            IO.println("errouuu");
            tentativa = IO.readln("digite o segredo");
            IO.println("parabéns vc acertou");
        }
    }
}