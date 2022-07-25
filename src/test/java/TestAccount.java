import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestAccount {

    private final String name;
    private final boolean expected;

    public TestAccount(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Тимоти Шаламе",true},
                {"ТимотиШаламе",false},
                {" ТимотиШаламе ",false},
                {"Тимоти Шаламе ",false},
                {" Тимоти Шаламе",false},
                {"Ти",false},
                {"Т М",true},
                {"Тимоти Шаламе1234567",false},
                {"Тимоти Шаламе123456",true},
                {"Тимоти  Шаламе",false},
        };
    }


    @Test
    public void testCheckNameToEmboss() throws Exception {
        Account account = new Account(name);
        Assert.assertEquals(expected,account.checkNameToEmboss());
    }
}
