package ch05;

public class Variable {

	public static void main(String[] args) {
		int[][] score = new int[5][]; // 뒤에 들어갈 배열 크기가 확정되지 않았기 때문에 비워둔것.
		 score[0] = new int[4]; // 배열[0]에 배열 4칸을 만들고
		 score[1] = new int[3]; // 배열[1]에 배열 3칸을 만들고
		 score[2] = new int[2]; // 배열[2]에 배열 2칸을 만들고
		 score[3] = new int[2]; // 배열[3]에 배열 2칸을 만들고
		 score[4] = new int[3]; // 배열[4]에 배열 3칸을 만들고
		 
		 for(int i = 0; i < score.length;i++) {
			 for(int j = 0; j < score.length; j++) {
				 if(i == 0) {
					 score[i][j] = 100;
				 }else if(i == 1) {
					 score[i][j] = 20;
				 }else if(i == 2) {
					 score[i][j] = 30;
				 }else if(i == 3) {
					 score[i][j] = 40;
				 }else if(i == 4) {
					 score[i][j] = 50;
				 }
			 }
		 }
		 /*score[0][0] = 100;
		 score[0][1] = 100;
		 score[0][2] = 100;
		 score[0][3] = 100;*/
		 //출력
		 for(int i = 0; i < score.length; i++) {
			 for(int j = 0; j < score[i].length; j++) {
				 System.out.print(score[i][j] + " ");
			 }System.out.println();
		 }
		 
	}

}
