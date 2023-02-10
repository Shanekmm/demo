package tesst;

public class Browser {
	private static String[] history=new String[100];
	private static int n;
	public Browser() {}
	public Browser(String[] url) {
	    set(url);
	      
        }		
	public void set(String[] url) {
		for(int i=0;i<url.length;i++)
		history[n++] = url[i];	
	}
	public void printHistory() {
		for(int i=0;i<n;i++) {
			System.out.println(history[i]);
			
		}
	}
	
}
	

