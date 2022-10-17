package day44_oopreview.callcenter;

public class CallCnter {

	public static void main(String[] args) {
		
		WhatsApp wa = new WhatsApp();
		
		wa.launch();  //messagingApp class inin icinde  //inheritance
		
		wa.allOSCompatible=true;        //inheritance
		
		wa.isFree=true;
		
		wa.name="Whats App";
		
		wa.call("Ozzy");
		
		wa.sendMessage("Thank you...");
		
		wa.videoCall();
		
		wa.accept();
		
		
		
		VoiceCallable.decline();  //interface name ile decline methodunu kullandi
		
		System.out.println(VoiceCallable.CAN_CALL);
		
		
		wa.getCount();
		
		wa.setCount(4);
		
		System.out.println("---------------");
		
		VoiceCallable obj = new WhatsApp();
		
		( (WhatsApp) obj).launch();
		
		( (MessagingApp) obj).allOSCompatible = false;   //burda casting yapti boylece error ortadan kalkti
		
		obj.call("Mr Tom");
		
		( (WhatsApp) obj).videoCall();
		
		((VideoCallable)obj).videoCall();   //olabilir cunku whatsUp is implementing videoCallable
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//final a access olabilir ama reassignment yapilamaz
		
		
		
		
		

	}

}