import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.util.Scanner;

public class hydragate {

        final static Scanner LER = new Scanner(System.in);

        public static void main(String[] args) throws InterruptedException {
                limparTela();

                //1
                char sinalComecar = escolhaMenu();

                if (sinalComecar == '1') {
                        limparTela();
                        //2
                        contarHistoria();
                } else {
                        limparTela();
                        tocarSomBye();
                        System.exit(0);
                }

                limparTela();

                //3
                char escolhaPersona = escolherPersonagem();

                limparTela();

                //4
                int qtdQuestoesAcertadas = passarFirewall();

                limparTela();

                //5
                revelarHabilidade(escolhaPersona);

                limparTela();

                //6
                introducaoHydra();

                limparTela();

                //7.1
                player player = definirStats(qtdQuestoesAcertadas, escolhaPersona);
                //7.2
                hidra hidra = definirStatsH(qtdQuestoesAcertadas);

                //8
                boolean venceuBatalha = batalhar(player, hidra);

                Thread.sleep(400);
                limparTela();

                if (venceuBatalha == true) {
                        //9
                        printVitoria();

                        limparTela();

                        //11
                        printCreditos();
                        System.exit(0);
                } else {
                        //10
                        printDerrota();

                        Thread.sleep(5000);
                        limparTela();

                        //11
                        printCreditos();
                        System.exit(0);
                }
        }

        //1
        public static char escolhaMenu() {
                pularLinha();
                pularLinha();
                pularLinha();
                setColor(2);
                printNomeGame();

                pularLinha();

                setColor(6);
                printOpcoes();

                setColor(7);

                tocarSomMenu();

                char sinalEscolha = vereficarDigitado();
                return sinalEscolha;
        }

