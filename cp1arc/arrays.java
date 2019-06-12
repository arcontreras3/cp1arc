class arrays{
	public static void main(String [] args){

		int[] mynumbers=new int[20];
			for  (int i = 0; i < mynumbers.length; ++i){
				mynumbers[i] = (int)(Math.random()*20+1);
				System.out.println(mynumbers[i]);

}
}
}