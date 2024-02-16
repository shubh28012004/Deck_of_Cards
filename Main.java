package javalab ; 
public class Main {
    public static void main(String args[]) {
        Deck ob = new Deck();
        System.out.println(ob.getdeck());
        ob.shuffleDeck();
        System.out.println();
        System.out.println(ob.getdeck());
        System.out.println(ob.getCard());

        System.out.println();
        System.out.println();

        System.err.println("Same cards \n");
        System.out.println(ob.samecard());
        
        System.out.println();
        System.out.println();
        
        if(ob.findCard("Hearts", "2")== true) {
        	System.out.println("Card Found!");
        	
        }else {
        	System.out.println("Card not Found ! ");
        }
        System.out.println();
        System.out.println();

        System.err.println("Dealing 5 cards: ");
        System.out.println(ob.dealCard(5));
    }

}
