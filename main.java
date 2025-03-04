// quiz game
import java.util.*;
class Q
{
String ques;
String[] options;
char cans;

public Q(String ques , String[] options , char cans)
{
this.ques = ques;
this.options = options;
this.cans = cans;
}
}
public class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Random r = new Random();

Q[] q = {
new Q("What is 2+2? " , new String[]{"A) 3 " , "B) 4 " , "C) 6 " , "D) 8"}, 'B'),
new Q("What is 6/3? " , new String[]{"A) 2 " , "B) 4 " , "C) 6 " , "D) 8"}, 'A'),
new Q("What is 2/2? " , new String[]{"A) 3 " , "B) 4 " , "C) 1 " , "D) 8"}, 'C'),
new Q("What is 2-2? " , new String[]{"A) 3 " , "B) 4 " , "C) 6 " , "D) 0"}, 'D'),
new Q("What is 3+2? " , new String[]{"A) 5 " , "B) 4 " , "C) 6 " , "D) 8"}, 'A'),
new Q("What is 2+5? " , new String[]{"A) 3 " , "B) 4 " , "C) 7 " , "D) 8"}, 'C'),
new Q("What is 2*8? " , new String[]{"A) 3 " , "B) 16 " , "C) 6 " , "D) 8"}, 'B'),
new Q("What is 2+0? " , new String[]{"A) 3 " , "B) 4 " , "C) 6 " , "D) 2"}, 'D'),
new Q("What is 9+2? " , new String[]{"A) 3 " , "B) 11 " , "C) 6 " , "D) 8"}, 'B'),
new Q("What is 1+8? " , new String[]{"A) 3 " , "B) 9 " , "C) 6 " , "D) 8"}, 'B'),
new Q("What is 12+2? " , new String[]{"A) 3 " , "B) 4 " , "C) 14 " , "D) 8"}, 'C'),
};

System.out.println("Welcome to the Quiz game!");
System.out.println("can we start");
String start = sc.next().toLowerCase(); 

if(!start.equals("yes"))
{
System.out.println("Okay , see you next time bye!");
return;
}

int score = 0, wans = 0 , qasked = 0;
List<Integer> qaskedList = new ArrayList<>();

while(qaskedList.size() < 11)
{
int index;
do
{     
index = r.nextInt(q.length);
}
while(qaskedList.contains(index)); 
qaskedList.add(index);
Q questions = q[index];

System.out.println("\nQ" + (qaskedList.size()+1) + " : " + questions.ques);
for(String option : questions.options)
{
System.out.println(option);
}

System.out.println("Your ans (A , B , C , D):");
char userans = Character.toUpperCase(sc.next().charAt(0));

if(userans == questions.cans)
{
System.out.println("Correct !");
score++;
}
else
{
System.out.println("Wrong ! correct ans is : " + questions.cans);
System.out.println("oops you lose 1 marks");
wans++;
score--;
}
qasked++;
if(wans>=2)
{
System.out.println("game over! You gave 2 wrong ans.");
break;
}
if(qasked == 3 && wans == 0)
{
System.out.println("You ans all three correctly ! \n do you want to con..? (yes/no)");
String cgame = sc.next().toLowerCase();
if(!cgame.equals("yes"))
{
break;
} 
}
}       
 
System.out.println("\n game over ! your final score is : " + score + " / " + qaskedList.size());
}
}
       