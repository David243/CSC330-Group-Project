package edu.cuny.csi.csc330.project;

import java.util.ResourceBundle;

public class GameChoices {

	
//	private List<BinaryTree> treeHistory = new ArrayList<BinaryTree>();

	private static Storage Node45 = new Storage();
	private static Storage Node34 = new Storage();
	private static Storage Node70 = new Storage();
	private static Storage Node24 = new Storage();
	private static Storage Node38 = new Storage();
	private static Storage Node62 = new Storage();
	private static Storage Node80 = new Storage();
	private static Storage Node21 = new Storage();
	private static Storage Node27 = new Storage();
	private static Storage Node37 = new Storage();
	private static Storage Node41 = new Storage();
	private static Storage Node79 = new Storage();
	private static Storage Node82 = new Storage();
	private static Storage Node26 = new Storage();
	private static Storage Node28 = new Storage();
	private static Storage Node81 = new Storage();
	private static Storage Node83 = new Storage();
	
	
	static void initFromPropBundle() {
		// so we're expecting a file in our CLASSPATH called
		// PropertyBundleDemo.properties
		ResourceBundle bundle = ResourceBundle.getBundle("GameChoices");
		
		String names[] = {"Node45","Node34","Node70","Node24","Node38","Node62", 
	    		"Node80","Node21","Node27","Node37","Node41","Node79","Node82","Node26",
	    		"Node28","Node81","Node83"};
		Storage sArr[] = {Node45,Node34,Node70,Node24,Node38,Node62, 
	    		Node80,Node21,Node27,Node37,Node41,Node79,Node82,Node26,
	    		Node28,Node81,Node83};
		
        for(int i = 0;i<names.length;i++) {
        	if (bundle.containsKey(names[i])) {
        		sArr[i].story = bundle.getString(names[i]);
        	}
        	if (bundle.containsKey(names[i]+"L")) {
        		sArr[i].lText = bundle.getString(names[i]+"L");
        	}
        	if (bundle.containsKey(names[i]+"R")) {
        		sArr[i].rText = bundle.getString(names[i]+"R");
        	}
        
        }
		
	}
	
	
	public static Storage[] stringArr() {
		Storage[] stringArr = {Node45,Node34,Node70,Node24,Node38,Node62, 
	    		Node80,Node21,Node27,Node37,Node41,Node79,Node82,Node26,
	    		Node28,Node81,Node83};
	
	return stringArr;	
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
