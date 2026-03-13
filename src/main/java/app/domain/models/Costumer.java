package app.domain.models;

import app.domain.models.enums.Roles;

public class Costumer extends User {
    Roles typeCostumer;


    public Costumer() {
    }

    public Costumer(int idUser, String idRegister, String fullName, int idIdentityCard, String email, int phoneNumber, String address, String role, Boolean isActive, String idCostumer, String password) {
        super(idUser, idRegister, fullName, idIdentityCard, email, phoneNumber, address, role, isActive);
    }

    public Roles getTypeCostumer() {
        return typeCostumer;
    }

    public void setTypeCostumer(Roles typeCostumer) {
        this.typeCostumer = typeCostumer;
    }

}