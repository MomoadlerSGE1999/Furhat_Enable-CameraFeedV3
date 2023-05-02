package furhatos.app.newskill.flow.main

import furhatos.app.newskill.flow.Parent
import furhatos.flow.kotlin.*
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Greeting : State = state(Parent) {
    onEntry {
        furhat.ask("Should I say Hello World?")
    }

    onResponse<Yes> {
        furhat.say("Hello World! .")
        goto(CameraFeet)
    }

    onResponse<No> {
        furhat.say("Ok.")
    }
    onNoResponse {
        furhat.say("The journey starts now")
        goto(CameraFeet)
    }
}
