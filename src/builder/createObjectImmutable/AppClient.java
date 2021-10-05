package builder.createObjectImmutable;

public class AppClient {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder().withName("Hubert")
                .withAccountNumber("Hubert1996").withAddress("Ha Dong - Ha Noi")
                .withEmail("Hubert.luong@synergixtech.com").wantNewsletter(true).wantMobileBanking(true).build();

        System.out.println(bankAccount);
    }
}
