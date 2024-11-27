import javax.swing.JLabel;


class Terminal extends JLabel implements IObservateur {
  private String message;

  private String titre;


  
  public Terminal(String message, String titre) {
    this.message = message;
    this.titre = titre;
  }

  public Terminal(String titre) {
    this.message = "";
    this.titre = titre;
  }

  public  void notification(String message) {
  }

}
