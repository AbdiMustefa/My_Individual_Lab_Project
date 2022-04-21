import java.rmi.Naming;
 
public class StartFileServer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			java.rmi.registry.LocateRegistry.createRegistry(1001);
			
			FileServer fs=new FileServer();
			fs.setFile("abdi.txt");			
			Naming.rebind("rmi://10.194.119.9/abc", fs);
			System.out.println("File Server is Ready now");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}
