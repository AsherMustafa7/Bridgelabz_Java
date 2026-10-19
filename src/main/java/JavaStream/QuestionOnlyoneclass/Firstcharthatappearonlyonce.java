package JavaStream.QuestionOnlyoneclass;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class Firstcharthatappearonlyonce 
{
 public static void main(String[] args) 
    {
        Map<Character,Integer> mpp=new LinkedHashMap<>();
        
        String str="Asher Mustafa";
        for(char c:str.toCharArray())
            {
                mpp.put(c,mpp.getOrDefault(c,0)+1);
            }
        Optional <Character>ch =mpp.entrySet().stream().filter(e->e.getValue()==1).map(p->p.getKey()).findFirst();
        ch.ifPresent(c->System.out.println(c));
    }   
}
