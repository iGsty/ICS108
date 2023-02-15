public class MCQuestion extends Question {

    private String choices;
    private final String answer;

    public MCQuestion(String text,String MCQuestion){
        super(text);
        choices = MCQuestion;
        answer = "\nanswer: d";
    }

    public String getChoices() {
        return choices;
    }
    public void setChoices(String choices){
        this.choices = choices;
    }

    public String toString(){
        return super.toString() + choices + answer;
    }
}
