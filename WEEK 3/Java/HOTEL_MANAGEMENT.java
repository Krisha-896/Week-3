import java.util.Scanner;

public class HOTEL_MANAGEMENT {
    public static void main(String[] args) {
        while (true) {
            float totalPrice;
            Scanner obj = new Scanner(System.in);
            System.out.println("1--->South Indian");
            System.out.println("2--->Punjabi");
            System.out.println("3--->Gujarati");
            System.out.println("4--->Italian");
            System.out.println("5--->EXIT");
            System.out.println("Enter the choice");
            int key = obj.nextInt();
            switch (key) {
                case 1:
                    System.out.println("You have selected South Indian");
                    System.out.println("1--->Dosa");
                    System.out.println("2--->Idli");
                    System.out.println("3--->Uttapam");
                    System.out.println("4--->Vada");
                    System.out.println("Enter the choice of south indian you want");
                    int choiceSouth = obj.nextInt();
                    switch (choiceSouth) {
                        case 1:
                            System.out.println("Welcome you have entered type of dosa");
                            System.out.println("1--->Masala Dosa");
                            System.out.println("2--->Rava Dosa");
                            System.out.println("3--->Spring Dosa");
                            System.out.println("Enter the dosa you want to order");
                            int choiceDosa = obj.nextInt();
                            switch (choiceDosa) {
                                case 1:
                                    System.out.println("You have selected MASALA DOSA in DOSA option under South");
                                    System.out.println("Enter the number of plates");
                                    int qtyDosa = obj.nextInt();
                                    totalPrice = qtyDosa * 40;
                                    System.out.println("total price of" + " " + qtyDosa + " " + "MASALA DOSA is" + " " + totalPrice);
                                    break;
                                case 2:
                                    System.out.println("You have selected RAVA DOSA in DOSA option under South");
                                    System.out.println("Enter the number of plates");
                                    int qtyDosa1 = obj.nextInt();
                                    totalPrice = qtyDosa1 * 60;
                                    System.out.println("total price of" + " " + qtyDosa1 + " " + "RAVA DOSA is" + " " + totalPrice);
                                    break;
                                case 3:
                                    System.out.println("You have selected SPRING DOSA in DOSA option under South");
                                    System.out.println("Enter the number of plates");
                                    int qtyDosa2 = obj.nextInt();
                                    totalPrice = qtyDosa2 * 90;
                                    System.out.println("total price of" + " " + qtyDosa2 + " " + "SPRING DOSA is" + " " + totalPrice);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Welcome you have entered type of Idli");
                            System.out.println("1--->Sooji Idli");
                            System.out.println("2--->Rava Idli");
                            System.out.println("3--->Moong dal & Spinach Idli");
                            System.out.println("Enter the Idli you want to order");
                            int choiceIdli = obj.nextInt();
                            switch (choiceIdli) {
                                case 1:
                                    System.out.println("You have selected Sooji Idli in Idli option under South");
                                    System.out.println("Enter the number of plates");
                                    int qtyIdli = obj.nextInt();
                                    totalPrice = qtyIdli * 30;
                                    System.out.println("total price of" + " " + qtyIdli + " " + "SOOJI IDLI is" + " " + totalPrice);
                                    break;
                                case 2:
                                    System.out.println("You have selected RAVA Idli in Idli option under South");
                                    System.out.println("Enter the number of plates");
                                    int qtyIdli1 = obj.nextInt();
                                    totalPrice = qtyIdli1 * 50;
                                    System.out.println("total price of" + " " + qtyIdli1 + " " + "RAVA IDLI is" + " " + totalPrice);
                                    break;
                                case 3:
                                    System.out.println("You have selected Moong dal & Spinach Idli in Idli option under South");
                                    System.out.println("Enter the number of plates");
                                    int qtyIdli2 = obj.nextInt();
                                    totalPrice = qtyIdli2 * 70;
                                    System.out.println("total price of" + " " + qtyIdli2 + " " + "MOOG DAL & SPINACH IDLI is" + " " + totalPrice);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Welcome you have entered type of Uttapam");
                            System.out.println("1--->Ragi Uttapam");
                            System.out.println("2--->Oats Uttapam");
                            System.out.println("Enter the Uttapam you want to order");
                            int choiceUttapam = obj.nextInt();
                            switch (choiceUttapam) {
                                case 1:
                                    System.out.println("You have selected Ragi Uttapam in Uttapam option under South");
                                    System.out.println("Enter the number of plates");
                                    int qtyUttapam = obj.nextInt();
                                    totalPrice = qtyUttapam * 40;
                                    System.out.println("total price of" + " " + qtyUttapam + " " + "RAGI UTTAPAM is" + " " + totalPrice);
                                    break;
                                case 2:
                                    System.out.println("You have selected Oats Uttapam in Uttapam option under South");
                                    System.out.println("Enter the number of plates");
                                    int qtyUttapam1 = obj.nextInt();
                                    totalPrice = qtyUttapam1 * 60;
                                    System.out.println("total price of" + " " + qtyUttapam1 + " " + "OATS UTTAPAM is" + " " + totalPrice);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("Welcome you have entered Vada");
                            System.out.println("Enter the number of plates");
                            int qtyVada = obj.nextInt();
                            totalPrice = qtyVada * 50;
                            System.out.println("total price of" + " " + qtyVada + " " + "VADA is" + " " + totalPrice);
                            break;
                        default:
                            break;

                    }
                    break;
                case 2:
                    System.out.println("You have selected Punjabi");
                    System.out.println("1--->Amritsari Kulcha");
                    System.out.println("2--->Sabji");
                    System.out.println("3--->Bread");
                    System.out.println("Enter the choice of Punjabi you want");
                    int choicePunjabi = obj.nextInt();
                    switch (choicePunjabi) {
                        case 1:
                            System.out.println("Welcome you have entered type of Amritsari Kulcha");
                            System.out.println("1--->Aloo Kulcha");
                            System.out.println("2--->Masala Kulcha");
                            System.out.println("3--->Paneer Kulcha");
                            System.out.println("Enter the  you Amritsari Kulcha want to order");
                            int choiceKulcha = obj.nextInt();
                            switch (choiceKulcha) {
                                case 1:
                                    System.out.println("You have selected Aloo Kulcha in Kulcha option under Punjabi");
                                    System.out.println("Enter the number of plates");
                                    int qtyKulcha = obj.nextInt();
                                    totalPrice = qtyKulcha * 30;
                                    System.out.println("total price of" + " " + qtyKulcha + " " + "ALOO KULCHA is" + " " + totalPrice);
                                    break;
                                case 2:
                                    System.out.println("You have selected Masala Kulcha in Kulcha option under Punjabi");
                                    System.out.println("Enter the number of plates");
                                    int qtyKulcha1 = obj.nextInt();
                                    totalPrice = qtyKulcha1 * 50;
                                    System.out.println("total price of" + " " + qtyKulcha1 + " " + "MASALA KULCHA is" + " " + totalPrice);
                                    break;
                                case 3:
                                    System.out.println("You have selected Paneer Kulcha in Kulcha option under Punjabi");
                                    System.out.println("Enter the number of plates");
                                    int qtyKulcha2 = obj.nextInt();
                                    totalPrice = qtyKulcha2 * 80;
                                    System.out.println("total price of" + " " + 2 + " " + "PANEER KULCHA is" + " " + totalPrice);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Welcome you have entered type of Punjabi Sabji");
                            System.out.println("1--->Paneer Tikka");
                            System.out.println("2--->Tandoori Paneer");
                            System.out.println("3--->Mattar Paneer");
                            System.out.println("Enter the  you Punjabi Sabji want to order");
                            int choiceSabji = obj.nextInt();
                            switch (choiceSabji) {
                                case 1:
                                    System.out.println("You have selected Paneer Tikka in Sabji option under Punjabi");
                                    System.out.println("Enter the number of plates");
                                    int qtySabji = obj.nextInt();
                                    totalPrice = qtySabji * 150;
                                    System.out.println("total price of" + " " + qtySabji + " " + "PANEER TIKKA is" + " " + totalPrice);
                                    break;
                                case 2:
                                    System.out.println("You have selected Tandoori Paneer in Sabji option under Punjabi");
                                    System.out.println("Enter the number of plates");
                                    int qtySabji1 = obj.nextInt();
                                    totalPrice = qtySabji1 * 210;
                                    System.out.println("total price of" + " " + qtySabji1 + " " + "TANDOORI PANEER is" + " " + totalPrice);
                                    break;
                                case 3:
                                    System.out.println("You have selected Mattar Paneer in Sabji option under Punjabi");
                                    System.out.println("Enter the number of plates");
                                    int qtySabji2 = obj.nextInt();
                                    totalPrice = qtySabji2 * 175;
                                    System.out.println("total price of" + " " + qtySabji2 + " " + "MATTAR PANEER is" + " " + totalPrice);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Welcome you have entered type of Bread");
                            System.out.println("1--->Rumali Roti");
                            System.out.println("2--->Naan");
                            System.out.println("Enter the  you Bread want to order");
                            int choiceBread = obj.nextInt();
                            switch (choiceBread) {
                                case 1:
                                    System.out.println("You have selected Rumali Roti in Bread option under Punjabi");
                                    System.out.println("Enter the number of plates");
                                    int qtyBread = obj.nextInt();
                                    totalPrice = qtyBread * 30;
                                    System.out.println("total price of" + " " + qtyBread + " " + "RUMALI ROTI is" + " " + totalPrice);
                                    break;
                                case 2:
                                    System.out.println("You have selected Naan in Bread option under Punjabi");
                                    System.out.println("Enter the number of plates");
                                    int qtyBread1 = obj.nextInt();
                                    totalPrice = qtyBread1 * 50;
                                    System.out.println("total price of" + " " + qtyBread1 + " " + "NAAN is" + " " + totalPrice);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("You have selected Gujarati");
                    System.out.println("1--->Sabji");
                    System.out.println("2--->Roti");
                    System.out.println("3--->Rice");
                    System.out.println("4--->Dal");
                    System.out.println("Enter the choice of Gujarati you want");
                    int choiceGuj = obj.nextInt();
                    switch (choiceGuj) {
                        case 1:
                            System.out.println("Welcome you have entered type of Sabji");
                            System.out.println("1--->Sev Tameta");
                            System.out.println("2--->Aloo");
                            System.out.println("3--->Mix");
                            System.out.println("Enter the Sabji you want to order");
                            int choiceSabjii = obj.nextInt();
                            switch (choiceSabjii) {
                                case 1:
                                    System.out.println("You have selected Sev Tameta in Sabji option under Gujarati");
                                    System.out.println("Enter the number of plates");
                                    int qtySabjii1 = obj.nextInt();
                                    totalPrice = qtySabjii1 * 100;
                                    System.out.println("total price of" + " " + qtySabjii1 + " " + "SEV TAMETA is" + " " + totalPrice);
                                    break;
                                case 2:
                                    System.out.println("You have selected Aloo in Sabji option under Gujarati");
                                    System.out.println("Enter the number of plates");
                                    int qtySabjii2 = obj.nextInt();
                                    totalPrice = qtySabjii2 * 130;
                                    System.out.println("total price of" + " " + qtySabjii2 + " " + "ALOO is" + " " + totalPrice);
                                    break;
                                case 3:
                                    System.out.println("You have selected Mix in Sabji option under Gujarati");
                                    System.out.println("Enter the number of plates");
                                    int qtySabjii3 = obj.nextInt();
                                    totalPrice = qtySabjii3 * 150;
                                    System.out.println("total price of" + " " + qtySabjii3 + " " + "MIX is" + " " + totalPrice);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Welcome you have entered Roti");
                            System.out.println("Enter the number of plates");
                            int qtyRoti = obj.nextInt();
                            totalPrice = qtyRoti * 20;
                            System.out.println("total price of" + " " + qtyRoti + " " + "ROTI is" + " " + totalPrice);
                            break;
                        case 3:
                            System.out.println("Welcome you have entered Rice");
                            System.out.println("Enter the number of plates");
                            int qtyRice = obj.nextInt();
                            totalPrice = qtyRice * 90;
                            System.out.println("total price of" + " " + qtyRice + " " + "RICE is" + " " + totalPrice);
                            break;
                        case 4:
                            System.out.println("Welcome you have entered Dal");
                            System.out.println("Enter the number of plates");
                            int qtyDal = obj.nextInt();
                            totalPrice = qtyDal * 130;
                            System.out.println("total price of" + " " + qtyDal + " " + "DAL is" + " " + totalPrice);
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("You have selected Italian");
                    System.out.println("1--->Pizza");
                    System.out.println("2--->pasta");
                    System.out.println("Enter the choice of Gujarati you want");
                    int choiceIta = obj.nextInt();
                    switch (choiceIta) {
                        case 1:
                            System.out.println("Welcome you have entered type of Pizza");
                            System.out.println("1--->Italian Pizza");
                            System.out.println("2--->Margherita");
                            System.out.println("Enter the Pizza you want to order");
                            int choicePizza = obj.nextInt();
                            switch (choicePizza) {
                                case 1:
                                    System.out.println("Welcome you have entered Italian Pizza");
                                    System.out.println("Enter the number of plates");
                                    int qtyPizza = obj.nextInt();
                                    totalPrice = qtyPizza * 530;
                                    System.out.println("total price of" + " " + qtyPizza + " " + "ITALIAN PIZZA is" + " " + totalPrice);
                                    break;
                                case 2:
                                    System.out.println("Welcome you have entered Margherita Pizza");
                                    System.out.println("Enter the number of plates");
                                    int qtyPizza1 = obj.nextInt();
                                    totalPrice = qtyPizza1 * 640;
                                    System.out.println("total price of" + " " + qtyPizza1 + " " + "MARGHERITA PIZZA is" + " " + totalPrice);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Welcome you have entered type of Pasta");
                            System.out.println("1--->Italian pasta");
                            System.out.println("2--->Mexican");
                            System.out.println("Enter the Pasta you want to order");
                            int choicePasta = obj.nextInt();
                            switch (choicePasta) {
                                case 1:
                                    System.out.println("Welcome you have entered Italian pasta");
                                    System.out.println("Enter the number of plates");
                                    int qtyPasta = obj.nextInt();
                                    totalPrice = qtyPasta * 370;
                                    System.out.println("total price of" + " " + qtyPasta + " " + "ITALIAN PASTA is" + " " + totalPrice);
                                    break;
                                case 2:
                                    System.out.println("Welcome you have entered Mexican Pizza");
                                    System.out.println("Enter the number of plates");
                                    int qtyPasta1 = obj.nextInt();
                                    totalPrice = qtyPasta1 * 490;
                                    System.out.println("total price of" + " " + qtyPasta1 + " " + "MEXICAN PASTA is" + " " + totalPrice);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}