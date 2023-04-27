package shita.data.repositories;

import shita.data.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserImply implements UserRepository {
    private  int lastIdCreated;
    private List<User> usersList = new ArrayList<>();

    @Override
    public User save(User user) {
        boolean isSaved = user.getId() != 0;
        if (isSaved)
            update(user);
        else {
            saveNew(user);

        }
        return  user;
    }
    private void update(User user)  {
        User user1 = findById(user.getId());
        int indexOfSaved = usersList.indexOf(user1);
        usersList.set(indexOfSaved,user);

    }

    private void saveNew(User user){
        user.setId(generatePackageId());
        usersList.add(user);
        lastIdCreated++;

    }
    private  int generatePackageId(){
        return lastIdCreated +1;
    }
    @Override
    public void delete(User user) {
        usersList.remove(user);


    }

    @Override
    public void deleteId(int id) {
        User foundUsers = findById(id);
        delete(foundUsers);
    }
    @Override
    public List<User> findAll() {

        return usersList;
    }

    @Override
    public User findById(int id) {
        for (User user : usersList)
            if (user.getId() ==id) return  user;
        return null;
    }
    public long lastIdCreated(){

        return  usersList.size();
    }

    @Override
    public void deleteAll() {
        usersList.clear();

    }
}