        //2
        public static void contarHistoria() {
                setColor(1);
                System.out.println("\t\t\t\t\t\t\t╔══════════════════════════════════════════════════════════════╗");
                System.out.println("\t\t\t\t\t\t\t║                    !ALERTA DO SOFTWARE!                      ║");
                System.out.println("\t\t\t\t\t\t\t║         SEUS ARQUIVOS FORAM INVADIDOS POR UM MALWARE         ║");
                System.out.println("\t\t\t\t\t\t\t╚══════════════════════════════════════════════════════════════╝");
                pularLinha();
                setColor(4);
                System.out.print("\t\t\t\t\t\t\t  DEV CHEFE:");
                setColor(7);
                System.out.println(" JUNIOR VENHA AQUI!!!!!!");
                System.out.println("\t\t\t\t\t\t\t  EU CLIQUEI PRA RESGATA MINHA MEGASENA ONLINE E APARECEU ISSO AI");
                System.out.println("\t\t\t\t\t\t\t  OU VOCE CONCERTA");
                System.out.println("\t\t\t\t\t\t\t  OU ESTA DES-PE-DI-DO!");
                System.out.println();
                setColor(4);
                System.out.print("\t\t\t\t\t\t\t  DEV JUNIOR:");
                setColor(7);
                System.out.println(" O SENHOR BAIXOU O MALWARE DA HIDRA!!!");
                System.out.println("\t\t\t\t\t\t\t  VOU SALVAR SEUS ARQUIVOS CHEFINHO");
                pularLinha();
                pularLinha();
                System.out.println(
                                "\t\t\t\t                    .=****-                    ....                                                 ");
                System.out.println(
                                "\t\t\t\t                  .+-:.  ..-+               .*      *.                                              ");
                System.out.println(
                                "\t\t\t\t                 .  --  --   +             --      --=-                      :*+++=                 ");
                System.out.println(
                                "\t\t\t\t                 :           *            .*:      O  #.                    .#= .:=                 ");
                System.out.println(
                                "\t\t\t\t                 .   =+==+-  +            .+:.    .:-:*.                    .#=..:=                 ");
                System.out.println(
                                "\t\t\t\t                  .         :              .=-.   #   .                     .#= .:=                 ");
                System.out.println(
                                "\t\t\t\t                    .:-*--:                 .:=+   +:.                      .#= .:=                 ");
                System.out.println(
                                "\t\t\t\t                      .*.                    .+:...      ..-++-.            .*=..-=                 ");
                System.out.println(
                                "\t\t\t\t                      .*.                   .=-..    ..-=-:::.               .+==*.                 ");
                System.out.println(
                                "\t\t\t\t                      :#-----------===:   ..-*+=+++**+=:.               ......+--+....              ");
                System.out.println(
                                "\t\t\t\t                    .-+*.   .......-=--   ..+*=...  .:-==--::::::::::.. =+=========++.              ");
                System.out.println(
                                "\t\t\t\t                  .:+::=.          -=--    --*+..       .:=+*=======+=--+===========+=-----:.       ");
                System.out.println(
                                "\t\t\t\t               ..-+:. --.          -=--   .++**...      .:-                              .-:        ");
                System.out.println(
                                "\t\t\t\t             ..==:.   -:.          -=--  .-:.....       .:=:::::::::::::::::::::::::::::::=:.       ");
                System.out.println(
                                "\t\t\t\t             ..:=+=:..-:.          -=--  .+-              -#=.                        .=#=.         ");
                System.out.println(
                                "\t\t\t\t                   :*==:.          -=-- .=:.              -#=.                        .-*-.         ");
                System.out.println(
                                "\t\t\t\t                      +..          -=-- .=:               -#=.                        .-*-.         ");
                System.out.println(
                                "\t\t\t\t                     .*..          -=-- .+-.              -#=.                        .-*-.         ");
                System.out.println(
                                "\t\t\t\t                    :=..=-         -*=-::---------=@+.    -#=.                        .-*-.         ");
                System.out.println(
                                "\t\t\t\t                   .+:. .*.        -=              %%#.   -#=.                        .-*-.         ");
                System.out.println(
                                "\t\t\t\t                   :=.   =:        -*++++++++++++++%#=:   -#=.                        .-*-.         ");
                System.out.println(
                                "\t\t\t\t                  .+:.   =:         -=+-        .*#.*:#.  -#=.                        .-*-.         ");
                System.out.println(
                                "\t\t\t\t                  :=.    :+         -==-        .**. .*.  -#=.                        .-*-.         ");
                System.out.println(
                                "\t\t\t\t                  =:.    .#         -==-        .**. .*.. -#=.                        .-*-.         ");
                System.out.println(
                                "\t\t\t\t                 .=:      :=        .--.        .==.      .=-.                        .-+-.         ");
                System.out.println(
                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                tocarSomHistoria();
        }

        //3
        public static char escolherPersonagem() {
                char escolha = ' ';
                apresentarPersonas();
                tocarSomEscolha();
                escolha = vereficarEscolha();
                return escolha;
        }

        //4
        public static int passarFirewall() throws InterruptedException {
                int[] vetRespostas = preencherRespostas(8);

                int[][] matrizZeroUm = preencherMatriz(8, 4, vetRespostas);

                String[][] matrizPerguntas = lerDoArquivo("perguntas.txt");

                setColor(1);
                printFirewall();
                setColor(7);
                tocarSomFirewall();

                int qtdQuestoesAcertadas = jogarFirewall(matrizZeroUm, matrizPerguntas);
                return qtdQuestoesAcertadas;
        }

        //5
        public static void revelarHabilidade(char escolha) {
                switch (escolha) {
                        case '1':
                                setColor(2);
                                printJaveiro();
                                pularLinha();
                                pularLinha();

                                setColor(4);
                                printPassiva();
                                setColor(6);
                                System.out.print("\t\t\t\t\t\t\t  COMPILAÇÃO RÁPIDA:"); // levelup
                                setColor(7);
                                System.out.println(" Aumenta entre 3% a 7% seu dano PERMANENTEMENTE a cada 2 rounds");
                                pularLinha();
                                pularLinha();

                                setColor(4);
                                printAtiva();
                                setColor(6);
                                System.out.print("\t\t\t\t\t\t\t  DEBUG:"); // sword_slash
                                setColor(7);
                                System.out.println(" Dá um SUPER-GOLPE, 1.5 a 3 vezes mais que o seu dano");
                                tocarSomRevelarHabilidade();
                                break;

                        case '2':
                                setColor(2);
                                printPythonico();
                                pularLinha();
                                pularLinha();

                                setColor(4);
                                printPassiva();
                                setColor(6);
                                System.out.print("\t\t\t\t\t\t\t  SINTAXE SIMPLES:"); // gta san
                                setColor(7);
                                System.out.println(" Há uma chance de 15% por round de ATACAR DE NOVO");
                                pularLinha();
                                pularLinha();

                                setColor(4);
                                printAtiva();
                                setColor(6);
                                System.out.print("\t\t\t\t\t\t\t  ZAWARUDOOO:"); // za-warudo
                                setColor(7);
                                System.out.println(" INIBE o proximo ataque do inimigo");
                                tocarSomRevelarHabilidade();
                                break;

                        default:
                                setColor(2);
                                printLuaniano();
                                pularLinha();
                                pularLinha();

                                setColor(4);
                                printPassiva();
                                setColor(6);
                                System.out.print("\t\t\t\t\t\t\t  PAUSA PRO CAFEZIN:"); // minecraft-drink
                                setColor(7);
                                System.out.println(" A cada 2 rounds, você cura de 5% a 10% da sua VIDA TOTAL");
                                pularLinha();
                                pularLinha();

                                setColor(4);
                                printAtiva();
                                setColor(6);
                                System.out.print("\t\t\t\t\t\t\t  ALUADO:"); // rizz-sound
                                setColor(7);
                                System.out.println(" Faz o dano dado pelo inimigo ser REPLICADO nele mesmo");
                                tocarSomRevelarHabilidade();
                                break;
                }
        }

        //6
        public static void introducaoHydra() {
                pularLinha();
                pularLinha();
                pularLinha();
                setColor(1);
                System.out.println(
                                "                                 \t\t\t\t██╗ █████╗ ██╗     ███████╗██████╗ ████████╗ █████╗ ██╗                                                             ");
                System.out.println(
                                "                                 \t\t\t\t██║██╔══██╗██║     ██╔════╝██╔══██╗╚══██╔══╝██╔══██╗██║                                                             ");
                System.out.println(
                                "\t         @@                    \t\t\t\t██║███████║██║     █████╗  ██████╔╝   ██║   ███████║██║                                            @@               ");
                System.out.println(
                                "\t        @@@@                   \t\t\t\t╚═╝██╔══██║██║     ██╔══╝  ██╔══██╗   ██║   ██╔══██║╚═╝                                           @@@@              ");
                System.out.println(
                                "\t       @@  @@                  \t\t\t\t██╗██║  ██║███████╗███████╗██║  ██║   ██║   ██║  ██║██╗                                          @@  @@             ");
                System.out.println(
                                "\t      @@ ][ @@                 \t\t\t\t╚═╝╚═╝  ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝                                         @@ ][ @@            ");
                System.out.println(
                                "\t     @@  ][  @@                                                                                                                                        @@  ][  @@  ");
                System.out.println(
                                "\t    @@   ][   @@                                                                                                                                      @@   ][   @@ ");
                System.out.println(
                                "\t   @@    ][    @@      \t\t\t\t+--------------------------------------------------------------------+                               @@    ][    @@         ");
                System.out.println(
                                "\t  @@     ][     @@   \t\t\t\t|░█▀█░█▀█░▀█▀░█▀▀░█▀█░█▀▀░▀█▀░█▀█░█░░░░░█▀▄░▀█▀░█▀▀░█▀▀░█▀█░░░█▀▄░█▀▀|                              @@     ][     @@          ");
                System.out.println(
                                "\t @@      ##      @@  \t\t\t\t|░█▀▀░█░█░░█░░█▀▀░█░█░█░░░░█░░█▀█░█░░░░░█▀▄░░█░░▀▀█░█░░░█░█░░░█░█░█▀▀|                             @@      ##      @@         ");
                System.out.println(
                                "\t@@@@@@@@@@@@@@@@@@@@ \t\t\t\t|░▀░░░▀▀▀░░▀░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░░░▀▀░░▀▀▀|                            @@@@@@@@@@@@@@@@@@@@        ");
                System.out.println(
                                "                       \t\t\t\t\t|░█▀▀░█▀▀░█▀▀░█░█░█▀▄░█▀█░█▀█░█▀▀░█▀█░░░█▀█░░░█▀▀░█▀▄░█▀▀░█▀█░▀█▀░█▀▀|                                                      ");
                System.out.println(
                                "                       \t\t\t\t\t|░▀▀█░█▀▀░█░█░█░█░█▀▄░█▀█░█░█░█░░░█▀█░░░█▀█░░░█▀▀░█▀▄░█▀▀░█░█░░█░░█▀▀|                                                      ");
                System.out.println(
                                "                       \t\t\t\t\t|░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░▀░▀░▀░▀░▀▀▀░▀░▀░░░▀░▀░░░▀░░░▀░▀░▀▀▀░▀░▀░░▀░░▀▀▀|                                                      ");
                System.out.println(
                                "                       \t\t\t\t\t+--------------------------------------------------------------------+                                                      ");
                setColor(7);
                tocarSomAlerta();
        }

        //7.1 - PLAYER
        public static player definirStats(int qtdQuestõesCertas, char classe) {
                player p = new player();

                double taxaDefacilidade = 0.9 + (qtdQuestõesCertas * 0.1);
                /*
                 * dai se qtdQuestoesCertas for 1(minimo) o tax fac sera 1
                 * e se for 8(maximo) sera 1.7
                 */
                p.vida = (int) (ThreadLocalRandom.current().nextInt(2500, 3001) * taxaDefacilidade);
                p.dano = (int) (ThreadLocalRandom.current().nextInt(200, 251) * taxaDefacilidade);
                p.qualClasse = classe;

                return p;
        }

        //7.2 - HIDRA
        public static hidra definirStatsH(int qtdQuestõesCertas) {
                hidra h = new hidra();

                double taxaDif = 1.8 - (qtdQuestõesCertas * 0.1);
                /*
                 * dai se qtdQuestoesCertas for 1(minimo) o tax dif sera 1.5
                 * e se for 8(maximo) sera 0.8
                 */

                h.vida = (int) (ThreadLocalRandom.current().nextInt(3500, 5001) * taxaDif);
                h.dano = (int) (ThreadLocalRandom.current().nextInt(320, 351) * taxaDif);
                h.vaiAtaca = true;

                return h;
        }

        //8
        public static boolean batalhar(player player, hidra hidra) throws InterruptedException {
                boolean venceu = false;
                int contHabilidadePassiva = 0;
                int contHabilidadeAtiva = 0;
                int contHabilidadeHidra = 0;
                final int vidaHT = hidra.vida; // vida total da hidra
                final int vidaPT = player.vida; // vida total do player

                while (hidra.vida >= 0 && player.vida >= 0) {

                        // 8.1
                        printBatalha(player, hidra, vidaHT, vidaPT, contHabilidadeAtiva);
                        hidra.vaiAtaca = true;

                        // habilidades passivas
                        switch (player.qualClasse) {
                                case '1':
                                        // Javeiro 8.A
                                        player = compilacaoRapida(player, contHabilidadePassiva);
                                        if (contHabilidadePassiva >= 2) {
                                                contHabilidadePassiva = 0;
                                        }
                                        contHabilidadePassiva++;
                                        break;
                                case '2':
                                        // Pythonico 8.B
                                        hidra = sintaxeSimples(player, hidra);
                                        break;
                                default:
                                        // Luaniano 8.C
                                        player = cafezinPlayer(player, contHabilidadePassiva);
                                        if (contHabilidadePassiva >= 2) {
                                                contHabilidadePassiva = 0;
                                        }
                                        contHabilidadePassiva++;
                                        break;
                        }

                        //8.2
                        char acaoPlayer = lerAcaoPlayer(contHabilidadeAtiva);

                        if (acaoPlayer == '1') {
                                //8.3
                                hidra.vida = atacarHidra(player, hidra).vida;
                                contHabilidadeAtiva++;
                                Thread.sleep(500);
                        } else {
                                // habilidades ativas
                                switch (player.qualClasse) {
                                        case '1':
                                                //8.D - Debug
                                                hidra = debug(player, hidra);
                                                break;
                                        case '2':
                                                //8.E - ZAWARUDOOO
                                                hidra = zawarudooo(player, hidra);
                                                pularLinha();
                                                hidra.vida = atacarHidra(player, hidra).vida;
                                                break;
                                        default:
                                                //8.F - Aluado
                                                hidra = aluado(player, hidra);
                                                break;
                                }
                                contHabilidadeAtiva = 0;
                        }

                        // turno hidra
                        if (verificarBaforada(contHabilidadeHidra, hidra) == true) {
                                //8.4
                                player = soltarBaforada(player, hidra);
                                contHabilidadeHidra = 0;

                        } else if (hidra.vaiAtaca == true && hidra.vida > 0 && player.vida > 0) {
                                //8.5
                                printHidraAtacou(player,hidra);
                                contHabilidadeHidra++;
                        }
                }
                //8.6
                venceu = vereficarVitoria(player, hidra);
                return venceu;
        }

        //8.1
        public static void printBatalha(player player, hidra hidra, int vidaHT, int vidaPT,
                        int coldownHabilidadeAtiva) {
                limparTela();
                int vidaH = hidra.vida;
                double porcentHidra = porcent(vidaHT, vidaH);

                printVidaH();
                printBarra(vidaHT, vidaH, porcentHidra, 1);

                setColor(3);
                printDanoH(hidra);

                setColor(2);
                if (porcentHidra >= 75) {
                        printHidra3();

                } else if (porcentHidra >= 50) {
                        printHidra2();

                } else if (porcentHidra >= 30) {
                        printHidra1();

                } else {
                        printHidra0();
                }

                int vidaP = player.vida;
                double porcentPlayer = porcent(vidaPT, vidaP);

                int corVP = vereficarCor(player);
                printVP(corVP);

                int corBP = trocarCor(corVP);
                printBarra(vidaPT, vidaP, porcentPlayer, corBP);

                setColor(3);
                printPlayer();

                printDanoColdownP(player, coldownHabilidadeAtiva, corVP);
        }

        //8.A
        public static player compilacaoRapida(player player, int contHabilidadePassiva) {
                if (contHabilidadePassiva >= 2) {
                        player.dano += (player.dano * ThreadLocalRandom.current().nextInt(3, 8)) / 100;
                        printPassivaJaveiro(player);
                        tocarSomLevelUp();
                }
                return player;
        }

        //8.B
        public static hidra sintaxeSimples(player player, hidra hidra) {
                if (ThreadLocalRandom.current().nextInt(1, 21) <= 3) {
                        hidra.vida -= player.dano;
                        printPassivaPythonico(player);
                        tocarSomGTAAgain();
                }
                return hidra;
        }

        //8.C
        public static player cafezinPlayer(player player, int contHabilidade) {
                if (contHabilidade >= 2) {
                        int cura = (player.vida * ThreadLocalRandom.current().nextInt(5, 11)) / 100;
                        player.vida += cura;
                        printPassivaLuaniano(cura);
                        tocarSomMinecraftDrink();
                }
                return player;
        }

        //8.2
        public static char lerAcaoPlayer(int contHabilidadeAtiva) {
                printAcao();
                char acao = ' ';
                do {
                        acao = lerChar();
                        if (acao != '1' && acao != '2') {
                                setColor(1);
                                System.out.println("Ação inválida, digite novamente..");
                                setColor(7);
                        } else if (acao == '2' && contHabilidadeAtiva < 3) {
                                setColor(1);
                                System.out.println("Coldown de habilidade ativo");
                                setColor(7);
                                acao = '0';
                        }
                } while (acao != '1' && acao != '2');
                return acao;
        }

        //8.3
        public static hidra atacarHidra(player player, hidra hidra) {
                hidra.vida -= player.dano;
                int cor = vereficarCor(player);
                setColor(cor);
                System.out.print("Você ataca a Hidra causando ");
                setColor(1);
                System.out.print(player.dano);
                setColor(cor);
                System.out.println(" de dano!");
                setColor(cor);
                tocarSomDanoMinecraft();
                return hidra;
        }

        //8.D - Debug
        public static hidra debug(player player, hidra hidra) throws InterruptedException {
                double ataqueDebug = player.dano * ThreadLocalRandom.current().nextDouble(1.5, 3.0);
                hidra.vida -= ataqueDebug;
                printAtivaJaveiro(ataqueDebug);
                tocarSomEspada();
                Thread.sleep(500);
                return hidra;
        }

        //8.E - ZAWARUDOOO
        public static hidra zawarudooo(player player, hidra hidra){
                hidra.vaiAtaca = false;
                printAtivaPythonico();
                tocarSomZawarudo();
                return hidra;
        }

        //8.F - Aluado
        public static hidra aluado(player player, hidra hidra) throws InterruptedException {
                int danoAutoInfligido = hidra.dano / 2;
                hidra.vida -= danoAutoInfligido;
                hidra.vida -= atacarHidra(player, hidra).vida;
                printAtivaLuaniano(danoAutoInfligido);
                tocarSomRizz();
                Thread.sleep(500);
                return hidra;
        }

        //8.4
        public static player soltarBaforada(player player, hidra hidra){
                int baforadaMortal = hidra.dano * ThreadLocalRandom.current().nextInt(2, 5);

                printBaforada(baforadaMortal);
                tocarSomBaforadaHidra();

                player.vida -= baforadaMortal;
                return player;
        }

        //8.5
        public static void printHidraAtacou(player player , hidra hidra) {
                player.vida -= hidra.dano;
                setColor(2);
                System.out.print("A hidra te ataca causando ");
                setColor(1);
                System.out.print(hidra.dano);
                setColor(2);
                System.out.println(" de dano!");
                setColor(7);
                tocarSomDanoMinecraft();
        }

        //8.6
        public static boolean vereficarVitoria(player player, hidra hidra) {
                boolean venceu = false;
                if (hidra.vida <= 0) {
                        venceu = true;
                }
                return venceu;
        }

        //9
        public static void printVitoria() {
                setColor(3);
                pularLinha();
                pularLinha();
                pularLinha();
                System.out.println(
                                "\t\t\t\t\t     ___________          _____                              _____          ___________");
                System.out.println(
                                "\t\t\t\t\t    '._==_==_=_.'        ( ___ )----------------------------( ___ )        '._==_==_=_.'");
                System.out.println(
                                "\t\t\t\t\t    .-\\:      /-.         |   |                              |   |         .-\\:      /-.");
                System.out.println(
                                "\t\t\t\t\t   | (|:.     |) |        |   | ░█░█░▀█▀░▀█▀░█▀█░█▀▄░▀█▀░█▀█ |   |        | (|:.     |) |");
                System.out.println(
                                "\t\t\t\t\t    '-|:.     |-'         |   | ░▀▄▀░░█░░░█░░█░█░█▀▄░░█░░█▀█ |   |         '-|:.     |-'");
                System.out.println(
                                "\t\t\t\t\t      \\::.    /           |   | ░░▀░░▀▀▀░░▀░░▀▀▀░▀░▀░▀▀▀░▀░▀ |   |           \\::.    /");
                System.out.println(
                                "\t\t\t\t\t       '::. .'            |___|                              |__ |            '::. .'");
                System.out.println(
                                "\t\t\t\t\t         ) (             (_____)----------------------------(_____)             ) (");
                System.out.println(
                                "\t\t\t\t\t       _.' '._                                                                _.' '._");
                System.out.println(
                                "\t\t\t\t\t      `\"\"\"\"\"\"\"`                                                              `\"\"\"\"\"\"\"`");
                System.out.println();
                System.out.println(
                                "\t\t\t\t\t    !MEUS PARABÉNS! VOCÊ SALVOU OS ARQUIVOS DO SEU CHEFE E FOI PROMOVIDO A DEV SÊNIOR!!!");
                tocarSomYAY();
        }

        //10
        public static void printDerrota() {
                setColor(1);
                pularLinha();
                pularLinha();
                pularLinha();
                System.out.println(
                                "\t\t\t\t\t   {}           {}        _____                              _____         {}           {}");
                System.out.println(
                                "\t\t\t\t\t     \\  _---_  /         ( ___ )----------------------------( ___ )          \\  _---_  /");
                System.out.println(
                                "\t\t\t\t\t      \\/     \\/           |   |                              |   |            \\/     \\/");
                System.out.println(
                                "\t\t\t\t\t       |() ()|            |   | ░█▀▄░█▀▀░█▀▄░█▀▄░█▀█░▀█▀░█▀█ |   |             |() ()|");
                System.out.println(
                                "\t\t\t\t\t        \\ + /             |RIP| ░█░█░█▀▀░█▀▄░█▀▄░█░█░░█░░█▀█ |RIP|              \\ + /");
                System.out.println(
                                "\t\t\t\t\t       / HHH  \\           |   | ░▀▀░░▀▀▀░▀░▀░▀░▀░▀▀▀░░▀░░▀░▀ |   |             / HHH  \\");
                System.out.println(
                                "\t\t\t\t\t      /  \\_/   \\          |___|                              |___|            /  \\_/   \\");
                System.out.println(
                                "\t\t\t\t\t    {}          {}       (_____)----------------------------(_____)         {}          {}");
                System.out.println();
                System.out.println(
                                "\t\t\t\t\t      !MEUS PESÂMES! VOCÊ PERDEU TODOS OS ARQUIVOS DO SEU CHEFE E FOI DES-PE-DI-DO!!!");
                tocarSomFalhaBuzina();

        }

        //11
        public static void printCreditos(){
                pularLinha();
                pularLinha();
                pularLinha();
                setColor(2);
                System.out.println("  \t\t\t\t\t\t\t\t\t╔════════════════════════════════╗");
                System.out.println("  \t\t\t\t\t\t\t\t\t║         CRÉDITOS FINAIS        ║");
                System.out.println("  \t\t\t\t\t\t\t\t\t╚════════════════════════════════╝");
                pularLinha();
                pularLinha();

                setColor(6);
                System.out.println("  \t\t\t\t\t\t\t\t\t  DESENVOLVIMENTO E CÓDIGO:");
                setColor(7);
                System.out.println("  \t\t\t\t\t\t\t\t\t  Lara e Marcelo");
                pularLinha();
                pularLinha();

                setColor(6);
                System.out.println("  \t\t\t\t\t\t\t\t\t  PROJETO DE TCA - IFPR:");
                setColor(7);
                System.out.println("  \t\t\t\t\t\t\t\t\t  Curso: Informática");
                System.out.println("  \t\t\t\t\t\t\t\t\t  Ano: 2025");
                pularLinha();
                pularLinha();

                setColor(6);
                System.out.println("  \t\t\t\t\t\t\t\t\t  AGRADECIMENTOS ESPECIAIS:");
                setColor(7);
                System.out.println("  \t\t\t\t\t\t\t\t\t  Honra a J.C");
                System.out.println("  \t\t\t\t\t\t\t\t\t  Prof. Herbert Raush Fernandes");
                System.out.println("  \t\t\t\t\t\t\t\t\t  Prof. Thiago Berticelli Ló");
                System.out.println("  \t\t\t\t\t\t\t\t\t  Prof. Odair Moreira de Souza");
                System.out.println("  \t\t\t\t\t\t\t\t\t  Colegas de classe");
                pularLinha();
                pularLinha();

                setColor(2);
                System.out.println("  \t\t\t\t\t\t\t\t\t╔══════════════════════════════════╗");
                System.out.println("  \t\t\t\t\t\t\t\t\t║        OBRIGADO POR JOGAR!       ║");
                System.out.println("  \t\t\t\t\t\t\t\t\t╚══════════════════════════════════╝");
                pularLinha();
                pularLinha();
                pularLinha();
                setColor(7);

                tocarSomCreditosFinais();
        }



        //Métodos que utilizam outros arquivos:
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public static void tocarSom(String caminhoArquivoSom) {
                try {
                        File soundFile = new File(caminhoArquivoSom);
                        if (!soundFile.exists()) {
                                System.out.println("Arquivo de som não encontrado: " + caminhoArquivoSom);
                                return;
                        }
                        // https://freewavesamples.com/
                        AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
                        AudioFormat format = audioStream.getFormat();
                        DataLine.Info info = new DataLine.Info(Clip.class, format);
                        Clip audioClip = (Clip) AudioSystem.getLine(info);
                        audioClip.open(audioStream);
                        audioClip.start();
                        Thread.sleep(audioClip.getMicrosecondLength() / 1000);
                        audioClip.close();
                        audioStream.close();

                } catch (UnsupportedAudioFileException e) {
                        System.err.println("O formato de áudio não é suportado.");
                        e.printStackTrace();
                } catch (LineUnavailableException e) {
                        System.err.println("Linha de áudio não disponível.");
                        e.printStackTrace();
                } catch (IOException e) {
                        System.err.println("Erro ao ler o arquivo de áudio.");
                        e.printStackTrace();
                } catch (InterruptedException e) {
                        System.err.println("O programa foi interrompido.");
                        e.printStackTrace();
                }
        }

        public static void tocarSomFirewall() {
                tocarSom("sons/facebook-messenger-2013 (online-audio-converter.com).wav");
        }

        public static void tocarSomAlerta() {
                tocarSom("sons/alarm-sound-effect (online-audio-converter.com).wav");
        }

        public static void tocarSomEscolha() {
                tocarSom("sons/somEscolha.wav");
        }

        public static void tocarSomHistoria() {
                tocarSom("sons/somHistoria.wav");
        }

        public static void tocarSomMenu() {
                tocarSom("sons/somMenu0528.wav");
        }

        public static void tocarSomRevelarHabilidade() {
                tocarSom("sons/somRevelar.wav");
        }

        public static void tocarSomDanoMinecraft() {
                tocarSom("sons/classic_hurt.wav");
        }

        public static void tocarSomCorreto() {
                tocarSom("sons/correct_9GUJzWlz.wav");
        }

        public static void tocarSomBaforadaHidra() {
                tocarSom("sons/ender-dragon-roar-2-made-with-Voicemod.wav");
        }

        public static void tocarSomFalhaBuzina() {
                tocarSom("sons/downer_noise.wav");
        }

        public static void tocarSomErro() {
                tocarSom("sons/erro_wFDIWJe0.wav");
        }

        public static void tocarSomGTAAgain() {
                tocarSom("sons/gta-san-andreas-ah-shit-here-we-go-again_BWv0Gvc.wav");
        }

        public static void tocarSomYAY() {
                tocarSom("sons/kids-saying-yay-sound-effect_3.wav");
        }

        public static void tocarSomLevelUp() {
                tocarSom("sons/levelup.wav");
        }

        public static void tocarSomCreditosFinais() {
                tocarSom("sons/meme-de-creditos-finales (online-audio-converter.com).wav");
        }

        public static void tocarSomMinecraftDrink() {
                tocarSom("sons/minecraft-drinking-sound-effect.wav");
        }

        public static void tocarSomRizz() {
                tocarSom("sons/rizz-sound-effect.wav");
        }

        public static void tocarSomBye() {
                tocarSom("sons/roblox-bye.wav");
        }

        public static void tocarSomEspada() {
                tocarSom("sons/sword_slash-ab22fe02-3826-345a-80ad-dc22261a9127.wav");
        }

        public static void tocarSomZawarudo() {
                tocarSom("sons/za-warudo-toki-wo-tomare_WJVdsYt.wav");
        }

        public static String[][] lerDoArquivo(String nomeArquivo) {
                // tentando abrir o arquivo para leitura
                try (FileReader reader = new FileReader(nomeArquivo);
                                BufferedReader bufferedReader = new BufferedReader(reader)) {

                        String linha;

                        // cria a matriz e o contador de linhas dela
                        String[][] matPergt = new String[8][4];
                        int i = 0;

                        while (true) {
                                linha = bufferedReader.readLine();

                                if (linha == null) {
                                        break;
                                }

                                String[] questao = linha.split(";");

                                // em cada posicao zero das linhas tem a pergunta
                                for (int j = 0; j < matPergt[0].length; j++) {
                                        matPergt[i][j] = questao[j];
                                }
                                i++;
                        }
                        return matPergt;

                } catch (IOException e) {
                        // Se o arquivo não existir, retorna a mensagem de erro
                        System.err
                                        .println("Erro ao ler o arquivo '" + nomeArquivo + "' (ou arquivo não existe): "
                                                        + e.getMessage());
                        return null;
                }
        }

        //Outros métodos:
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public static void setColor(int cor) {
                String s = "[0m";
                switch (cor) {
                        case 0:
                                s = "[30m";// preto
                                break;
                        case 1:
                                s = "[31m";// vermelho
                                break;
                        case 2:
                                s = "[32m";// verde
                                break;
                        case 3:
                                s = "[33m";// amarelo
                                break;
                        case 4:
                                s = "[34m";// azul
                                break;
                        case 5:
                                s = "[35m";// magenta
                                break;
                        case 6:
                                s = "[36m";// ciano
                                break;
                        case 7:
                                s = "[97m";// branco
                                break;
                }

                System.out.print((char) 27 + s);
        }

        public static double porcent(int vidaT, int vida) {
                return (double) (vida * (double) 100) / (double) vidaT;
        }

        public static int trocarCor(int corVP) {
                int corTrocada = 7;
                switch (corVP) {
                        case 4: // javeiro
                                corTrocada = 6;
                                break;
                        case 6: // pythonico
                                corTrocada = 4;
                                break;
                        default: // luaniano
                                corTrocada = 4;
                                break;
                }
                return corTrocada;
        }

        public static player turnoHidra(player player, hidra hidra, int contHabilidadeHidra) {
                return player;
        }

        public static int jogarFirewall(int[][] matrizZeroUm, String[][] matrizPerguntas) throws InterruptedException {
                int contError = 0;
                int contAcertadas = 0;
                boolean passouFase = false;
                for (int i = 0; i < matrizZeroUm.length; i++) {
                        limparTela();
                        imprimirPgts(i, matrizPerguntas);

                        char respostaPlayer = vereficarEscolha();
                        passouFase = vereficarAcerto(matrizZeroUm, respostaPlayer, i);

                        if (passouFase == true) {
                                contAcertadas++;
                                tocarSomCorreto();

                        } else {
                                i = -1; // recomeça as perguntas
                                tocarSomErro();
                                contAcertadas = contError * (-1);
                                if (contError < 7) {
                                        contError++;
                                }
                        }
                }
                return contAcertadas;
        }

        public static int[][] preencherMatriz(int linha, int coluna, int[] respostasC) {
                int[][] matriz = new int[linha][coluna];
                int contLinha = 0;

                for (int j = 0; j < matriz.length; j++) {
                        matriz[contLinha][respostasC[j] - 1] = 1;
                        contLinha++;
                }
                return matriz;
        }

        public static int[] preencherRespostas(int tamanho) {
                // 1 ; 2 ; 3 ; 2 ; 1 ; 1 ; 2 ; 3
                int[] vet = new int[tamanho];
                vet[0] = 1;
                vet[1] = 2;
                vet[2] = 3;
                vet[3] = 2;
                vet[4] = 1;
                vet[5] = 1;
                vet[6] = 2;
                vet[7] = 3;
                return vet;
        }

        public static void apresentarPersonas() {
                setColor(5);
                printEscolha();
                pularLinha();
                pularLinha();
                setColor(7);
                printPersonas();
                setColor(4);
                printNomesPersonas();
                setColor(7);
                pularLinha();
        }

        public static void limparTela() {
                for (int i = 0; i < 40; ++i) {
                        System.out.println();
                }
                System.out.print("\033\143");

        }

        public static void pularLinha() {
                System.out.print("\n");
        }

        public static char lerChar() {
                char valor = LER.next().charAt(0);
                return valor;
        }

        //Métodos que verificam algo:
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public static boolean verificarBaforada(int contHabilidadeHidra, hidra hidra) {
                boolean baforada = false;
                if (contHabilidadeHidra >= 2 && hidra.vaiAtaca == true
                                && ThreadLocalRandom.current().nextInt(1, 3) == 1) {
                        baforada = true;
                }
                return baforada;
        }

        public static int vereficarCor(player player) {
                int cor = 7;
                switch (player.qualClasse) {
                        case '1': // javeiro
                                cor = 4;
                                break;
                        case '2': // pythonico
                                cor = 6;
                                break;
                        default: // luaniano
                                cor = 5;
                                break;
                }
                return cor;
        }

        public static boolean vereficarAcerto(int[][] matrizZeroUm, char respostaPlayer, int linhaAtual) {
                boolean passou = false;
                int resposta = respostaPlayer - '0';
                if (matrizZeroUm[linhaAtual][resposta - 1] == 1) {
                        passou = true;
                }
                return passou;
        }

        public static char vereficarEscolha() {
                char numDigitado = 0;
                do {
                        numDigitado = lerChar();
                        if (numDigitado != '1' && numDigitado != '2' && numDigitado != '3') {
                                setColor(1);
                                System.out.println("Escolha inválida, digite novamente..");
                                setColor(7);
                        }
                } while (numDigitado != '1' && numDigitado != '2' && numDigitado != '3');
                return numDigitado;
        }

        public static char vereficarDigitado() {
                char digitado = ' ';
                do {
                        digitado = lerChar();
                        if (digitado != '1' && digitado != '2') {
                                setColor(1);
                                System.out.println("Valor inválido, digite novamente..");
                                setColor(7);
                        }
                } while (digitado != '1' && digitado != '2');
                return digitado;
        }

        //Métodos que imprimem algo:
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public static void imprimirPgts(int linhaAtual, String[][] matrizPerguntas) {
                switch (linhaAtual) {
                        case 0:
                                pularLinha();
                                pularLinha();
                                pularLinha();
                                setColor(5);
                                System.out.println("\t\t\t\t\t\t\t" + matrizPerguntas[0][0]); // pgt 1
                                pularLinha();
                                setColor(7);
                                System.out.println("\t\t\t\t\t\t\t\t\t" + matrizPerguntas[0][1]);
                                System.out.println("\t\t\t\t\t\t\t\t\t" + matrizPerguntas[0][2]);
                                System.out.println("\t\t\t\t\t\t\t\t\t" + matrizPerguntas[0][3]);
                                break;

                        case 1:
                                pularLinha();
                                pularLinha();
                                pularLinha();
                                setColor(1);
                                System.out.println("\t\t\t\t\t\t\t\t      " + matrizPerguntas[1][0]); // pgt 2
                                pularLinha();
                                setColor(7);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t    " + matrizPerguntas[1][1]);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t    " + matrizPerguntas[1][2]);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t    " + matrizPerguntas[1][3]);
                                break;

                        case 2:
                                pularLinha();
                                pularLinha();
                                pularLinha();
                                setColor(4);
                                System.out.println("\t\t\t\t\t\t\t\t" + matrizPerguntas[2][0]); // pgt 3
                                pularLinha();
                                setColor(7);
                                System.out.println("\t\t\t\t\t\t\t\t" + matrizPerguntas[2][1]);
                                System.out.println("\t\t\t\t\t\t\t\t" + matrizPerguntas[2][2]);
                                System.out.println("\t\t\t\t\t\t\t\t" + matrizPerguntas[2][3]);
                                break;

                        case 3:
                                pularLinha();
                                pularLinha();
                                pularLinha();
                                setColor(3);
                                System.out.println("\t\t\t\t\t\t\t\t" + matrizPerguntas[3][0]); // pgt 4
                                pularLinha();
                                setColor(7);
                                System.out.println("\t\t\t\t\t\t\t\t\t       " + matrizPerguntas[3][1]);
                                System.out.println("\t\t\t\t\t\t\t\t\t       " + matrizPerguntas[3][2]);
                                System.out.println("\t\t\t\t\t\t\t\t\t       " + matrizPerguntas[3][3]);
                                break;

                        case 4:
                                pularLinha();
                                pularLinha();
                                pularLinha();
                                setColor(6);
                                System.out.println("\t\t\t\t\t\t\t\t\t   " + matrizPerguntas[4][0]); // pgt 5
                                pularLinha();
                                setColor(7);
                                System.out.println("\t\t\t\t\t\t\t\t" + matrizPerguntas[4][1]);
                                System.out.println("\t\t\t\t\t\t\t\t" + matrizPerguntas[4][2]);
                                System.out.println("\t\t\t\t\t\t\t\t" + matrizPerguntas[4][3]);
                                break;

                        case 5:
                                pularLinha();
                                pularLinha();
                                pularLinha();
                                setColor(5);
                                System.out.println("\t\t\t\t\t\t\t\t    " + matrizPerguntas[5][0]); // pgt 6
                                pularLinha();
                                setColor(7);
                                System.out.println("\t\t\t\t\t\t\t\t\t      " + matrizPerguntas[5][1]);
                                System.out.println("\t\t\t\t\t\t\t\t\t      " + matrizPerguntas[5][2]);
                                System.out.println("\t\t\t\t\t\t\t\t\t      " + matrizPerguntas[5][3]);
                                break;

                        case 6:
                                pularLinha();
                                pularLinha();
                                pularLinha();
                                setColor(3);
                                System.out.println("\t\t\t\t\t\t\t\t    " + matrizPerguntas[6][0]); // pgt 7
                                pularLinha();
                                setColor(7);
                                System.out.println("\t\t\t\t\t\t\t\t\t       " + matrizPerguntas[6][1]);
                                System.out.println("\t\t\t\t\t\t\t\t\t       " + matrizPerguntas[6][2]);
                                System.out.println("\t\t\t\t\t\t\t\t\t       " + matrizPerguntas[6][3]);
                                break;

                        default:
                                pularLinha();
                                pularLinha();
                                pularLinha();
                                setColor(2);
                                System.out.println("\t\t\t\t\t\t\t\t" + matrizPerguntas[7][0]); // pgt 8
                                pularLinha();
                                setColor(7);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t " + matrizPerguntas[7][1]); // rp 1
                                System.out.println("\t\t\t\t\t\t\t\t\t\t " + matrizPerguntas[7][2]); // rp 2
                                System.out.println("\t\t\t\t\t\t\t\t\t\t " + matrizPerguntas[7][3]); // rp 3
                                break;
                }
        }

