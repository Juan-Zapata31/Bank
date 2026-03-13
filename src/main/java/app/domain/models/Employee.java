package app.domain.models;

import app.domain.models.enums.Roles;

public class Employee extends User {
    Roles typeEmployee;

    public Employee() {
    }

    public Employee(int idUser, String idRegister, String fullName, int idIdentityCard, String email, int phoneNumber, String address, String role, Boolean isActive) {
        super(idUser, idRegister, fullName, idIdentityCard, email, phoneNumber, address, role, isActive);
    }

    public Roles getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(Roles typeEmployee) {
        this.typeEmployee = typeEmployee;
    }
}
