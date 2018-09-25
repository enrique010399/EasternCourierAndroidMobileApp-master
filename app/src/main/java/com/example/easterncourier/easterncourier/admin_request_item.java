package com.example.easterncourier.easterncourier;

public class admin_request_item {
    String requestId;
    String senderLocationLatitude;
    String senderLocationLongitude;
    String receiverLocationLatitude;
    String receiverLocationLongitude;
    String receiverName;
    String requestDescription;
    String clientUserName;
    String clientFullName;
    String clientDateRequested;
    String clientPackageImage;

    public admin_request_item(){

    }

    public admin_request_item(String requestId, String senderLocationLatitude, String senderLocationLongitude, String receiverLocationLatitude, String receiverLocationLongitude, String receiverName, String requestDescription, String clientUserName, String clientFullName, String clientDateRequested, String clientPackageImage) {
        this.requestId = requestId;
        this.senderLocationLatitude = senderLocationLatitude;
        this.senderLocationLongitude = senderLocationLongitude;
        this.receiverLocationLatitude = receiverLocationLatitude;
        this.receiverLocationLongitude = receiverLocationLongitude;
        this.receiverName = receiverName;
        this.requestDescription = requestDescription;
        this.clientUserName = clientUserName;
        this.clientFullName = clientFullName;
        this.clientDateRequested = clientDateRequested;
        this.clientPackageImage = clientPackageImage;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSenderLocationLatitude() {
        return senderLocationLatitude;
    }

    public void setSenderLocationLatitude(String senderLocationLatitude) {
        this.senderLocationLatitude = senderLocationLatitude;
    }

    public String getSenderLocationLongitude() {
        return senderLocationLongitude;
    }

    public void setSenderLocationLongitude(String senderLocationLongitude) {
        this.senderLocationLongitude = senderLocationLongitude;
    }

    public String getReceiverLocationLatitude() {
        return receiverLocationLatitude;
    }

    public void setReceiverLocationLatitude(String receiverLocationLatitude) {
        this.receiverLocationLatitude = receiverLocationLatitude;
    }

    public String getReceiverLocationLongitude() {
        return receiverLocationLongitude;
    }

    public void setReceiverLocationLongitude(String receiverLocationLongitude) {
        this.receiverLocationLongitude = receiverLocationLongitude;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public String getClientUserName() {
        return clientUserName;
    }

    public void setClientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
    }

    public String getClientFullName() {
        return clientFullName;
    }

    public void setClientFullName(String clientFullName) {
        this.clientFullName = clientFullName;
    }

    public String getClientDateRequested() {
        return clientDateRequested;
    }

    public void setClientDateRequested(String clientDateRequested) {
        this.clientDateRequested = clientDateRequested;
    }

    public String getClientPackageImage() {
        return clientPackageImage;
    }

    public void setClientPackageImage(String clientPackageImage) {
        this.clientPackageImage = clientPackageImage;
    }
}