        public static void printBarra(int vidaTotal, int vidaAtual, double porcentagem, int corVida) {
                setColor(corVida);
                for (int i = 0; i < (int) porcentagem; i++) {
                        System.out.print("▇");
                }

                setColor(7);
                for (int i = 0; i < 100 - (int) porcentagem; i++) {
                        System.out.print("▇");
                }
                System.out.println(" " + (int) porcentagem + "% da vida");
        }

        public static void printDanoColdownP(player player, int coldownHabilidadeAtiva, int cor) {
                int coldown;
                if (coldownHabilidadeAtiva >= 3) {
                        coldown = 0;
                } else if (coldownHabilidadeAtiva == 2) {
                        coldown = 1;
                } else if (coldownHabilidadeAtiva == 1) {
                        coldown = 2;
                } else {
                        coldown = 3;
                }
                setColor(7);
                System.out.print("|");
                setColor(cor);
                System.out.print("Dano Player");
                setColor(7);
                System.out.print(": ");
                System.out.println(player.dano);

                System.out.print("|");
                setColor(cor);
                System.out.print("Coldown Habilidade Ativa");
                setColor(7);
                System.out.println(": " + coldown + " rounds");
                pularLinha();
        }

        public static void printVP(int corVP) {
                setColor(7);
                System.out.print("|");
                setColor(corVP);
                System.out.print("Vida Player");
                setColor(7);
                System.out.print(": ");
        }

