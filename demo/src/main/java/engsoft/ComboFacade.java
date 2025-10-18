package engsoft;

public class ComboFacade {
    Burger burger;
    Bebida bebida;
    Sobremesa sobremesa;
    String nameCombo = "";
    private Combo combo;
    
    

    public ComboFacade(Burger burger, Bebida bebida, Sobremesa sobremesa, String nameCombo) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
        this.nameCombo = "";
    }

    public void criarCombo(int codigo) {
        if (codigo < 1 || codigo > 3) {
            System.out.println("Código inválido! Use 1, 2 ou 3.");
            return;
        }

        switch(codigo) {
            case 1:
                nameCombo = "Combo Master";
                burger = new Burger("Big Cheddar", 18.00);
                bebida = new Bebida("Coca-Cola", 8.00);
                sobremesa = new Sobremesa("Sundae", 9.90);
                combo = new Combo(burger, bebida, sobremesa);
                break;
            case 2:
                nameCombo = "Super Combo";
                burger = new Burger("Mega Bacon", 16.00);
                bebida = new Bebida("Guaraná", 7.50);
                sobremesa = new Sobremesa("Torta de Maçã", 9.00);
                combo = new Combo(burger, bebida, sobremesa);
                break;
            case 3:
                nameCombo = "Combo Kids";
                burger = new Burger("Mini Burger", 12.00);
                bebida = new Bebida("Suco de laranja", 6.00);
                sobremesa = new Sobremesa("Sorvete", 4.90);
                combo = new Combo(burger, bebida, sobremesa);
                break;
            default:
                System.out.println("Código de combo inválido!");
                break;
        }
    }

    private void exibirItem (String tipo, ItemCombo item){
        System.out.printf("%-12s: %s - R$ %.2f%n", 
                      tipo, item.getName(), item.getPrice());
    }

    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda!");
            return;
        }

        System.out.println("\n=== Detalhes do Pedido ===");
        exibirItem("Burger", combo.getBurger());
        exibirItem("Bebida", combo.getBebida());
        exibirItem("Sobremesa", combo.getSobremesa());
        System.out.println("==========================");
    }

    public double getPrecoTotal() {
        return combo.getPrecoTotal();
    }
}
