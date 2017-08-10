package edu.cmu.lti.nlp;

import edu.cmu.lti.algorithm.container.SetS;
import edu.cmu.lti.util.text.FString;

public class StopWord {
	public static final SetS m429= new SetS("a about above across after again against all almost alone along already also although always among an and another any anybody anyone anything anywhere are area areas around as ask asked asking asks at away b back backed backing backs be became because become becomes been before began behind being beings best better between big both but by c came can cannot case cases certain certainly clear clearly come could d did differ different differently do does done down down downed downing downs during e each early either end ended ending ends enough even evenly ever every everybody everyone everything everywhere f face faces fact facts far felt few find finds first for four from full fully further furthered furthering furthers g gave general generally get gets give given gives go going good goods got great greater greatest group grouped grouping groups h had has have having he her here herself high high high higher highest him himself his how however i if important in interest interested interesting interests into is it its itself j just k keep keeps kind knew know known knows l large largely last later latest least less let lets like likely long longer longest m made make making man many may me member members men might more most mostly mr mrs much must my myself n necessary need needed needing needs never new new newer newest next no nobody non noone not nothing now nowhere number numbers o of off often old older oldest on once one only open opened opening opens or order ordered ordering orders other others our out over p part parted parting parts per perhaps place places point pointed pointing points possible present presented presenting presents problem problems put puts q quite r rather really right right room rooms s said same saw say says second seconds see seem seemed seeming seems sees several shall she should show showed showing shows side sides since small smaller smallest so some somebody someone something somewhere state states still still such sure t take taken than that the their them then there therefore these they thing things think thinks this those though thought thoughts three through thus to today together too took toward turn turned turning turns two u under until up upon us use used uses v very w want wanted wanting wants was way ways we well wells went were what when where whether which while who whole whose why will with within without work worked working works would x y year years yet you young younger youngest your yours z");
	public static final SetS m429Cap=capitalize(m429);
	public static SetS capitalize(SetS m){
		SetS m1= new SetS();
		m1.addAll(m);
		for (String s: m)
			m1.add(FString.capFirstLetter(s));
		return m1;
	}
	public static final SetS m523= new SetS(new String[]  { "a", "able", "about", "above",
			"according", "accordingly", "across", "actually", "after", "afterwards",
			"again", "against", "all", "allow", "allows", "almost", "alone", "along",
			"already", "also", "although", "always", "am", "among", "amongst", "an",
			"and", "another", "any", "anybody", "anyhow", "anyone", "anything",
			"anyway", "anyways", "anywhere", "apart", "appear", "appreciate",
			"appropriate", "are", "around", "as", "aside", "ask", "asking",
			"associated", "at", "available", "away", "awfully", "b", "be", "became",
			"because", "become", "becomes", "becoming", "been", "before",
			"beforehand", "behind", "being", "believe", "below", "beside", "besides",
			"best", "better", "between", "beyond", "both", "brief", "but", "by", "c",
			"came", "can", "cannot", "cant", "cause", "causes", "certain",
			"certainly", "changes", "clearly", "co", "com", "come", "comes",
			"concerning", "consequently", "consider", "considering", "contain",
			"containing", "contains", "corresponding", "could", "course",
			"currently", "d", "definitely", "described", "despite", "did",
			"different", "do", "does", "doing", "done", "down", "downwards",
			"during", "e", "each", "edu", "eg", "eight", "either", "else",
			"elsewhere", "enough", "entirely", "especially", "et", "etc", "even",
			"ever", "every", "everybody", "everyone", "everything", "everywhere",
			"ex", "exactly", "example", "except", "f", "far", "few", "fifth",
			"first", "five", "followed", "following", "follows", "for", "former",
			"formerly", "forth", "four", "from", "further", "furthermore", "g",
			"get", "gets", "getting", "given", "gives", "go", "goes", "going",
			"gone", "got", "gotten", "greetings", "h", "had", "happens", "hardly",
			"has", "have", "having", "he", "hello", "help", "hence", "her", "here",
			"hereafter", "hereby", "herein", "hereupon", "hers", "herself", "hi",
			"him", "himself", "his", "hither", "hopefully", "how", "howbeit",
			"however", "i", "ie", "if", "ignored", "immediate", "in", "inasmuch",
			"inc", "indeed", "indicate", "indicated", "indicates", "inner",
			"insofar", "instead", "into", "inward", "is", "it", "its", "itself", "j",
			"just", "k", "keep", "keeps", "kept", "know", "knows", "known", "l",
			"last", "lately", "later", "latter", "latterly", "least", "less", "lest",
			"let", "like", "liked", "likely", "little", "look", "looking", "looks",
			"ltd", "m", "mainly", "many", "may", "maybe", "me", "mean", "meanwhile",
			"merely", "might", "more", "moreover", "most", "mostly", "much", "must",
			"my", "myself", "n", "name", "namely", "nd", "near", "nearly",
			"necessary", "need", "needs", "neither", "never", "nevertheless", "new",
			"next", "nine", "no", "nobody", "non", "none", "noone", "nor",
			"normally", "not", "nothing", "novel", "now", "nowhere", "o",
			"obviously", "of", "off", "often", "oh", "ok", "okay", "old", "on",
			"once", "one", "ones", "only", "onto", "or", "other", "others",
			"otherwise", "ought", "our", "ours", "ourselves", "out", "outside",
			"over", "overall", "own", "p", "particular", "particularly", "per",
			"perhaps", "placed", "please", "plus", "possible", "presumably",
			"probably", "provides", "q", "que", "quite", "qv", "r", "rather", "rd",
			"re", "really", "reasonably", "regarding", "regardless", "regards",
			"relatively", "respectively", "right", "s", "said", "same", "saw", "say",
			"saying", "says", "second", "secondly", "see", "seeing", "seem",
			"seemed", "seeming", "seems", "seen", "self", "selves", "sensible",
			"sent", "serious", "seriously", "seven", "several", "shall", "she",
			"should", "since", "six", "so", "some", "somebody", "somehow", "someone",
			"something", "sometime", "sometimes", "somewhat", "somewhere", "soon",
			"sorry", "specified", "specify", "specifying", "still", "sub", "such",
			"sup", "sure", "t", "take", "taken", "tell", "tends", "th", "than",
			"thank", "thanks", "thanx", "that", "thats", "the", "their", "theirs",
			"them", "themselves", "then", "thence", "there", "thereafter", "thereby",
			"therefore", "therein", "theres", "thereupon", "these", "they", "think",
			"third", "this", "thorough", "thoroughly", "those", "though", "three",
			"through", "throughout", "thru", "thus", "to", "together", "too", "took",
			"toward", "towards", "tried", "tries", "truly", "try", "trying", "twice",
			"two", "u", "un", "under", "unfortunately", "unless", "unlikely",
			"until", "unto", "up", "upon", "us", "use", "used", "useful", "uses",
			"using", "usually", "uucp", "v", "value", "various", "very", "via",
			"viz", "vs", "w", "want", "wants", "was", "way", "we", "welcome", "well",
			"went", "were", "what", "whatever", "when", "whence", "whenever",
			"where", "whereafter", "whereas", "whereby", "wherein", "whereupon",
			"wherever", "whether", "which", "while", "whither", "who", "whoever",
			"whole", "whom", "whose", "why", "will", "willing", "wish", "with",
			"within", "without", "wonder", "would", "x", "y", "yes", "yet", "you",
			"your", "yours", "yourself", "yourselves", "z", "zero" });
}