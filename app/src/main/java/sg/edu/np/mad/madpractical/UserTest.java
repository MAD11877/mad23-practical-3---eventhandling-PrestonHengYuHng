package sg.edu.np.mad.madpractical;

public class UserTest {
    public String Name;
    public String Description;
    public int Id;
    public static boolean Followed;

    public UserTest(String name, String description, int id) {
        Name = name;
        Description = description;
        Id = id;
        Followed = false;
    }
}