        public static void printDanoH(hidra hidra) {
                setColor(7);
                System.out.print("|");
                setColor(2);
                System.out.print("Dano Hidra");
                setColor(7);
                System.out.print(": ");
                System.out.println(hidra.dano);
        }

        public static void printVidaH() {
                setColor(7);
                System.out.print("|");
                setColor(2);
                System.out.print("Vida Hidra");
                setColor(7);
                System.out.print(": ");
        }

        public static void printBaforada(int baforadaMortal) {
                setColor(2);
                System.out.print("A hidra solta sua Baforada Mortal e causa ");
                setColor(1);
                System.out.print(baforadaMortal);
                setColor(2);
                System.out.println(" de dano!");
                setColor(7);
        }

        public static void printAtivaLuaniano(int danoAutoInfligido) {
                setColor(7);
                System.out.print("|");
                setColor(3);
                System.out.print("Habilidade Ativa Usada");
                setColor(7);
                System.out.print(": ");
                System.out.print("ALUADO! A Hidra causou ");
                setColor(1);
                System.out.print(danoAutoInfligido);
                setColor(7);
                System.out.println(" de dano em si mesma!");
        }

        public static void printAtivaPythonico() {
                setColor(7);
                System.out.print("|");
                setColor(3);
                System.out.print("Habilidade Ativa Usada");
                setColor(7);
                System.out.print(": ");
                System.out.print("ZAWARUDOOO! A Hidra não atacará no round!");
        }

