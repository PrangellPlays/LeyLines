package dev.lumi.leylines.item.util;

public interface ColouredTooltipItem {
    default int tooltipBackground() {
        return 0xE61C1C24;
    }

    default int tooltipBorder() {
        return 0xFFB8A46B;
    }

    default int tooltipShadow() {
        return 0x66000000;
    }
}
