package sg.edu.np.mad.madpractical5;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import android.content.Context;
import android.app.Application;

public class UserTest{
    private User user;
    private UserAdapter userAdapter;
    private DatabaseHandler dbHandler;


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

    @Test
    public void testForDBHelper(){
        Context context = App.getApplication().getApplicationContext();
        dbHandler = new DatabaseHandler(context, null, null, 1);
        user = dbHandler.getUser(1);
        assertNotNull(user);
    }
   
}
