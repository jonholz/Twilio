import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class simple
{
   public static final String ACCOUNT_SID = "AC81ce47051878f824bdec31f482366bc4";
   public static final String AUTH_TOKEN = "6b023aee59b097eeced3185ad698f299";

   public static void main(String[] args)
   {
      Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
      Message message = Message.creator(
         new PhoneNumber("+12024877115"),
         new PhoneNumber("+16154900911"),
         "Hello from Java").create();

      System.out.println(message.getSid());
   }
}
