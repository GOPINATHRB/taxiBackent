package com.senderThread.sender.service;

import com.senderThread.sender.domain.CommonPackage;
import com.senderThread.sender.domain.LocalPackage;
import com.senderThread.sender.domain.YercaudPackage;
import com.senderThread.sender.dto.CommonPackageDTO;
import com.senderThread.sender.dto.LocalPackageDTO;
import com.senderThread.sender.dto.YercaudPackageDTO;
import com.senderThread.sender.repository.CommonPackageRepository;
import com.senderThread.sender.repository.LocalPackageRepository;
import com.senderThread.sender.repository.YercaudPackageRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TeriffPageService {

    @Inject
    private CommonPackageRepository commonPackageRepository;

    @Inject
    private LocalPackageRepository localPackageRepository;


    @Inject
    private YercaudPackageRepository yercaudPackageRepository;


    public LocalPackage convertLocalPackageDTOToDomain(LocalPackageDTO localPackageDTO){

        LocalPackage localPackage = new LocalPackage();

        localPackage.setFirstFourtyKm(localPackageDTO.getFirstFourtyKm());
        localPackage.setSecondFourtyKm(localPackageDTO.getSecondFourtyKm());
        localPackage.setThirdFourtyKm(localPackageDTO.getThirdFourtyKm());
        localPackage.setOutStationPerKm(localPackageDTO.getOutStationPerKm());
        localPackage.setVehicleType(localPackageDTO.getVehicleType());
        localPackage.setWaitingHours(localPackageDTO.getWaitingHours());

        return localPackage;
    }


    public LocalPackage prepareAndSaveLocalPackage(LocalPackageDTO localPackageDTO){

        LocalPackage localPackage = convertLocalPackageDTOToDomain(localPackageDTO);

        return saveLocalPackage(localPackage);

    }

    private LocalPackage saveLocalPackage(LocalPackage localPackage) {
        return localPackageRepository.save(localPackage);
    }


    public CommonPackage prepareAndSaveCommonPackage(CommonPackageDTO commonPackageDTO) {

        CommonPackage commonPackage = convertCommonPackageDTOToDomain(commonPackageDTO);
        return saveCommonPackage(commonPackage);
    }

    private CommonPackage saveCommonPackage(CommonPackage commonPackage) {
       return commonPackageRepository.save(commonPackage);
    }

    private CommonPackage convertCommonPackageDTOToDomain(CommonPackageDTO commonPackageDTO) {

        CommonPackage commonPackage = new CommonPackage();

        commonPackage.setPackageExtraKm(commonPackageDTO.getPackageExtraKm());
commonPackage.setKilometer(commonPackageDTO.getKilometer());
commonPackage.setLocalRate(commonPackageDTO.getLocalRate());
commonPackage.setVehicleType(commonPackageDTO.getVehicleType());
return commonPackage;
    }


    public YercaudPackage prepareAndSaveYercaudPackage(YercaudPackageDTO yercaudPackageDTO) {

        YercaudPackage yercaudPackage = convertYercaudPackageDTOToDomain(yercaudPackageDTO);
        return saveYercaudPackage(yercaudPackage);
    }

    private YercaudPackage saveYercaudPackage(YercaudPackage yercaudPackage) {

        return yercaudPackageRepository.save(yercaudPackage);
    }

    private YercaudPackage convertYercaudPackageDTOToDomain(YercaudPackageDTO yercaudPackageDTO) {

        YercaudPackage yercaudPackage = new YercaudPackage();

        yercaudPackage.setDropPackage(yercaudPackageDTO.getDropPackage());
        yercaudPackage.setDropYercaud(yercaudPackageDTO.getDropYercaud());
        yercaudPackage.setAddHours(yercaudPackageDTO.getAddHours());
        yercaudPackage.setKilometer(yercaudPackageDTO.getKilometer());
        yercaudPackage.setVehicleType(yercaudPackageDTO.getVehicleType());
        yercaudPackage.setAddKM(yercaudPackageDTO.getAddKM());

        return yercaudPackage;
    }

    public Object prepareTeriffObject() {

         return  prepareLocalPackageObj();


    }

    private Object prepareLocalPackageObj() {
        List<LocalPackage> localPackageList = localPackageRepository.findAll();

        List<CommonPackage> commonPackageList = commonPackageRepository.findAll();

        List<YercaudPackage> yercaudPackageList = yercaudPackageRepository.findAll();
        // Convert each LocalPackage into a row format using streams
        List<List<String>> localPackageListString = localPackageList.stream()
                .map(localPackage -> List.of(
                        localPackage.getVehicleType(),
                        String.valueOf(localPackage.getFirstFourtyKm()),
                        String.valueOf(localPackage.getSecondFourtyKm()),
                        String.valueOf(localPackage.getThirdFourtyKm()),
                        String.valueOf(localPackage.getWaitingHours()),
                        localPackage.getOutStationPerKm() + " Rs"
                ))
                .collect(Collectors.toList());

        List<List<String>> commonPackageListString = commonPackageList.stream()
                .map(commonPackage -> List.of(
                        commonPackage.getVehicleType(),
                        String.valueOf(commonPackage.getVehicleType()),
                        String.valueOf(commonPackage.getKilometer()),
                        String.valueOf(commonPackage.getLocalRate()),
                        String.valueOf(commonPackage.getPackageExtraKm())
                ))
                .collect(Collectors.toList());

        List<List<String>> yercaudPackageListString = yercaudPackageList.stream()
                .map(yercaudPackage -> List.of(
                        yercaudPackage.getVehicleType(),
                        String.valueOf(yercaudPackage.getDropYercaud()),
                        String.valueOf(yercaudPackage.getDropPackage()),
                        String.valueOf(yercaudPackage.getKilometer()),
                        String.valueOf(yercaudPackage.getAmount()),
                        String.valueOf(yercaudPackage.getAddKM()),
                        String.valueOf(yercaudPackage.getAddHours())
                ))
                .collect(Collectors.toList());


        // Create a map to return a key-value pair
        Map<String, List<List<String>>> result = new HashMap<>();
        result.put("localPackageList", localPackageListString);
        result.put("commonPackageList", commonPackageListString);
        result.put("yercaudPackageList", yercaudPackageListString);
        return result;
    }
}
