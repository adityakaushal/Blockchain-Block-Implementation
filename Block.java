package testpack;

import java.util.*;

public class Block {
	
	
	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;
	
		
	public Block(String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash();
	}
	
	public String calculateHash() {
			
		String calculateHash = StringUtil.applySha256(previousHash + Long.toString(timeStamp) + data);
		
		return calculateHash;
	}
	
	public static void main(String[] args) {
		
		Block bck = new Block("hello","0");
		System.out.print("The hash key generated is: ");
		System.out.println(bck.calculateHash());
		

	}

}
