import java.util.ArrayList;
import java.util.List;

public class phoneBook extends Contact {

    List<Contact> contactList =new ArrayList<>();

    public phoneBook(){}

    public phoneBook(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public phoneBook(String firstName, String lastName, long phoneNumber, String address) {
        super(firstName, lastName, phoneNumber, address);
    }

    public void addToThePhoneBookList(Contact contact) {

        if (!contactList.contains(contact))
             contactList.add(contact);
        else
            System.out.println("this Contact Already in The List ! "+"\n");
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void updateContact(Contact oldContact , Contact updateContact){
            contactList.set(contactList.indexOf(oldContact),updateContact);
        }

    public void findByNumber(long phoneNumber){
        int i =0;
        for(; i<contactList.size() ; i++){
            if (contactList.get(i).getPhoneNumber() == phoneNumber) {
                System.out.println(contactList.get(i)+ "\n");
                break;
            }
        }
        if (i == contactList.size()){
            System.out.println("NullPointerException"+ "\n");
        }

    }

//    public void findByNumber2(long phoneNumber){
//        contactList.forEach(contact -> {
//            if(contact.getPhoneNumber() == phoneNumber){
//                System.out.println(contact + "\n");
//            }
//        });
//    }

    public void sortContactByName(){

        contactList.sort((Contact contacta,Contact contactb) ->{
         return contacta.getFirstName().compareTo(contactb.getFirstName());
        });
        System.out.println(contactList + "\n");
        }

    public void format(){
         contactList.forEach(contact -> {
             System.out.println("Name : " + contact.getFirstName() + " " + contact.getLastName() + "\n" + "Phone Number : " + contact.getPhoneNumber() + "\n");
        });
    }

    }








