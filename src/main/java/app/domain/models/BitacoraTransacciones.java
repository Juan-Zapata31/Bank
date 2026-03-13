package app.domain.models;

public class BitacoraTransacciones {
    int idRegister;
    String typeOperation;
    String responsableUser;
    String descriptionOperation;
    String resultOperation;
    int idOrigen;


    public BitacoraTransacciones() {
    }

    public BitacoraTransacciones(int idRegister, String typeOperation, String responsableUser, String descriptionOperation, String resultOperation, int idOrigen) {
        this.idRegister = idRegister;
        this.typeOperation = typeOperation;
        this.responsableUser = responsableUser;
        this.descriptionOperation = descriptionOperation;
        this.resultOperation = resultOperation;
        this.idOrigen = idOrigen;
    }

    public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getResponsableUser() {
        return responsableUser;
    }

    public void setResponsableUser(String responsableUser) {
        this.responsableUser = responsableUser;
    }

    public String getDescriptionOperation() {
        return descriptionOperation;
    }

    public void setDescriptionOperation(String descriptionOperation) {
        this.descriptionOperation = descriptionOperation;
    }

    public String getResultOperation() {
        return resultOperation;
    }

    public void setResultOperation(String resultOperation) {
        this.resultOperation = resultOperation;
    }

    public int getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(int idOrigen) {
        this.idOrigen = idOrigen;
    }

    @Override
    public String toString() {
        return "BitacoraTransacciones [idRegister=" + idRegister + ", typeOperation=" + typeOperation + ", responsableUser=" + responsableUser + ", descriptionOperation=" + descriptionOperation + ", resultOperation=" + resultOperation + ", idOrigen=" + idOrigen + "]";
    }

}
