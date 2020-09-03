/*
****************
Program : 
****************
*/

import java.util.*;
public class CardDeck
{
    public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter Number of hands : ");
        int hands = scan.nextInt();
		System.out.print("\nEnter Cards per hand : ");
        int cards = scan.nextInt();
    

        String[] suit = {"SPADES", "HEARTS", "DIAMONDS", "CLUBS"};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        List<String> deck = new ArrayList<String>();
        for (int i = 0; i < suit.length; i++)
            for (int j = 0; j < rank.length; j++)
                deck.add(rank[j] + " of " + suit[i]);


        Collections.shuffle(deck);
    
        if (hands * cards > deck.size())
		{
            System.out.println("Not enough cards.");
            return;
        }
    
        for (int i = 0; i < hands; i++)
            System.out.println(dealHand(deck, cards));
    }
	
    public static <E> List<E> dealHand(List<E> deck, int n)
	{
        int dSize = deck.size();
        List<E> handView = deck.subList(dSize - n, dSize);
        List<E> hand = new ArrayList<E>(handView);
        handView.clear();
        return hand;
    }
}

/*
****************
Output : 
****************

D:\mca214\java>javac CardDeck.java

D:\mca214\java>java CardDeck

Enter Number of hands : 5

Enter Cards per hand : 4
[9 of HEARTS, 7 of HEARTS, 10 of SPADES, 10 of HEARTS]
[King of SPADES, 4 of HEARTS, 6 of HEARTS, Queen of SPADES]
[Ace of CLUBS, 3 of DIAMONDS, Ace of HEARTS, 6 of SPADES]
[4 of CLUBS, 7 of DIAMONDS, 2 of CLUBS, 10 of CLUBS]
[Jack of SPADES, 6 of CLUBS, 5 of HEARTS, 8 of DIAMONDS]

D:\mca214\java>
*/