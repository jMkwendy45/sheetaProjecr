package shita.data.model;

import java.time.LocalDate;
import java.util.List;

public class Package {
    private  int id;
    private double weightInGram;
    private User sendersDetails;
    private User receiversDetails;
    private LocalDate timeCreated;
    private List<Event>Status;
    private  boolean payOnDelivery;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeightInGram() {
        return weightInGram;
    }

    public void setWeightInGram(double weightInGram) {
        this.weightInGram = weightInGram;
    }

    public User getSendersDetails() {
        return sendersDetails;
    }

    public void setSendersDetails(User sendersDetails) {
        this.sendersDetails = sendersDetails;
    }

    public User getReceiversDetails() {
        return receiversDetails;
    }

    public void setReceiversDetails(User receiversDetails) {
        this.receiversDetails = receiversDetails;
    }

    public LocalDate getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDate timeCreated) {
        this.timeCreated = timeCreated;
    }

    public List<Event> getStatus() {
        return Status;
    }

    public void setStatus(List<Event> status) {
        Status = status;
    }

    public boolean isPayOnDelivery() {
        return payOnDelivery;
    }

    public void setPayOnDelivery(boolean payOnDelivery) {
        this.payOnDelivery = payOnDelivery;
    }


}
