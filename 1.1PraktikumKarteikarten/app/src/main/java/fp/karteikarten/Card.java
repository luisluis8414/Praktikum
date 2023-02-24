package fp.karteikarten;

public class Card
{
    private String question;
    private String anwser;
    
    public Card(String question, String anwser)
    {
        this.question = question;
        this.anwser=anwser;
    }

    public String getQuestion(){
        return question;
    }
    
    public boolean isAnswerCorrect(String userAnwser)
    {
        if(userAnwser.equals(anwser)){
            return true;
        }else{
            return false;
        }
    }
}
