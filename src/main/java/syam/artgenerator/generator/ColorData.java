/**
 * ArtGenerator - Package: syam.artgenerator.generator
 * Created: 2012/11/21 20:37:28
 */
package syam.artgenerator.generator;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DataMap (DataMap.java)
 * @author syam(syamn)
 */
public class ColorData {

    private static Map<Color, String> colorMap = new HashMap<Color, String>();

    public static void init(List<String> allowedBlocks){
        colorMap.clear();

        // put colors
        for (String id : allowedBlocks) {

        	switch(id.trim()) {
        	    case "35:0":
        	    	putColor("35:0", 221, 221, 221);
        	    	break;
        	    case "35:1":
        	    	putColor("35:1", 172, 105, 65);
        	    	break;
        	    case "35:2":
        	    	putColor("35:2", 179, 80, 188);
        	    	break;
        	    case "35:3":
        	    	putColor("35:3", 106, 138, 201);
        	    	break;
        	    case "35:4":
        	    	putColor("35:4", 177, 166, 39);
        	    	break;
        	    case "35:5":
        	    	putColor("35:5", 65, 174, 56);
        	    	break;
        	    case "35:6":
        	    	putColor("35:6", 208, 132, 153);
        	    	break;
        	    case "35:7":
        	    	putColor("35:7", 64, 64, 64);
        	    	break;
        	    case "35:8":
        	    	putColor("35:8", 154, 161, 161);
        	    	break;
        	    case "35:9":
        	    	putColor("35:9", 46, 110, 137);
        	    	break;
        	    case "35:10":
        	    	putColor("35:10", 126, 61, 181);
        	    	break;
        	    case "35:11":
        	    	putColor("35:11", 46, 56, 141);
        	    	break;
        	    case "35:12":
        	    	putColor("35:12", 79, 50, 31);
        	    	break;
        	    case "35:13":
        	    	putColor("35:13", 53, 70, 27);
        	    	break;
        	    case "35:14":
        	    	putColor("35:14", 150, 52, 48);
        	    	break;
        	    case "35:15":
        	    	putColor("35:15", 0, 0, 0);
        	    	break;
        	    case "1":
        	    	putColor("1", 125, 125, 125);
        	    	break;
        	    case "3":
        	    	putColor("3", 134, 96, 67);
        	    	break;
        	    case "4":
        	    	putColor("4", 122, 122, 122);
        	    	break;
        	    case "5":
        	    	putColor("5", 156, 127, 78);
        	    	break;
        	    case "12":
        	    	putColor("12", 219, 211, 160);
        	    	break;
        	    case "13":
        	    	putColor("13", 131, 123, 123);
        	    	break;
        	    case "22":
        	    	putColor("22", 29, 71, 165);
        	    	break;
        	    case "24":
        	    	putColor("24", 218, 210, 158);
        	    	break;
        	    case "25":
        	    	putColor("25", 100, 67, 50);
        	    	break;
        	    case "41":
        	    	putColor("41", 249, 236, 78);
        	    	break;
        	    case "42":
        	    	putColor("42", 219, 219, 219);
        	    	break;
        	    case "45":
        	    	putColor("45", 146, 99, 86);
        	    	break;
        	    case "48":
        	    	putColor("48", 103, 121, 103);
        	    	break;
        	    case "49":
        	    	putColor("49", 20, 18, 29);
        	    	break;
        	    case "57":
        	    	putColor("57", 97, 219, 213);
        	    	break;
        	    case "80":
        	    	putColor("80", 239, 251, 251);
        	    	break;
        	    case "82":
        	    	putColor("82", 158, 164, 176);
        	    	break;
        	    case "86":
        	    	putColor("86", 165, 110, 44);
        	    	break;
        	    case "87":
        	    	putColor("87", 40, 20, 20);
        	    	break;
        	    case "88":
        	    	putColor("88", 84, 64, 51);
        	    	break;
        	    case "89":
        	    	putColor("89", 143, 118, 69);
        	    	break;
        	    case "5:1":
        	    	putColor("5:1", 128, 95, 54);
        	    	break;
        	    case "5:2":
        	    	putColor("5:2", 215, 203, 141);
        	    	break;
        	    case "5:3":
        	    	putColor("5:3", 184, 135, 112);
        	    	break;
        	    case "19":
        	    	putColor("19", 229, 229, 79);
        	    	break;
        	    case "112":
        	    	putColor("112", 31, 16, 19);
        	    	break;
        	    case "133":
        	    	putColor("133", 95, 233, 134);
        	    	break;
        	}
        }

    }

    private static void putColor(final String block, final int r, final int g, final int b){
        colorMap.put(new Color(r, g, b), block.trim());
    }

    public static String getBlockStr(final Color color){
        if (color == null) return "0";
        return (colorMap.containsKey(color)) ? colorMap.get(color) : "0";
    }

    public static Map<Color, String> getColorMap(){
        return colorMap;
    }
}
