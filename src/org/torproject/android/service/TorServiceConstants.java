/* Copyright (c) 2009, Nathan Freitas, Orbot / The Guardian Project - http://openideals.com/guardian */
/* See LICENSE for licensing information */
package org.torproject.android.service;

public interface TorServiceConstants {


	public final static String TOR_APP_USERNAME = "org.torproject.android";
	public final static String ORWEB_APP_USERNAME = "info.guardianproject.browser";
	
	
	//home directory of Android application
	
	//name of the tor C binary
	public final static String TOR_BINARY_ASSET_KEY = "libtor.so";	
	
	//torrc (tor config file)
	public final static String TORRC_ASSET_KEY = "torrc";
	public final static String TORRC_TETHER_KEY = "torrctether";
	
	public final static String TOR_CONTROL_COOKIE = "control_auth_cookie";
	
	//how to launch tor
//	public final static String TOR_COMMAND_LINE_ARGS = "-f " + TORRC_INSTALL_PATH  + " || exit\n";
		
	//privoxy
	public final static String PRIVOXY_ASSET_KEY = "libprivoxy.so";
	
	//privoxy.config
	public final static String PRIVOXYCONFIG_ASSET_KEY = "privoxy.config";
	
	//geoip data file asset key
	public final static String GEOIP_ASSET_KEY = "geoip";
	public final static String GEOIP6_ASSET_KEY = "geoip6";
	
	
	//various console cmds
	public final static String SHELL_CMD_CHMOD = "chmod";
	public final static String SHELL_CMD_KILL = "kill -9";
	public final static String SHELL_CMD_RM = "rm";
	public final static String SHELL_CMD_PS = "ps";
	public final static String SHELL_CMD_PIDOF = "pidof";
	public final static String SHELL_CMD_LINK = "ln -s";
	

	public final static String CHMOD_EXE_VALUE = "700";

	
	public final static int FILE_WRITE_BUFFER_SIZE = 2048;
	
	//HTTP Proxy server port
	public final static int PORT_HTTP = 8118; //just like Privoxy!
	
	//Socks port client connects to, server is the Tor binary
	public final static int PORT_SOCKS = 9050;
	
	//what is says!
	public final static String IP_LOCALHOST = "127.0.0.1";
	public final static int TOR_CONTROL_PORT = 9051;
	public final static int UPDATE_TIMEOUT = 1000;
	public final static int TOR_TRANSPROXY_PORT = 9040;
	public final static int STANDARD_DNS_PORT = 53;
	public final static int TOR_DNS_PORT = 5400;
	
	//path to check Tor against
	public final static String URL_TOR_CHECK = "https://check.torproject.org";

    //control port 
    public final static String TOR_CONTROL_PORT_MSG_BOOTSTRAP_DONE = "Bootstrapped 100%";
    
    public final static int STATUS_OFF = 0;
    public final static int STATUS_ON = 1;
    public final static int STATUS_CONNECTING = 2;
    
    public final static int PROFILE_OFF = -1;
    public final static int PROFILE_ON = 1;

    public static final int STATUS_MSG = 1;
    public static final int ENABLE_TOR_MSG = 2;
    public static final int DISABLE_TOR_MSG = 3;
    public static final int LOG_MSG = 4;
    
    public static final String BINARY_TOR_VERSION = "0.2.4.20";
    public static final String BINARY_PRIVOXY_VERSION = "3.0.12";
    public static final String PREF_BINARY_TOR_VERSION_INSTALLED = "BINARY_TOR_VERSION_INTALLED";
    public static final String PREF_BINARY_PRIVOXY_VERSION_INSTALLED = "BINARY_PRIVOXY_VERSION_INTALLED";
    
    //obfsproxy 
    public static final String OBFSPROXY_ASSET_KEY = "libobfsproxy.so";
    
	public static final int MESSAGE_TRAFFIC_COUNT = 5;
	

	//name of the iptables binary
	public final static String IPTABLES_BINARY_ASSET_KEY = "libxtables.so";	
	

}
