package exercicios.aula43.e02;

public class Teste {

    public static void main(String[] args) {


        // abstract em CONTRIBUINTE + método abstrato estendido para PF e PJ.

        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 01");
        p1.setRendaBruta(1000);
        p1.setCpf("074.324.326-94");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000);
        p2.setCnpj("18.311.450/0001-60");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 03");
        p3.setRendaBruta(2000);
        p3.setCpf("230.621.407-71");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 04");
        p4.setRendaBruta(3000);
        p4.setCnpj("65.057.413/0001-58");

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Contribuinte 05");
        p5.setRendaBruta(3700);
        p5.setCpf("050.069.357-90");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 06");
        p6.setRendaBruta(4000);
        p6.setCnpj("72.043.284/0001-04");

        // array
        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for (Contribuinte c : contribuintes) {
            System.out.println(c.toString());
        }
    }
}
