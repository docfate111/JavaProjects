package src;
public class LogMessage {
	public static void main(String[] args) {
	LogMessage lm=new LogMessage("CLIENT3:security alert - repeated login failure");
	System.out.println(lm.getMachineId());
	System.out.println(lm.containsWord("failure"));
	lm=new LogMessage("Webserver:disksit offline");
	System.out.println(lm.getMachineId());
	System.out.println(lm.containsWord("disk"));
	System.out.println(lm.containsWord("DISK"));
	}
	private String machineId;
	private String description;
	public LogMessage(String message) {
	machineId=message.substring(0, message.indexOf(':'));
	description=message.substring(message.indexOf(':')+1);
	}
	public boolean containsWord(String keyword) {
		return description.contains(keyword);
	}
	public String getMachineId() {return machineId;}
	public String getDescription() {return description;}
}
