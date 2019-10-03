//​​sets ​​up​​ a​​ scanner, ​​to ​​ya ​​know,​​ scan.
Scanner​​ scan​​ =​​ new​​ Scanner(System.in);

//​​scans ​​in ​​the ​​coded​​ message.

String​​ Letters ​​= ​​scan.nextLine();

//​​measures ​​how​​ long​​ the​​ message ​​is.
int​​ lLen​​ =​​ Letters.length();

//​​scans​​ in​​ the ​​key, ​​meaning​​ you​​ have​​ to ​​know ​​it​​ before​​hand.
String​​ Key​​ =​ ​ scan.nextLine();

//​​measures ​​how ​​long​​ the​​ key​​ is.
int​​ kLen ​​=​​ Key.length();

//​​loops​​ for​​ each​​ letter​​ of​​ the​​ message.
for(int​​ i=0; i<lLen; i++)​​{

	//​​gets​​ the ​​current​​ char.
	char​​ letter​​ =​​ Letters.charAt(i);

	//​​converts ​​that​​ letter​​ into​​ a​​ number.
	int ​​number​​ = ​​letter​​-​​'a';

	//​​gets​​ the​​ letter​​ at​​ the​​ appropriate ​​point​​ in ​​the ​​key.
	char keyLetter ​​= ​​Key.charAt(i%kLen);

	//​​converts​​ that​​ to​​ a​​ number​​ too.
	int​​ keyNum​​ = ​​keyLetter-'a';

	//​​get ​​the ​​original ​​letter ​​by ​​math.
	int​​ plain​​ =​​ number​​-​​keyNum;

	//​​if​​ the​​ number ​​is​​ negative​​ that's​​ bad, ​​so​​ we​​ must​​ do​​ something.
	if(plain​​<0)​​{

		//​​we​​ add ​​to​​ get ​​the ​​mod, ​​because ​​that​​ works.
		plain ​​= ​​26+plain;}

	//​​if ​​the​​ number​​ is ​​larger​​ than ​​26,​​ that's ​​bad​​ so ​​we​​ must ​​do​​ something.
	if(plain>26)​​{

		//​​so​​ we​​ mod​​ it​​ by​​ the​​ alphabet​​ size.
		plain %= 26;}

	//​​converts​​ the​​ number​​ of ​​the ​​plain​​ text​​ to​​ a​​ char​​ and​​ prints​​ it,​​ so​​ it ​​can ​​be​​ read.
	System.out.print((char)​​(plain​​+'a'));
}