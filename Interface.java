package Lab3;
interface Media{
	void play();
	void stop();
	default void pause() {
		System.out.println("Media paused");
	}
	static void about() {
		System.out.println("This is a Media Interface");
		
	}
	
}
interface AdvancedMedia extends Media{
	void nextTrack();
}
class MusicPlayer implements AdvancedMedia{
	public void play() {
		System.out.println("Music started");
	}
	public void stop() {
		System.out.println("Music Stopped");
	}
	public void nextTrack() {
		System.out.println("Next Song");
	}
	
}

public class Interface {
	public static void main(String[]args) {
		MusicPlayer musicplayer=new MusicPlayer();
		musicplayer.play();
		musicplayer.nextTrack();
		musicplayer.pause();
		Media.about();
		musicplayer.stop();
		
	}

}
