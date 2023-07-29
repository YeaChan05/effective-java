package org.yeachan.chapter2.item2;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

/**
 * package :  org.yeachan.chapter2.item2
 * fileName : NutritionFacts
 * author :  ShinYeaChan
 * date : 2023-07-28
 */
@Builder
public class NutritionFacts {
    @Builder.Default private int servingSize=10;
    private int sodium;
    private int carbohydrate;
    private int servings;
    @Singular
    private List<String> names;
    public static void main(String[] args) {
        NutritionFacts nutritionFacts= NutritionFacts.builder()
                .servings(10)
                .carbohydrate(100)
                .name("11")
                .name("22")
                .clearNames()
                .build();
    }
}
