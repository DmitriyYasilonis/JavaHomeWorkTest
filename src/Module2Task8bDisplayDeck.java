public class Module2Task8bDisplayDeck {
        public static void main(String[] args) {
            Module2Task8aDeck module2Task8aDeck = new Module2Task8aDeck();
            for (int suit = Module2Task8Card.DIAMONDS; suit <= Module2Task8Card.SPADES; suit++) {
                for (int rank = Module2Task8Card.ACE; rank <= Module2Task8Card.KING; rank++) {
                    Module2Task8Card module2Task8Card = module2Task8aDeck.getCard(suit, rank);
                    System.out.format("%s of %s%n",
                            module2Task8Card.rankToString(module2Task8Card.getRank()),
                            module2Task8Card.suitToString(module2Task8Card.getSuit()));
                }
            }
        }

}
