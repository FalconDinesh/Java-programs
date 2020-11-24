import java.util.Scanner;
class PlayfairCipher
{
private String KeyWord = new String();
private String Key = new String();
private int containsJ = 0;
private String cipherText = new String();
private char matrix_arr[][] = new char[5][5];
public static void main(String[] args)
{
String contChoice,plainText="",keyword="";
Scanner sc = new Scanner(System.in);
PlayfairCipher object = new PlayfairCipher();
do {
System.out.println("MENU : ");
System.out.println("1 - Get Text and key");
System.out.println("2 - Key Matrix");
System.out.println("3 - Encrypt");

System.out.println("4 - Decrypt");
System.out.println("5 - Exit");
String choice = sc.next();
if(choice.equals("1")) {
//getting user input
System.out.println("Enter a Text : ");
plainText = sc.next();
System.out.println("Enter a key : ");
keyword = sc.next();
//removing the duplicate letters in the word
object.findAndReplaceRepeat(keyword);
//entire word for the matrix
object.KeyGen();
//filler letter for odd sized word
if (plainText.length() % 2 != 0)
{
plainText = plainText +"x";
}
}else if(choice.equals("2")) {
System.out.println();
System.out.println("Key Matrix");
System.out.println();
object.matrix_print();
System.out.println();
}else if(choice.equals("3")) {
object.cipherText = object.encryptMessage(plainText);
System.out.println();
System.out.println("Encryption : " + object.cipherText);
System.out.println();
}
else if(choice.equals("4")) {
if(object.cipherText == null || object.cipherText.isEmpty()) {
System.out.println();
System.out.println("Cipher Text Not Found ");
System.out.println();
}else{
String plaindecrypt =
object.removeFillers(object.decryptMessage(object.cipherText));

System.out.println();
System.out.println("Decryption : " + plaindecrypt);
System.out.println();
}
}else{
System.exit(0);
}
System.out.print("Do you want to continue (y/n) : ");
contChoice = sc.next();
} while(contChoice.equals("y") || contChoice.equals("Y"));
sc.close();
}
//removing duplicate letters
//returns : word without duplicate letters
public void findAndReplaceRepeat(String k)
{
String keyNoRepeat = new String();
boolean flag = false;
keyNoRepeat = keyNoRepeat + k.charAt(0);
for (int i = 1; i < k.length(); i++)
{
for (int j = 0; j < keyNoRepeat.length(); j++) {
if (k.charAt(i) == keyNoRepeat.charAt(j))
{
flag = true;
}
}
if (flag == false)
keyNoRepeat = keyNoRepeat + k.charAt(i);
flag = false;
}
KeyWord = keyNoRepeat;
for (int i=0; i<KeyWord.length(); i++) {
if(KeyWord.substring(i,i+1).equals("j")) {
containsJ = 1;
break;
}

}
}
//to get all the remaining letters in the alphabet that are not present in the keyword
//returns : entire word with all the other words
public void KeyGen()
{
boolean flag = true;
char current;
Key = KeyWord;
for (int i = 0; i < 26; i++)
{
current = (char) (i + 97);
if(containsJ == 1) {
if (current == 'i')
continue;
}
else{
if (current == 'j')
continue;
}
for (int j = 0; j < KeyWord.length(); j++)
{
if (current == KeyWord.charAt(j))
{
flag = false;
break;
}
}
if (flag)
Key = Key + current;
flag = true;
}
matrix();
}
//creation of watrix with the keyword generated
//returns : matrix for the given key

private void matrix()
{
int counter = 0;
for (int i = 0; i < 5; i++)
{
for (int j = 0; j < 5; j++)
{
matrix_arr[i][j] = Key.charAt(counter);
counter++;
}
}
}
//printing Key matrix_arr
private void matrix_print(){
String line;
for (int i = 0; i < 5; i++)
{
line="";
for (int j = 0; j < 5; j++)
{
line = line + " "+matrix_arr[i][j];
}
System.out.println(line);
}
}
//adding filler to replace repeated letters in plainText
//returns : plaintext with fillers to remove repeated letters
private String format(String old_text)
{
int i = 0;
int len = 0;
String text = new String();
len = old_text.length();
for (int tmp = 0; tmp < len; tmp++)
{
if (old_text.charAt(tmp) == 'j')
{

text = text + 'i';
}
else
text = text + old_text.charAt(tmp);
}
len = text.length();
for (i = 0; i < len; i = i + 2)
{
if (text.charAt(i + 1) == text.charAt(i))
{
text = text.substring(0, i + 1) + 'x' + text.substring(i + 1);
}
}
return text;
}
//dividing the plaintext into two pair sets
//returns : string array with two letters pair
private String[] Divid2Pairs(String new_string)
{
String Original = format(new_string);
int size = Original.length();
if (size % 2 != 0)
{
size++;
Original = Original + 'x';
}
String x[] = new String[size / 2];
int counter = 0;
for (int i = 0; i < size / 2; i++)
{
x[i] = Original.substring(counter, counter + 2);
counter = counter + 2;
}
return x;
}
//getting the row and column for each corresponding letters
//returns : An array with row and column for a letter

public int[] GetDiminsions(char letter)
{
int[] key = new int[2];
if (letter == 'j')
letter = 'i';
for (int i = 0; i < 5; i++)
{
for (int j = 0; j < 5; j++)
{
if (matrix_arr[i][j] == letter)
{
key[0] = i;
key[1] = j;
break;
}
}
}
return key;
}
//decrypting a msg
//returns : decrypted string
public String decryptMessage(String Source)
{
String src_arr[] = Divid2Pairs(Source);
String Code = new String();
char one;
char two;
int part1[] = new int[2];
int part2[] = new int[2];
for (int i = 0; i < src_arr.length; i++)
{
one = src_arr[i].charAt(0);
two = src_arr[i].charAt(1);
//gets the row and column of the character in the matrix
//returns: a array with row and column
part1 = GetDiminsions(one);
part2 = GetDiminsions(two);
if (part1[0] == part2[0])

{
if (part1[1] > 0)
part1[1]--;
else
part1[1] = 4;
if (part2[1] > 0)
part2[1]--;
else
part2[1] = 4;
}
else if (part1[1] == part2[1])
{
if (part1[0] > 0)
part1[0]--;
else
part1[0] = 4;
if (part2[0] > 0)
part2[0]--;
else
part2[0] = 4;
}
else
{
//example: 'ab'
//to decrypt a we need a's row and b's column
//to decrypt b we need b's row and a's column
//so we swap both of their columns for ease of work and to avoid
confusions
int temp = part1[1];
part1[1] = part2[1];
part2[1] = temp;
}
Code = Code + matrix_arr[part1[0]][part1[1]]
+ matrix_arr[part2[0]][part2[1]];
}
return Code;
}
//encrypting a msg

//returns : encrypted string
public String encryptMessage(String Source)
{
String src_arr[] = Divid2Pairs(Source);
String Code = new String();
char one;
char two;
int part1[] = new int[2];
int part2[] = new int[2];
for (int i = 0; i < src_arr.length; i++)
{
one = src_arr[i].charAt(0);
two = src_arr[i].charAt(1);
//gets the row and column of the character in the matrix
//returns: a array with row and column
part1 = GetDiminsions(one);
part2 = GetDiminsions(two);
if (part1[0] == part2[0])
{
if (part1[1] < 4)
part1[1]++;
else
part1[1] = 0;
if (part2[1] < 4)
part2[1]++;
else
part2[1] = 0;
}
else if (part1[1] == part2[1])
{
if (part1[0] < 4)
part1[0]++;
else
part1[0] = 0;
if (part2[0] < 4)
part2[0]++;
else
part2[0] = 0;
}

else
{
//example: 'ab'
//to decrypt a we need a's row and b's column
//to decrypt b we need b's row and a's column
//so we swap both of their columns for ease of work and to avoid
confusions
int temp = part1[1];
part1[1] = part2[1];
part2[1] = temp;
}
Code = Code + matrix_arr[part1[0]][part1[1]]
+ matrix_arr[part2[0]][part2[1]];
}
return Code;
}
private String removeFillers(String plainText){
int n = plainText.length();
for (int i=0; i<n; i++) {
if(plainText.substring(i,i+1).equals("x")) {
plainText = plainText.substring(0,i)+plainText.substring(i+1,n);
n--;
}
}
return plainText;
}
}