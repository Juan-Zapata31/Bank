package app.domain.models;

public class GeneralBankingProduct {
    private int idGeneralBankingProduct;
    private String nameGeneralBankingProduct;
    private String categoryGeneralBankingProduct;
    private boolean RequiresApproval;

    public GeneralBankingProduct() {
    }

    public GeneralBankingProduct(int idGeneralBankingProduct, String nameGeneralBankingProduct, String categoryGeneralBankingProduct, boolean RequiresApproval) {
        this.idGeneralBankingProduct = idGeneralBankingProduct;
        this.nameGeneralBankingProduct = nameGeneralBankingProduct;
        this.categoryGeneralBankingProduct = categoryGeneralBankingProduct;
        this.RequiresApproval = RequiresApproval;
    }

    public int getIdGeneralBankingProduct() {
        return idGeneralBankingProduct;
    }

    public void setIdGeneralBankingProduct(int idGeneralBankingProduct) {
        this.idGeneralBankingProduct = idGeneralBankingProduct;
    }

    public String getNameGeneralBankingProduct() {
        return nameGeneralBankingProduct;
    }

    public void setNameGeneralBankingProduct(String nameGeneralBankingProduct) {
        this.nameGeneralBankingProduct = nameGeneralBankingProduct;
    }

    public String getCategoryGeneralBankingProduct() {
        return categoryGeneralBankingProduct;
    }

    public void setCategoryGeneralBankingProduct(String categoryGeneralBankingProduct) {
        this.categoryGeneralBankingProduct = categoryGeneralBankingProduct;
    }

    public boolean isRequiresApproval() {
        return RequiresApproval;
    }

    public void setRequiresApproval(boolean RequiresApproval) {
        this.RequiresApproval = RequiresApproval;
    }
}
