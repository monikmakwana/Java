/*
 Use While loop to generate random numbers and maintain a
	running sum of these values.Terminate when the sum exceeds 20.
	(Note:use Math.random() method to obtain numbers.)

****************
Program : 
****************
*/

import java.util.*;
class Random_Value
{
	public static void main(String args[])
	{
		double sum = 0,num;
		
		while(sum<=20)
		{
			num = Math.random();
			System.out.println("Number : " + num);
			sum = sum + num;
		}
		
		System.out.println("\nSum : " + sum);
	}
}

/*
****************
Output : 
****************

D:\java\ass1>javac Random_Value.java

D:\java\ass1>java Random_Value
Number : 0.0583898867457312
Number : 0.5323844419306222
Number : 0.16612941646063784
Number : 0.5398173905176288
Number : 0.6729410329955853
Number : 0.2017481751575978
Number : 0.975394824796241
Number : 0.7550958254693274
Number : 0.8117172297820215
Number : 0.6354559267085547
Number : 0.44769136522850894
Number : 0.6336576671220499
Number : 0.8055133028925132
Number : 0.2492492440581291
Number : 0.3754172034841706
Number : 0.841269786739181
Number : 0.3647994191872511
Number : 0.932483678565745
Number : 0.7929781558262956
Number : 0.3516408289465821
Number : 0.39431656568601947
Number : 0.8822938862554174
Number : 0.464031086977965
Number : 0.8873811629731461
Number : 0.5885527947944624
Number : 0.4854318041805229
Number : 0.41787291428972595
Number : 0.3342492384256581
Number : 0.836085060218379
Number : 0.8267881240555205
Number : 0.5966513062315589
Number : 0.49529244105925163
Number : 0.44221657911431644
Number : 0.9553648088739908
Number : 0.10964359303487226
Number : 0.6813726361412856

Sum : 20.54131880492647
*/