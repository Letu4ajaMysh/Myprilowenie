package as.course.myprilowenie;

import android.util.Log;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;

public class GameXMLParser {

    XmlPullParser xpp;
    private String currentName;
    private Integer currentId;

    public GameXMLParser ( XmlPullParser xpp ) {
        this.xpp = xpp;
    }

    public ArrayList<String> getGamesList(){

    }

//    public ArrayList<Game> getGamesList ( ) {
//        ArrayList<Game> gamesList = new ArrayList<> ( );
//        int isName = 0;
//
//
//        try {
//            int eventType = xpp.getEventType ( );
//            while (eventType != XmlPullParser.END_DOCUMENT) {
//
//                if (eventType == XmlPullParser.START_DOCUMENT) {
//                } else if (eventType == XmlPullParser.START_TAG) {
//                    if (xpp.getName ( ).equals ( "game" )) {
//                        currentId = Integer.valueOf ( xpp.getAttributeValue ( 0 ) );
//                    }
//                    if (xpp.getName ( ).equals ( "name" )) {
//                        isName = 1;
//                    }
//
//                } else if (eventType == XmlPullParser.END_TAG) {
//                    if (xpp.getName ( ).equals ( "game" )) {
//                        gamesList.add ( new Game ( this.currentName , this.currentId ) );
//                    }
//
//
//                } else if (eventType == XmlPullParser.TEXT) {
//                    if (isName == 1) {
//                        this.currentName = xpp.getText ( );
//                        isName = 0;
//                    }
//                }
//
//                eventType = xpp.next ( );
//            }
//        } catch (Throwable t) {
//            Log.v ( "Parser" , "Ошибка при загрузке XML-документа: " + t.toString ( ) );
//        }
//        return gamesList;
   // }

    public Game getGame ( Integer id ) {
        Game currentGame = new Game ( );
        Boolean isFound = false;
        Boolean isName = false;
        Boolean isDescription = false;

        try {
            int eventType = xpp.getEventType ( );
            while (eventType != XmlPullParser.END_DOCUMENT) {

                if (eventType == XmlPullParser.START_TAG) {
                    if (xpp.getName ( ).equals ( "game" )) {
                        if (Integer.valueOf ( xpp.getAttributeValue ( 0 ) ) == id) {
                            isFound = true;
                        }
                    } else if (xpp.getName ( ).equals ( "name" )) {
                        isName = true;
                    } else if (xpp.getName ( ).equals ( "description" )) {
                        isDescription = true;
                    }
                } else if (eventType == XmlPullParser.TEXT) {
                    if (isName && isFound) {
                        currentGame.setName ( xpp.getText ( ) );
                        isName = false;
                    } else if (isDescription && isFound) {
                        currentGame.setDescription ( xpp.getText ( ) );
                        isDescription = false;
                    }
                } else if (eventType == XmlPullParser
                        .END_TAG && xpp.getName ( ).equals ( "game" )) {
                    isFound = false;
                }


                eventType = xpp.next ( );
            }
        } catch (Throwable t) {
            Log.v ( "Parser" , "Ошибка при загрузке XML-документа: " + t.toString ( ) );
        }
        return currentGame;
    }
}
