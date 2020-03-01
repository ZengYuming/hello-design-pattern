import java.math.BigDecimal;

public class SalaryCalculator {
    private static BigDecimal 黎尔基本工资 = new BigDecimal(28000);
    private static BigDecimal 黎尔社保个人部分 = new BigDecimal(294.3);
    private static BigDecimal 黎尔社保公司部分 = new BigDecimal(626.80);
    private static BigDecimal 黎尔个税 = new BigDecimal(606.17);

    private static BigDecimal 思梅基本工资 = new BigDecimal(15000);
    private static BigDecimal 思梅社保个人部分 = new BigDecimal(201.22);
    private static BigDecimal 思梅社保公司部分 = new BigDecimal(370.24);
    private static BigDecimal 思梅个税 = new BigDecimal(188.96);

    private static BigDecimal 曾小锋基本工资 = new BigDecimal(20000);
    private static BigDecimal 曾小锋社保个人部分 = new BigDecimal(201.22);
    private static BigDecimal 曾小锋社保公司部分 = new BigDecimal(370.24);
    private static BigDecimal 曾小锋个税 = new BigDecimal(398.96);

    private static BigDecimal 陈玉萍基本工资 = new BigDecimal(7000.00);
    private static BigDecimal 陈玉萍社保个人部分 = new BigDecimal(294.30);
    private static BigDecimal 陈玉萍社保公司部分 = new BigDecimal(626.80);
    private static BigDecimal 陈玉萍个税 = new BigDecimal(0);

    private static BigDecimal 曾芋茗基本工资 = new BigDecimal(24000.00);
    private static BigDecimal 曾芋茗社保个人部分 = new BigDecimal(294.30);
    private static BigDecimal 曾芋茗社保公司部分 = new BigDecimal(626.80);
    private static BigDecimal 曾芋茗个税 = new BigDecimal(411.17);

    private static BigDecimal 活动经费 = new BigDecimal(400);


    public static void main(String[] args) {
        //【聚付宝转的钱】
        BigDecimal 黎尔_JOPPAY = 黎尔基本工资.divide(BigDecimal.valueOf(2)).add(黎尔社保公司部分.divide(BigDecimal.valueOf(2)));
        System.out.println("黎尔_JOPPAY" + 黎尔_JOPPAY.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 曾芋茗_JOPPAY = 曾芋茗基本工资.divide(BigDecimal.valueOf(2)).add(曾芋茗社保公司部分.divide(BigDecimal.valueOf(2)));
        System.out.println("曾芋茗_JOPPAY" + 曾芋茗_JOPPAY.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 曾小锋_JOPPAY = 曾小锋基本工资.add(曾小锋社保公司部分);
        System.out.println("曾小锋" + 曾小锋_JOPPAY.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 陈玉萍_JOPPAY = 陈玉萍基本工资.add(陈玉萍社保公司部分);
        System.out.println("陈玉萍" + 陈玉萍_JOPPAY.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal Jerry转账总数 = 黎尔_JOPPAY.add(曾芋茗_JOPPAY).add(曾小锋_JOPPAY).add(陈玉萍_JOPPAY).add(活动经费.divide(BigDecimal.valueOf(2)));
        System.out.println("Jerry转账总数" + Jerry转账总数.setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println();

        //[BTB]
        BigDecimal 思梅_BTB = 思梅基本工资.subtract(思梅社保个人部分).subtract(思梅个税);
        System.out.println("思梅_BTB" + 思梅_BTB.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 黎尔_BTB = 黎尔基本工资.divide(BigDecimal.valueOf(2)).subtract(黎尔社保个人部分.divide(BigDecimal.valueOf(2))).subtract(黎尔个税.divide(BigDecimal.valueOf(2)));
        System.out.println("黎尔_BTB" + 黎尔_BTB.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 曾芋茗_BTB = 曾芋茗基本工资.divide(BigDecimal.valueOf(2)).subtract(曾芋茗社保个人部分.divide(BigDecimal.valueOf(2))).subtract(曾芋茗个税.divide(BigDecimal.valueOf(2)));
        System.out.println("曾芋茗_BTB" + 曾芋茗_BTB.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal BTB转账总数 = 思梅_BTB.add(黎尔_BTB).add(活动经费.divide(BigDecimal.valueOf(2)));
        System.out.println("BTB转账总数" + BTB转账总数.setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println();

        //转给同事
        BigDecimal 我转给黎尔的钱 = 黎尔_JOPPAY.subtract(黎尔个税.divide(BigDecimal.valueOf(2))).subtract(黎尔社保个人部分.divide(BigDecimal.valueOf(2))).subtract(黎尔社保公司部分.divide(BigDecimal.valueOf(2)));
        System.out.println("我转给黎尔的钱" + 我转给黎尔的钱.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 我转给曾小锋的钱 = 曾小锋_JOPPAY.subtract(曾小锋个税).subtract(曾小锋社保个人部分).subtract(曾小锋社保公司部分);
        System.out.println("我转给曾小锋的钱" + 我转给曾小锋的钱.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 我转给陈玉萍的钱 = 陈玉萍_JOPPAY.subtract(陈玉萍个税).subtract(陈玉萍社保个人部分).subtract(陈玉萍社保公司部分);
        System.out.println("我转给陈玉萍的钱" + 我转给陈玉萍的钱.setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println();

        //转给梦洁的钱
        BigDecimal 黎尔TO梦洁 = 黎尔个税.divide(BigDecimal.valueOf(2)).add(黎尔社保个人部分.divide(BigDecimal.valueOf(2))).add(黎尔社保公司部分.divide(BigDecimal.valueOf(2)));
        System.out.println("黎尔TO梦洁" + 黎尔TO梦洁.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 思梅TO梦洁 = BigDecimal.ZERO;
        System.out.println("思梅TO梦洁" + 思梅TO梦洁.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 曾芋茗TO梦洁 = 曾芋茗个税.add(曾芋茗社保个人部分).add(曾芋茗社保公司部分.divide(BigDecimal.valueOf(2)));
        System.out.println("曾芋茗TO梦洁" + 曾芋茗TO梦洁.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 曾小锋TO梦洁 = 曾小锋个税.add(曾小锋社保个人部分).add(曾小锋社保公司部分);
        System.out.println("曾小锋TO梦洁" + 曾小锋TO梦洁.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 陈玉萍TO梦洁 = 陈玉萍个税.add(陈玉萍社保个人部分).add(陈玉萍社保公司部分);
        System.out.println("陈玉萍TO梦洁" + 陈玉萍TO梦洁.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal 转给梦洁的钱 = 黎尔TO梦洁.add(思梅TO梦洁).add(曾芋茗TO梦洁).add(曾小锋TO梦洁).add(陈玉萍TO梦洁);
        System.out.println("转给梦洁的钱" + 转给梦洁的钱.setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}
