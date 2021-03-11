package pl.zad3.zad3.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.zad3.zad3.dao.VideoCasseteRepo;
import pl.zad3.zad3.dao.entity.VideoCassete;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCasseteManager {
    private VideoCasseteRepo videoCasseteRepo;

    @Autowired

    public VideoCasseteManager(VideoCasseteRepo videoCasseteRepo) {
        this.videoCasseteRepo = videoCasseteRepo;
    }
    public Optional<VideoCassete> findAllById(Long id){
        return videoCasseteRepo.findById(id);
    }
    public Iterable<VideoCassete> findAll(){
        return videoCasseteRepo.findAll();
    }
    public VideoCassete save(VideoCassete videoCassete){
        return videoCasseteRepo.save(videoCassete);
    }
    public void delete(Long id){
        videoCasseteRepo.deleteById(id);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void fillDb(){
        save(new VideoCassete(1L,"Tytul1", LocalDate.of(1999,1,1)));
        save(new VideoCassete(2L,"Tytul2", LocalDate.of(210,2,11)));

    }

}
