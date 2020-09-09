/*
****************
Program : 
****************
*/

import java.util.*;
class CollectionExample
{	
	public static void main(String[] args)
	{
		ArrayList  a = new ArrayList();
		LinkedList l = new LinkedList();
		
		Date start;
		Date end;
		long difference1, difference2;
		long difference3, difference4;
		
		
		start = new Date();
		populate(a);
		end   = new Date();
		difference1 = end.getTime() - start.getTime();
		
		
		start = new Date();
		populate(l);
		end   = new Date();
		difference2 = end.getTime() - start.getTime();
		
		
		
		start = new Date();
		print(a);
		end   = new Date();
		difference3 = end.getTime() - start.getTime();
		
		start = new Date();
		print(l);
		end   = new Date();
		difference4 = end.getTime() - start.getTime();
		
		System.out.println("Time in Populating ArrayList elements  :: " + difference1);
		System.out.println("Time in Printing   ArrayList elements  :: " + difference3);
		
		System.out.println("Time in Populating LinkedList elements :: " + difference2);
		System.out.println("Time in Printing   LinkedList elements :: " + difference4);
		
	}
	
	public static void populate(List a)
	{
		for(int i=0; i < 5000; i++)
		{
			a.add("Element #" + Integer.toString(i+1));
		}
	}	
	
	public static void print(List a)
	{
		for(int i=0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	}
}

/*
****************
Output : 
****************

Element #4707
Element #4708
Element #4709
Element #4710
Element #4711
Element #4712
Element #4713
Element #4714
Element #4715
Element #4716
Element #4717
Element #4718
Element #4719
Element #4720
Element #4721
Element #4722
Element #4723
Element #4724
Element #4725
Element #4726
Element #4727
Element #4728
Element #4729
Element #4730
Element #4731
Element #4732
Element #4733
Element #4734
Element #4735
Element #4736
Element #4737
Element #4738
Element #4739
Element #4740
Element #4741
Element #4742
Element #4743
Element #4744
Element #4745
Element #4746
Element #4747
Element #4748
Element #4749
Element #4750
Element #4751
Element #4752
Element #4753
Element #4754
Element #4755
Element #4756
Element #4757
Element #4758
Element #4759
Element #4760
Element #4761
Element #4762
Element #4763
Element #4764
Element #4765
Element #4766
Element #4767
Element #4768
Element #4769
Element #4770
Element #4771
Element #4772
Element #4773
Element #4774
Element #4775
Element #4776
Element #4777
Element #4778
Element #4779
Element #4780
Element #4781
Element #4782
Element #4783
Element #4784
Element #4785
Element #4786
Element #4787
Element #4788
Element #4789
Element #4790
Element #4791
Element #4792
Element #4793
Element #4794
Element #4795
Element #4796
Element #4797
Element #4798
Element #4799
Element #4800
Element #4801
Element #4802
Element #4803
Element #4804
Element #4805
Element #4806
Element #4807
Element #4808
Element #4809
Element #4810
Element #4811
Element #4812
Element #4813
Element #4814
Element #4815
Element #4816
Element #4817
Element #4818
Element #4819
Element #4820
Element #4821
Element #4822
Element #4823
Element #4824
Element #4825
Element #4826
Element #4827
Element #4828
Element #4829
Element #4830
Element #4831
Element #4832
Element #4833
Element #4834
Element #4835
Element #4836
Element #4837
Element #4838
Element #4839
Element #4840
Element #4841
Element #4842
Element #4843
Element #4844
Element #4845
Element #4846
Element #4847
Element #4848
Element #4849
Element #4850
Element #4851
Element #4852
Element #4853
Element #4854
Element #4855
Element #4856
Element #4857
Element #4858
Element #4859
Element #4860
Element #4861
Element #4862
Element #4863
Element #4864
Element #4865
Element #4866
Element #4867
Element #4868
Element #4869
Element #4870
Element #4871
Element #4872
Element #4873
Element #4874
Element #4875
Element #4876
Element #4877
Element #4878
Element #4879
Element #4880
Element #4881
Element #4882
Element #4883
Element #4884
Element #4885
Element #4886
Element #4887
Element #4888
Element #4889
Element #4890
Element #4891
Element #4892
Element #4893
Element #4894
Element #4895
Element #4896
Element #4897
Element #4898
Element #4899
Element #4900
Element #4901
Element #4902
Element #4903
Element #4904
Element #4905
Element #4906
Element #4907
Element #4908
Element #4909
Element #4910
Element #4911
Element #4912
Element #4913
Element #4914
Element #4915
Element #4916
Element #4917
Element #4918
Element #4919
Element #4920
Element #4921
Element #4922
Element #4923
Element #4924
Element #4925
Element #4926
Element #4927
Element #4928
Element #4929
Element #4930
Element #4931
Element #4932
Element #4933
Element #4934
Element #4935
Element #4936
Element #4937
Element #4938
Element #4939
Element #4940
Element #4941
Element #4942
Element #4943
Element #4944
Element #4945
Element #4946
Element #4947
Element #4948
Element #4949
Element #4950
Element #4951
Element #4952
Element #4953
Element #4954
Element #4955
Element #4956
Element #4957
Element #4958
Element #4959
Element #4960
Element #4961
Element #4962
Element #4963
Element #4964
Element #4965
Element #4966
Element #4967
Element #4968
Element #4969
Element #4970
Element #4971
Element #4972
Element #4973
Element #4974
Element #4975
Element #4976
Element #4977
Element #4978
Element #4979
Element #4980
Element #4981
Element #4982
Element #4983
Element #4984
Element #4985
Element #4986
Element #4987
Element #4988
Element #4989
Element #4990
Element #4991
Element #4992
Element #4993
Element #4994
Element #4995
Element #4996
Element #4997
Element #4998
Element #4999
Element #5000
Time in Populating ArrayList elements  :: 0
Time in Printing   ArrayList elements  :: 453
Time in Populating LinkedList elements :: 0
Time in Printing   LinkedList elements :: 374

D:\mca214\java>
*/