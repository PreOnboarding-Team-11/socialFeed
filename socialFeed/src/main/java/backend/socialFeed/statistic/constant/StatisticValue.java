package backend.socialFeed.statistic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatisticValue {
    COUNT("count"),
    VIEW_COUNT("view_count"),
    LIKE_COUNT("like_count"),
    SHARE_COUNT("share_count");

    public final String value;

    public static StatisticValue from(String value) {
        for (StatisticValue statisticValue : StatisticValue.values()) {
            if (statisticValue.getValue().equalsIgnoreCase(value)) {
                return statisticValue;
            }
        }

        throw new IllegalArgumentException("검색 타입은 count, view_count, like_count, share_count 중 하나여야 합니다.");
    }
}