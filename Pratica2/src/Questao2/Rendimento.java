package Questao2;

import java.text.NumberFormat;

    public class Rendimento {
        private double investimentoInicial;
        private double taxaRendimento;
        private int numMeses;

        public Rendimento(double investimentoInicial, double taxaRendimento, int numMeses) {
            this.investimentoInicial = investimentoInicial;
            this.taxaRendimento = taxaRendimento;
            this.numMeses = numMeses;
        }

        public double getInvestimentoInicial() {
            return investimentoInicial;
        }
        public double getTaxaRendimento() {
            return taxaRendimento;
        }
        public int getNumMeses() {
            return numMeses;
        }
        public void setInvestimentoInicial(double investimentoInicial) {
            this.investimentoInicial = investimentoInicial;
        }
        public void setTaxaRendimento(double taxaRendimento) {
            this.taxaRendimento = taxaRendimento;
        }
        public void setNumMeses(int numMeses) {
            this.numMeses = numMeses;
        }

        public void calculoRendimento(){
            double rendimentoMes;
            rendimentoMes=getInvestimentoInicial(); //rendimentoMes começa com o valor inicial
            System.out.println("Valor inicial: " + NumberFormat.getCurrencyInstance().format(getInvestimentoInicial())); //para imprimir em real
            System.out.println("Taxa de Juros: " + NumberFormat.getPercentInstance().format(getTaxaRendimento()/100)); //formata o 2%
            for (int i=1; i<=getNumMeses();i++) {
                rendimentoMes = rendimentoMes*getTaxaRendimento()/100+rendimentoMes;
                System.out.println("Mês " + i + ":" + NumberFormat.getCurrencyInstance().format(rendimentoMes));
            }

        }

    }
