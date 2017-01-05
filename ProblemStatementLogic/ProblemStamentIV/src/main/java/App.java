import com.model.Sentence;
import com.model.SentenceRotated;
import com.service.ServiceRotateSentence;
import com.service.ServiceRotateSentenceImpl;
import com.util.RemoveEmptyCharacter;
import com.util.ValidateNumber;

import java.util.Scanner;

/**
 * Created by joschinc on 1/4/17.
 */
public class App {
        public static void main(String[] args) {
            try {
                Scanner sc = new Scanner(System.in);
                ValidateNumber validateNumber = new ValidateNumber();
                System.out.println("Digit your sentence, please!");
                String text = sc.nextLine();
                if (text.contains(" ")) {
                    RemoveEmptyCharacter validator = new RemoveEmptyCharacter();
                    text = validator.removeWhiteCharacter(text);
                }
                System.out.println("Digit number of rotations, please!");
                String rotateTime = sc.nextLine();
                if(validateNumber.isNumeric(rotateTime)){
                    Sentence sentence = new Sentence(text, Integer.parseInt(rotateTime));
                    ServiceRotateSentence serviceRotateSentence = new ServiceRotateSentenceImpl();
                    SentenceRotated sentenceRotated = serviceRotateSentence.rotateSentence(sentence);
                    System.out.println(sentenceRotated.toString());
                } else {
                    System.out.println("Only numbers are supported!");
                }

            } catch (Exception e){
                e.printStackTrace();
            }
        }
}
