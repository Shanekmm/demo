package tesst;

public class browser {
	private static String[] history=new String[100];
	private static int n;
	public int no;
	public String[] hs=new String[100];
	public browser()
	{
		for(int i=0;i<n;i++) {
			Set(history[i]);
		}
		
	}
	public browser(String[] url) {
		for (int i = 0; i < url.length; i++) {
            history[i] = url[i];
            n++;
        }		
	}
	public void Set(String url) {
		hs[no++] = url;
	}
	public void prinths() {
		for(int i=0;i<no;i++) {
			System.out.println(hs[i]);
		}
	}
	public void printhistory() {
		for(int i=0;i<n;i++) {
			System.out.println(history[i]);
		}
	}
	
}
	
