package scouter;

	import java.io.*;
	public class files{
	  public String fileData;
	  public boolean createFile(String name){
	    try{
	      File file=new File(name);
	      boolean success= file.createNewFile();
	      if(success){
	        return true;
	      }
	      else {
	        System.out.println("File Creation failed");
	        return false;
	      }
	    }
	    catch(IOException e){
	      return false;
	    }
	}
	  public boolean deleteFile(String filename){
	    File file= new File(filename);
	    boolean success=file.delete();
	    if(!success){
	      System.out.println("Deletion failed");
	      return false;
	    }
	    return true;
	  }
	  
	  public boolean renameFile(String oldName,String newName){
	    File file=new File(oldName);
	    File file2= new File(newName);
	    boolean success= file.renameTo(file2);
	    if(!success){
	      return false;
	    }
	    return true;
	  }
	  public void writeToFile(String file,String msg){
	    try{
	      BufferedWriter out = new BufferedWriter(new FileWriter(file));
	      out.write(msg);
	      out.close();
	    }
	    catch(IOException e){
	      System.out.println("Write in file error");
	    }
	  }
	  
	  public void readFile(String file){
	    try{
	      BufferedReader in = new BufferedReader(new FileReader(file));
	      String str;
	      while((str=in.readLine())!=null){
	        fileData=str;
	      }
	      in.close();
	    }
	    catch(IOException e){
	      System.out.println("Reading file error");
	    }
	  }
	  public String getFileData(){
	    return fileData;
	  }
	  public void setFileData(String fileData){
		  this.fileData=fileData;
	  }
	
	  
}
