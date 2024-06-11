package net.ray1997.ai.ink.time.craft.web.controller;

import net.ray1997.time.craft.client.document.dto.DocumentDTO;
import net.ray1997.time.craft.client.dto.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document")
public class DocumentController {

    @PostMapping("create")
    public Result<String> create(
            @RequestBody
            DocumentDTO doc) {

        return null;

    }
}
