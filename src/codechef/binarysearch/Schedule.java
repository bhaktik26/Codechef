package codechef.binarysearch;

import java.io.*;
import java.util.*;
public class Schedule
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int z=1;z<=t;z++)
        {
            String s[]=br.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            int c=1;
            String str=br.readLine().trim();
            List<Integer> list=new ArrayList<>();int o1=0,o2=0;
            char ch[]=str.toCharArray();
            if(str.length()==1)
            {
                System.out.println(1);
                continue;
            }
            for(int i=0;i<n;i++)
            {
                ch[i]=str.charAt(i);
                if(i%2==0)
                {
                    if(ch[i]!='1')
                    o1++;
                    if(ch[i]!='0')
                    o2++;
                }
                else
                {
                    if(ch[i]!='0')
                    o1++;
                    if(ch[i]!='1')
                    o2++;
                }
                if(i>0)
                {
                    if(ch[i]==ch[i-1])
                    {
                        c++;
                    }
                    else
                    {
                        
                        list.add(c);
                        c=1;
                    }
                }
            }
            list.add(c);
            if((int)Math.min(o1,o2) <=k)
            System.out.println(1);
            else
            {
                int lo=2,hi=n,min=n;
                while(lo<=hi)
                {
                    int mid=(lo+hi)/2;
                    int fl=0;
                    for(int j:list)
                    {
                        fl+=j/(mid+1);
                    }
                    if(fl<=k)
                    {
                        hi=mid-1;
                        min=(int)Math.min(min,mid);
                    }
                    else
                    lo=mid+1;
                }
                System.out.println(min);
            }
        }
    }
} 
