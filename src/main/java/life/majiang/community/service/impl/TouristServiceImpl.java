package life.majiang.community.service.impl;


import life.majiang.community.mapper.TouristMapper;
import life.majiang.community.model.Tourist;
import life.majiang.community.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TouristServiceImpl implements TouristService {
    @Autowired
    private TouristMapper touristMapper;
    @Override
    public Tourist find(String code, String password) {

        Tourist tourist = touristMapper.find(code, password);
        System.out.println(tourist);
//        if (tourist == null){
//            throw new CustomizeException(CustomizeErrorCode.LOGIN_OFF);
//        }
        return tourist;
    }

    @Override
    public int insert(Tourist tourist) {
        int insert = touristMapper.insert(tourist);
        return insert;
    }
}