        public static void printAtivaJaveiro(double ataqueDebug) {
                setColor(7);
                System.out.print("|");
                setColor(3);
                System.out.print("Habilidade Ativa Usada");
                setColor(7);
                System.out.print(": ");
                System.out.print("DEBUG! Você causou ");
                setColor(1);
                System.out.printf("%.2f", ataqueDebug);
                setColor(7);
                System.out.println(" de dano!");
        }

        public static void printPassivaLuaniano(int cura) {
                setColor(7);
                System.out.print("|");
                setColor(3);
                System.out.print("Habilidade Passiva Ativada");
                setColor(7);
                System.out.print(": ");
                System.out.print("Você deu uma Pausa pro Cafezin e curou ");
                setColor(1);
                System.out.print(cura);
                setColor(7);
                System.out.println(" pontos de vida!");
                pularLinha();
        }

        public static void printPassivaPythonico(player player) {
                setColor(7);
                System.out.print("|");
                setColor(3);
                System.out.print("Habilidade Passiva Ativada");
                setColor(7);
                System.out.print(": ");
                System.out.print("Sintaxe Simples! Você ataca novamente causando mais ");
                setColor(1);
                System.out.print(player.dano);
                setColor(7);
                System.out.println(" de dano!");
                pularLinha();
        }

