package exemplo2;

import exemplo1.Roupa;

public class exemploArray {
    public static void main(String[] args) {


    Roupa[] roupas = new Roupa[5];
//   for(int i=0; i<9; i++) {
//        roupas[i] = new Roupa();
//    }
    roupas[0] = new Roupa("casaco","preta","Slim","G","outuno/inverno");
    roupas[1] = new Roupa("blusa","azul","Slim","P","outuno/inverno");
    roupas[2] = new Roupa("camiseta","branca","despojada","P","verao");
    roupas[3] = new Roupa("bermuda","jeans","curto","P","verao");
    roupas[4] = new Roupa("calca","laranja","Slim","G","outuno/inverno");
//    roupas[0].colecao = "outuno/inverno";
//    roupas[0].cor = "preta";
//    roupas[0].modelo = "slim";
//    roupas[0].tamanho = "P";
//    roupas[0].descricao = "casaco";

//    roupas[1].colecao = "outuno/inverno";
//    roupas[1].cor = "azul";
//    roupas[1].modelo = "slim";
//    roupas[1].tamanho = "P";
//    roupas[1].descricao = "blusa";
//
//    roupas[2].colecao = "primavera/verao";
//    roupas[2].cor = "branca";
//    roupas[2].modelo = "despojada";
//    roupas[2].tamanho = "P";
//    roupas[2].descricao = "camiseta";
//
//    roupas[3].colecao = "verao";
//    roupas[3].cor = "jeans";
//    roupas[3].modelo = "curto";
//    roupas[3].tamanho = "P";
//    roupas[3].descricao = "bermuda";
//
//    roupas[4].colecao = "outuno/inverno";
//    roupas[4].cor = "laranha";
//    roupas[4].modelo = "slim";
//    roupas[4].tamanho = "G";
//    roupas[4].descricao = "calça";

		System.out.println(roupas[0].descricao);
		System.out.println(roupas[1].descricao);
		System.out.println(roupas[2].descricao);
		System.out.println(roupas[3].descricao);
		System.out.println(roupas[4].descricao);
//		System.out.println(roupas[5].descricao);
//		System.out.println(roupas[6].descricao);
//		System.out.println(roupas[7].descricao);
//		System.out.println(roupas[8].descricao);
    }
}