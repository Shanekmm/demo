package tesst;
public class web {
	public static void main(String[] args)
	{
		String[] urls = {"apple.com", "google.com", "fb.com"};
		browser chrome=new browser(urls);
		browser firefox=new browser();
		chrome.Set("insta.com");
		chrome.prinths();
		firefox.printhistory();
	}
}