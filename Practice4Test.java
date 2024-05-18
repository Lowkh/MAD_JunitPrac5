package sg.edu.np.mad.madpractical4;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class UserTest{
    private User user;
    private UserAdapter userAdapter;

    @Test
    public void testForUserAdapterClass(){
        user = new User("John Doe", "MAD Developer", 1, false);

        ArrayList<User> test_List = new ArrayList<>();
        test_List.add(user);
        test_List.add(user);
        test_List.add(user);
        test_List.add(user);
        test_List.add(user);

        userAdapter = new UserAdapter(test_List,null);
        assertEquals(5, userAdapter.getItemCount());
    }
    @Test
    public void testForUserClass(){
        user = new User("John Doe", "MAD Developer", 1, false);

        assertEquals("John Doe", user.getName());
        assertEquals("MAD Developer", user.getDescription());
        assertEquals(false, user.getFollowed());
    }

}
