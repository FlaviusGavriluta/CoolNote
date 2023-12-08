package com.example.coolnote;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class NoteController {
    static String note;
    static int editCount = 0;

    @GetMapping(value = "note")
    public String displayAddNoteForm() {
        return "note";
    }

    @GetMapping
    public String index(Model model) {
        model.addAtribute("note", note);
        model.addAtribute("editCount", editCount);
        return "index";
    }

    @PostMapping(value = "note")
    public String processAddNoteForm(@RequestParam String newNote) {
        // Redirect to "/"
        return "redirect:";
    }
}