        public static void printPassivaJaveiro(player player) {
                setColor(7);
                System.out.print("|");
                setColor(3);
                System.out.print("Habilidade Passiva Ativada");
                setColor(7);
                System.out.print(": ");
                System.out.print("Compilação Rápida! Seu dano aumentou para ");
                setColor(3);
                System.out.println(player.dano);
                setColor(7);
                pularLinha();
        }

        public static void printAcao() {
                setColor(3);
                System.out.print("|");
                setColor(7);
                System.out.print("Escolha sua ação");
                setColor(3);
                System.out.println(": ");
                setColor(3);
                System.out.print("|");
                setColor(7);
                System.out.println("1 - Atacar");
                setColor(3);
                System.out.print("|");
                setColor(7);
                System.out.println("2 - Usar Habilidade Ativa");
                setColor(7);
        }

        public static void printPlayer() {
                System.out.println("          .:::::..");
                System.out.println("      ..:::::::::::.");
                System.out.println("     =+#####+=+#####+=");
                System.out.println("     :.#####+-*#####:.");
                System.out.println("     .:-###==:--###-:.");
                System.out.println("     .:::::::::::-:::.");
                System.out.println("      .:::=======::..");
                System.out.println("       ..::::-:::::.");
                System.out.println("         ...:::...");
        }

        public static void printHidra0() {
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                   ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                           ..::....  .::::....   ..::....           ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                          .*#%%##*+. :#:-=+%*+   -*###**+.          ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                          :+..*:.:*+..=+..==.+=. -+  =. =:          ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                          .-*..=:. ::  .*::*:.:*.:#..=+..+.         ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                            .=:.:-..=. .+-..*: =*.+=:..=..:*:       ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             :+:.-=-+*++%+-:+: =*..--. .:=:.:+.     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                            -%%%%%%##**++*#%%%%%#-:..**=--+  +:..   ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                            ......          ..::=*#%%%%#**#+*%%%-   ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                     ..:==++=-..    ");
        }

        public static void printHidra1() {
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                 .#=     ...        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                -::-  :=..:=.       ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                             ..++.....   .+.        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                             =-.         ..:-       ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                           .=.      .===:   :+.     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                           =:*..:..=-. --=-. .-     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                           #00+-00#.   .*##+..=.    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                         .=-.-+--+=.    :-.-: -.    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                         ::.:.-*+-     .+..=:.=.    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                         :-.++.:=.     -:.-= .=.    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                         .:*..=.     .+:..+..*-     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                           ...      :=-+==.=+.      ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                  .+*-.=-:#:        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                  :=..=-:+.         ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                              -++++==: .**+**%#+  .*==#:+.          ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                              +..*..-#. :+:.-*.*-..+: =:--.         ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                              :%:.=: .+. .++.#:.:*.== .*--=.        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                -::+- .-..=#==*. +=.+-. .=:-=.      ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                               .-=::+++###%#*=*-.*= .-=...:+.=:     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                               :%%%#*=-:....:+#%%%%%*===...::.=-=.  ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                ....:-=#%%%%%%%#-.  ");
        }

        public static void printHidra2() {
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                                    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                     .::.                           ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                   ..==:.  .=:-=:.                  ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                   .=.-+===...--..=.                ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                  .=.        .:=+-#.  :-:-+=        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                 .+.          .+-.+++-:. :-.        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                .++    .=*::-*-..        .=-        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                              .-=00.*00+*-..*..            .+.      ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             .---:.-.=... .+*.     :+.-*=.  .+.     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             .-=:-:=+-.  .*.:--=.:*=. .--:=..:=.    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             .:..==.+.   .*00+=00::.=  .-:.= .-:    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             .-+-.--    .+-::==+#-.-:  .-=-+ .::    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                              .-=-.     -.. :==--.:-  .--.:- .=.    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                       .-+-+:.--.--. .-==**..:+.    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                      .-:.=-=-.:=:. .==..-:.+=.     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                     .-=---#-.--.  -=.:+*:=+.       ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                     .::  -..+..  +:====-+-.        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                     .-=--*..=    *..:=.-:.         ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                            .++**###=.:-. .+.--.  -=:----.          ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                            :+--*:..+=..+-::+..=-.:* .-:-:.         ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             :=-.=: .:: .+. .=. -:.#.-**--=.        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                              .---+=..:..*++++=..=..+.. .=:==.      ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             ..-=-=*##%%%%%%*+=-:-. .--...--.=:     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             .-*#**+=-:.. .:-+*#%%%#*+*-:..+.:++-.  ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                  .:-=+*#%%%%%#+:.  ");
        }

        public static void printHidra3() {
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                         .:-.   .....-*-    .:--.                   ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                        .-:=.  :-=-+-:=:.---=.-=.                   ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                       :-:.-::-: .+=..:--:.  .=::=+:    :==-.       ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                     .:=:      ..+=.          .-=:-: :-=..--.       ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                   .:=-.       -=-:      .--:.==..:--.. ..-         ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                   =--  .::. .+-=+-.:::-+*::=+.         ...=-.      ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                  --00::-00==-*-:-=--**-..=:       .---.  .:-.     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                  +=-=-+=.-+::=00--00=.=: =:+.... :=:..*=-. .--.    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                  +:-.-++=-. -:..====- -:.*:--=-.-+=.. .+-+- .-:    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                  + .-=-=:.  - .==:-:. -:-00+=00-.::-. .+..-. -::   ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                  +-=:.-.    -+=.--.  .==+-:=:+**:.-:.  +-=+: -::   ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                  -=:-:.      =+-:-  .-:=...-=---.--.  --.:=..-::   ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                   ...      .==..-: .-:.=*==..=:.--.  -+=**: -=:    ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                           .=-=-=:.:-.:-..=:=-.:-:. .+=..--.==:     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                           =-. ==:-: .=--==*:.--. .--.:**--+-.      ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                          .=---+.+.  :-.  +.:=.  .-==--*.++.        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                          .=:..+:=   :-:::+ -:   :=:..+.=:          ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                           =-::=-:-: .--. =:.=.  .=+=+= +           ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                           :=::-*..--..--::+:.--: -=..=.=.          ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                            :+-.:=..::. -=::--..--:=::=*:=-.        ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             .:=:-=. ::..+---=+.:-.=+:..---=-.      ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             .*--=+-+*+*#+=--=.:-. :=. ..-=:-:     ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                             .%%%%##**++==+**#%%%#+=--*----=::--:.  ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                              ...            ...:-=+*#%%#*****%%*:  ");
                System.out.println(
                                "\t\t\t\t\t\t\t\t                                                                                       .:--==-:.    ");
        }

        public static void printAtiva() {
                System.out.println("\t\t\t\t\t\t\t                     HABILIDADE ATIVA:                     ");
        }

        public static void printPassiva() {
                System.out.println("\t\t\t\t\t\t\t                     HABILIDADE PASSIVA:                   ");
        }

        public static void printLuaniano() {
                System.out
                                .println("\t\t\t\t\t\t _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _ ");
                System.out
                                .println("\t\t\t\t\t\t|_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_|");
                System.out
                                .println("\t\t\t\t\t\t|_|                                                                        |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██╗   ██╗ ██████╗  ██████╗███████╗    ███████╗    ██╗   ██╗███╗   ███╗ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██║   ██║██╔═══██╗██╔════╝██╔════╝    ██╔════╝    ██║   ██║████╗ ████║ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██║   ██║██║   ██║██║     █████╗      █████╗      ██║   ██║██╔████╔██║ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ╚██╗ ██╔╝██║   ██║██║     ██╔══╝      ██╔══╝      ██║   ██║██║╚██╔╝██║ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_|  ╚████╔╝ ╚██████╔╝╚██████╗███████╗    ███████╗    ╚██████╔╝██║ ╚═╝ ██║ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_|   ╚═══╝   ╚═════╝  ╚═════╝╚══════╝    ╚══════╝     ╚═════╝ ╚═╝     ╚═╝ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_|                                                                        |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██╗     ██╗   ██╗ █████╗ ███╗   ██╗██╗ █████╗ ███╗   ██╗ ██████╗ ██╗   |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██║     ██║   ██║██╔══██╗████╗  ██║██║██╔══██╗████╗  ██║██╔═══██╗██║   |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██║     ██║   ██║███████║██╔██╗ ██║██║███████║██╔██╗ ██║██║   ██║██║   |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██║     ██║   ██║██╔══██║██║╚██╗██║██║██╔══██║██║╚██╗██║██║   ██║╚═╝   |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ███████╗╚██████╔╝██║  ██║██║ ╚████║██║██║  ██║██║ ╚████║╚██████╔╝██╗   |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝   |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_|");
        }

