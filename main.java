
public class main {

	public static void main(String[] args) {
		kotak main = new kotak();
		
		main.setPanjang(5);
		main.setLebar(3);
		
		double Panjang = main.getPanjang();
		double Lebar = main.getLebar(); 
		double Luas = main.getLuas();
		double Keliling = main.getKeliling();
		
		System.out.println("panjang"+ Panjang);
		System.out.println("lebar"+ Lebar);
		System.out.println("luas"+ Luas);
		System.out.println("keliling"+ Keliling);
		
		mahasiswa main1 = new mahasiswa();
		
		main1.setNama("mushaebi ashar");
		main1.setNim("D0217312");
		main1.setAlamat("matakalo");
		main1.setGolonganDarah("O");
		main1.setStatus("mahasiswa");
		main1.setTinggiBadang(165);
		main1.setBeratBadan(55);
		
		String Nama = main1.getNama();
		String Nim = main1.getNim();
		String Alamat = main1.getAlamat();
		String GolonganDarah = main1.getGolonganDarah();
		String Status = main1.getStatus();
		int TinggiBadang = main1.getTinggiBadang();
		int  BeratBadan = main1.getBeratBadan();
		
		System.out.println("nama"+ Nama);
		System.out.println("nim"+ Nim);
		System.out.println("alamat"+ Alamat);
		System.out.println("golongan darah"+ GolonganDarah );
		System.out.println("Status"+ Status );
		System.out.println("tinggi badan"+ TinggiBadang);
		System.out.println("berat badan"+ BeratBadan);
		
		node main2 = new node();
		
		main2.setLabel("mushaebi ashar");
		main2.setValue(7);
		
		String label = main2.getLabel();
		int Value = main2.getValue();
		
		System.out.println("label :"+label);
		System.out.println("value :"+Value);
		
		stack main3 = new stack();
		
		stack.value[0] = "muksin";
		stack.value[1] = "asrini";
		stack.value[2] = "arsyad";
		stack.value[3] = "mawar";
		stack.value[4] = "melati";
		stack.value[5] = "miko";
		stack.value[6] = "suleha";
		stack.value[7] = "caca";
		stack.value[8] = "cinta";
		stack.value[9] = "safa";
		stack.value[10] = "marwah";
		stack.value[11] = "muhammad";
		stack.value[12] = "ibrahim";
		stack.value[13] = "isa";
		stack.value[14] = "ismail";
		stack.value[15] = "adam";
		stack.value[16] = "yusuf";
		stack.value[17] = "hawa";
		stack.value[18] = "ridwan";
	    stack.value[19] = "atid";
		stack.value[20] = "malik";
		stack.value[21] = "israil";
		stack.value[22] = "mikail";
		stack.value[23] = "ismail";
		stack.value[24] = "isya";
		stack.value[25] = "ashar";
		stack.value[26] = "subuhan";
		stack.value[26] = "burhan";
		stack.value[27] = "bambang";
		stack.value[28] = "pamungkas";
		stack.value[29] = "dicky";
		stack.value[30] = "dana";
		stack.value[31] = "coki";
		stack.value[32] = "ciko";
		stack.value[33] = "muslim";
		stack.value[34] = "tretan";
		stack.value[35] = "yoigi";
		stack.value[36] = "wahyu";
		stack.value[37] = "sarinha";
		stack.value[38] = "bulan";
		stack.value[39] = "muhammad ashar";
		stack.value[40] = "ikram";
		stack.value[41] = "apri";
		stack.value[42] = "puput";
		stack.value[43] = "widya";
		stack.value[44] = "fitri";
		stack.value[45] = "ika";
		stack.value[46] = "eka";
		stack.value[47] = "anti";
		stack.value[48] = "juni";
		stack.value[49] = "juli";
		stack.value[50] = "desi";
		stack.value[51] = "septian";
		stack.value[52] = "okto";
		stack.value[53] = "novi";
		stack.value[54] = "indah";
		stack.value[55] = "irfan";
		stack.value[56] = "rahwana";
		stack.value[57] = "nurlisa";
		stack.value[58] = "anisa azizah";
		stack.value[59] = "afdal anto";
		stack.value[60] = "nur";
		stack.value[61] = "nunur";
		stack.value[62] = "sisda";
		stack.value[63] = "cikah";
		stack.value[64] = "mala";
		stack.value[65] = "nurmadina";
		stack.value[66] = "herna";
		stack.value[67] = "umay";
		stack.value[68] = "bayu";
		stack.value[69] = "indriani";
		stack.value[70] = "citran";
		stack.value[71] = "mega";
		stack.value[72] = "eging";
		stack.value[73] = "andi udin";
		stack.value[74] = "tiaruddin";
		stack.value[75] = "najamuddin";
		stack.value[76] = "aldi wahyudi";
		stack.value[77] = "ana";
		stack.value[78] = "vionita";
		stack.value[79] = "nasrul";
		stack.value[80] = "angga";
		stack.value[81] = "onad";
		stack.value[82] = "marhum";
		stack.value[83] = "ani";
		stack.value[84] = "mirni";
		stack.value[85] = "darman";
		stack.value[86] = "rapia";
		stack.value[87] = "kiko";
		stack.value[88] = "jamila";
		stack.value[89] = "efendi";
		stack.value[90] = "sukri";
		stack.value[91] = "andini";
		stack.value[92] = "putra";
		stack.value[93] = "putri";
		stack.value[94] = "reski";
		stack.value[95] = "uul";
		stack.value[96] = "sapri";
		stack.value[97] = "ical";
		stack.value[98] = "dika";
		stack.value[99] = "andiwati";

		stack.setValueAt(7,"mushaebi ashar");
		
		for (int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

		
		
	}

}

