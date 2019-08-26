package tw;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.bytebuddy.jar.asm.commons.StaticInitMerger;
import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;
	private static final String Static = null;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
        
            int    ANumber=0;
            int BNumber=0;
            
            //答案    存储为位置和值
            String[] answer= {"1","2","3","4"};
            Map<String,Integer > mapAnswer=new HashMap<String,Integer >();
            for(int k =0;k <answer.length;k ++ )
            {
            	mapAnswer.put(answer[k], k);
            }
            
            //字符串转数组-》map 保留 key和位置
            //对比数组和位置，将位置相同且值相同的统计为xA,数值相同的统计为xB
            String[] arr = input.split(" "); 
           // System.out.println(Arrays.toString(arr));
            Map<String,Integer > mapIput=new HashMap<String, Integer>();
            for(int j =0;j <arr.length;j ++ )
            {
            	System.out.println(mapIput.get(arr[j]));
           	if(mapIput.get(arr[j])==null)
          			{
            		mapIput.put(arr[j], j);
        		
           			}
           	else {
           		System.out.println("输入错误");
           	}
            		
            	
            }
            for (String key : mapIput.keySet()) { 
            	 
            	} 
            for(Entry<String, Integer> Iput : mapIput.entrySet()){
            	
            	 for(Entry<String, Integer> Answer : mapAnswer.entrySet()){
            		
                 	if(Answer.getKey().equals(Iput.getKey())&&Answer.getValue()==Iput.getValue())
                 	{
                 		ANumber++;
                 	}
                 	if(Answer.getKey().equals(Iput.getKey())&&Answer.getValue()!=Iput.getValue())
                 	{BNumber++;}
                                 
                 }
            	
             
            }
            String result=ANumber+"A"+BNumber+"B";
        
           // System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5]
            System.out.println(input);
            System.out.println(result);
        }
    }
}
