package computershop;

public enum SubType {
	Frivolous, Game, Regular, COSC, VLIW, RISC, GameDesk, RegularDesk;
	public String toString() {
		switch(this) {
		case Frivolous:   return "轻薄本";
		case Game:        return "游戏本";
		case Regular:     return "常规笔记本";
		case COSC:        return "COSC服务器";
		case VLIW:        return "VLIM服务器";
		case RISC:        return "RISC服务器";
		case GameDesk:    return "游戏台式机";
		case RegularDesk: return "普通台式机";
		default:          return "Unspecified";
		}
	}
}
