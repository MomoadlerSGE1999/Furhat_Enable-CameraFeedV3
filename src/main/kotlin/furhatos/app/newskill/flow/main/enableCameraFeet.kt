package furhatos.app.newskill.flow.main

import furhatos.app.newskill.flow.Parent
import furhatos.flow.kotlin.Furhat.Companion.cameraFeed
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state



val CameraFeet :State =  state() {

    onEntry {
        /** Camera feed */
        /** Camera feed */
        furhat.cameraFeed.enable()     //Enables the camera feed
        //furhat.cameraFeed.disable()    //Disables the camera feed
        //furhat.cameraFeed.isOpen()     //Returns a boolean depicting if the feed is open
        furhat.cameraFeed.isClosed()   //Returns a boolean depicting if the feed is closed.
        furhat.cameraFeed.port()       //Returns the port of the camera feed as an Int.

        /** Audio feed */

        /** Audio feed */
        //furhat.cameraFeed.disable()    //Disables the audio feed
        furhat.cameraFeed.isOpen()     //Returns a boolean depicting if the feed is open
        //furhat.cameraFeed.port()       //Returns the port of the audio feed as an Int.
        println(cameraFeed.isOpen())
        println(cameraFeed.isClosed())
        println(cameraFeed.port())
    }

}