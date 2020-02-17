public class Module2Task8aDeck {
        public static int numSuits = 4;
        public static int numRanks = 13;
        public static int numCards = numSuits * numRanks;

        private Module2Task8Card[][] module2Task8Cards;

        public Module2Task8aDeck() {
            module2Task8Cards = new Module2Task8Card[numSuits][numRanks];
            for (int suit = Module2Task8Card.DIAMONDS; suit <= Module2Task8Card.SPADES; suit++) {
                for (int rank = Module2Task8Card.ACE; rank <= Module2Task8Card.KING; rank++) {
                    module2Task8Cards[suit-1][rank-1] = new Module2Task8Card(rank, suit);
                }
            }
        }

        public Module2Task8Card getCard(int suit, int rank) {
            return module2Task8Cards[suit-1][rank-1];
        }

}
