package config;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Configurations for both client and server
 */
public class GlobalConfig {
    // timeout for client-server response, 10 seconds
    public static final int SERVER_TIMEOUT = 10000;

    public static final String RES_CODE = "resCode";
    public static final String MESSAGE = "message";
    public static final String ROOM_ID = "roomID";
    public static final String TOKEN = "token";
    public static final String NEW_USER = "newUser";
    public static final String ACCEPT = "accept";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String ROOM_LIST = "roomList";
    public static final String HISTORY = "history";
    public static final String MSG_TYPE = "msgType";

    // resCode for server response to client
    public static final int SUCCESS = 1000;
    public static final int SERVER_ERROR = 1001;
    public static final int DUP_USERNAME = 1002;    // for register use
    public static final int NO_MATCH = 1003;
    public static final int MISSING_ARGS = 1004;
    public static final int NO_ROOM = 1005;
    public static final int DUP_USER = 1006;    // for inviting user to room use
    public static final int DECLINE = 1007;
    public static final int TOKEN_EXPIRED = 1008;
    public static final int NO_INVITATION = 1009;


    public static final HashMap<Integer, String> errorMsg = new HashMap<>() {{
        put(SUCCESS, "success");
        put(SERVER_ERROR, "internal server not available");
        put(DUP_USERNAME, "username already exists, try another username or login");
        put(NO_MATCH, "username or password does not match record");
        put(MISSING_ARGS, "missing request argument(s)");
        put(NO_ROOM, "no such a room in the system");
        put(DUP_USER, "user is already in the room");
        put(DECLINE, "invitation to room was declined");
        put(NO_INVITATION, "the invitation is not valid");
        put(TOKEN_EXPIRED, "token expired");
    }};

    // code identifying message type from server
    public static final int SYSTEM = 2001;
    public static final int CHAT = 2002;
    public static final int INVITATION = 2003;

    public static final ArrayList<Integer> ROUTE_PORTS = new ArrayList<>() {{
        add(8080);
        add(8082);
    }};
    public static final ArrayList<Integer> WEBSOCKET_PORTS = new ArrayList<>() {{
        add(8081);
        add(8083);
    }};
    public static final ArrayList<Integer> LOGIN_PORTS = new ArrayList<>() {{
        add(8090);
        add(8091);
    }};
    // protocols
    public static final String LOGIN_PROTOCOL = "/login";
    public static final String REGISTER_PROTOCOL = "/register";
    public static final String CREATE_ROOM_PROTOCOL = "/create_room";
    public static final String SEND_MSG_PROTOCOL= "/send_msg";
    public static final String INVITE_PROTOCOL= "/invite";
    public static final String INVITATION_RSP_PROTOCOL= "/invitation_rsp";
    public static final String GET_HISTORY_PROTOCOL = "/get_chat_history";

    // host and ports
    public static final String IP_ADDRESS = "127.0.0.1";
}
