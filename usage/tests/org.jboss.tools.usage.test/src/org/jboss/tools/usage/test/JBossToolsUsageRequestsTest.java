package org.jboss.tools.usage.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.jboss.tools.usage.googleanalytics.ILoggingAdapter;
import org.jboss.tools.usage.internal.HttpGetMethod;
import org.junit.Before;
import org.junit.Test;

public class JBossToolsUsageRequestsTest {

	private ILoggingAdapter loggingAdapter;

	@Before
	public void setUp() {
		this.loggingAdapter = new SystemOutLogger();
	}
	
	@Test
	public void testUrl0() throws IOException {
		String userAgent = "Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.2.4) Gecko/20100614 Ubuntu/10.04 (lucid) Firefox/10.0.0";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=338321265"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmje=1"
			+"&utmfl=10.1%20r53"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D156030507.1285760711.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}
		
	@Test
	public void testUrl0_0() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (X11; U; Linux x86_64; en-US)";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=338321288"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmje=1"
			+"&utmfl=10.1%20r53"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_0"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D156032507.1285760711.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}

	@Test
	public void testUrl0_1() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (X11; U; Linux x86_64; en-US; rv:1.9.2.4) Gecko/20100614 Ubuntu/10.04 (lucid) v201006010437R-H98-GA";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=3383212651"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmje=1"
			+"&utmfl=10.1%20r53"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_1"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D156030508.195542053.1281528584.1281528584.1281528584.1%3B%2B__utmz%3D156030500.1281528584.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}

	@Test
	public void testUrl0_2() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (X11; U; Linux x86_64; en-US; rv:1.9.2.4) Gecko/20100614 Ubuntu/10.04 (lucid) Eclipse/3.5.0";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=3383212652"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmje=1"
			+"&utmfl=10.1%20r53"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_2"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D156030509.1285760712.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}

	@Test
	public void testUrl0_3() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (X11; U; Linux x86_64; en-US;) Eclipse/3.5.0";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=3383212651"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmje=1"
			+"&utmfl=10.1%20r53"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_3"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D156030501.1285760711.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}
	
	@Test
	public void testUrl0_4() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=3383212651"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmje=1"
			+"&utmfl=10.1%20r53"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_4"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D156030502.195542053.1281528584.1281528584.1281528584.1%3B%2B__utmz%3D156030500.1281528584.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}

	@Test
	public void testUrl0_5() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (Linux x86_64)";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=33832126513"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmje=1"
			+"&utmfl=10.1%20r53"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_5"
			+"&utmac=UA-17645367-1"
			+"&__utma%3D156030503.195542053.1281528584.1281528584.1281528584.1%3B%2B__utmz%3D156030500.1281528584.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}

	@Test
	public void testUrl0_6() throws IOException {
		String userAgent = "Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.2.4) Gecko/20100614 Ubuntu/10.04 (lucid) com.jboss.jbds.product/3.0.1";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=338321265"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmje=1"
			+"&utmfl=10.1%20r53"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_6"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D156030507.1285760711.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}

	@Test
	public void testUrl0_7() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (X11; U; Linux x86_64; en-US)";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=338321268"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmje=1"
			+"&utmfl=10.1%20r53"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_7"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D156030507.1285760711.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}

	@Test
	public void testUrl0_7_1() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (X11; U; Linux x86_64; en-us)";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=338321068"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmje=1"
			+"&utmfl=10.1%20r53"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_7_1"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D156030507.1285760711.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}

	
	@Test
	public void testUrl0_7_2() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (X11; U; Linux x86_64; en-US)";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=338333268"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmdt=-%20JBoss%20Community"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_7_2"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D156620507.1285760111.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}
	
	@Test
	public void testUrl0_7_3() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (X11; U; Linux x86_64; en-US)";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=311333268"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmdt=tools-usage-test_0_7_3"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_7_3"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D112660507.1285760711.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}
	
	@Test
	public void testUrl0_7_3_mac() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (Macintosh; U; Intel Mac OS X 10.5; fr)";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=351333268"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmdt=tools-usage-test_0_7_3"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_7_3_mac"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D133660507.1285760711.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}
	
	@Test
	public void testUrl0_7_3_win() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (Windows; U; Windows NT 6.1; en-US)";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=351333254"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmdt=tools-usage-test_0_7_3_win"
			+"&utmhid=1087431432"
			+"&utmr=0"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_7_3_win"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D133660522.1285760711.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}


	@Test
	public void testUrl0_7_3_1() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (Windows; U; Windows NT 6.1; en-US)";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?" 
			+"utmwv=4.7.2"
			+"&utmn=358333254"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-us"
			+"&utmdt=tools-usage-test_0_7_3_1"
			+"&utmhid=1087431432"
			+"&utmr=smooks|seam|drools|esb"
			+"&utmp=%2Ftools%2Fusage%2FtestUrl0_7_3_1"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D133860522.1285760711.1281430767.1281430767.1281430767.1%3B%2B__utmz%3D156030500.1281430767.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}
	
	@Test
	public void testUrl8() throws IOException {
		String userAgent = "com.jboss.jbds.product/3.0.1 (Windows; U; Windows NT 6.1; en-US)";
		TestHttpGetMethod method = new TestHttpGetMethod(userAgent, loggingAdapter);
		String url = "http://www.google-analytics.com/__utm.gif?"
			+"utmwv=4.7.2"
			+"&utmn=453325272"
			+"&utmhn=jboss.org"
			+"&utmcs=UTF-8"
			+"&utmsr=1920x1080"
			+"&utmsc=24-bit"
			+"&utmul=en-US"
			+"&utmdt=jboss.org-tools-usage-instance"
			+"&utmhid=1722580305"
			+"&utmr=org.jboss.tools.usage.tests"
			+"&utmp=%2Fjboss.org%2Ftools%2Fusage%2FtestUrl8"
			+"&utmac=UA-17645367-1"
			+"&utmcc=__utma%3D999.69517276658961975851281943564260.1281943564259.1281943564259.1281943564259.-1%3B%2B__utmz%3D999.1281943564259.1.1.utmcsr%3D%28direct%29%7Cutmccn%3D%28direct%29%7Cutmcmd%3D%28none%29%3B"
			+"&gaq=1";
		method.request(url);
		assertEquals(HttpURLConnection.HTTP_OK, method.getResponseCode());
	}
	
	protected class TestHttpGetMethod extends HttpGetMethod {

		private HttpURLConnection urlConnection;

		public TestHttpGetMethod(String userAgent, ILoggingAdapter loggingAdapter) {
			super(userAgent, loggingAdapter);
		}

		@Override
		protected HttpURLConnection createURLConnection(String urlString,
				String userAgent) throws IOException {
			return this.urlConnection = super.createURLConnection(urlString, userAgent);
		}

		public int getResponseCode() throws IOException {
			return urlConnection.getResponseCode();
		}
	}
}
