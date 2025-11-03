package dk.easv.dal;

import dk.easv.be.UserItem;

import java.io.IOException;
import java.util.List;

public class UserDAO
{
    private DBConnector dbConnector = new DBConnector();

    public UserDAO() throws IOException {}

    public List<UserItem> getAllUsers() throws Exception
    {
        return null;
    }
}