        public static void printPythonico() {
                System.out.println(
                                "\t\t\t\t\t\t _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _ ");
                System.out.println(
                                "\t\t\t\t\t\t|_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_|");
                System.out.println(
                                "\t\t\t\t\t\t|_|                                                                              |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| ██╗   ██╗ ██████╗  ██████╗███████╗    ███████╗    ██╗   ██╗███╗   ███╗       |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| ██║   ██║██╔═══██╗██╔════╝██╔════╝    ██╔════╝    ██║   ██║████╗ ████║       |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| ██║   ██║██║   ██║██║     █████╗      █████╗      ██║   ██║██╔████╔██║       |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| ╚██╗ ██╔╝██║   ██║██║     ██╔══╝      ██╔══╝      ██║   ██║██║╚██╔╝██║       |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_|  ╚████╔╝ ╚██████╔╝╚██████╗███████╗    ███████╗    ╚██████╔╝██║ ╚═╝ ██║       |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_|   ╚═══╝   ╚═════╝  ╚═════╝╚══════╝    ╚══════╝     ╚═════╝ ╚═╝     ╚═╝       |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_|                                                                              |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| ██████╗ ██╗   ██╗████████╗██╗  ██╗ ██████╗ ███╗   ██╗██╗ ██████╗ ██████╗ ██╗ |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| ██╔══██╗╚██╗ ██╔╝╚══██╔══╝██║  ██║██╔═══██╗████╗  ██║██║██╔════╝██╔═══██╗██║ |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| ██████╔╝ ╚████╔╝    ██║   ███████║██║   ██║██╔██╗ ██║██║██║     ██║   ██║██║ |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| ██╔═══╝   ╚██╔╝     ██║   ██╔══██║██║   ██║██║╚██╗██║██║██║     ██║   ██║╚═╝ |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| ██║        ██║      ██║   ██║  ██║╚██████╔╝██║ ╚████║██║╚██████╗╚██████╔╝██╗ |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| ╚═╝        ╚═╝      ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝ ╚═════╝ ╚═════╝ ╚═╝ |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_| _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _ |_|");
                System.out.println(
                                "\t\t\t\t\t\t|_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_|");
        }

        public static void printJaveiro() {
                System.out
                                .println("\t\t\t\t\t\t _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _ ");
                System.out
                                .println("\t\t\t\t\t\t|_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_|");
                System.out
                                .println("\t\t\t\t\t\t|_|                                                                        |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██╗   ██╗ ██████╗  ██████╗███████╗    ███████╗    ██╗   ██╗███╗   ███╗ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██║   ██║██╔═══██╗██╔════╝██╔════╝    ██╔════╝    ██║   ██║████╗ ████║ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██║   ██║██║   ██║██║     █████╗      █████╗      ██║   ██║██╔████╔██║ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ╚██╗ ██╔╝██║   ██║██║     ██╔══╝      ██╔══╝      ██║   ██║██║╚██╔╝██║ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_|  ╚████╔╝ ╚██████╔╝╚██████╗███████╗    ███████╗    ╚██████╔╝██║ ╚═╝ ██║ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_|   ╚═══╝   ╚═════╝  ╚═════╝╚══════╝    ╚══════╝     ╚═════╝ ╚═╝     ╚═╝ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_|                                                                        |_|");
                System.out
                                .println("\t\t\t\t\t\t|_|      ██╗ █████╗ ██╗   ██╗███████╗██╗██████╗  ██████╗ ██╗               |_|");
                System.out
                                .println("\t\t\t\t\t\t|_|      ██║██╔══██╗██║   ██║██╔════╝██║██╔══██╗██╔═══██╗██║               |_|");
                System.out
                                .println("\t\t\t\t\t\t|_|      ██║███████║██║   ██║█████╗  ██║██████╔╝██║   ██║██║               |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ██   ██║██╔══██║╚██╗ ██╔╝██╔══╝  ██║██╔══██╗██║   ██║╚═╝               |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| ╚█████╔╝██║  ██║ ╚████╔╝ ███████╗██║██║  ██║╚██████╔╝██╗               |_|");
                System.out
                                .println("\t\t\t\t\t\t|_|  ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝╚═╝  ╚═╝ ╚═════╝ ╚═╝               |_|");
                System.out
                                .println("\t\t\t\t\t\t|_| _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _ |_|");
                System.out
                                .println("\t\t\t\t\t\t|_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_||_|");
        }

        public static void printFirewall() {
                System.out.println(
                                "++++:++++++++++++.++++++:++++++++++++.+++++++++++--+++++++++++:+***********.+++++++++++--+++++++++++:=+++++++++++.=+++++++++:++++++++++++.+++++++++++--+++++++++++:+***********.******");
                System.out.println(
                                "++++:++++++++++++.++++++:++++++++++++.+++++++++++--+++++++++++:+***********.+++++++++++--+++++++++++:=+++++++++++.=+++++++++:++++++++++++.+++++++++++--+++++++++++:+***********.******");
                System.out.println(
                                "++++:++++++++++++.++++++:++++++++++++:+++++++++++--++++++++++*:+***********.+++++++++++--+++++++++++:=+++++++++++.++++++===========-:+++++++++++:-===========.===========-:+++++++++**");
                System.out.println(
                                "===========-:+++++++++++:-===========.===========-:+++++++++++:++++++++++++.===========-:++++++++++++++++++++++=-***********-=+++++++++++.+++++++++++-:+++++++++:+++++++++:+++++++++**");
                System.out.println(
                                "===========-:+++++++++++++++++=-***********-=+++++++++++.+++++++++++-:+++++++++++:************:+++++++++++--++++++++++++++++++++++=-***********-=+++++++++++.+++++++++++-:++++++++++**");
                System.out.println(
                                "+++++++++++=-******+++++++++++=-***********-=+++++++++++.+++++++++++-:+++++++++++:************:+++++++++++--+++++++++++++++:++++++++++++:+++++++++++--++++++++++*:+***********..+*****");
                System.out.println(
                                "::::..............:::::..............:::::::::::..:::::::::::........................................::::::::::...:::::::::..............:::::::::::..:::::::::::.................::**");
                System.out.println(
                                "****:=+++++++++++:*****:=+++++++++++:***********==***********:=+++++++++++.+++++++++++--+++++++++++:+***********.**********:=+++++++++++:***********==***********:=+++++++++++.+++:;**");
                System.out.println(
                                "****:=+++++++++++:*****:=+++++++++++:***********==***********:=++++++++++***************************************.******++++:+***********.+++++++++++-=***********:=+++++++++++.++;=;**");
                System.out.println(
                                "****:=+++++++++++:*****:=+++++++++++:***********==***********:=+++++++*+================================+****.**********:=+++++++++++:***********==***********:=+++++++++++.+++:::::**");
                System.out.println(
                                "+++++++++++=-+++++++++++++++++=-+++++++++++:=+++++++++++.+++++++++++--*|░█▀▀░▀█▀░█▀▄░█▀▀░█░█░█▀█░█░░░█░░|*+++.++++++===========-:+++++++++++:-===========.===========-:+++++++++==++**");
                System.out.println(
                                "::::..............:::::..............:::::::::::..:::::::::::.........*|░█▀▀░░█░░█▀▄░█▀▀░█▄█░█▀█░█░░░█░░|*::...:::::::::..............:::::::::::..:::::::::::.................:::::**");
                System.out.println(
                                "+++++++++++=-+++++++++++++++++=-+++++++++++:=+++++++++++.+++++++++++--*|░▀░░░▀▀▀░▀░▀░▀▀▀░▀░▀░▀░▀░▀▀▀░▀▀▀|*+++.+*****=++++++++++--***********--++++++++++=.+++++++++++-:+++++++::::::**");
                System.out.println(
                                "+++:+***********++++:+***********.+++++++++++-=***********:=++++++++++*+================================+*+++.=+++++++++:+***********.+++++++++++-=***********:=+++++++++++.:=++++++**");
                System.out.println(
                                "++++:+***********.+++++:+***********.+++++++++++-=***********:=++++++++++************************************+++.=++++++++++++++++=-+++++++++++:=+++++++++++.+++++++++++--*+++++**++**");
                System.out.println(
                                "++++:+***********.+++++:+***********.+++++++++++-=***********:=+++++++++++.+++++++++++--***********-=+++++++++++.=+++++++++:+***********.+++++++++++-=***********:=+++++++++++.:=+++**");
                System.out.println(
                                "................................................................................................................................................................................ ..:**");
                System.out.println(
                                "+++++++++++=-++++++++++++++++=-+++++++++++:=+++++++++++.+++++++++++--***********:++++++++++++:+++++++++++--++++++++++++++++++++++=-+++++++++++:=+++++++++++.+++++++++++--*********--**");
                System.out.println(
                                "+++++++++++=-++++++++++++++++=-+++++++++++:=+++++++++++.+++++++++++--***********:++++++++++++:+++++++++++--++++++++++++++++++++++=-+++++++++++:=+++++++++++.+++++++++++--*****+++-++**");
                System.out.println(
                                ":::::::::::..::::::::::::::::..:::::::::::..:::::::::::.:::::::::::..:::::::::::..:::::::::::.:::::::::::..::::::::::::::::::::::..:::::::::::..:::::::::::.:::::::::::..::::::.....**");
                System.out.println(
                                "****:=++++++++++++****:=+++++++++++:+++++++++++=-+++++++++++:+***********.+++++++++++--+++++++++++:=+++++++++++.+*****=++++++++++--***********--++++++++++=.+++++++++++-:+++++++:::+**");
                System.out.println(
                                "****:=+++++++++++:****:=+++++++++++:+++++++++++=-+++++++++++:+***********.+++++++++++--+++++++++++:=+++++++++++.+*********:=+++++++++++:+++++++++++=-+++++++++++:+***********...++++**");
                System.out.println(
                                "****:=+++++++++++.****:=+++++++++++.+++++++++++--+++++++++++:+***********.+++++++++++-:+++++++++++:=+++++++++++.+*****=++++++++++--***********--++++++++++=.+++++++++++-:+++++++++++**");
                System.out.println(
                                "=++++++++++--*****=++++++++++--***********--++++++++++=.+++++++++++-:+++++++++++:++++++++++++:+++++++++++--***********++++:+***********.+++++++++++-=***********:=+++++++++++.+++.++**");
        }

