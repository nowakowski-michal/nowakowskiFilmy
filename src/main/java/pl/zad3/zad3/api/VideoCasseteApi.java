package pl.zad3.zad3.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.zad3.zad3.dao.entity.VideoCassete;
import pl.zad3.zad3.manager.VideoCasseteManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassets")
public class VideoCasseteApi {
    private VideoCasseteManager videoCassetes;

    @Autowired
    public VideoCasseteApi(VideoCasseteManager videoCassetes) {
        this.videoCassetes=videoCassetes;

    }
    @GetMapping("/all")
    public  Iterable<VideoCassete> getAll(){
        return videoCassetes.findAll();
    }
    @GetMapping
    public Optional<VideoCassete> getById(@RequestParam long index){
    return videoCassetes.findAllById(index);
    }
    @PostMapping
    public VideoCassete addVideo(@RequestBody VideoCassete videoCassete){
        return videoCassetes.save(videoCassete);
    }
    @PutMapping
    public VideoCassete updateVideo(@RequestBody VideoCassete videoCassete){
        return videoCassetes.save(videoCassete);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam long index){
        videoCassetes.delete(index);
    }

}
