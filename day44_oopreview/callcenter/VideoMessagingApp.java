package day44_oopreview.callcenter;

public abstract class VideoMessagingApp extends MessagingApp implements ScreenSharable,VideoCallable {
	
	//messagingApp class inda constructor var bu yuzden hata vermiyor

}

//EXTENDS DEN SONRA MessagingApp in yanina virgul koyup baska bir extends olusturamayiz --->multiple extends mumkun degil  ama implements da mumkun

//VideoMessagingApp bastract classi birden fazla interface e implements oluyor





//body de hicbir code yazilmadi neden hata vermedi?


//cunku bu bir concrete class degil  ,  abstract class olunca zorunlu degil 


//abstract classes can have constructors but interface cannot have
