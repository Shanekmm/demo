package tesst;
public class Web {
	public static void main(String[] args)
	{
		String[] urls = {"apple.com", "google.com", "fb.com"};
		Browser chrome=new Browser(urls);
		System.out.println("\n Visited urls in chrome \n");
		chrome.printHistory();
		String[] url = {"insta.com","twitter.com"};
		chrome.set(url);
		System.out.println("\n Updated urls in chrome \n");
		chrome.printHistory();
	    String[] ur = {"reddit.com","snapchat.com"};
		Browser firefox=new Browser(ur);
		System.out.println("\n New History of Firefox \n");
		firefox.printHistory();
	}
}
