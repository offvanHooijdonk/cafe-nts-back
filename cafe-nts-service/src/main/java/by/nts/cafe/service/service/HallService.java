package by.nts.cafe.service.service;

import by.nts.cafe.service.model.HallModel;
import by.nts.cafe.service.service.impl.IHallService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HallService implements IHallService {

    @Override
    public List<HallModel> getAll() {
        List<HallModel> list = new ArrayList<>();

        list.add(new HallModel("1", "Hall Test 1"));
        list.add(new HallModel("3", "Hall #2"));
        list.add(new HallModel("6", "Pink Hall"));
        list.add(new HallModel("32", "Hookah Hall"));
        list.add(new HallModel("63", "Super Hall"));

        return list;
    }
}
