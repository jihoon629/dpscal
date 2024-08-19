package com.example.dpscal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class CharacterService {

    public List<DtoChrastat> getAllCharacters() {
        try {
            // JSON 파일 읽기
            ClassPathResource resource = new ClassPathResource("characters.json");
            InputStream inputStream = resource.getInputStream();

            // ObjectMapper를 사용하여 JSON 파일을 List<DtoChrastat>로 변환
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(inputStream, new TypeReference<List<DtoChrastat>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
