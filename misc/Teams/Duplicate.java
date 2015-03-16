import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Duplicate {
 
    final static int ts = 2;
    //final static List<List<String>> teams = Lists.newArrayList();
    final static List<List<String>> rootList = new ArrayList<List<String>>(); 
    public static void main(String[] args) {
        List<String> tmpList = Arrays.asList(args);
        TreeSet<String> unique = new TreeSet<String>(tmpList);
        String[] result = unique.toArray(new String[unique.size()]);
        if (args.length == result.length) {
        	System.out.println("No duplicates found!");
        	//System.out.println(Arrays.toString(result));
        	System.out.println("Make sure you shuffle them before sending!");
        	divide(result);
        }
        else {
        	System.out.println("Duplicates found!");
        }
    }
    public static void divide(String[] names) {

    	for(int i=0;i<names.length;i=i+ts) {
    	    String[] grp = Arrays.copyOfRange(names, i, i + ts);
    	    List<String> nodeList = new ArrayList<String>(Arrays.asList(grp));
            rootList.add(nodeList);
        }  
        //System.out.println(rootList);
        for(int i=0;i<rootList.size();i++){
        	System.out.println(rootList.get(i));
        }
    }
}

