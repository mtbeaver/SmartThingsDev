definition(
    name: "Haiku SenseMe Service Manager",
    namespace: "smartthings",
    author: "mtbeaver",
    description: "Service Manager for discovering Haiku SenseMe Smart fans",
    category: "Fan",
    iconUrl: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience.png",
    iconX2Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png",
    iconX3Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png")

preferences {
    page(name: "deviceDiscovery", title: "Haiku Smart Fan Discovery", nextPage: "deviceDiscovery")
}    

def _broadcastAddr = ;
def _port = 31415;

def deviceDiscovery() {
    
    // Set the device id to the broadcast address and port
    device.deviceNetworkId = "";
}

void sendDiscoveryMessage() {
    sendHubCommand(new physicangraph.device.HubAction("<ALL;DEVICE;ID;GET>", physicalgraph.device.Protocol.LAN))
}
