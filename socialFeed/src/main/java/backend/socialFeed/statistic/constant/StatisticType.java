package backend.socialFeed.statistic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatisticType {
    DATE("date"),
    HOUR("hour");

    public final String type;


    public static StatisticType from(String type) {
        for (StatisticType statisticType : StatisticType.values()) {
            if (statisticType.getType().equalsIgnoreCase(type)) {
                return statisticType;
            }
        }

        throw new IllegalArgumentException("검색 타입은 date, hour 중 하나여야 합니다.");
    }
}
