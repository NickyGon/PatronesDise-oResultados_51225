package observer.ejemplo;


import java.util.ArrayList;
import java.util.List;

public class CanalDeYoutube implements iCanal{

    private List<iUsuario> observerList=new ArrayList<>();

    private List<Video> videos=new ArrayList<>();


    public void uploadVideo(Video video){
        videos.add(video);
        notifyObserver(video);
    }


    @Override
    public void attach(iUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(iUsuario observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(Video video) {
        for (iUsuario usuario:observerList){
            if (usuario.getCategoria().equals(video.getCategoria())){
                usuario.update("Nuevo video subido! "+video.getTitulo(),video);
            }
        }
    }
}
