package models.services;

import models.entities.CarRental;
import models.entities.Invoice;

public class RentalServices {
    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilTaxServices taxServices;

    public RentalServices(Double pricePerHour, Double pricePerDay, BrazilTaxServices taxServices) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxServices = taxServices;
    }

    public void processInvoice(CarRental carRental){
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double) (t2 - t1) / 1000 / 60 / 60; // encontra a diferença das datas em horas

        Double basicPayment;
        if (hours <= 12.0){
            basicPayment = Math.ceil(hours) * this.pricePerHour;
        }else {
            basicPayment =  Math.ceil(hours / 24) * this.pricePerDay;
        }

        Double tax = this.taxServices.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
