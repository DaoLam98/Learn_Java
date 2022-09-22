package org.example.service;

import org.example.model.Category;
import org.example.model.Clothes;
import org.example.model.Size;
import org.example.model.Status;

import java.util.ArrayList;
import java.util.List;

public class ClothesService {
    public List<Clothes> getAllClothes(){
        List<Clothes> list = new ArrayList<Clothes>();
        list.add(new Clothes(1, "Áo thun thể thao nam Recycle Active V1",
                "Chất liệu 100% Recycle Polyester, theo xu hướng thời trang bền vững", Size.M, Category.SHIRT,
                "Đen", 149000, Status.STOCKING));
        return list;
    }
}