        public static void printEscolha() {
                System.out.println("\t\t\t\t\t\t\t╔══════════════════════════════════════════════════════════════╗");
                System.out.println("\t\t\t\t\t\t\t║                   ESCOLHA SEU PERSONAGEM:                    ║");
                System.out.println("\t\t\t\t\t\t\t╚══════════════════════════════════════════════════════════════╝");
        }

        public static void printNomesPersonas() {
                System.out.println(
                                "        +----------------------------------------+\t        +------------------------------------------------+ \t        +--------------------------------------------+");
                System.out.println(
                                "        |░▀█░░░░░░░░░░▀▀█░█▀█░█░█░█▀▀░▀█▀░█▀▄░█▀█|\t        |░▀▀▄░░░░░░░░░█▀█░█░█░▀█▀░█░█░█▀█░█▀█░▀█▀░█▀▀░█▀█| \t        |░▀▀█░░░░░░░░░█░░░█░█░█▀█░█▀█░▀█▀░█▀█░█▀█░█▀█|");
                System.out.println(
                                "        |░░█░░░░▄▄▄░░░░░█░█▀█░▀▄▀░█▀▀░░█░░█▀▄░█░█|\t        |░▄▀░░░░▄▄▄░░░█▀▀░░█░░░█░░█▀█░█░█░█░█░░█░░█░░░█░█| \t        |░░▀▄░░░▄▄▄░░░█░░░█░█░█▀█░█░█░░█░░█▀█░█░█░█░█|");
                System.out.println(
                                "        |░▀▀▀░░░░░░░░░▀▀░░▀░▀░░▀░░▀▀▀░▀▀▀░▀░▀░▀▀▀|\t        |░▀▀▀░░░░░░░░░▀░░░░▀░░░▀░░▀░▀░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀▀▀| \t        |░▀▀░░░░░░░░░░▀▀▀░▀▀▀░▀░▀░▀░▀░▀▀▀░▀░▀░▀░▀░▀▀▀|");
                System.out.println(
                                "        +----------------------------------------+\t        +------------------------------------------------+ \t        +--------------------------------------------+");
        }

        public static void printPersonas() {
                System.out.println(
                                "\t                   ..:-:...                                                                                                                  ...                 ");
                System.out.println(
                                "\t                 -=:.##..:#.                                                                                                              ..=+-:+*:.             ");
                System.out.println(
                                "\t          .:+:::+=.       .-*::::+.                                         .......                                                    ..-+=:.=##=.::*=..         ");
                System.out.println(
                                "\t          .-  .==. :0: :0.  *.  .:*.                                 ...-++-....:*-:..                                             ..:++:..==####== ..:-+-.        ");
                System.out.println(
                                "\t          ..  .==           =.   ..                             ...+*##-:= :0  :0 --.:-*#=:.                                     ....::::::+*=-::-*=-:::::-:..     ");
                System.out.println(
                                "\t               .-: .-==-.  .#.                                ..:----::-++:        .#::::::--:.                                          .--       :+:            ");
                System.out.println(
                                "\t               ..=-.. ....+=.                                           .== .==+-. .=.                                                  .-+ :0  :0  -:.           ");
                System.out.println(
                                "\t              .-+=+**+++*#++-...                                        ..=-......-=..                                           ===    .-+         =:.           ");
                System.out.println(
                                "\t            ..-%+.        .+*---==.                                      ..=+=**==+.                                              +.*    .-=  **.   -=.           ");
                System.out.println(
                                "\t   .=-......-%##=.       .*:=##=.:+.                                    .:*=    .*-..                                             ..+    .:**==-==+*:.             ");
                System.out.println(
                                "\t      *+*#***#@*#=        .=.=###==-.                                  ..=-+=    .+-=:.                                            .*     .=+.*..++..*:.           ");
                System.out.println(
                                "\t            -=.=+---------%==##==-+.                                 ...:.=       .+:.:..                                          .#+++==++.       ..=:.          ");
                System.out.println(
                                "\t                --:=:.  .*:-*---=:.                                       .=     .+:                                               .*.:::-+:.         :+..         ");
                System.out.println(
                                "\t                -:.-.   .+..=...                                         ..=.    .+:                                               .*   .-=           ..#.         ");
                System.out.println(
                                "\t                -:.-.   .+..=                                           .-+++*+-==+==-.                                            .*  .-=:             :==.       ");
                System.out.println(
                                "\t                -=-=.   .*--=                                          ..-+--=: :==-=-..                                           ..-..:+.++==..==++..:...=:.      ");
                System.out.println(
                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        public static void printNomeGame() {
                System.out.println(
                                "\t\t\t\t\t\t╔═══════════════════════════════════════════════════════════════════════════╗");
                System.out.println(
                                "\t\t\t\t\t\t║██╗  ██╗██╗   ██╗██████╗ ██████╗  █████╗  ██████╗  █████╗ ████████╗███████╗║");
                System.out.println(
                                "\t\t\t\t\t\t║██║  ██║╚██╗ ██╔╝██╔══██╗██╔══██╗██╔══██╗██╔════╝ ██╔══██╗╚══██╔══╝██╔════╝║");
                System.out.println(
                                "\t\t\t\t\t\t║███████║ ╚████╔╝ ██║  ██║██████╔╝███████║██║  ███╗███████║   ██║   █████╗  ║");
                System.out.println(
                                "\t\t\t\t\t\t║██╔══██║  ╚██╔╝  ██║  ██║██╔══██╗██╔══██║██║   ██║██╔══██║   ██║   ██╔══╝  ║");
                System.out.println(
                                "\t\t\t\t\t\t║██║  ██║   ██║   ██████╔╝██║  ██║██║  ██║╚██████╔╝██║  ██║   ██║   ███████╗║");
                System.out.println(
                                "\t\t\t\t\t\t║╚═╝  ╚═╝   ╚═╝   ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚══════╝║");
                System.out.println(
                                "\t\t\t\t\t\t╚═══════════════════════════════════════════════════════════════════════════╝");
        }

        public static void printOpcoes() {
                System.out.println("\t\t\t\t\t\t\t\t      +--------------------------------+");
                System.out.println("\t\t\t\t\t\t\t\t      |░▀█░░░░░░░░░░▀▀█░█▀█░█▀▀░█▀█░█▀▄|");
                System.out.println("\t\t\t\t\t\t\t\t      |░░█░░░░▄▄▄░░░░░█░█░█░█░█░█▀█░█▀▄|");
                System.out.println("\t\t\t\t\t\t\t\t      |░▀▀▀░░░░░░░░░▀▀░░▀▀▀░▀▀▀░▀░▀░▀░▀|");
                System.out.println("\t\t\t\t\t\t\t\t      +--------------------------------+");

                System.out.println("\t\t\t\t\t\t\t\t      +----------------------------+");
                System.out.println("\t\t\t\t\t\t\t\t      |░▀▀▄░░░░░░░░░█▀▀░█▀█░▀█▀░█▀▄|");
                System.out.println("\t\t\t\t\t\t\t\t      |░▄▀░░░░▄▄▄░░░▀▀█░█▀█░░█░░█▀▄|");
                System.out.println("\t\t\t\t\t\t\t\t      |░▀▀▀░░░░░░░░░▀▀▀░▀░▀░▀▀▀░▀░▀|");
                System.out.println("\t\t\t\t\t\t\t\t      +----------------------------+");
        }
}