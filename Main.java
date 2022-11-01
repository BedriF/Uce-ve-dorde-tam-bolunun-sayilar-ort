import java.util.Scanner;
        import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                int k,i,toplam=0,j=0;
                Scanner input = new Scanner(System.in);
                System.out.println("Sayı giriniz : ");
                k = input.nextInt();
                for(i=0;i<=k;i++){
                    if(0==i%3&&0==i%4){
                        //System.out.println("3'e ve 4'e bölünen sayıların ortalaması : " + i);
                        toplam+=i;
                        j++;
                    }
                }
                toplam=toplam/(j-1);
                System.out.println("3'e ve 4'e bölünen sayıların ortalaması : " +toplam );
            }
        }

