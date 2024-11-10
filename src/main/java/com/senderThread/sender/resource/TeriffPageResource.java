package com.senderThread.sender.resource;

import com.senderThread.sender.domain.CommonPackage;
import com.senderThread.sender.domain.LocalPackage;
import com.senderThread.sender.domain.YercaudPackage;
import com.senderThread.sender.dto.CommonPackageDTO;
import com.senderThread.sender.dto.LocalPackageDTO;
import com.senderThread.sender.dto.YercaudPackageDTO;
import com.senderThread.sender.repository.CommonPackageRepository;
import com.senderThread.sender.repository.LocalPackageRepository;
import com.senderThread.sender.repository.YercaudPackageRepository;
import com.senderThread.sender.service.TeriffPageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController

public class TeriffPageResource {


    @Inject
    private TeriffPageService teriffPageService;


    @PostMapping("/teriff/local-package")
    public ResponseEntity<?> postLocalPackage(@RequestBody LocalPackageDTO localPackageDTO){

        LocalPackage localPackage = teriffPageService.prepareAndSaveLocalPackage(localPackageDTO);
        return ResponseEntity.ok().body(localPackage);
    }


    @PostMapping("/teriff/oommon-package")
    public ResponseEntity<?> postCommonPackage(@RequestBody CommonPackageDTO commonPackageDTO){
        CommonPackage commonPackage = teriffPageService.prepareAndSaveCommonPackage(commonPackageDTO);
        return ResponseEntity.ok().body(commonPackage);
    }

    @PostMapping("/teriff/yercaud-package")
    public ResponseEntity<?> postYercaudPackage(@RequestBody YercaudPackageDTO yercaudPackageDTO){

        YercaudPackage yercaudPackage = teriffPageService.prepareAndSaveYercaudPackage(yercaudPackageDTO);
        return ResponseEntity.ok().body(yercaudPackage);
    }

    @GetMapping("teriff/package")
    public ResponseEntity<?> getTeriffPackage(){

        Object obj = teriffPageService.prepareTeriffObject();

        return ResponseEntity.ok().body(obj);
    }

}
