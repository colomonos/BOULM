import java.util.Date;
class Operation {
  private Date date;

  private float montant;

  public Operation(Date date, float montant) {
    this.date = date;
    this.montant = montant;
  }

  @Override
  public String toString() {
    String res = "  " + this.date + " | " + this.montant;
    return res;
  }

  public final Date getDate() {
    return date;
  }

  public void setDate(Date value) {
    date = value;
  }

  public final float getMontant() {
    return montant;
  }

  public void setMontant(float value) {
    montant = value;
  }

}
