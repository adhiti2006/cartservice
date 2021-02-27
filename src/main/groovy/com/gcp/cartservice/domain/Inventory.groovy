package com.gcp.cartservice.domain

class Inventory {
    String id
    boolean storePickUp
    boolean shipToHome
    List<OpenBox> openBoxList

    Inventory(String id, boolean storePickUp, boolean shipToHome, List<OpenBox> openBoxList) {
        this.id = id
        this.storePickUp = storePickUp
        this.shipToHome = shipToHome
        this.openBoxList = openBoxList
    }
}
