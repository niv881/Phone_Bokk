import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact niv = new Contact("niv" ,"hason",5454545 ,"hakalnit 88");
        Contact gilad = new Contact("gilad" ,"hason",54564674 ,"modiin 88");
        Contact Shoham = new Contact("shoham" ,"hason",537555555 ,"hakalnit 88");
        Contact niv_new = new Contact("niv" ,"bason",5454545 ,"modiin 458");
        Contact amos = new Contact("amos" ,"yerushalmi",54264154 ,"moshe 6565");
        Contact nor = new Contact("nor " ,"moshe",5696865 ,"avaron 2123");
        Contact nir = new Contact("nir" ,"avram",52656985 ,"yeroshalim 585");
        Contact sami =  new Contact("sami" ,"sasgoni",5245785 ,"izhak 545");
        Contact loroze = new Contact("loroze" ,"tomato",5986856 ,"yom tov");
        Contact lama = new Contact("lama " ,"yegoslavi",5123654 ,"hifa 656");
        Contact banana = new Contact("banana" ,"zigzagun",5789656 ,"hood555");
        Contact whells = new Contact("whells" ,"oy a broh",574213 ,"mother home");
        Contact spongebob = new Contact("spongebob" ,"sevivon",5986532 ,"trilitrililai");


        phoneBook myPhonebook = new phoneBook();

        myPhonebook.addToThePhoneBookList(niv);
        myPhonebook.addToThePhoneBookList(gilad);
        myPhonebook.addToThePhoneBookList(Shoham);
        System.out.println(myPhonebook.getContactList());
// **************************************************************************

        myPhonebook.addToThePhoneBookList(gilad);
// **************************************************************************

        myPhonebook.updateContact(niv,niv_new);
//
        System.out.println(myPhonebook.getContactList());
// **************************************************************************
        myPhonebook.findByNumber( 5379555);
        myPhonebook.findByNumber( 537555555);

// **************************************************************************

        myPhonebook.addToThePhoneBookList(amos);
        myPhonebook.addToThePhoneBookList(banana);
        myPhonebook.addToThePhoneBookList(nir);
        myPhonebook.addToThePhoneBookList(lama);
        myPhonebook.addToThePhoneBookList(loroze);
        myPhonebook.addToThePhoneBookList(nor);
        myPhonebook.addToThePhoneBookList(sami);
        myPhonebook.addToThePhoneBookList(whells);
        myPhonebook.addToThePhoneBookList(spongebob);
// **************************************************************************

        System.out.println(myPhonebook.getContactList());
// **************************************************************************

        Contact spongeBob = new Contact("spongebob" ,"squarePants",598653221 ,"Bikini - Botom");
        myPhonebook.updateContact(spongebob,spongeBob);
        System.out.println(myPhonebook.getContactList());
        myPhonebook.findByNumber( 598653220);
        myPhonebook.findByNumber( 598653221);
// **************************************************************************

        myPhonebook.sortContactByName();
// **************************************************************************

        myPhonebook.format();










    }
}