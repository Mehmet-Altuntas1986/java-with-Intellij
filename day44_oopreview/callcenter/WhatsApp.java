package day44_oopreview.callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable,VideoCallable { //bu line da hata varsa constructor or override error var.  (asagidakileri yazmadan once hata verdi)
                                                                                   //WhatsApp yazisinda hata gorunuyordu ,saga tikla,sonra add unimplemented methods ddd
	@Override
	public void videoCall() {
		System.out.println("WhatsApp - doing a video call Mr mike...");
		
	}

	@Override
	public void call(String contact) {
		System.out.println("WhatsApp - calling " + contact + "...");
		
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("WhatsApp - sending a message - " + msg + "...");
		
	}

}