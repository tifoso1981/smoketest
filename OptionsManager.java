package gov.gao.qa.base;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class OptionsManager {

	public ChromeOptions co;
	public FirefoxOptions fo;
	public EdgeOptions eo;
	public Properties prop;

	public OptionsManager(Properties prop) {
		this.prop = prop;
	}

	public ChromeOptions getChromeOptions() {
		co = new ChromeOptions();		
		co.addArguments("--no-sandbox");
		co.addArguments("--disable-dev-shm-usage");
		co.addArguments("--disable-features=VizDisplayCompositor");
		co.addArguments("--start-maximized");
		co.addArguments("--remote-allow-origins=*");
		co.setPageLoadStrategy(PageLoadStrategy.NONE);
		//co.addArguments("--headless");
		co.addArguments("--incognito"); 
		return co;
	}
	
	public FirefoxOptions getFirefoxOptions() { 
		fo = new FirefoxOptions();
		fo.setPageLoadStrategy(PageLoadStrategy.NONE);
		if(prop.getProperty("headless").equals("yes")) fo.addArguments("--headless");
		if(prop.getProperty("incognito").equals("yes")) fo.addArguments("--incognito"); 
		return fo;
	}
	
	public EdgeOptions getEdgeOptions() { 
		eo = new EdgeOptions();		
		Map<String, Object> prefs = new HashMap<String, Object>();
		eo.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		List<String> args = Arrays.asList("use-fake-ui-for-media-stream", "use-fake-device-for-media-stream");
		Map<String, Object> map = new HashMap<>();
		map.put("args", args);
		eo.setCapability("ms:edgeOptions", map);
		prefs.put("download.default_directory", System.getProperty("user.dir") + File.separator + "FILES");
		prefs.put("profile.default_content_setting_values.automatic_downloads", 1);
		eo.setExperimentalOption("prefs", prefs);
		eo.addArguments("--no-sandbox");
		eo.addArguments("--disable-dev-shm-usage");
		eo.addArguments("--disable-features=VizDisplayCompositor");
		eo.addArguments("--start-maximized");
		eo.addArguments("--remote-allow-origins=*");
		eo.addArguments("--disable-gpu");
		eo.addArguments("headless");
		eo.addArguments("inprivate"); 
		return eo;
	}
}
