package cl.gonzalo.controller;

import cl.gonzalo.model.Tienda;
import cl.gonzalo.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class Index {

    @Autowired
    private TiendaRepository tr;



    @GetMapping("/tiendas")
    public String inicio(ModelMap m) {

        Iterable<Tienda> tienda = tr.findAll();
        m.addAttribute("tienda", tienda);

        return "Index";

    }


    @GetMapping("/creardepto/{id}")
    public String inicio(ModelMap m, @PathVariable("id") String id) {

        long ids = Long.parseLong(id);

        Optional<Tienda> tienda = tr.findById(ids);

        Long identi = tienda.get().getId();
        m.addAttribute("identi", identi);

        return "depto";

    }

    @PostMapping("/crear")
    public String crear(Model m, Tienda tienda) {

        tr.save(tienda);

        return "redirect:/tiendas";

    }
}
