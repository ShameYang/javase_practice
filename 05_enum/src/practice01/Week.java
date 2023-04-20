package practice01;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO Week枚举类定义星期 x
 * @date 2023/3/5 12:48:53
 */
public enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");

    private  final String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}