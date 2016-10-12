package assignment2;

enum ChipherKey {
	
	A('t'),
	B('m'),
	C('e'),
	D('s'),
	E('f'),
	F('k'),
	G('j'),
	H('a'),
	I('x'),
	J('n'),
	K('o'),
	L('v'),
	M('l'),
	N('u'),
	O('c'),
	P('h'),
	Q('z'),
	R('g'),
	S('y'),
	T('b'),
	U('w'),
	V('p'),
	W('d'),
	X('r'),
	Y('i'),
	Z('q');
	
	char value;
	
	ChipherKey(char value) {
		this.value = value;
	}
}
